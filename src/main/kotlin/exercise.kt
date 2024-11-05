

fun main() {

    val A = intArrayOf(100, 100, 100, -10)
    val D = arrayOf("2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29")
    println(solution(A, D))  // Output: 230


}

fun solution(A: IntArray, D: Array<String>): Int {
    var totalIncome = 0
    var totalExpense = 0
    val monthsDataMap = mutableMapOf<String, MonthData>()

    for (i in A.indices) {
        val amount = A[i]
        val date = D[i]
        val month = date.substring(5, 7)

        if (amount >= 0) {
            totalIncome += amount
        } else {
            totalExpense += amount
            val monthData = monthsDataMap.getOrPut(month) { MonthData(0, 0) }
            monthData.cardPaymentCount += 1
            monthData.cardPaymentTotalCost += -amount
        }
    }

    var monthsWithFeeWaived = 0
    for (monthData in monthsDataMap.values) {
        if (monthData.cardPaymentCount >= 3 && monthData.cardPaymentTotalCost >= 100) {
            monthsWithFeeWaived += 1
        }
    }

    val totalFee = 5 * (12 - monthsWithFeeWaived)
    val finalBalance = totalIncome + totalExpense - totalFee
    return finalBalance
}

data class MonthData(
    var cardPaymentCount: Int,
    var cardPaymentTotalCost: Int
)

fun solution2(s: String): String {
    if (s.isEmpty()) return "other"

    val c = s[0]

    return when {
        c.isDigit() -> "digit"
        c.isLowerCase() -> "lower"
        c.isUpperCase() -> "upper"
        else -> "other"
    }
}