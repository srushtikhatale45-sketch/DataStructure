package Array;

import java.util.Scanner;

public class Reversearray {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Element of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int i =0,j=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
