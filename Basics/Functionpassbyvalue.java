package datastructure;

public class Functionpassbyvalue {
	static void modify(int a) {
		a=a+10;
	}

	public static void main(String[] args) {
		
		int x =5;
		modify(x=6);
		System.out.println(x);
	}
}
