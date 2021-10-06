/*
3.使用下面的方法头编写两个方法：
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
使用reverse 方法实现isPalindrome。如果一个数字的反向倒置数和它的顺向数一样，这个数就称作回文数。
编写一个测试程序，提示用户输人一个整数值，然后报告这个整数是否是回文数。
 */

package Homework9;

import java.util.Scanner;

public class Homework9_3 {

  //メインメソッド
  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Please enter an integer: ");

    //変数numberを定義し、コンソールから文字列を受け取って代入する
    int number = input.nextInt();

    //結果を出力する
    System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
  }

  //戻り値があるメソッド
  public static int reverse(int number) {
    String reverse = "";
    String n = number + "";

    for (int i = n.length() - 1; i >= 0; i--) {
      reverse += n.charAt(i);
    }
    return Integer.parseInt(reverse);
  }

  public static boolean isPalindrome(int number) {
    return number == reverse(number) ? true : false;
  }

}
