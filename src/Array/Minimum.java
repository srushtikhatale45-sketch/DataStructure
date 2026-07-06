package Array;

import java.util.Scanner;

public class Minimum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
