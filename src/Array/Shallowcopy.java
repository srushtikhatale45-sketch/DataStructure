package Array;

public class Shallowcopy {
    static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = arr;
        arr1[2]=6;
        System.out.println(arr[2]);
    }
}
