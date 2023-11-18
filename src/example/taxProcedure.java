package example;

import java.util.Scanner;

public class taxProcedure {
  public double incomeaxProcedure(double income) {
    String result = "Hello,your income is  " + income;
    System.out.println(result);

//    个人所得税计算程序
    double tax = 0;

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

    System.out.println("你需要缴纳的个人所得税为：" + tax);
    return tax;
  }
}
