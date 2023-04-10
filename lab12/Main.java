package lab12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i=0; i<n; i++)
        {

            array[i] = scanner.nextInt();
        }

        double average = findAverFromArr( array, n, 0);
        System.out.println("Average is " + average);
    }
    public static double findAverFromArr(int[] arr, int n, int i) {

     if(i == n -1){
         return arr[i];

        }
     if(i == 0){
         return ((arr[i] + findAverFromArr(arr, n, i+1))/n);
     }
     return (arr[i] + findAverFromArr(arr, n , i+1));
     // here we are finding average from the array
    }
}
