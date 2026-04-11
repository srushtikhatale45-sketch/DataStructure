package IfElseInJava;

import java.util.Scanner;

public class TernaryInVariable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();

//          int as;
        int as  = (n>0) ?100:0;
//        if(n>0) as =100;
//        else as=0;
        System.out.println(as);
        System.out.println((10>5)?((5>2)?5:2):((10>2)?10:2));
    }
}
