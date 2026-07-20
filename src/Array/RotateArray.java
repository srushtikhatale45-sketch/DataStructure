package Array;

import java.util.Scanner;

public class RotateArray {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();
        d=d%n;
        Rotate(arr,0,d-1);
        Rotate(arr,d,n-1);
        Rotate(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    static void Rotate(int[] arr ,int i,int j){
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
