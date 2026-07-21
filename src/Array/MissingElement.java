package Array;

import java.util.Scanner;

public class MissingElement {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n =sc.nextInt();
        System.out.print("Enter the array element: ");
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        ArrayElement(arr);
    }
    static  int ArrayElement(int[] arr){
        int sumarray = 0;
        int n =arr.length+1;
        int totalsum= n*(n+1)/2;
        for(int ele:arr){
            sumarray+=ele;
        }
        return totalsum-sumarray;
    }
}
