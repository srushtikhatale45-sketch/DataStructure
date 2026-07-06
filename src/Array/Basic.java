package Array;

public class Basic {
    static void main(String[] args) {
//       definning array and access the array elements with the help of index
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        int[] arr2 = new int[4];//here we just defined the array
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
