package arraysAndLists

fun main() {
    // method 1
    val names = arrayOf(
        "Jamila", "James"
    )
    println(names)
    println(names.contentToString())
    println(names[0])
    println(names[1])
    println("Array size: ${names.size}")

    if ("Jamila" in names) {
        println("found")
    } else {
        println("not found")
    }

    // method 2
    val arrayOfNulls = arrayOfNulls<String>(5)

    arrayOfNulls[4] = "hello"
    println(arrayOfNulls.contentToString())

    arrayOfNulls.fill("*")
    println(arrayOfNulls.contentToString())

}