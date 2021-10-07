/*
2.编写一个方法，计算一个整数各位数字之和。使用下面的方法头：
public static int sumDigits(long n)
例如：sumDigits(234)返回9(2+3+4).
提示：使用求余操作符％ 提取数字，用除号/ 去掉提取出来的数字。例如：使用234X10 (=4 ) 抽取4。然后使用234/10 (=23 ) 从234 中去掉4。使用一个循环来反复提取和去掉每位数字，直到所有的位数都提取完为止。
编写程序提示用户输入一个整数，然后显示这个整数所有数字的和。
 */

package Homework9;

import java.util.Scanner;

public class Homework9_2 {

  //メインメソッド
  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.print("Enter a integer: ");

    //変数numberを定義し、コンソールから文字列を受け取って代入する
    int number = input.nextInt();

    //結果を出力する
    System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
  }

  //戻り値があるメソッド
  public static int sumDigits(long n) {
    //各桁の和の初期化
    int sum = 0;

    //各桁を抽出する
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }

    //呼び出し元に値を返す
    return sum;
  }

}
