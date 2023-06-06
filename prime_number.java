//2. Checking for a Prime Number

public class prime_number {
    public static void main(String[] args) {
        int num = 29; //number to test
        boolean isPrime = true;

        //Process
        //Implement for-loop and conditional if-else statements to test the number
        for(int i = 2; i < num; i++) {
            if(num%i==0) {
                isPrime = false;
                break;
            }
        }

        //print question
        System.out.println("---------------------------------------------");
        System.out.println("Checking for a Prime Number");
        System.out.println("---------------------------------------------");
        System.out.println("Number: 29");
        System.out.println("---------------------------------------------");

        //print output
        if(isPrime) {
            System.out.println(num + " is a prime number.");
            System.out.println("---------------------------------------------");
        }
        else {
            System.out.println(num + " is not ra prime number.");
            System.out.println("---------------------------------------------");
        }
    }
}
