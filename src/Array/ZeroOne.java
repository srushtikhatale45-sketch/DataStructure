package Array;

import java.util.Scanner;

public class ZeroOne {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i]= sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        Segregate0and1(arr);

    }
    static void Segregate0and1(int[] arr) {
        int number0= 0;
        for (int ele:arr) {
            if(ele==0){
                number0++;
            }

        }
        for(int i=0;i<number0;i++){
            arr[i]=0;
        }
        for(int i=number0;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

}
