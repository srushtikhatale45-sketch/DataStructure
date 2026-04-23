package LoopsInJava;

import java.util.Scanner;

public class Series99 {
    static void main(String[] args) {
        int a = 99,d=4;
        for (int i =99; i > 0; i--) {
            if(a>0) {
                System.out.println(a);
                a -= d;
            }

        }
    }
}
