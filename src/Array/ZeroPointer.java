package Array;

import java.util.Scanner;

public class ZeroPointer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array Element: ");
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
        int n =arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            if(i>j) {
                break;
            }
            if (arr[i] == 1 && arr[j] == 0) {
                    arr[i] = 0;
                    arr[j] = 1;
                    i++;
                    j--;
            }
    }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
