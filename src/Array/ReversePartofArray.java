package Array;

import java.util.Scanner;

public class ReversePartofArray {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Reverse(arr);

    }
    static void Reverse(int[] arr){
        int i=4,j=8;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
