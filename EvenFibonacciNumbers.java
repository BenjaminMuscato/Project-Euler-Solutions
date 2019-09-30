public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int sum = FindSumOfEvenValuedFibonacciTermsBelow(4000000);
        System.out.println(sum);
    }

    public static int FindSumOfEvenValuedFibonacciTermsBelow(int upperBound) {
        int b = 1;
        int c = 2, d;
        long sum = 0;
        while(c < upperBound) {
            sum += c;
            d = b+(c<<0x01);
            c = d+b+c;
            b = d;
        }
        return (int) sum;
    }
}