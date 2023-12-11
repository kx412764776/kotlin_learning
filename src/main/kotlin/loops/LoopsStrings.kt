package loops

fun main() {
    val brand = "selfridges"
    for (letter in brand.toCharArray()) {
        print("$letter ")
    }
    println()
    for (letter in brand) {
        print("$letter ")
    }
}