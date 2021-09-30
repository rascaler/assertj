package com.cybermax.assertj.core.base;

import com.cybermax.assertj.core.AbstractAssert;
import com.cybermax.assertj.core.AbstractComparableAssert;
import com.cybermax.assertj.core.number.NumberAssert;

import java.math.BigDecimal;

//public class AbstractCharacterAssert extends AbstractAssert<AbstractCharacterAssert, Character>
public abstract class AbstractCharacterAssert<SELF extends AbstractCharacterAssert<SELF>> extends AbstractComparableAssert<SELF, Character> {

    public AbstractCharacterAssert(Character b, Class<?> selfType) {
        super(b, selfType);
    }

}
