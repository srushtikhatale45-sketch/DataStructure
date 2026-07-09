package Array;
//passing array to method
public class PassByReference {
    static void Change(int[] arr) {
        arr[2]=20;
    }
    static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        System.out.println(arr1[2]);//30
        Change(arr1);
        System.out.println(arr1[2]);//20
    }
}
