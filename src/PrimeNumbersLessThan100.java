public class PrimeNumbersLessThan100 {
    public static boolean isPrimeNumber(int number){
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        for(int number=1;number<100;number++){
            if(isPrimeNumber(number)){
                System.out.println(number);
            }
        }
    }
}
