public class SmallestMultiple {
    public static void main(String[] args) {
        int smallestPossibleNumeber = FindSmallestPossibleEvenDivisor();
        System.out.println(smallestPossibleNumeber);
    }

    public static int FindSmallestPossibleEvenDivisor() {
        int lowerBoundInclusive = 1;
        int upperBoundInclusive = 20;
        int smallestNumber = lowerBoundInclusive;
        for (int i = lowerBoundInclusive + 1; i <= upperBoundInclusive; i++) {
            smallestNumber *= i;
        }
        return smallestNumber;
    }
}