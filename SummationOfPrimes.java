public class SummationOfPrimes {
    public static void main(String[] args) {
        int twoMillion = 2000000;
        int result = GetSumOfPrimesBelow(twoMillion);
        System.out.println(result);
    }

    public static Set<Integer> GetPrimesBelow(int upperBoundExclusive) {
        return null;
    }

    public static int GetSumOfPrimesBelow(int upperBoundExclusive) {
        Set<Integer> primes = GetPrimesBelow(upperBoundExclusive);
        int result = GetSumOfSet(primes);
        return result;
    }

    public static int GetSumOfSet(Set<Integer> set) {
        int sum = 0;
        for (Integer num : set) {
            sum += num.intValue();
        }
        return sum;
    }
}