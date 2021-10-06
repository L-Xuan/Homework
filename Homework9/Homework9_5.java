/*
5.使用下面的方法头编写方法，按升序显示三个数：
public static void displaySortedNumbers(double num1, double num2, double num3)
 */

package Homework9;

import java.util.Scanner;

public class Homework9_5 {

  //メインメソッド
  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter three numbers: ");

    //変数numberを定義し、コンソールから文字列を受け取って代入する
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

    //数字を昇順に表示する
    displaySortedNumbers(number1, number2, number3);
  }

  //displaySortedNumbersメソッド
  public static void displaySortedNumbers(double num1, double num2, double num3) {

    double temp;

    if (num2 < num1 && num2 < num3) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    } else if (num3 < num1 && num3 < num2) {
      temp = num1;
      num1 = num3;
      num3 = temp;
    }
    if (num3 < num2) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }

    //結果を出力する
    System.out.println(num1 + " " + num2 + " " + num3);
  }

}
