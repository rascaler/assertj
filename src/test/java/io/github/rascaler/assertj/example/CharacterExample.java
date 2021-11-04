package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;

import java.util.ArrayList;
import java.util.List;
import static io.github.rascaler.assertj.Assertions.assertThat;

public class CharacterExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        char c = 'a';
        List<Character> m = new ArrayList<>();
        m.add('a');
        m.add('b');
        Assertions.assertThat(c).isNull().thenFailThrow(exception);
        Assertions.assertThat(c).isNotNull().thenFailThrow(exception);
        Assertions.assertThat(c).isEqualTo('a').thenFailThrow(exception);
        Assertions.assertThat(c).isEqualTo('b').thenFailThrow(exception);
        Assertions.assertThat(c).isIn(m).thenFailThrow(exception);
        Assertions.assertThat(c).isIn('a','b').thenFailThrow(exception);
        Assertions.assertThat(c).isAscii().thenFailThrow(exception);
        Assertions.assertThat(c).isLowerCase().thenFailThrow(exception);
        Assertions.assertThat(c).isUpperCase().thenFailThrow(exception);
 
    }
}