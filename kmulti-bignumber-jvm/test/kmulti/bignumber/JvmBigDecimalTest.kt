package kmulti.bignumber

import kotlin.test.Test
import kotlin.test.assertTrue

class JvmBigDecimalTest {
    @Test
    fun testPreciseEquality() {
        val ones = BigDecimal("111111111111111.111111111111111111")
        val more = BigDecimal("111111111111111.111111111111111111")
        assertTrue { ones == more }
        assertTrue { ones.compareTo(more) == 0 }
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

