package Array;

import java.util.Scanner;

public class SearchinArray {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of element present in the array:  ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;
        System.out.print("Enter the  element present in the array:  ");
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the target value to be found: ");
        int key=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key) {
                System.out.print(i);
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element is present.");
        }
        else {
            System.out.println("Element is not present.");
        }
    }
}
