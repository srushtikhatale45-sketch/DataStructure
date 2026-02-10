package patterns;

public class Patterns2 {
	public static void pattern7(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print("");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
		    }
		System.out.println("");
	}
	}
     public static void pattern8(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("");
				}
				for(int j=1;j<=2*n-i*2+1;j++) {
					System.out.print("*");
			    }
			System.out.println("");
		}
     }




	public static void main(String[] args) {
		pattern7(5);
		pattern8(5);
	}
		

}
