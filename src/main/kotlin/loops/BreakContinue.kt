package loops

fun main() {
    val nums = intArrayOf(
        1, 2, 3, 4, 5, 6, 7, 8
    )

    for (n in nums) {
        if (n % 2 == 0) continue
        if (n > 6) break
        println(n)
    }
    println("Some code")

    // this is not allowed
    /*
    nums.forEach {
        if (it == 2) {
            continue
        }
    }
     */
}