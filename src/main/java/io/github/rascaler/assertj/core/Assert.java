package io.github.rascaler.assertj.core;

public interface Assert<SELF extends Assert<SELF, ACTUAL>, ACTUAL> {

  /**
   * Verifies that the actual value is equal to the given one.
   * <p>
   * Example:
   * <pre><code class='java'> // assertions succeed
   * assertThat(&quot;abc&quot;).isEqualTo(&quot;abc&quot;);
   * assertThat(new HashMap&lt;String, Integer&gt;()).isEqualTo(new HashMap&lt;String, Integer&gt;());
   *
   * // assertions fail
   * assertThat(&quot;abc&quot;).isEqualTo(&quot;123&quot;);
   * assertThat(new ArrayList&lt;String&gt;()).isEqualTo(1);</code></pre>
   *
   * @param expected the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  SELF isEqualTo(Object expected);

  /**
   * Verifies that the actual value is not equal to the given one.
   * <p>
   * Example:
   * <pre><code class='java'> // assertions succeed
   * assertThat(&quot;abc&quot;).isNotEqualTo(&quot;123&quot;);
   * assertThat(new ArrayList&lt;String&gt;()).isNotEqualTo(1);
   *
   * // assertions fail
   * assertThat(&quot;abc&quot;).isNotEqualTo(&quot;abc&quot;);
   * assertThat(new HashMap&lt;String, Integer&gt;()).isNotEqualTo(new HashMap&lt;String, Integer&gt;());</code></pre>
   *
   * @param other the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is equal to the given one.
   */
  SELF isNotEqualTo(Object other);

  /**
   * Verifies that the actual value is {@code null}.
   * <p>
   * Example:
   * <pre><code class='java'> String value = null;
   * // assertion succeeds
   * assertThat(value).isNull();
   *
   * // assertions fail
   * assertThat(&quot;abc&quot;).isNull();
   * assertThat(new HashMap&lt;String, Integer&gt;()).isNull();</code></pre>
   *
   * @throws AssertionError if the actual value is not {@code null}.
   */
  SELF isNull();

  /**
   * Verifies that the actual value is not {@code null}.
  * <p>
   * Example:
   * <pre><code class='java'> // assertions succeed
   * assertThat(&quot;abc&quot;).isNotNull();
   * assertThat(new HashMap&lt;String, Integer&gt;()).isNotNull();
   *
   * // assertions fails
   * String value = null;
   * assertThat(value).isNotNull();</code></pre>
   *
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   */
  SELF isNotNull();

  /**
   * Verifies that the actual value is present in the given array of values.
   * <p>
   * This assertion always fails if the given array of values is empty.
   * <p>
   * Example:
   * <pre><code class='java'> Ring[] elvesRings = new Ring[] { vilya, nenya, narya };
   *
   * // assertion succeeds
   * assertThat(nenya).isIn(elvesRings);
   *
   * // assertions fail
   * assertThat(oneRing).isIn(elvesRings);
   * assertThat(oneRing).isIn(new Ring[0]);</code></pre>
   *
   * @param values the given array to search the actual value in.
   * @return {@code this} assertion object.
   * @throws NullPointerException if the given array is {@code null}.
   * @throws AssertionError if the actual value is not present in the given array.
   */
  SELF isIn(Object... values);

  /**
   * Verifies that the actual value is not present in the given array of values.
   * <p>
   * This assertion always succeeds if the given array of values is empty.
   * <p>
   * Example:
   * <pre><code class='java'> Ring[] elvesRings = new Ring[] { vilya, nenya, narya };
   *
   * // assertions succeed
   * assertThat(oneRing).isNotIn(elvesRings);
   * assertThat(oneRing).isNotIn(new Ring[0]);
   *
   * // assertions fails:
   * assertThat(nenya).isNotIn(elvesRings);</code></pre>
   *
   * @param values the given array to search the actual value in.
   * @return {@code this} assertion object.
   * @throws NullPointerException if the given array is {@code null}.
   * @throws AssertionError if the actual value is present in the given array.
   */
  SELF isNotIn(Object... values);

  /**
   * Verifies that the actual value is present in the given iterable.
   * <p>
   * This assertion always fails if the given iterable is empty.
   * <p>
   * Example:
   * <pre><code class='java'> Iterable&lt;Ring&gt; elvesRings = list(vilya, nenya, narya);
   *
   * // assertion succeeds
   * assertThat(nenya).isIn(elvesRings);
   *
   * // assertions fail:
   * assertThat(oneRing).isIn(elvesRings);
   * assertThat(oneRing).isIn(emptyList());</code></pre>
   *
   * @param values the given iterable to search the actual value in.
   * @return {@code this} assertion object.
   * @throws NullPointerException if the given collection is {@code null}.
   * @throws AssertionError if the actual value is not present in the given collection.
   */
  SELF isIn(Iterable<?> values);

  /**
   * Verifies that the actual value is not present in the given iterable.
   * <p>
   * This assertion always succeeds if the given iterable is empty.
   * <p>
   * Example:
   * <pre><code class='java'> Iterable&lt;Ring&gt; elvesRings = list(vilya, nenya, narya);
   *
   * // assertions succeed:
   * assertThat(oneRing).isNotIn(elvesRings);
   * assertThat(oneRing).isNotIn(emptyList());
   *
   * // assertions fails:
   * assertThat(nenya).isNotIn(elvesRings);</code></pre>
   *
   * @param values the given iterable to search the actual value in.
   * @return {@code this} assertion object.
   * @throws NullPointerException if the given collection is {@code null}.
   * @throws AssertionError if the actual value is present in the given collection.
   */
  SELF isNotIn(Iterable<?> values);

  /**
   * description: 断言失败抛异常
   * @param exception
   * @return SELF
   * @author wurenqing
   * @time 2021-09-29 17:11
   */
  SELF thenThrow(RuntimeException exception);

  SELF thenThrow(RuntimeException exception, String msg);

  SELF thenThrow(RuntimeException exception, String format, Object... arguments);


  /**
   * description: 断言失败抛异常
   * @param error
   * @return SELF
   * @author wurenqing
   * @time 2021-09-29 17:11
   */
  SELF thenThrow(Error error);

  SELF thenThrow(Error error, String msg);

  SELF thenThrow(Error error, String format, Object... arguments);

  /**
   * description: 断言失败抛异常
   * 需要添加com.cybermax.assertj.core.exception.ExceptionConvertor才能正常使用
   * @param obj
   * @return SELF
   * @author wurenqing
   * @time 2021-09-29 17:11
   */
  <T> SELF thenThrow(T obj);

  /**
   * description: 断言失败抛异常
   * 需要添加com.cybermax.assertj.core.exception.ExceptionConvertor才能正常使用
   * @param obj
   * @return SELF
   * @author wurenqing
   * @time 2021-09-29 17:11
   */
  <T> SELF thenThrow(T obj, String format, Object... arguments);

  /**
   * description: 断言失败抛异常
   * 需要添加com.cybermax.assertj.core.exception.ExceptionConvertor才能正常使用
   * @param obj
   * @return SELF
   * @author wurenqing
   * @time 2021-09-29 17:11
   */
  <T> SELF thenThrow(T obj, String msg);

}
