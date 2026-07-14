package Array;

public class SearchinArray {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        boolean found = false;
        int key=30;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key);
            found=true;
        }
        if(found){
            System.out.println("Element is present.");
        }
        else {
            System.out.println("Element is not present.");
            System.out.println("Element is not present.");
        }
    }
}
