package com.qing.assertj

import com.qing.assertj.core.collection.ListAssert
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CollectionAssertTest extends Specification {


    def "ListAssert:isEmpty passed"() {
        expect:
        new ListAssert(a).isEmpty().getResult()

        where:
        a << [Arrays.asList(), null]
    }

    def "ListAssert:isEmpty not passed"() {
        expect:
        !new ListAssert(a).isEmpty().getResult()

        where:
        a <<[Arrays.asList(1)]
    }

    def "ListAssert:isNotEmpty passed"() {
        expect:
        new ListAssert(a).isNotEmpty().getResult()

        where:
        a <<[Arrays.asList(1)]
    }

    def "ListAssert:isNotEmpty not passed"() {
        expect:
        !new ListAssert(a).isNotEmpty().getResult()

        where:
        a <<[Arrays.asList(), null]
    }

    def "ListAssert:hasEmptyElement passed"() {
        expect:
        new ListAssert(a).hasEmptyElement().getResult()

        where:
        a << [Arrays.asList(1, null, 2)]
    }


    def "ListAssert:hasEmptyElement not passed"() {
        expect:
        !new ListAssert(a).hasEmptyElement().getResult()

        where:
        a << [Arrays.asList(1, 2)]
    }

    def "ListAssert:containsAll passed"() {
        expect:
        new ListAssert(a).containsAll(b).getResult()

        where:
        a | b
        Arrays.asList() | new Integer[] {}
        Arrays.asList(1,2) | new Integer[] {}
        Arrays.asList(1,2) | new Integer[] {1}
        Arrays.asList(1,2) | new Integer[] {1,1,1}
        Arrays.asList(1,2) | Arrays.asList()
        Arrays.asList(1,2) | Arrays.asList()
        Arrays.asList(1,2) | Arrays.asList(1)
        Arrays.asList(1,2) | Arrays.asList(1,1,1)
    }

    def "ListAssert:containsAll not passed"() {
        expect:
        !new ListAssert(a).containsAll(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {1,3}
        Arrays.asList(1,2) | new Integer[] {1,3}
        Arrays.asList(1,2) | Arrays.asList(1,3)
    }

    def "ListAssert:containsAny passed"() {
        expect:
        new ListAssert(a).containsAny(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {1,3}
        Arrays.asList(1,2) | Arrays.asList(1,3)
    }

    def "ListAssert:containsAny not passed"() {
        expect:
        !new ListAssert(a).containsAny(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {3,4}
//        Arrays.asList(1,2) | Arrays.asList(1,3)
    }

    def "ListAssert:containsNone passed"() {
        expect:
        new ListAssert(a).containsNone(b).getResult()

        where:
        a | b
//        Arrays.asList(1,2) | new Integer[] {1,4}
        Arrays.asList(1,2) | new Integer[] {3,4}
        Arrays.asList(1,2) | Arrays.asList(3,4)
    }

    def "ListAssert:containsNone not passed"() {
        expect:
        !new ListAssert(a).containsNone(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {1}
        Arrays.asList(1,2) | new Integer[] {2}
        Arrays.asList(1,2) | Arrays.asList(1,2)
        Arrays.asList(1,2) | new Integer[] {1,4}
        Arrays.asList(1,2) | new Integer[] {1,2,3}
        Arrays.asList(1,2) | Arrays.asList(1)
        Arrays.asList(1,2) | Arrays.asList(2)
        Arrays.asList(1,2) | Arrays.asList(1,2)
        Arrays.asList(1,2) | Arrays.asList(1,4)
        Arrays.asList(1,2) | Arrays.asList(1,2,3)
    }

    def "ListAssert:hasAnyIn passed"() {
        expect:
        new ListAssert(a).hasAnyIn(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {1}
        Arrays.asList(1,2) | Arrays.asList(1,2)
        Arrays.asList(1,2) | new Integer[] {1,3}
        Arrays.asList(1,2) | Arrays.asList(1)
        Arrays.asList(1,2) | Arrays.asList(1,2)
        Arrays.asList(1,2) | Arrays.asList(1,3)
    }

    def "ListAssert:hasAnyIn not passed"() {
        expect:
        !new ListAssert(a).hasAnyIn(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {3,4}
        Arrays.asList(1,2) | Arrays.asList(3,4)
    }

    def "ListAssert:isAllIn passed"() {
        expect:
        new ListAssert(a).isAllIn(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | Arrays.asList(1,2)
        Arrays.asList(1,2) | new Integer[] {1,2,3}
        Arrays.asList(1,2) | Arrays.asList(1,2,)
        Arrays.asList(1,2) | Arrays.asList(1,2,3)
    }

    def "ListAssert:isAllIn not passed"() {
        expect:
        !new ListAssert(a).isAllIn(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {1,3}
        Arrays.asList(1,2) | new Integer[] {3,4}
        Arrays.asList(1,2) | Arrays.asList(1,3)
        Arrays.asList(1,2) | Arrays.asList(3,4)
    }

    def "ListAssert:hasNoneIn passed"() {
        expect:
        new ListAssert(a).hasNoneIn(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {3,4}
        Arrays.asList(1,2) | Arrays.asList(3,4)
    }

    def "ListAssert:hasNoneIn not passed"() {
        expect:
        !new ListAssert(a).hasNoneIn(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | new Integer[] {1,3}
        Arrays.asList(1,2) | new Integer[] {1,2,3}
        Arrays.asList(1,2) | Arrays.asList(1,3)
        Arrays.asList(1,2) | Arrays.asList(1,2,3)
    }

    def "ListAssert:hasOneSize passed"() {
        expect:
        new ListAssert(a).hasOneSize().getResult()

        where:
        a << [Arrays.asList(new Integer[] {null}),Arrays.asList(1)]
    }

    def "ListAssert:hasOneSize not passed"() {
        expect:
        !new ListAssert(a).hasOneSize().getResult()

        where:
        a << [Arrays.asList(), Arrays.asList(1,2)]
    }

    def "ListAssert:hasMoreThanOneSize passed"() {
        expect:
        new ListAssert(a).hasMoreThanOneSize().getResult()

        where:
        a << [Arrays.asList(1,2)]
    }

    def "ListAssert:hasMoreThanOneSize not passed"() {
        expect:
        !new ListAssert(a).hasMoreThanOneSize().getResult()

        where:
        a << [Arrays.asList(new Integer[] {null}), Arrays.asList(new Integer[] {1})]
    }

    def "ListAssert:isSizeEqualTo passed"() {
        expect:
        new ListAssert(a).isSizeEqualTo(b).getResult()

        where:
        a | b
        Arrays.asList(1,null) | 2
        Arrays.asList(1,2) | 2
    }

    def "ListAssert:isSizeEqualTo not passed"() {
        expect:
        !new ListAssert(a).isSizeEqualTo(b).getResult()

        where:
        a | b
        Arrays.asList(1,null) | 1
        Arrays.asList(1,2) | 3
    }

    def "ListAssert:isSizeLessThan passed"() {
        expect:
        new ListAssert(a).isSizeLessThan(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 3
    }

    def "ListAssert:isSizeLessThan not passed"() {
        expect:
        !new ListAssert(a).isSizeLessThan(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 1
    }

    def "ListAssert:isSizeLessThanOrEqualTo passed"() {
        expect:
        new ListAssert(a).isSizeLessThanOrEqualTo(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 2
        Arrays.asList(1,2) | 3
    }

    def "ListAssert:isSizeLessThanOrEqualTo not passed"() {
        expect:
        !new ListAssert(a).isSizeLessThanOrEqualTo(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 1
    }


    def "ListAssert:isSizeGreaterThan passed"() {
        expect:
        new ListAssert(a).isSizeGreaterThan(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 1
    }

    def "ListAssert:isSizeGreaterThan not passed"() {
        expect:
        !new ListAssert(a).isSizeGreaterThan(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 2
        Arrays.asList(1,2) | 3
    }


    def "ListAssert:isSizeGreaterThanOrEqualTo passed"() {
        expect:
        new ListAssert(a).isSizeGreaterThanOrEqualTo(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 1
        Arrays.asList(1,2) | 2
    }

    def "ListAssert:isSizeGreaterThanOrEqualTo not passed"() {
        expect:
        !new ListAssert(a).isSizeGreaterThanOrEqualTo(b).getResult()

        where:
        a | b
        Arrays.asList(1,2) | 3
    }

    def "ListAssert:isSizeBetween passed"() {
        expect:
        new ListAssert(a).isSizeBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 1 | 2
        Arrays.asList(1,2) | 2 | 3
        Arrays.asList(1,2) | 1 | 3
    }

    def "ListAssert:isSizeBetween not passed"() {
        expect:
        !new ListAssert(a).isSizeBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 0 | 1
        Arrays.asList(1,2) | 3 | 4
    }

    def "ListAssert:isSizeStrictlyBetween passed"() {
        expect:
        new ListAssert(a).isSizeStrictlyBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 1 | 3
    }

    def "ListAssert:isSizeStrictlyBetween not passed"() {
        expect:
        !new ListAssert(a).isSizeStrictlyBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 0 | 1
        Arrays.asList(1,2) | 1 | 2
        Arrays.asList(1,2) | 2 | 3
        Arrays.asList(1,2) | 3 | 4
    }


    def "ListAssert:isSizeStartInclusiveBetween passed"() {
        expect:
        new ListAssert(a).isSizeStartInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 2 | 3
        Arrays.asList(1,2) | 1 | 3
    }

    def "ListAssert:isSizeStartInclusiveBetween not passed"() {
        expect:
        !new ListAssert(a).isSizeStartInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 0 | 1
        Arrays.asList(1,2) | 1 | 2
        Arrays.asList(1,2) | 3 | 4
    }


    def "ListAssert:isSizeEndInclusiveBetween passed"() {
        expect:
        new ListAssert(a).isSizeEndInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 1 | 2
        Arrays.asList(1,2) | 1 | 3
    }

    def "ListAssert:isSizeEndInclusiveBetween not passed"() {
        expect:
        !new ListAssert(a).isSizeEndInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        Arrays.asList(1,2) | 0 | 1
        Arrays.asList(1,2) | 2 | 3
        Arrays.asList(1,2) | 3 | 4
    }
}