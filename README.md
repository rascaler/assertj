# assertj
java版: https://github.com/rascaler/assertj

python版: https://github.com/rascaler/assertpy

本项目参考：https://github.com/assertj/assertj-core

如果本项目对你们有帮助，帮忙給个star★

为什么不用assertj-core而直接造轮子？

1.assertj-core无法自定义异常，AssertionError包揽一切

2.assertj-core过于笨重,业务编码过程中，实际就只是对一些基础类型的数据和集合进行验证，所以没有必要用到

个人设计的想法：
可能在写业务的过程中，当不符合条件的情况下，需要抛个异常，你可能会这样
```java
if (object == null) {
    log.error("object 不能为空");
    throw new BizException(OBJECT_CANNOT_BE_NULL);
}
```
假如你的方法体里有很多这种要判断的，那么可能一个简单的函数，都会变得冗长，而且语义上，看起来长篇大幅，肯定不如
```java
assertThat(object).isNotNull().thenThrow(new BizException(OBJECT_CANNOT_BE_NULL))
```
多个验证共用一个异常
```java
assertThat(object).isNotNull().isEqualTo(1).thenThrow(new BizException(OBJECT_CANNOT_BE_NULL))
```
不同的验证用不同的异常
```java
assertThat(object).isNotNull().thenThrow(new BizException(OBJECT_CANNOT_BE_NULL))
        .isEqualTo(1).thenThrow(new BizException(OBJECT_IS_NOT_EQAULS))
```

此外，本包是一个断言工具包,只判断对和错，所以不会对原生数据类型有任何的操作，比如做转换，日期格式化等,数据转换的操作应该在业务中处理，然后再执行断言。

后续待完善：

1.添加日志输出

2.争取测试覆盖率到100%,目前只是每个类型的


## 安装

### maven引入

```xml
<dependency>
    <groupId>io.github.rascaler</groupId>
    <artifactId>assertj</artifactId>
    <version>1.0.5</version>
</dependency>
```

你也可以拉取项目

## 使用

### 例子
```java
import static Assertions.assertThat;
public class Example {
    public static void main(String[] args) {
        String str = "str";
        assertThat(str).isNotBlank().thenThrow(new BizException(OBJECT_CANNOT_BE_EMPTY))
                .isAllUpperCase().thenThrow(new BizException()); 
    }
}
```

### 自定义异常转换
自定义异常，你可以在项目中定义如下异常和拦截器，在拦截器中统一对异常捕获处理，转换成客户端需要的数据格式

```json
{
  "msg": "失败",
  "code": "1001",
  "data": null
}
```

```java
// 异常
public class ApiException extends RuntimeException {

    public ApiException(String code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private String code;

    private String msg;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
```

```java
// 转换器
public class ApiExceptionConvertor implements ExceptionConvertor<String,ApiException> {
    @Override
    public ApiException getException(String obj) {
        String msg = ExceptionMessage.messages.get(obj);
        assertThat(msg).isNotBlank().thenThrow(new RuntimeException("异常未定义"));
        return new ApiException(obj, msg, null);
    }
}
```

```java
public class ExceptionMessage {
    public static final String FAIL = "1001";
    public static final String SUCCESS = "1000";
    public static final String OBJECT_CANNOT_BE_EMPTY = "1002";
    public static final Map<String, String> messages = new HashMap<>();
    static {
        /**
         * 消息提示你可以放入资源文件 key-value,然后加载如
         * 如：
         * 1001=失败
         * 1000=成功
         */
        messages.put(SUCCESS, "失败");
        messages.put(FAIL, "失败");
        messages.put(OBJECT_CANNOT_BE_EMPTY, "不能为空");
    }
}
```

```java
//异常测试
public class ExceptionTest {

    @BeforeClass
    public static void  init() {
        /**
         * 设置异常转换器，在项目初始化的时候设置
         * 如果你使用的springboot,你可以可以在@Configuration中配置
         */
        Assertions.addExceptionCoverters(new ApiExceptionConvertor());
    }

    @Test
    public void testException() {
        assertThat(1).isLessThan(1).thenThrow(ExceptionMessage.FAIL);
    }

    @Test
    public void testExceptionWithLog() {
        // 无占位符
        assertThat(1).isLessThan(1).thenThrow(ExceptionMessage.FAIL,"日志测试");
    }

    @Test
    public void testExceptionWithLog2() {
        // 有占位符
        assertThat(1).isLessThan(1).thenThrow(ExceptionMessage.FAIL,"日志测试[{}]", "占位符");
    }
}
```


## 例子


### String
字符串(String)

```java
import java.util.ArrayList;
import java.util.List;
import static Assertions.assertThat;

public class StringExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        String str = "string";
        List<String> s = new ArrayList<>();
        s.add("string");
        s.add("test");
        assertThat(str).isNull().thenThrow(exception);
        assertThat(str).isNotNull().thenThrow(exception);
        assertThat(str).isEqualTo("string").thenThrow(exception);
        assertThat(str).isNotEqualTo("str").thenThrow(exception);

        assertThat(str).isBlank().thenThrow(exception);
        assertThat(str).isNotBlank().thenThrow(exception);
        assertThat(str).isEmpty().thenThrow(exception);
        assertThat(str).isNotEmpty().thenThrow(exception);
        assertThat(str).isAllUpperCase().thenThrow(exception);
        assertThat(str).isAllLowerCase().thenThrow(exception);
        assertThat(str).isNumberCreatable().thenThrow(exception);
        assertThat(str).isEqualTo("string").thenThrow(exception);
        assertThat(str).contains("tr").thenThrow(exception);
        assertThat(str).doseNotContains("aa").thenThrow(exception);
        assertThat(str).startsWith("str").thenThrow(exception);
        assertThat(str).endsWith("ing").thenThrow(exception);
    }
}
```
### Character
字符类(char)

```java

import java.util.ArrayList;
import java.util.List;
import static Assertions.assertThat;

public class CharacterExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        char c = 'a';
        List<Character> m = new ArrayList<>();
        m.add('a');
        m.add('b');
        assertThat(c).isNull().thenThrow(exception);
        assertThat(c).isNotNull().thenThrow(exception);
        assertThat(c).isEqualTo('a').thenThrow(exception);
        assertThat(c).isEqualTo('b').thenThrow(exception);
        assertThat(c).isIn(m).thenThrow(exception);
        assertThat(c).isIn('a','b').thenThrow(exception);
        assertThat(c).isAscii().thenThrow(exception);
        assertThat(c).isLowerCase().thenThrow(exception);
        assertThat(c).isUpperCase().thenThrow(exception);

    }
}
```

### Number
数值类型(byte,short,int,float,double)
包装类(Byte,Short,Integer,Float,Double)

```java
import java.util.ArrayList;
import java.util.List;
import static Assertions.assertThat;

public class NumberExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        int num = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertThat(num).isNull().thenThrow(exception);
        assertThat(num).isNotNull().thenThrow(exception);
        assertThat(num).isEqualTo(1).thenThrow(exception);
        assertThat(num).isNotEqualTo(3).thenThrow(exception);
        assertThat(num).isGreaterThan(0).thenThrow(exception);
        assertThat(num).isGreaterThanOrEqualTo(1).thenThrow(exception);
        assertThat(num).isLessThan(2).thenThrow(exception);
        assertThat(num).isLessThanOrEqualTo(1).thenThrow(exception);
        assertThat(num).isBetween(0,1).thenThrow(exception);
        assertThat(num).isStrictlyBetween(0,2).thenThrow(exception);
        assertThat(num).isStartInclusiveBetween(1,2).thenThrow(exception);
        assertThat(num).isEndInclusiveBetween(0,1).thenThrow(exception);
        assertThat(num).isIn(list);
    }
}
```

### Boolean
布尔类型(boolean,Boolean)

```java

import java.util.ArrayList;
import java.util.List;
import static Assertions.assertThat;

public class BooleanExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        boolean obj = true;
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        assertThat(obj).isNull().thenThrow(exception);
        assertThat(obj).isNotNull().thenThrow(exception);
        assertThat(obj).isEqualTo(1).thenThrow(exception);
        assertThat(obj).isNotEqualTo(3).thenThrow(exception);
        assertThat(obj).isFalse().thenThrow(exception);
        assertThat(obj).isTrue().thenThrow(exception);
        assertThat(obj).isIn(list).thenThrow(exception);
        assertThat(obj).isIn(true, false).thenThrow(exception);
        assertThat(obj).isNotIn(list).thenThrow(exception);
        assertThat(obj).isNotIn(true, false).thenThrow(exception);
    }
}
```

### Array
数组


```java

import java.util.ArrayList;
import java.util.List;
import static Assertions.assertThat;

public class ArrayExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        Integer[] obj = new Integer[] {1, 2};
        Integer[] expect = new Integer[] {1, 2};
        List<Integer> expect2 = new ArrayList<>();
        expect2.add(1);
        expect2.add(3);
        assertThat(obj).isNull().thenThrow(exception);
        assertThat(obj).isNotNull().thenThrow(exception);
        assertThat(obj).isEqualTo(1).thenThrow(exception);
        assertThat(obj).isNotEqualTo(3).thenThrow(exception);
        assertThat(obj).isEmpty().thenThrow(exception);
        assertThat(obj).isNotEmpty().thenThrow(exception);
        assertThat(obj).isAllIn(expect).thenThrow(exception);
        assertThat(obj).isAllIn(expect2).thenThrow(exception);
        assertThat(obj).hasAnyIn(expect).thenThrow(exception);
        assertThat(obj).hasAnyIn(expect2).thenThrow(exception);
        assertThat(obj).hasNoneIn(expect).thenThrow(exception);
        assertThat(obj).hasNoneIn(expect2).thenThrow(exception);
        assertThat(obj).containsAll(expect).thenThrow(exception);
        assertThat(obj).containsAll(expect2).thenThrow(exception);
        assertThat(obj).isSizeEqualTo(2).thenThrow(exception);
        assertThat(obj).isSizeBetween(1,3).thenThrow(exception);
        assertThat(obj).isSizeStrictlyBetween(1,3).thenThrow(exception);
        assertThat(obj).isSizeGreaterThan(1).thenThrow(exception);
        assertThat(obj).isSizeGreaterThanOrEqualTo(2).thenThrow(exception);
        assertThat(obj).isSizeGreaterThan(2).thenThrow(exception);
        assertThat(obj).isSizeLessThan(3).thenThrow(exception);
        assertThat(obj).isSizeLessThanOrEqualTo(2).thenThrow(exception);
    }
}
```
### Collection
集合(Collection子类)
集合和数组的方法基本一致
```java
import java.util.ArrayList;
import java.util.List;

import static Assertions.assertThat;

public class CollectionExample {
public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        List<String> actual = new ArrayList<>();
        Integer[] expect = new Integer[] {1, 2};
        List<Integer> expect2 = new ArrayList<>();
        expect2.add(1);
        expect2.add(3);
        assertThat(actual).isNull().thenThrow(exception);
        assertThat(actual).isNotNull().thenThrow(exception);
        assertThat(actual).isEqualTo(1).thenThrow(exception);
        assertThat(actual).isNotEqualTo(3).thenThrow(exception);
        assertThat(actual).isEmpty().thenThrow(exception);
        assertThat(actual).isNotEmpty().thenThrow(exception);
        assertThat(actual).isAllIn(expect).thenThrow(exception);
        assertThat(actual).isAllIn(expect2).thenThrow(exception);
        assertThat(actual).hasAnyIn(expect).thenThrow(exception);
        assertThat(actual).hasAnyIn(expect2).thenThrow(exception);
        assertThat(actual).hasNoneIn(expect).thenThrow(exception);
        assertThat(actual).hasNoneIn(expect2).thenThrow(exception);
        assertThat(actual).containsAll(expect).thenThrow(exception);
        assertThat(actual).containsAll(expect2).thenThrow(exception);
        assertThat(actual).isSizeEqualTo(2).thenThrow(exception);
        assertThat(actual).isSizeBetween(1,3).thenThrow(exception);
        assertThat(actual).isSizeStrictlyBetween(1,3).thenThrow(exception);
        assertThat(actual).isSizeGreaterThan(1).thenThrow(exception);
        assertThat(actual).isSizeGreaterThanOrEqualTo(2).thenThrow(exception);
        assertThat(actual).isSizeGreaterThan(2).thenThrow(exception);
        assertThat(actual).isSizeLessThan(3).thenThrow(exception);
        assertThat(actual).isSizeLessThanOrEqualTo(2).thenThrow(exception);
    }
}
```

### Map
map

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static Assertions.assertThat;

public class MapExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        Map<String, Integer> actual = new HashMap<>();
        actual.put("test", 1);
        actual.put("test1", 2);
        List<String> expectKeys = new ArrayList<>();
        expectKeys.add("test");
        expectKeys.add("test2");
        List<Integer> expectValues = new ArrayList<>();
        expectValues.add(1);
        expectValues.add(3);
        assertThat(actual).isNull().thenThrow(exception);
        assertThat(actual).isNotNull().thenThrow(exception);
        assertThat(actual).isEqualTo(1).thenThrow(exception);
        assertThat(actual).isNotEqualTo(3).thenThrow(exception);
        assertThat(actual).isEmpty().thenThrow(exception);
        assertThat(actual).isNotEmpty().thenThrow(exception);
        assertThat(actual).containsKey("test").thenThrow(exception);
        assertThat(actual).containsKeys("test","test1").thenThrow(exception);
        assertThat(actual).containsValue(1).thenThrow(exception);
        assertThat(actual).containsValues(1,2).thenThrow(exception);
        assertThat(actual).doesNotContainKey("test3").thenThrow(exception);
        assertThat(actual).doesNotContainValue(3).thenThrow(exception);
        assertThat(actual).doesNotContainKeys(expectKeys).thenThrow(exception);
        assertThat(actual).doesNotContainValues(expectValues).thenThrow(exception);
    }
}
```
