package basics

fun main() {
    val number = "10"
    println(10 + number.toInt())
    println(10.toString() + number)
    println()

    val d = 3.0
    println(d)
    println(d.toInt())
    println(d.toFloat())
    println(d.toBigDecimal())
    println(d.toUInt())
    println(d.toRawBits())
}