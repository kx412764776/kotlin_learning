package basics

fun main() {
    val name1 = "Saleh"
    val name2 = String("Saleh".toCharArray())
    val name3 = "Saleh"

    // comparing the contents
    println("== ${name1 == name2}")
    println(".equals ${name1.equals(name2)}")

    // comparing the memory location
    println("=== ${name1 === name2}")
    println("${name1 === name3}")
}