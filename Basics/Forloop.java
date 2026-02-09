package datastructure;

public class Forloop {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};//Array
		for(int i=0;i<arr.length;i++) { //Initialising for loop
			System.out.println(arr[i]);
		}
        String[] fruits = {"Apple","Banana","Mango","Pineapple","Strawberry"};//for loop for Strings
        for(String fruit :fruits) {
        System.out.println((fruit));}
        {
        int[] prices = {100,200,300,400};
        int total = 0;
        for(int price:prices) {
        	total+=price;
        }
        System.out.println("Total Price:" + total);
        }
}

}
