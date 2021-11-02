package com.github.qing.assertj

import com.github.qing.assertj.core.map.DefaultMapAssert
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MapAssertSpec extends Specification {

    def "DefaultMapAssert:isEmpty passed"() {
        expect:
        new DefaultMapAssert(a).isEmpty().getResult()

        where:
        a << [new HashMap<>(), null]
    }

    def "DefaultMapAssert:isEmpty not passed"() {
        expect:
        !new DefaultMapAssert(a).isEmpty().getResult()

        where:
        a << [[a: 1]]
    }

    def "DefaultMapAssert:isNotEmpty passed"() {
        expect:
        new DefaultMapAssert(a).isNotEmpty().getResult()

        where:
        a << [[a:1]]
    }

    def "DefaultMapAssert:isNotEmpty not passed"() {
        expect:
        !new DefaultMapAssert(a).isNotEmpty().getResult()

        where:
        a << [new HashMap<>(), null]
    }

    def "DefaultMapAssert:containsKey passed"() {
        expect:
        new DefaultMapAssert(a).containsKey(b).getResult()

        where:
        a | b
        [a: 1] | "a"
    }

    def "DefaultMapAssert:containsKey not passed"() {
        expect:
        !new DefaultMapAssert(a).containsKey(b).getResult()

        where:
        a | b
        [a: 1] | null
        [a: 1] | "b"
    }

    def "DefaultMapAssert:doesNotContainKey passed"() {
        expect:
        new DefaultMapAssert(a).doesNotContainKey(b).getResult()

        where:
        a | b
        [a: 1] | null
        [a: 1] | "b"
    }

    def "DefaultMapAssert:doesNotContainKey not passed"() {
        expect:
        !new DefaultMapAssert(a).doesNotContainKey(b).getResult()

        where:
        a | b
        [a: 1] | "a"
    }

    def "DefaultMapAssert:containsKeys passed"() {
        expect:
        new DefaultMapAssert(a).containsKeys(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | ["a"] as String[]
        [a: 1, b: 2] | ["a", "b"] as String[]
        [a: 1, b: 2] | ["a"]
        [a: 1, b: 2] | ["a", "b"]
    }

    def "DefaultMapAssert:containsKeys not passed"() {
        expect:
        !new DefaultMapAssert(a).containsKeys(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | ["a", "c"] as String[]
        [a: 1, b: 2] | ["d", "c"] as String[]
        [a: 1, b: 2] | ["a", "c"]
        [a: 1, b: 2] | ["d", "c"]
    }

    def "DefaultMapAssert:doesNotContainKeys passed"() {
        expect:
        new DefaultMapAssert(a).doesNotContainKeys(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | ["c", "d"] as String[]
        [a: 1, b: 2] | ["a", "d"] as String[]
        [a: 1, b: 2] | ["a", "d"]
        [a: 1, b: 2] | ["a", "d"]
    }

    def "DefaultMapAssert:doesNotContainKeys not passed"() {
        expect:
        !new DefaultMapAssert(a).isEmpty().getResult()

        where:
        a | b
        [a: 1, b: 2] | ["a"] as String[]
        [a: 1, b: 2] | ["a", "b"] as String[]
        [a: 1, b: 2] | ["a"]
        [a: 1, b: 2] | ["a", "b"]
    }

    def "DefaultMapAssert:containsValue passed"() {
        expect:
        new DefaultMapAssert(a).containsValue(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | 1
        [a: 1, b: 2] | 2
    }

    def "DefaultMapAssert:containsValue not passed"() {
        expect:
        !new DefaultMapAssert(a).containsValue(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | null
        [a: 1, b: 2] | 3
    }

    def "DefaultMapAssert:containsValues passed"() {
        expect:
        new DefaultMapAssert(a).containsValues(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | [1] as Integer[]
        [a: 1, b: 2] | [1,2] as Integer[]
        [a: 1, b: 2] | [1]
        [a: 1, b: 2] | [1,2]
    }

    def "DefaultMapAssert:containsValues not passed"() {
        expect:
        !new DefaultMapAssert(a).containsValues(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | [3] as Integer[]
        [a: 1, b: 2] | [1,3] as Integer[]
        [a: 1, b: 2] | [3]
        [a: 1, b: 2] | [1,3]
    }

    def "DefaultMapAssert:doesNotContainValue passed"() {
        expect:
        new DefaultMapAssert(a).doesNotContainValue(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | null
        [a: 1, b: 2] | 3
    }

    def "DefaultMapAssert:doesNotContainValue not passed"() {
        expect:
        !new DefaultMapAssert(a).doesNotContainValue(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | 1
        [a: 1, b: 2] | 2
    }

    def "DefaultMapAssert:doesNotContainValues passed"() {
        expect:
        new DefaultMapAssert(a).doesNotContainValues(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | [3] as Integer[]
        [a: 1, b: 2] | [1,3] as Integer[]
        [a: 1, b: 2] | [3]
        [a: 1, b: 2] | [1,3]
    }

    def "DefaultMapAssert:doesNotContainValues not passed"() {
        expect:
        !new DefaultMapAssert(a).doesNotContainValues(b).getResult()

        where:
        a | b
        [a: 1, b: 2] | [1] as Integer[]
        [a: 1, b: 2] | [1,2] as Integer[]
        [a: 1, b: 2] | [1]
        [a: 1, b: 2] | [1,2]
    }



}