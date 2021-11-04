package io.github.rascaler.assertj.core.base;

import io.github.rascaler.assertj.core.AbstractAssert;

//public class AbstractCharacterAssert extends AbstractAssert<AbstractCharacterAssert, Character>
public abstract class AbstractCharacterAssert<SELF extends AbstractCharacterAssert<SELF>> extends AbstractAssert<SELF, Character> {

    public AbstractCharacterAssert(Character b, Class<?> selfType) {
        super(b, selfType);
    }

}
