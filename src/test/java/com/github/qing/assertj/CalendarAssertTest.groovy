package com.github.qing.assertj


import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CalendarAssertTest extends Specification {


    def "DateAssert:isEqualTo passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isEqualTo(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 1)
    }

    def "DateAssert:isEqualTo not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isEqualTo(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
    }

    def "DateAssert:isBefore passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isBefore(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
    }

    def "DateAssert:isBefore not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isBefore(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 0)
    }

    def "DateAssert:isBeforeOrEqualTo passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isBeforeOrEqualTo(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 1)
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
    }

    def "DateAssert:isBeforeOrEqualTo not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isBeforeOrEqualTo(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 0)
    }

    def "DateAssert:isAfter passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isAfter(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 0)
    }

    def "DateAssert:isAfter not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isAfter(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
    }

    def "DateAssert:isAfterOrEqualTo passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isAfterOrEqualTo(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 0)
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 1)
    }

    def "DateAssert:isAfterOrEqualTo not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isAfterOrEqualTo(b).getResult()

        where:
        a | b
        new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
    }


    def "DateAssert:isBetween passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 3)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3)
    }

    def "DateAssert:isBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 0) | new Date(2021, 1, 1, 1, 1, 1)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3) | new Date(2021, 1, 1, 1, 1, 4)
    }


    def "DateAssert:isStrictlyBetween passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isStrictlyBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 3)
    }

    def "DateAssert:isStrictlyBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isStrictlyBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 0) | new Date(2021, 1, 1, 1, 1, 1)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3) | new Date(2021, 1, 1, 1, 1, 4)
    }


    def "DateAssert:isStartInclusiveBetween passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isStartInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 3)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3)
    }

    def "DateAssert:isStartInclusiveBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isStartInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 0) | new Date(2021, 1, 1, 1, 1, 1)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3) | new Date(2021, 1, 1, 1, 1, 4)
    }


    def "DateAssert:isEndInclusiveBetween passed"() {
        expect:
        new com.github.qing.assertj.core.calendar.DateAssert(a).isEndInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 2)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 1) | new Date(2021, 1, 1, 1, 1, 3)
    }

    def "DateAssert:isEndInclusiveBetween not passed"() {
        expect:
        !new com.github.qing.assertj.core.calendar.DateAssert(a).isEndInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 0) | new Date(2021, 1, 1, 1, 1, 1)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3)
        new Date(2021, 1, 1, 1, 1, 2) | new Date(2021, 1, 1, 1, 1, 3) | new Date(2021, 1, 1, 1, 1, 4)
    }
}