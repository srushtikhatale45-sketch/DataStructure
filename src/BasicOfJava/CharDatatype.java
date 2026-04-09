package BasicOfJava;

public class CharDatatype {
    static void main(String[] args) {
        char name = 's';
        System.out.println(name);
        char name1 = 'a';
        System.out.println(name1);
        char name2 = 'n';
        System.out.println(name2);
//        ascii values
        char ch = 'A';
        int a = ch;//implicit
        System.out.println(a);

        char ch1 = 'a';
        int b = (int)ch1;//explicit
        System.out.println(b);

        char a1 = '3';
        int b1 = a1;
        System.out.println(b1);

        char c = 'b';
        System.out.println(c*c);

        int x= 32;
        char as=(char)x;
        System.out.println(as);



    }
}
