package com.qing.assertj

import com.qing.assertj.core.number.IntegerAssert

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class NumberAssertTest extends Specification {



    def "NumberAssert:isZero"() {
        expect:
        new IntegerAssert(a).isZero().getResult() == true

        where:
        a << [0]
    }

    def "NumberAssert:isNotZero"() {
        expect:
        new IntegerAssert(a).isNotZero().getResult() == true

        where:
        a << [1]

    }
//
//
//    def "NumberAssert:isEqualTo"() {
//        expect:
//        new IntegerAssert(a).isEqualTo(b).getResult() == true
//
//        where:
//        a | b
//        1 | 1
//        0 | 0
//    }



}