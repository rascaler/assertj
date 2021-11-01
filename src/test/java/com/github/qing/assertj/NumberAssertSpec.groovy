package com.github.qing.assertj


import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class NumberAssertSpec extends Specification {


    def "NumberAssert:isZero"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isZero().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isZero().getResult()

        where:
        a | b
        0 | 1
        0 | -1
    }

    def "NumberAssert:isNotZero"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isNotZero().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isNotZero().getResult()
        where:
        a << [1,-1]
        b << [0,0]
    }

    def "NumberAssert:isOne"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isOne().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isOne().getResult()
        where:
        a << [1,1,1]
        b << [0,2,-2]
    }

    def "NumberAssert:isNotOne"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isNotOne().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isNotOne().getResult()
        where:
        a << [0,2,-2]
        b << [1,1,1]
    }

    def "NumberAssert:isPositive"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isPositive().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isPositive().getResult()
        where:
        a << [1, 2, 3]
        b << [0, 0,-1]
    }

    def "NumberAssert:isNegative"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isNegative().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isNegative().getResult()
        where:
        a << [-1,-2,-3]
        b << [0, 0, 1]
    }

    def "NumberAssert:isNotNegative"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isNotNegative().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isNotNegative().getResult()
        where:
        a << [0, 1, 2]
        b << [-1,-2,-3]
    }

    def "NumberAssert:isNotPositive"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isNotPositive().getResult()
        // not passed
        !new com.github.qing.assertj.core.number.IntegerAssert(b).isNotPositive().getResult()
        where:
        a << [0,-1, -2]
        b << [1, 2, 3]
    }

    def "NumberAssert:isLessThan passed"() {
        expect:
        new com.github.qing.assertj.core.number.IntegerAssert(a).isLessThan(b).getResult()
        where:
        a | b
        0 | 1
        -1| 1
    }
    def "NumberAssert:isLessThan not passed"() {
        expect:
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isLessThan(b).getResult()
        where:
        a | b
        1 | 1
        2 | 1
    }


    def "NumberAssert:isLessThanOrEqualTo pased"() {
        expect:
        // passed
        new com.github.qing.assertj.core.number.IntegerAssert(a).isLessThanOrEqualTo(b).getResult()
        where:
        a | b
        0 | 1
        1 | 1
    }

    def "NumberAssert:isLessThanOrEqualTo not passed"() {
        expect:
        // passed
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isLessThanOrEqualTo(b).getResult()
        where:
        a | b
        2 | 1
    }

    def "NumberAssert:isGreaterThan passed"() {
        expect:
        new com.github.qing.assertj.core.number.IntegerAssert(a).isGreaterThan(b).getResult()
        where:
        a | b
        2 | 1
    }

    def "NumberAssert:isGreaterThan not passed"() {
        expect:
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isGreaterThan(b).getResult()
        where:
        a | b
        0 | 1
        1 | 1
    }


    def "NumberAssert:isGreaterThanOrEqualTo passed"() {
        expect:
        new com.github.qing.assertj.core.number.IntegerAssert(a).isGreaterThanOrEqualTo(b).getResult()
        where:
        a | b
        1 | 1
        2 | 1
    }

    def "NumberAssert:isGreaterThanOrEqualTo not passed"() {
        expect:
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isGreaterThanOrEqualTo(b).getResult()
        where:
        a | b
        1 | 2
    }

    def "NumberAssert:isBetween passed "() {
        expect:
        new com.github.qing.assertj.core.number.IntegerAssert(a).isBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        1 | 0 | 2
        2 | 0 | 2
    }

    def "NumberAssert:isBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isBetween(b, c).getResult()
        where:
        a | b | c
        -1| 0 | 2
        3 | 0 | 2
    }

    def "NumberAssert:isStrictlyBetween passed"() {
        expect:
        new com.github.qing.assertj.core.number.IntegerAssert(a).isStrictlyBetween(b, c).getResult()
        where:
        a | b | c
        1 | 0 | 2
    }

    def "NumberAssert:isStrictlyBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isStrictlyBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        2 | 0 | 2
        -1| 0 | 2
        3 | 0 | 2
    }


    def "NumberAssert:isStartInclusiveBetween passed"() {
        expect:
        new com.github.qing.assertj.core.number.IntegerAssert(a).isStartInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        1 | 0 | 2
    }

    def "NumberAssert:isStartInclusiveBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isStartInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        -1| 0 | 2
        2 | 0 | 2
        3 | 0 | 2
    }

    def "NumberAssert:isEndInclusiveBetween passed"() {
        expect:
        new com.github.qing.assertj.core.number.IntegerAssert(a).isEndInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        1 | 0 | 2
        2 | 0 | 2
    }

    def "NumberAssert:isEndInclusiveBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.number.IntegerAssert(a).isEndInclusiveBetween(b, c).getResult()
        where:
        a | b | c
        0 | 0 | 2
        -1 | 0 | 2
        3 | 0 | 2
    }


}