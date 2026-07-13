package Array;

import java.util.Scanner;

public class OperationsOnArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        print(arr);
        operation(arr);
    }
    public static void operation(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
              arr[i]=arr[i]+10;
            }
            else {
                arr[i]=2*arr[i];
            }
        }
        print(arr);
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            }
        System.out.println();
        }

}

