package com.qing.assertj

import com.qing.assertj.core.array.IntArrayAssert
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ArrayAssertTest extends Specification {

    def "IntArrayAssert:isEmpty passed"() {
        expect:
        new IntArrayAssert(a).isEmpty().getResult()

        where:
        a <<[new int[] {}, null]
    }

    def "IntArrayAssert:isEmpty not passed"() {
        expect:
        !new IntArrayAssert(a).isEmpty().getResult()

        where:
        a <<[new int[] {1}]
    }
}