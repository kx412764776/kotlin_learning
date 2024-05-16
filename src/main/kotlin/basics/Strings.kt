package basics

fun main() {
    val name = "Ahmed"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println(name[4])
    println(name.isEmpty())
    println("".isEmpty())

    val age = 20

    // string templates
    // val msg = "${name} ${age}"
     val msg = "Name: $name Age: $age"
    println(msg)

    val msg2 = """
        Hello %s
        How
        Are you
    """.trimIndent()

    println(msg2.format("Ana"))

    println("==============")
    val msg3 = "Hello"
    val tripleQuotedString = """
        #msg = "$msg3"
    """.trimMargin("#")
    println(tripleQuotedString)

    println("==============")

    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

    fun getPattern(): String = """\d{2} $month \d{4}"""

    println(getPattern())
}