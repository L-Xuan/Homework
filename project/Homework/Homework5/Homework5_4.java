/*
4.ISBN-10(国际标准书号）以前是一个 10 位整数d1d2d3d4d5d6d7d8d9d10最 后的一位 d10。是校验和，它是使用下面的公式用另外 9个数计算出来的：
(d1 x 1 + d2 x 2+ d3x 3+d4 x 4+d5 x 5+d6 x 6+ d7 x 7+ d8 x 8+ d9 x 9)% 11
如果校验和为 10, 那么按照ISBN-10 的习惯，最后一位应该表示为 X。编写程序，提示用 户输人前 9 个数，然后显示 10 位 ISBN (包括前面起始位置的 0 >。程序应该读取一个整数输入。
以下是一个运行示例：
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
 */

package Homework5;

import java.util.Scanner;

public class Homework5_4 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter the first 9 digits of an ISBN as integer: ");

    //変数isbnを定義し、コンソールから文字列を受け取って代入する
    int isbn = input.nextInt();

    //各桁の数字を抽出する
    int d1 = isbn / 100000000;
    int remainingDigits = isbn % 100000000;
    int d2 = remainingDigits / 10000000;
    remainingDigits %= 10000000;
    int d3 = remainingDigits / 1000000;
    remainingDigits %= 1000000;
    int d4 = remainingDigits / 100000;
    remainingDigits %= 100000;
    int d5 = remainingDigits / 10000;
    remainingDigits %= 10000;
    int d6 = remainingDigits / 1000;
    remainingDigits %= 1000;
    int d7 = remainingDigits / 100;
    remainingDigits %= 100;
    int d8 = remainingDigits / 10;
    remainingDigits %= 10;
    int d9 = remainingDigits;

    //d10の計算
    int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

    //ISBNを出力する
    System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
    if (d10 == 10) {
      System.out.println("X");
    } else {
      System.out.println(d10);
    }
  }

}
