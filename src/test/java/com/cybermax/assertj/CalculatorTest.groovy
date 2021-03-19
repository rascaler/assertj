package com.cybermax.assertj

import com.cybermax.assertj.mock.Calculator
import spock.lang.Specification
import spock.lang.Unroll


@Unroll
class CalculatorTest extends Specification {

    def "should calculate: #x + #y = #sum"() {

        expect:
        Calculator.take(x).add(y).calculate() == sum

        where:
        x | y  | sum
        1 | 2  | 3
        2 | 5  | 7
        3 | -1 | 2

    }

    def "should subtract numbers"() {

        given:
        Calculator calculator = new Calculator()
        when:
        calculator.add(4).subtract(4)
        then:
        calculator.calculate() == 0

    }

    def "should multiply" () {

        expect:
        Calculator.take(2).multiply(2).calculate() == 4

    }
}