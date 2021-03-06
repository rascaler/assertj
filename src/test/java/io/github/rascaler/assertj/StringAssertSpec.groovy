package io.github.rascaler.assertj


import io.github.rascaler.assertj.core.base.StringAssert
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StringAssertSpec extends Specification {

    def "StringAssert:isEmpty passed"() {
        expect:
        new StringAssert(a).isEmpty().getResult()

        where:
        a << [null, ""]
    }

    def "StringAssert:isEmpty not passed"() {
        expect:
        !new StringAssert(a).isEmpty().getResult()

        where:
        a << [" ","111"]
    }

    def "StringAssert:isNotEmpty passed"() {
        expect:
        new StringAssert(a).isNotEmpty().getResult()
        where:
        a << ["1111", " "]
    }

    def "StringAssert:isNotEmpty not passed"() {
        expect:
        !new StringAssert(a).isNotEmpty().getResult()
        where:
        a << [null, ""]
    }

    def "StringAssert:isBlank passed"() {
        expect:
        new StringAssert(a).isBlank().getResult()

        where:
        a << [null, "", " "]
    }

    def "StringAssert:isBlank not passed"() {
        expect:
        !new StringAssert(a).isBlank().getResult()

        where:
        a << ["test", " test"]
    }

    def "StringAssert:isNotBlank passed"() {
        expect:
        new StringAssert(a).isNotBlank().getResult()

        where:
        a << ["test", " test"]
    }

    def "StringAssert:isNotBlank not passed"() {
        expect:
        !new StringAssert(a).isNotBlank().getResult()

        where:
        a << [null, "", " "]
    }


    def "StringAssert:startsWith passed"() {
        expect:
        new StringAssert(a).startsWith(b).getResult()

        where:
        a | b
        "" | ""
        "string" | "st"
    }

    def "StringAssert:startsWith not passed"() {
        expect:
        !new StringAssert(a).startsWith(b).getResult()

        where:
        a      | b
        "" | "a"
        "string" | "t"
        "string" | "tr"
    }


    def "StringAssert:doseNotStartWith passed"() {
        expect:
        new StringAssert(a).doseNotStartWith(b).getResult()

        where:
        a | b
        "" | "a"
        "string" | "t"
        "string" | "tr"
    }

    def "StringAssert:doseNotStartWith not passed"() {
        expect:
        !new StringAssert(a).doseNotStartWith(b).getResult()

        where:
        a | b
        "string" | "st"
        "string" | ""
    }

    def "StringAssert:endsWith passed"() {
        expect:
        new StringAssert(a).endsWith(b).getResult()

        where:
        a | b
        "" | ""
        "string" | ""
        "string" | "ing"
    }

    def "StringAssert:endsWith not passed"() {
        expect:
        !new StringAssert(a).endsWith(b).getResult()

        where:
        a | b
        "" | "i"
        "string" | "i"
    }

    def "StringAssert:doesNotEndWith passed"() {
        expect:
        new StringAssert(a).doesNotEndWith(b).getResult()

        where:
        a | b
        "" | "i"
        "string" | "i"
    }

    def "StringAssert:doesNotEndWith not passed"() {
        expect:
        !new StringAssert(a).doesNotEndWith(b).getResult()

        where:
        a | b
        "" | ""
        "string" | ""
        "string" | "ing"
    }

    def "StringAssert:contains passed"() {
        expect:
        new StringAssert(a).contains(b).getResult()

        where:
        a | b
        "" | ""
        "string" | ""
        "string" | "s"
        "string" | "t"
        "string" | "g"
    }

    def "StringAssert:contains not passed"() {
        expect:
        !new StringAssert(a).contains(b).getResult()

        where:
        a | b
        "" | "m"
        "string" | "m"
    }


    def "StringAssert:doesNotContain passed"() {
        expect:
        new StringAssert(a).doesNotContain(b).getResult()

        where:
        a | b
        "" | "m"
        "string" | "m"
    }

    def "StringAssert:doesNotContain not passed"() {
        expect:
        !new StringAssert(a).doesNotContain(b).getResult()

        where:
        a | b
        "" | ""
        "string" | ""
        "string" | "s"
        "string" | "t"
        "string" | "g"
    }

    def "StringAssert:isAllLowerCase passed"() {
        expect:
        // passed
        new StringAssert(a).isAllLowerCase().getResult()

        where:
        a << ["aa"]
    }

    def "StringAssert:isAllUpperCase not passed"() {
        expect:
        !new StringAssert(a).isAllLowerCase().getResult()

        where:
        a << ["", "Aa"]
    }


    def "StringAssert:isNumberCreatable passed"() {
        expect:
        new StringAssert(a).isNumberCreatable().getResult()

        where:
        a << ["1", "1.1", "1D", "1F"]
    }

    def "StringAssert:isNumberCreatable not passed"() {
        expect:
        !new StringAssert(a).isNumberCreatable().getResult()

        where:
        a << ["","1c","aa"]
    }


}