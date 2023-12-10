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
}