package basics

fun main() {
    val n1 = 21
    val n2 = 20

    val value = if (n1 > n2) {
        println("True")
        ":)"
    } else {
        println("False")
        ":("
    }

    println(value)
    println("Some code")
}