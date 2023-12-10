package basics

fun main() {
    val isAdult: Boolean? = null

    // when boolean is null, this check is required
    if (isAdult == true) {
        println("not null and true")
    } else {
        println("false or null")
    }
}