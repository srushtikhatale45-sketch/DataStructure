package datastructure;
import java.util.Scanner;

class Solution{
	public  void printNumber(Scanner sc) {
//		Function to take input and display output
		int number;
//		Take input
		number = sc.nextInt();
//		print output
		System.out.println(number);
	}

}
class inputoutput {

	public static void main(String[] args) {
//		Creating an instance of Solution class
		Solution sol = new Solution();
		
//		Scanner class
		Scanner sc = new 
		Scanner(System.in);
//		Function call to take input and display output
		sol.printNumber(sc);

	}

}
