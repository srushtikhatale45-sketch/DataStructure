package datastructure;

public class Dowhile {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int i =0;
		do {
			System.out.println("Array Element at "+i+" of Array:"+numbers[i]);
			i++;
		}while(i<numbers.length);

	}

}
