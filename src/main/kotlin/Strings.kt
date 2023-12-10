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
}