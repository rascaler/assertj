package com.qing.assertj.core.base;

import com.qing.assertj.core.AbstractAssert;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class ObjectAssert extends AbstractAssert<ObjectAssert, Object> {

    public ObjectAssert(Object b) {
        super(b, ObjectAssert.class);
    }

}
