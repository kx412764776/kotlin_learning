import java.util.*;

public class hsbcTest {

    static class MonthData {
        int cardPaymentCount = 0;
        int cardPaymentTotalCost = 0;
    }

    public static int solution(int[] A, String[] D) {
        int totalIncome = 0;
        int totalExpenses = 0;
        Map<String, MonthData> monthsDataMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int amount = A[i];
            String date = D[i];
            String month = date.substring(5, 7);

            if (amount >= 0) {
                totalIncome += amount;
            } else {
                totalExpenses += amount;

                MonthData monthData = monthsDataMap.getOrDefault(month, new MonthData());
                monthData.cardPaymentCount += 1;
                monthData.cardPaymentTotalCost -= amount;
                monthsDataMap.put(month, monthData);
            }
        }

        int monthsWithFeeWaived = 0;
        for (MonthData monthData : monthsDataMap.values()) {
            if (monthData.cardPaymentCount >= 3 && monthData.cardPaymentTotalCost >= 100) {
                monthsWithFeeWaived += 1;
            }
        }

        int totalFee = 5 * (12 - monthsWithFeeWaived);
        return totalIncome + totalExpenses - totalFee;
    }



    public static void main(String[] args) {
        int[] A1 = {100, 100, 100, -10};
        String[] D1 = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        System.out.println(solution(A1, D1)); // Output: 230

        int[] A2 = {180, -50, -25, -25};
        String[] D2 = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};
        System.out.println(solution(A2, D2)); // Output: 25

        int[] A3 = {1, -1, 0, -105, 1};
        String[] D3 = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"};
        System.out.println(solution(A3, D3)); // Output: -164

        int[] A4 = {100, 100, -10, -20, -30};
        String[] D4 = {"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"};
        System.out.println(solution(A4, D4)); // Output: 80
    }

}
