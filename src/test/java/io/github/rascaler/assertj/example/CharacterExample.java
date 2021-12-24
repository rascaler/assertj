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
        Assertions.assertThat(c).isNull().thenThrow(exception);
        Assertions.assertThat(c).isNotNull().thenThrow(exception);
        Assertions.assertThat(c).isEqualTo('a').thenThrow(exception);
        Assertions.assertThat(c).isEqualTo('b').thenThrow(exception);
        Assertions.assertThat(c).isIn(m).thenThrow(exception);
        Assertions.assertThat(c).isIn('a','b').thenThrow(exception);
        Assertions.assertThat(c).isAscii().thenThrow(exception);
        Assertions.assertThat(c).isLowerCase().thenThrow(exception);
        Assertions.assertThat(c).isUpperCase().thenThrow(exception);
 
    }
}