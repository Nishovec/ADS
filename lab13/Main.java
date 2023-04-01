package lab13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        checkPrime(n);

    }
    public static void checkPrime( int n) {
        if (n <= 1) {
            System.out.println(n + " is not prime or composite.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime ");
            } else {
                System.out.println("Composite ");
            }
        }
    }
}