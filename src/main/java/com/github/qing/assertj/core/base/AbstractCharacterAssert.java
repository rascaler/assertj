package com.github.qing.assertj.core.base;

import com.github.qing.assertj.core.AbstractAssert;
import com.github.qing.assertj.core.AbstractComparableAssert;

//public class AbstractCharacterAssert extends AbstractAssert<AbstractCharacterAssert, Character>
public abstract class AbstractCharacterAssert<SELF extends AbstractCharacterAssert<SELF>> extends AbstractAssert<SELF, Character> {

    public AbstractCharacterAssert(Character b, Class<?> selfType) {
        super(b, selfType);
    }

}
