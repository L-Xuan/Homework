/*
5.(财务应用程序：计算小费）
编写一个程序，读入一笔费用与酬金率，计算酬金和总钱数。例如，
如果用户输人10 作为费用，15% 作为酬金率，计算结果显示酬金为$1.5, 总费用为$11.S。下面是一个运行示例：
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
*/

package Homework4;

import java.util.Scanner;

public class Homework4_5 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter the subtotal and a gratuity rate: ");

    //変数subtotal,gratuityRateを定義し、コンソールから文字列を受け取って代入する
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    //報酬とトータル費用の計算
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    //出力する
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }

}
