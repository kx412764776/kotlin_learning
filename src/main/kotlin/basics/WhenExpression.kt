package basics

fun main() {
    val input = "f"

    val gender = when(input.uppercase()) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> {
            "Unknown Gender"
        }
    }

    println(gender)

    val age = 18

    when (age) {
        in 13..19 -> println("Teenager")
        in 0..12 -> println("Children")
        else -> println("Adult")
    }
}