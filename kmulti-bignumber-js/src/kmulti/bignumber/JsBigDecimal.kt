package kmulti.bignumber

actual class BigDecimal() : Number(), Comparable<BigDecimal> {

    actual constructor(strVal: String) : this() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual constructor(doubleVal: Double) : this() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual constructor(intVal: Int) : this() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual constructor(longVal: Long) : this() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun compareTo(other: BigDecimal): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toByte(): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toChar(): Char {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toDouble(): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toFloat(): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toInt(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toLong(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toShort(): Short {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun add(augend: BigDecimal): BigDecimal {
        throw Exception("Not implemented")
    }

    actual fun subtract(subtrahend: BigDecimal): BigDecimal {
        throw Exception("Not implemented")
    }

    actual fun multiply(multiplicand: BigDecimal): BigDecimal {
        throw Exception("Not implemented")
    }

    actual fun divide(divisor: BigDecimal): BigDecimal {
        throw Exception("Not implemented")
    }

    actual fun remainder(divisor: BigDecimal): BigDecimal {
        throw Exception("Not implemented")
    }

    actual fun negate(): BigDecimal {
        throw Exception("Not implemented")
    }
}
