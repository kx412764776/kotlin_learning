fun main() {
    // int number = 18;
    var number: Int = 18
    var l: Long = 100L
    var d: Double = 3.14
    var f: Float = 3.14F
    var b: Boolean = true
    var s: String = "kotlin"
    var c: Char = 'a'

    // don't suggest use any
    var x: Any = "13"
    x = 13

    var brandVar = "kotlin"
    brandVar = "KOTLIN"

    // Read only.
    // final String brand = "kotlin";
    val brandVal = "kotlin"

    // null safety
    var brand1 = "end"
    println(brand1.uppercase())

    var brand2: String? = null
    println(brand2?.uppercase())

}
const val PI = 3.14 // static final