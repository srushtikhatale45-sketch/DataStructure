package datastructure;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		int[] arr1 = {10,20,30,40};
		System.out.println(arr1[0]);//accessing array element
		System.out.println("Length of array:"+arr1.length);//array length
        System.out.println(Arrays.toString(arr1));		
		
        for(int i=0; i<arr1.length; i++) {
        	System.out.println("This is an Array index "+i+" th element:"+ arr1[i]);
        }//for accessing whole array
        int[][] matrix = {{10,20,30},{40,50,60}};
        System.out.println(Arrays.deepToString(matrix));
        
	 }

}
