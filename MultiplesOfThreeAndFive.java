import java.util.Set;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class MultiplesOfThreeAndFive {
    public static void main(String[] args) {
        int result = FindSumOfXAndYGreaterThanOneAndBelowZ(3, 5, 10);
        System.out.println("Result: " + result);
    }

    public static int FindSumOfXAndYGreaterThanOneAndBelowZ(int x, int y, int zExclusive) {
        int sumOfMultiplesOfX = FindSumOfMultiplesOfXGreaterThanOneAndBelowY(x, zExclusive);
        int sumOfMultiplesOfY = FindSumOfMultiplesOfXGreaterThanOneAndBelowY(y, zExclusive);
        int sumOfMultiplesOfXAndY = FindSumOfMultiplesOfXGreaterThanOneAndBelowY(x * y, zExclusive);
        int totalSum = (sumOfMultiplesOfX + sumOfMultiplesOfY) - sumOfMultiplesOfXAndY;
        return totalSum;
    }

    public static int FindSumOfMultiplesOfXGreaterThanOneAndBelowY(int x, int yExclusive) {
        int numberOfMultiples = (yExclusive - 1) / x;
        int sumOfMultiples = numberOfMultiples * (numberOfMultiples + 1) / 2;
        int totalAnswer = x * sumOfMultiples;
        return totalAnswer;
    }
}