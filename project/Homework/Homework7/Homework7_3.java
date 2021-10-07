/*
3.(检测子串）编写一个程序，提示用户输入两个字符串，检测第二个字符串是否是第一个字符串的子串。
 */

package Homework7;

import java.util.Scanner;

public class Homework7_3 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter string s1: ");
    System.out.println("Enter string s2: ");

    //変数stringを定義し、コンソールから文字列を受け取って代入する
    String string1 = input.nextLine();
    String string2 = input.nextLine();

    //出力する
    System.out.println(string2 + ((string1.contains(string2)) ? " is " : " is not ") + "a substring of " + string1);
  }

}
