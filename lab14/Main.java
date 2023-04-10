package lab14;

import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // instance
        System.out.println("Enter the number :"); // prints
        int num = sc.nextInt(); // storing num
        if(num>=0)
        {
            int factorial=findFactorial(num); // method findFactorial
            System.out.println("The factorial of the entered the number is :"+factorial);
        }
        else // if number<0
        {
            System.out.println("Factorial not possible.");
            System.out.println("Please enter valid input.");
        }
    }
    public static int findFactorial(int num)
    {
        if(num==0)
            return 1;
        else if(num==1)
            return 1;
        else
            return num*findFactorial(num-1);
        // this code checks number is 1 or 0 and finds factorial
    }
    public static int findFibonacci(int n){
        if(n==1) {
            return 1;
        }
        if(n==0){
            return 0;
        }
        return  findFibonacci(n-1)+findFibonacci(n-2);
        // if input 0 or 1 then there is formula
    }
    public static int findPow(int n,int i){
        if(i==1) {
            return n;
        }
        if(i==0){
            return 1;
        }
        if(n==1) {
            return 1;
        }
        if(n==0){
            return 0;
        }
        return  n*findPow(n,i-1);
        // we check for the correctness of data and use recursion for multiplying n method findPOw
    }
    public static void reverseArray(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
        // here method that reverses array of integers in place
    }
    public static boolean isDigits(String s){
        if (s.length() == 0) {
            return false;
        } else if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        } else {
            return Character.isDigit(s.charAt(0)) && isDigits(s.substring(1));
        }
        // here we checking for the correctness and returns if input are string are digits
    }
    int[] array = new int[n];
          for (int i=0; i<n; i++) {
    array[i] = scanner.nextInt();
}
    reverseArray(array, 0, n-1);
        System.out.println("Reversed array:");
        for(int i=0; i<n; i++) {
    System.out.print(array[i] + " ");
    // here reverse the array and separated by space and iterates n times
}
}