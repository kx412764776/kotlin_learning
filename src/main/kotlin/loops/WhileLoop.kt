package loops

fun main() {
    var number = 1
    while (number <= 5) {
        println("Number ${number++}")
    }

    val brand = "selfridges"
    var index1 = brand.length - 1
    while (index1 >= 0) {
        print("${brand[index1--]} ")
    }
    println()

    var index2 = 0
    while (index2 < brand.length) {
        print("${brand[index2++]} ")
    }
}