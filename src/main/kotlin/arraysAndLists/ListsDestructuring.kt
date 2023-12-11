package arraysAndLists

fun main() {
    val names = listOf(
        "Jamila",
        "James",
        "Saleh",
        "Peter"
    )

    /*
    val j = names[0]
    val ja = names[1]
    val s = names[2]
     */
    val (one, two, _, four) = names
    println("$one $two $four")
}