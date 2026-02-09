package datastructure;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 5;
		int factorial =1;
		while(num>0) {    //For calculating factorial of the number
			factorial *=num;
			num--;
		}
		System.out.println(factorial);
		
		String[] colors = {"Red","Pink","Sky"};
		int i=0;
		while(i<colors.length) {
			System.out.println("Color:"+colors[i]);
			i++;
		}

	}

}
