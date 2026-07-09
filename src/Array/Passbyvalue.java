package Array;

public class Passbyvalue {
    public static void Change(int x){
        x=9;
    }
    static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        Change(x);
        System.out.println(x);
    }
}
