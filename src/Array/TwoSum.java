package Array;

import java.util.Scanner;

public class TwoSum {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number array elements here: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements here: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.print("Enter the target value: ");
        int  target= sc.nextInt();
        twoSum(arr,target);

    }
    static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static boolean twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target) return true;
            }
        }
        return  false;

    }
}
