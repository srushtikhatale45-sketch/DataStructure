package datastructure;
class wrapper{
	int value =5;
	}
public class Functionpassbyreference {
   static void modify(wrapper obj) {
	   obj.value += 10;
   }

	public static void main(String[] args) {
		wrapper w = new wrapper();
		modify(w);
		System.out.println(w.value);//output=15
	}

}
