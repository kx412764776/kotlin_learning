fun main() {
    val n1 = 31
    val n2 = 20
    // var v = n1 > n2 ? ":)" : ":("
    val v = if (n1 >= n2) ":)" else ":("
    println(v)
    val v1 =
        if (n1 >= n2) ":)"
        else if (n1 == 100) "hooray"
        else ":("
}