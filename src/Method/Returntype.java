package Method;

public class Returntype {
    static int yashika(){//we can give the datatype instead of the void which requires the return with its value
        System.out.println("Anant");
        return 4;
    }
    static void main(String[] args) {
        System.out.println("Printing name of person");
        yashika();
        System.out.println(yashika());//printing the data inside function and the value of the function
        int x =yashika();
        System.out.println(3+x);//operation with the functions value
    }
}
