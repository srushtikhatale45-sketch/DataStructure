package Array;

public class ShallowCopyDeepCopy {
    static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int[] x = arr;
        x[1] =69;
        System.out.println(arr[1]);
    }
}
