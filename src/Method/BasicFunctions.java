package Method;

public class BasicFunctions {
    public static  void Ananya(){
        System.out.println("Ananya");
    }
    static void main(String[] args) {
        Ramya();
        System.out.println("Main Function");
    }
    public static  void Ramya(){
        Shiv();
        System.out.println("Ramya");
    }
    public static  void Shiv(){
        Ananya();
        System.out.println("Shiv");
        Ram();
    }
    public static  void Ram(){
        System.out.println("Ram");
        Ananya();
    }
}
