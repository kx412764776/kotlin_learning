package loops

fun main() {
    println("range")
    for (i in 1..5) print("$i ")

    println()
    println("downTo")

    for (i in 5 downTo 1) print("$i ")

    println()
    println("steps")

    for (i in 1..5 step 2) print("$i ")
    for (i in 5 downTo 1 step 2) print("$i ")
}