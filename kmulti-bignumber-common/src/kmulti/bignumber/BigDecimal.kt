package kmulti.bignumber

/**
 * Multiplatform `expect` declaration for immutable, arbitrary-precision signed decimal numbers.
 *
 * Ideally this class would extend [Number][kotlin.Number] but we are currently unable to do this
 * due to https://youtrack.jetbrains.com/issue/KT-17345
 *
 * @see kotlin.util.BigDecimals
 *
 * @author Andrew Bissell
 */
expect class BigDecimal(strVal: String) : /*Number,*/ Comparable<BigDecimal> {
    constructor(doubleVal: Double)
    constructor(intVal: Int)
    constructor(longVal: Long)

    fun add(augend: BigDecimal): BigDecimal
    fun subtract(subtrahend: BigDecimal): BigDecimal
    fun multiply(multiplicand: BigDecimal): BigDecimal
    fun divide(divisor: BigDecimal): BigDecimal
    fun remainder(divisor: BigDecimal): BigDecimal
    fun negate(): BigDecimal
}

val ZERO = BigDecimal(0)
val ONE = BigDecimal(1)
val TEN = BigDecimal(10)
val NEGATIVE_ONE = BigDecimal(-1)

operator fun BigDecimal.plus(augend: BigDecimal) = this.add(augend)
operator fun BigDecimal.minus(subtrahend: BigDecimal) = this.subtract(subtrahend)
operator fun BigDecimal.times(multiplicand: BigDecimal) = this.multiply(multiplicand)
operator fun BigDecimal.div(divisor: BigDecimal) = this.divide(divisor)
operator fun BigDecimal.rem(divisor: BigDecimal) = this.remainder(divisor)
operator fun BigDecimal.unaryMinus() = this.negate()
operator fun BigDecimal.inc() = this.add(ONE)
operator fun BigDecimal.dec() = this.subtract(ONE)

infix fun BigDecimal.eq(other: BigDecimal) = this.compareTo(other) == 0
infix fun BigDecimal.neq(other: BigDecimal) = this.compareTo(other) != 0
