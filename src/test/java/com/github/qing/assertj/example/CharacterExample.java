package com.github.qing.assertj.example;

import java.util.ArrayList;
import java.util.List;
import static com.github.qing.assertj.Assertions.assertThat;

public class CharacterExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        char c = 'a';
        List<Character> m = new ArrayList<>();
        m.add('a');
        m.add('b');
        assertThat(c).isNull().thenFailThrow(exception);
        assertThat(c).isNotNull().thenFailThrow(exception);
        assertThat(c).isEqualTo('a').thenFailThrow(exception);
        assertThat(c).isEqualTo('b').thenFailThrow(exception);
        assertThat(c).isIn(m).thenFailThrow(exception);
        assertThat(c).isIn('a','b').thenFailThrow(exception);
        assertThat(c).isAscii().thenFailThrow(exception);
        assertThat(c).isLowerCase().thenFailThrow(exception);
        assertThat(c).isUpperCase().thenFailThrow(exception);
 
    }
}