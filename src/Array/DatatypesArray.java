package Array;

public class DatatypesArray {
    static void main(String[] args) {
        char[] arr = new char[4]; //char datatype
        arr[0]='a';
        arr[1]='b';
        arr[2]='c';
        arr[3]='d';
        System.out.println("Character Datatype");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] arr1 = new String[4];//String datatype
        arr1[0]="ABC";
        arr1[1]="XYZ";
        arr1[2]="PQR";
        arr1[3]="STU";
        System.out.println("String Datatype");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        double[] arr2 = new double[4];//Double datatype
        arr2[0]=10.0;
        arr2[1]=20.0;
        arr2[2]=30.0;
        arr2[3]=40.0;
        System.out.println("Double Datatype");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[] arr3 = new int[4];//Double datatype
        arr3[0]=10;
        arr3[1]=20;
        arr3[2]=30;
        arr3[3]=40;
        System.out.println("Integer Datatype");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
