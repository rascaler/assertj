package com.cybermax.assertj.core.number;


public interface NumberAssert<SELF extends NumberAssert<SELF, ACTUAL>, ACTUAL extends Number> {

  /**
   * Verifies that the actual value is equal to zero.
   * <p>
   * Example:
   * <pre><code class='java'> // assertions will pass
   * assertThat(0).isZero();
   * assertThat(0.0).isZero();
   *
   * // assertions will fail
   * assertThat(42).isZero();
   * assertThat(3.142).isZero();</code></pre>
   * 
   * @return this assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not equal to zero.
   */
  SELF isZero();

  /**
   * Verifies that the actual value is not equal to zero.
   * <p>
   * Example:
   * <pre><code class='java'> // assertions will pass
   * assertThat(42).isNotZero();
   * assertThat(3.142).isNotZero();
   *
   * // assertions will fail
   * assertThat(0).isNotZero();
   * assertThat(0.0).isNotZero();</code></pre>
   *
   * @return this assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is equal to zero.
   */
  SELF isNotZero();

  /**
   * Verifies that the actual value is equal to one.
   * <p>
   * Example:
   * <pre><code class='java'> // assertions will pass
   * assertThat(1).isOne();
   * assertThat(1.0).isOne();
   *
   * // assertions will fail
   * assertThat(42).isOne();
   * assertThat(3.142).isOne();</code></pre>
   *
   * @return this assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not equal to one.
   * @since 2.7.0 / 3.7.0
   */
  SELF isOne();


  SELF isNotOne();
  /**
   * Verifies that the actual value is positive.
   * <p>
   * Example:
   * <pre><code class='java'> // assertions will pass
   * assertThat(42).isPositive();
   * assertThat(3.142).isPositive();
   *
   * // assertions will fail
   * assertThat(0).isPositive();
   * assertThat(-42).isPositive();</code></pre>
   * 
   * @return this assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not positive.
   */
  SELF isPositive();

  /**
   * Verifies that the actual value is negative.
   * <p>
   * Example:
   * <pre><code class='java'> // assertions will pass
   * assertThat(-42).isNegative();
   * assertThat(-3.124).isNegative();
   *
   * // assertions will fail
   * assertThat(0).isNegative();
   * assertThat(42).isNegative();</code></pre>
   * 
   * @return this assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not negative.
   */
  SELF isNegative();

  /**
   * Verifies that the actual value is non negative (positive or equal zero).
   * <p>
   * Example:
   * <pre><code class='java'> // assertions will pass
   * assertThat(42).isNotNegative();
   * assertThat(0).isNotNegative();
   *
   * // assertions will fail
   * assertThat(-42).isNotNegative();
   * assertThat(-3.124).isNotNegative();</code></pre>
   * 
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not non negative.
   */
  SELF isNotNegative();

  /**
   * Verifies that the actual value is non positive (negative or equal zero).
   * <p>
   * Example:
   * <pre><code class='java'> // assertions will pass
   * assertThat(-42).isNotPositive();
   * assertThat(0).isNotPositive();
   *
   * // assertions will fail
   * assertThat(42).isNotPositive();
   * assertThat(3.124).isNotPositive();</code></pre>
   * 
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not non positive.
   */
  SELF isNotPositive();
}
