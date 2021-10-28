package com.qing.assertj

import com.qing.assertj.core.array.BoxedIntArrayAssert
import com.qing.assertj.core.array.IntArrayAssert
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ArrayAssertTest extends Specification {

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
        new Integer[] {1,2} | new Integer[] {1}
        new Integer[] {1,2} | new Integer[] {1,1,1}
        new Integer[] {1,2} | Arrays.asList(1)
    }

    def "BoxedIntArrayAssert:containsAll not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).containsAll(b).getResult()

        where:
        a | b
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
        !new BoxedIntArrayAssert(a).containsAny(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | Arrays.asList(1,3)
    }

    def "BoxedIntArrayAssert:isAllIn not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).containsAny(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | Arrays.asList(1,3)
    }

    def "BoxedIntArrayAssert:hasNoneIn passed"() {
        expect:
        !new BoxedIntArrayAssert(a).containsAny(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | Arrays.asList(1,3)
    }

    def "BoxedIntArrayAssert:hasNoneIn not passed"() {
        expect:
        !new BoxedIntArrayAssert(a).containsAny(b).getResult()

        where:
        a | b
        new Integer[] {1,2} | new Integer[] {1,3}
        new Integer[] {1,2} | Arrays.asList(1,3)
    }



}