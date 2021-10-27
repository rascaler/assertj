package com.qing.assertj

import com.qing.assertj.core.number.IntegerAssert

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class NumberAssertTest extends Specification {


    def "NumberAssert:isZero"() {
        expect:
        // passed
        new IntegerAssert(a).isZero().getResult()
        // not passed
        !new IntegerAssert(b).isZero().getResult()

        where:
        a | b
        0 | 1
        0 | -1
    }

    def "NumberAssert:isNotZero"() {
        expect:
        // passed
        new IntegerAssert(a).isNotZero().getResult()
        // not passed
        !new IntegerAssert(b).isNotZero().getResult()
        where:
        a << [1,-1]
        b << [0,0]
    }

    def "NumberAssert:isOne"() {
        expect:
        // passed
        new IntegerAssert(a).isOne().getResult()
        // not passed
        !new IntegerAssert(b).isOne().getResult()
        where:
        a << [1,1,1]
        b << [0,2,-2]
    }

    def "NumberAssert:isNotOne"() {
        expect:
        // passed
        new IntegerAssert(a).isNotOne().getResult()
        // not passed
        !new IntegerAssert(b).isNotOne().getResult()
        where:
        a << [0,2,-2]
        b << [1,1,1]
    }

    def "NumberAssert:isPositive"() {
        expect:
        // passed
        new IntegerAssert(a).isPositive().getResult()
        // not passed
        !new IntegerAssert(b).isPositive().getResult()
        where:
        a << [1, 2, 3]
        b << [0, 0,-1]
    }

    def "NumberAssert:isNegative"() {
        expect:
        // passed
        new IntegerAssert(a).isNegative().getResult()
        // not passed
        !new IntegerAssert(b).isNegative().getResult()
        where:
        a << [-1,-2,-3]
        b << [0, 0, 1]
    }

    def "NumberAssert:isNotNegative"() {
        expect:
        // passed
        new IntegerAssert(a).isNotNegative().getResult()
        // not passed
        !new IntegerAssert(b).isNotNegative().getResult()
        where:
        a << [0, 1, 2]
        b << [-1,-2,-3]
    }

    def "NumberAssert:isNotPositive"() {
        expect:
        // passed
        new IntegerAssert(a).isNotPositive().getResult()
        // not passed
        !new IntegerAssert(b).isNotPositive().getResult()
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isLessThan passed"() {
        expect:
        new IntegerAssert(a).isLessThan(b).getResult()
        where:
        a | b
        0 | 1
        -1| 1
    }
    def "NumberAssert:isLessThan not passed"() {
        expect:
        !new IntegerAssert(a).isLessThan(b).getResult()
        where:
        a | b
        1 | 1
        2 | 1
    }


    def "NumberAssert:isLessThanOrEqualTo pased"() {
        expect:
        // passed
        new IntegerAssert(a).isLessThanOrEqualTo(b).getResult()
        where:
        a | b
        0 | 1
        1 | 1
    }

    def "NumberAssert:isLessThanOrEqualTo not passed"() {
        expect:
        // passed
        !new IntegerAssert(a).isLessThanOrEqualTo(b).getResult()
        where:
        a | b
        2 | 1
    }

    def "NumberAssert:isGreaterThan passed"() {
        expect:
        new IntegerAssert(a).isGreaterThan(b).getResult()
        where:
        a | b
        2 | 1
    }

    def "NumberAssert:isGreaterThan not passed"() {
        expect:
        !new IntegerAssert(a).isGreaterThan(b).getResult()
        where:
        a | b
        0 | 1
        1 | 1
    }


    def "NumberAssert:isGreaterThanOrEqualTo passed"() {
        expect:
        new IntegerAssert(a).isGreaterThanOrEqualTo(b).getResult()
        where:
        a | b
        1 | 1
        2 | 1
    }

    def "NumberAssert:isGreaterThanOrEqualTo not passed"() {
        expect:
        !new IntegerAssert(a).isGreaterThanOrEqualTo(b).getResult()
        where:
        a | b
        1 | 2
    }

    def "NumberAssert:isBetween passed "() {
        expect:
        new IntegerAssert(a).isBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        1 | 0 | 2
        2 | 0 | 2
    }

    def "NumberAssert:isBetween not passed"() {
        expect:
        !new IntegerAssert(a).isBetween(b, c).getResult()
        where:
        a | b | c
        -1| 0 | 2
        3 | 0 | 2
    }

    def "NumberAssert:isStrictlyBetween passed"() {
        expect:
        new IntegerAssert(a).isStrictlyBetween(b, c).getResult()
        where:
        a | b | c
        1 | 0 | 2
    }

    def "NumberAssert:isStrictlyBetween not passed"() {
        expect:
        !new IntegerAssert(a).isStrictlyBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        2 | 0 | 2
        -1| 0 | 2
        3 | 0 | 2
    }


    def "NumberAssert:isStartInclusiveBetween passed"() {
        expect:
        new IntegerAssert(a).isStartInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        1 | 0 | 2
    }

    def "NumberAssert:isStartInclusiveBetween not passed"() {
        expect:
        !new IntegerAssert(a).isStartInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        -1| 0 | 2
        2 | 0 | 2
        3 | 0 | 2
    }

    def "NumberAssert:isEndInclusiveBetween passed"() {
        expect:
        new IntegerAssert(a).isEndInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        1 | 0 | 2
        2 | 0 | 2
    }

    def "NumberAssert:isEndInclusiveBetween not passed"() {
        expect:
        !new IntegerAssert(a).isEndInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        -1 | 0 | 2
        3 | 0 | 2
    }


}