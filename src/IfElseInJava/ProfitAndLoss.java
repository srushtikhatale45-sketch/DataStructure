package IfElseInJava;

import java.util.Scanner;

public class ProfitAndLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price here:");
        double cost_price = sc.nextDouble();
        System.out.print("Enter the selling Price here:");
        double selling_price = sc.nextDouble();
//        if(cost_price<selling_price){
//            System.out.println("Profit is " + ((selling_price-cost_price)/100) +"%");
//        }
//        if(cost_price==selling_price){
//            System.out.println("No Profit No Loss");
//        }
//        if(selling_price<cost_price){
//            System.out.println(" Loss  "+ ((cost_price-selling_price)/100)+ "%");
//            sc.close();
//        }
        if(cost_price<selling_price){
            System.out.println("Profit is " + (((selling_price-cost_price)/cost_price)*100) +"%");
        }

        else if(selling_price<cost_price){
            System.out.println(" Loss  "+ (((cost_price/selling_price)/selling_price)*100)+ "%");
            sc.close();
        }
        else {
            System.out.println("No Profit No Loss");
        }



    }
}
