package test;

import java.util.Scanner;

public class testmain {
    public static void main(String[] args) {

        double tax=0;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的收入(元)：");
        double income = input.nextDouble();
        if (income <= 5000) {
            tax = 0;
        } else if (income > 5000 && income <= 8000) {
            tax = (income - 5000) * 0.03;
        } else if (income > 8000 && income <= 17000) {
            tax = 150 + (income - 8000) * 0.1;
        } else if (income > 17000 && income <= 30000) {
            tax = 1050 + (income - 17000) * 0.2;
        } else if (income > 30000 && income <= 40000) {
            tax = 3450 + (income - 30000) * 0.25;
        } else if (income > 40000 && income <= 60000) {
            tax = 7950 + (income - 40000) * 0.3;
        } else if (income > 60000 && income <= 80000) {
            tax = 13950 + (income - 60000) * 0.35;
        } else {
            tax = 21950 + (income - 80000) * 0.45;
        }

        System.out.println("您的工资是：" + income+"元");
        System.out.println("您需要缴纳的个人所得税为：" + tax+"元");
    }
}
