public class FirstPrimeNumbers {
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
        int numberOfPrimeNumbers= 20;
        int count=0;
        for(int number=1;count<20;number++){
            if(isPrimeNumber(number)){
                System.out.println(number);
                count++;
            }
        }
    }
}
