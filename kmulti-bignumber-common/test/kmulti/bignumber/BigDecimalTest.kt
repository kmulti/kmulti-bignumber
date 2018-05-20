package kmulti.bignumber

import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * @author Andrew Bissell
 */
class BigDecimalTest {
    @Test
    fun testBigDecimal() {
        val ones = BigDecimal("111111111111111.111111111111111111")
        val twos = BigDecimal("222222222222222.222222222222222222")
        val threes = BigDecimal("333333333333333.333333333333333333")
        assertTrue { ones + twos eq threes }
    }

    @Test
    fun testInequality() {
        val ones = BigDecimal("111111111111111.111111111111111111")
        val twos = BigDecimal("222222222222222.222222222222222222")
        assertTrue { ones < twos }
        assertTrue { twos > ones }
        assertTrue { ones neq twos }
        assertTrue { ones != twos }
    }

    @Test
    fun testPreciseEquality() {
        val ones = BigDecimal("111111111111111.111111111111111111")
        val more = BigDecimal("111111111111111.111111111111111111")
        assertTrue { ones == more }
        assertTrue { ones.compareTo(more) == 0 }
    }

    @Test
    fun testConstructorEquality() {
        val fromStr = BigDecimal("1111")
        val fromDouble = BigDecimal(1111.0)
        val fromInt = BigDecimal(1111)
        val fromLong = BigDecimal(1111L)
        assertTrue { fromStr eq fromDouble }
        assertTrue { fromDouble eq fromInt }
        assertTrue { fromInt eq fromLong }
    }

    @Test
    fun testImpreciseEquality() {
        val ones = BigDecimal("1111.1111")
        val sum = ones + ones
        val twos = BigDecimal("2222.22220")
        assertTrue { sum != twos }
        assertTrue { sum eq twos }
    }

    @Test
    fun testNegation() {
        val ones = BigDecimal("111111111111111.111111111111111111")
        val neg = ones * NEGATIVE_ONE
        val minusOnes = BigDecimal("-111111111111111.111111111111111111")
        assertTrue { neg eq minusOnes }
        assertTrue { (ones + minusOnes) eq ZERO }
        assertTrue { -ones eq neg }
    }

    @Test
    fun testIdentityMultiplication() {
        val ten = ONE * TEN
        assertTrue { ten eq TEN }
    }

    @Test
    fun testDivisionAndRemainder() {
        val numer = BigDecimal(3)
        val denom = BigDecimal(4)
        assertTrue { numer / denom eq BigDecimal(0.75) }
        assertTrue { numer % denom eq BigDecimal(3) }
        val negNumer = BigDecimal(-3)
        assertTrue { negNumer / denom eq BigDecimal(-0.75) }
        assertTrue { negNumer % denom eq BigDecimal(-3) }
    }

    @Test
    fun testIncAndDec() {
        var mutable = BigDecimal("4.0")
        mutable++
        assertTrue { mutable eq BigDecimal("5.0") }
        mutable--
        assertTrue { mutable eq BigDecimal("4.0") }
    }
}
