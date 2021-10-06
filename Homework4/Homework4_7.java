/*
7.(财务应用程序：计算利息）
如果知道收支余额和年利率的百分比，就可以使用下面的公式计算下个月要支付的利息额：
利息额= 收支余额 x (年利率/ 1200)
编写程序，读取收支余额和年百分利率，显示两个版本的下月利息。下面是一个运行示例：
*/

package Homework4;

import java.util.Scanner;

public class Homework4_7 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter balance and annual interest rate ");

    //変数balance,annualInterestRateを定義し、コンソールから文字列を受け取って代入する
    double balance = input.nextDouble();
    double annualInterestRate = input.nextDouble();

    //来月の利息を計算する
    double interest = balance * (annualInterestRate / 1200);

    //出力する
    System.out.println("The interest is " + interest);
  }

}
