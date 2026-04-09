package BasicOfJava;

public class IncrementDecrement {
    static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x=x+1;//x+=1
        System.out.println(x);
        x=x-1;//x-=1
        x++;
        System.out.println(x);
        x=x*1;//x*=1
        x--;
        System.out.println(x);
        x=x/1;//x/=1
        System.out.println(x);

        int s = 7;
        int t=  ++s; //t=7
        System.out.println(s+" "+t);
    }
}
