/*
4.使用下面的方法头编写方法，反向显示一个整数：
public static void reverse(int number)
例如：reverse(3456)返回6543。编写一个测试程序，提示用户输人一个整数，然后显示它的反向数。
 */

package Homework9;

import java.util.Scanner;

public class Homework9_4 {

  //メインメソッド
  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter an integer: ");

    //変数numberを定義し、コンソールから文字列を受け取って代入する
    int number = input.nextInt();

    //出力する
    System.out.println("Display and integer reversed: ");

    //文字列の並びを逆にする
    reverse(number);
  }

  //戻り値があるメソッド
  public static void reverse(int number) {
    while (number > 0) {
      System.out.println(number % 10);
      number /= 10;
    }
    System.out.println();

  }

}
