package functions

fun main() {
    greet("Jamila", 18)
    greet(age=15, name="Alex")
    greet("Bob")

    functionsAsArguments()

    val d = double(10)
    println(d)

    println()

    val (v1, v2) = twoValues()
    println("$v1 $v2")
    val (t1, t2, t3) = threeValues()
    println("$t1 $t2 $t3")
}

//fun twoValues(): Pair<String, Int> {
//    return "Kotlin" to 20
//}
fun twoValues(): Pair<String, Int> =
    "Kotlin" to 20

fun twoValues2(): Pair<String, Int> =
    Pair("Kotlin", 20)

fun threeValues(): Triple<String, Int, Char> {
    return Triple(
        "Kotlin",
        20,
        'Z'
    )
}

//fun double(n: Int): Int{
//    return n * 2
//}

//fun double(n: Int): Int = n * 2
fun double(n: Int) = n * 2


private fun functionsAsArguments() {
    foo(bar = {
        println("bar as a function")
    })
    foo {
        println("baz baz")
    }
}

fun foo(bar: () -> Unit) {
    println("bar function")
    bar()
}

// java: public void greet()
fun greet(name: String, age: Int = -1): Unit {
    println("Hello $name")
    if (age == -1) {
        println("age not provided\n")
        return
    }
    if (age >= 16) {
        println("$name is an adult\n")
    } else {
        println("$name is not an adult\n")
    }
}