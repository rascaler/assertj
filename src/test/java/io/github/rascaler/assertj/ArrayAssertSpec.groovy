package io.github.rascaler.assertj

import io.github.rascaler.assertj.core.array.BoxedIntArrayAssert
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ArrayAssertSpec extends Specification {

    def "BoxedIntArrayAssert:isEmpty passed"() {
        expect:
        new BoxedIntArrayAssert(a).isEmpty().getResult()

        where:
        a <<[new Integer[] {}, null]
    }

    def "BoxedIntArrayAssert:isEmpty not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isEmpty().getResult()

        where:
        a <<[new Integer[] {1}]
    }

    def "BoxedIntArrayAssert:isNotEmpty passed"() {
        expect:
        new BoxedIntArrayAssert(a).isNotEmpty().getResult()

        where:
        a <<[new Integer[] {1}]
    }

    def "BoxedIntArrayAssert:isNotEmpty not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isNotEmpty().getResult()

        where:
        a <<[new Integer[] {}, null]
    }

    def "BoxedIntArrayAssert:hasEmptyElement passed"() {
        expect:
        new BoxedIntArrayAssert(a).hasEmptyElement().getResult()

        where:
        a << [new Integer[] {1, null, 2}]
    }


    def "BoxedIntArrayAssert:hasEmptyElement not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).hasEmptyElement().getResult()

        where:
        a << [new Integer[] {1, 2}]
    }

    def "BoxedIntArrayAssert:containsAll passed"() {
        expect:
        new BoxedIntArrayAssert(a).containsAll(b).getResult()

        where:
        a | b
        new Integer[] {} | new Integer[] {}
        new Integer[] {1,2} | new Integer[] {}
        new Integer[] {1,2} | new Integer[] {1}
        new Integer[] {1,2} | new Integer[] {1,1,1}
        new Integer[] {} | Arrays.asList()
        new Integer[] {1,2} | Arrays.asList()
        new Integer[] {1,2} | Arrays.asList(1)
        new Integer[] {1,2} | Arrays.asList(1,1,1)
    }

    def "BoxedIntArrayAssert:containsAll not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).containsAll(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | Arrays.asList(1,3)
    }

    def "BoxedIntArrayAssert:containsAny passed"() {
        expect:
        new BoxedIntArrayAssert(a).containsAny(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | Arrays.asList(1,3)
    }

    def "BoxedIntArrayAssert:containsAny not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).containsAny(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {3,4}
//        new Integer[] {1,2} | Arrays.asList(1,3)
    }

    def "BoxedIntArrayAssert:containsNone passed"() {
        expect:
        new BoxedIntArrayAssert(a).containsNone(b).getResult()

        where:
        a | b
//        new Integer[] {1,2} | new Integer[] {1,4}
        new Integer[] {1,2} | new Integer[] {3,4}
        new Integer[] {1,2} | Arrays.asList(3,4)
    }

    def "BoxedIntArrayAssert:containsNone not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).containsNone(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1}
        new Integer[] {1,2} | new Integer[] {2}
        new Integer[] {1,2} | new Integer[] {1,2}
        new Integer[] {1,2} | new Integer[] {1,4}
        new Integer[] {1,2} | new Integer[] {1,2,3}
        new Integer[] {1,2} | Arrays.asList(1)
        new Integer[] {1,2} | Arrays.asList(2)
        new Integer[] {1,2} | Arrays.asList(1,2)
        new Integer[] {1,2} | Arrays.asList(1,4)
        new Integer[] {1,2} | Arrays.asList(1,2,3)
    }

    def "BoxedIntArrayAssert:hasAnyIn passed"() {
        expect:
        new BoxedIntArrayAssert(a).hasAnyIn(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1}
        new Integer[] {1,2} | new Integer[] {1,2}
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | Arrays.asList(1)
        new Integer[] {1,2} | Arrays.asList(1,2)
        new Integer[] {1,2} | Arrays.asList(1,3)
    }

    def "BoxedIntArrayAssert:hasAnyIn not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).hasAnyIn(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {3,4}
        new Integer[] {1,2} | Arrays.asList(3,4)
    }

    def "BoxedIntArrayAssert:isAllIn passed"() {
        expect:
        new BoxedIntArrayAssert(a).isAllIn(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,2}
        new Integer[] {1,2} | new Integer[] {1,2,3}
        new Integer[] {1,2} | Arrays.asList(1,2,)
        new Integer[] {1,2} | Arrays.asList(1,2,3)
    }

    def "BoxedIntArrayAssert:isAllIn not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isAllIn(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | new Integer[] {3,4}
        new Integer[] {1,2} | Arrays.asList(1,3)
        new Integer[] {1,2} | Arrays.asList(3,4)
    }

    def "BoxedIntArrayAssert:hasNoneIn passed"() {
        expect:
        new BoxedIntArrayAssert(a).hasNoneIn(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {3,4}
        new Integer[] {1,2} | Arrays.asList(3,4)
    }

    def "BoxedIntArrayAssert:hasNoneIn not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).hasNoneIn(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | new Integer[] {1,2,3}
        new Integer[] {1,2} | Arrays.asList(1,3)
        new Integer[] {1,2} | Arrays.asList(1,2,3)
    }

    def "BoxedIntArrayAssert:hasOneSize passed"() {
        expect:
        new BoxedIntArrayAssert(a).hasOneSize().getResult()

        where:
        a << [new Integer[] {null}, new Integer[] {1}]
    }

    def "BoxedIntArrayAssert:hasOneSize not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).hasOneSize().getResult()

        where:
        a << [new Integer[] {}, new Integer[] {1,2}]
    }

    def "BoxedIntArrayAssert:hasMoreThanOneSize passed"() {
        expect:
        new BoxedIntArrayAssert(a).hasMoreThanOneSize().getResult()

        where:
        a << [new Integer[] {1,2}]
    }

    def "BoxedIntArrayAssert:hasMoreThanOneSize not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).hasMoreThanOneSize().getResult()

        where:
        a << [new Integer[] {null}, new Integer[] {1}]
    }

    def "BoxedIntArrayAssert:isSizeEqualTo passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeEqualTo(b).getResult()

        where:
        a | b
        new Integer[] {1, null} | 2
        new Integer[] {1, 2} | 2
    }

    def "BoxedIntArrayAssert:isSizeEqualTo not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeEqualTo(b).getResult()

        where:
        a | b
        new Integer[] {1, null} | 1
        new Integer[] {1, 2} | 3
    }

    def "BoxedIntArrayAssert:isSizeLessThan passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeLessThan(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 3
    }

    def "BoxedIntArrayAssert:isSizeLessThan not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeLessThan(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 1
    }

    def "BoxedIntArrayAssert:isSizeLessThanOrEqualTo passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeLessThanOrEqualTo(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 2
        new Integer[] {1, 2} | 3
    }

    def "BoxedIntArrayAssert:isSizeLessThanOrEqualTo not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeLessThanOrEqualTo(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 1
    }


    def "BoxedIntArrayAssert:isSizeGreaterThan passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeGreaterThan(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 1
    }

    def "BoxedIntArrayAssert:isSizeGreaterThan not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeGreaterThan(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 2
        new Integer[] {1, 2} | 3
    }


    def "BoxedIntArrayAssert:isSizeGreaterThanOrEqualTo passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeGreaterThanOrEqualTo(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 1
        new Integer[] {1, 2} | 2
    }

    def "BoxedIntArrayAssert:isSizeGreaterThanOrEqualTo not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeGreaterThanOrEqualTo(b).getResult()

        where:
        a | b
        new Integer[] {1, 2} | 3
    }

    def "BoxedIntArrayAssert:isSizeBetween passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 1 | 2
        new Integer[] {1, 2} | 2 | 3
        new Integer[] {1, 2} | 1 | 3
    }

    def "BoxedIntArrayAssert:isSizeBetween not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 0 | 1
        new Integer[] {1, 2} | 3 | 4
    }

    def "BoxedIntArrayAssert:isSizeStrictlyBetween passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeStrictlyBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 1 | 3
    }

    def "BoxedIntArrayAssert:isSizeStrictlyBetween not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeStrictlyBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 0 | 1
        new Integer[] {1, 2} | 1 | 2
        new Integer[] {1, 2} | 2 | 3
        new Integer[] {1, 2} | 3 | 4
    }


    def "BoxedIntArrayAssert:isSizeStartInclusiveBetween passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeStartInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 2 | 3
        new Integer[] {1, 2} | 1 | 3
    }

    def "BoxedIntArrayAssert:isSizeStartInclusiveBetween not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeStartInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 0 | 1
        new Integer[] {1, 2} | 1 | 2
        new Integer[] {1, 2} | 3 | 4
    }


    def "BoxedIntArrayAssert:isSizeEndInclusiveBetween passed"() {
        expect:
        new BoxedIntArrayAssert(a).isSizeEndInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 1 | 2
        new Integer[] {1, 2} | 1 | 3
    }

    def "BoxedIntArrayAssert:isSizeEndInclusiveBetween not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).isSizeEndInclusiveBetween(b, c).getResult()

        where:
        a | b | c
        new Integer[] {1, 2} | 0 | 1
        new Integer[] {1, 2} | 2 | 3
        new Integer[] {1, 2} | 3 | 4
    }

}