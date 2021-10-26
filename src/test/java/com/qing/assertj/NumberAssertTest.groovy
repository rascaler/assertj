package com.qing.assertj

import com.qing.assertj.core.number.IntegerAssert

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class NumberAssertTest extends Specification {

    private RuntimeException testException = new RuntimeException("test cannot passed");

    def "NumberAssert:isZero"() {
        expect:
        // passed
        new IntegerAssert(a).isZero().getResult() == true
        // not passed
        new IntegerAssert(b).isZero().getResult() == false

        where:
        a | b
        0 | 1
        0 | -1
    }

    def "NumberAssert:isNotZero"() {
        expect:
        // passed
        new IntegerAssert(a).isNotZero().getResult() == true
        // not passed
        new IntegerAssert(b).isNotZero().getResult() == false
        where:
        a << [1,-1]
        b << [0,0]
    }

    def "NumberAssert:isOne"() {
        expect:
        // passed
        new IntegerAssert(a).isOne().getResult() == true
        // not passed
        new IntegerAssert(b).isOne().getResult() == false
        where:
        a << [1,1,1]
        b << [0,2,-2]
    }

    def "NumberAssert:isNotOne"() {
        expect:
        // passed
        new IntegerAssert(a).isNotOne().getResult() == true
        // not passed
        new IntegerAssert(b).isNotOne().getResult() == false
        where:
        a << [0,2,-2]
        b << [1,1,1]
    }

    def "NumberAssert:isPositive"() {
        expect:
        // passed
        new IntegerAssert(a).isPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isPositive().getResult() == false
        where:
        a << [1, 2, 3]
        b << [0, 0,-1]
    }

    def "NumberAssert:isNegative"() {
        expect:
        // passed
        new IntegerAssert(a).isNegative().getResult() == true
        // not passed
        new IntegerAssert(b).isNegative().getResult() == false
        where:
        a << [-1,-2,-3]
        b << [0, 0, 1]
    }

    def "NumberAssert:isNotNegative"() {
        expect:
        // passed
        new IntegerAssert(a).isNotNegative().getResult() == true
        // not passed
        new IntegerAssert(b).isNotNegative().getResult() == false
        where:
        a << [0, 1, 2]
        b << [-1,-2,-3]
    }

    def "NumberAssert:isNotPositive"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isLessThan"() {
        expect:
        // passed
        new IntegerAssert(a).isLessThan(b).getResult() == true
        // not passed
        new IntegerAssert(a).isLessThan(b).getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isLessThanOrEqualTo"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isGreaterThan"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }


    def "NumberAssert:isGreaterThanOrEqualTo"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isBetween"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isStrictlyBetween"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }


    def "NumberAssert:isStartInclusiveBetween"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isEndInclusiveBetween"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult() == true
        // not passed
        new IntegerAssert(b).isNotPositive().getResult() == false
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }


}