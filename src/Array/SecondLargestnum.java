package Array;

import java.util.Scanner;

public class SecondLargestnum{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        LargestNum2(arr);
    }
    public static void LargestNum2(int[] arr){
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest2 && arr[i]!=largest){
                largest2=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(largest2);
    }

}