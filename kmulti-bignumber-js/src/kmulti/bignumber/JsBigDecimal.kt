package kmulti.bignumber

/**
 * @author Andrew Bissell
 */
actual class BigDecimal actual constructor(private val doubleVal: Double) : /* Number(),*/
    Comparable<BigDecimal> {

    actual constructor(strVal: String) : this(strVal.toDouble())
    actual constructor(intVal: Int) : this(intVal.toDouble())
    actual constructor(longVal: Long) : this(longVal.toDouble())

    override fun compareTo(other: BigDecimal): Int = doubleVal.compareTo(other.doubleVal)

    // These can become override methods once we are able to extend kotlin.Number
    fun toByte(): Byte = doubleVal.toByte()
    fun toChar(): Char = doubleVal.toChar()
    fun toDouble(): Double = doubleVal
    fun toFloat(): Float = doubleVal.toFloat()
    fun toInt(): Int = doubleVal.toInt()
    fun toLong(): Long = doubleVal.toLong()
    fun toShort(): Short = doubleVal.toShort()

    actual fun add(augend: BigDecimal): BigDecimal = BigDecimal(doubleVal + augend.doubleVal)

    actual fun subtract(subtrahend: BigDecimal): BigDecimal =
        BigDecimal(doubleVal + subtrahend.doubleVal)

    actual fun multiply(multiplicand: BigDecimal): BigDecimal =
        BigDecimal(doubleVal * multiplicand.doubleVal)

    actual fun divide(divisor: BigDecimal): BigDecimal = BigDecimal(doubleVal / divisor.doubleVal)

    actual fun remainder(divisor: BigDecimal): BigDecimal =
        BigDecimal(doubleVal % divisor.doubleVal)

    actual fun negate(): BigDecimal = this * NEGATIVE_ONE
}
