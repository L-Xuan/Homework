/*
3.(对三个整数排序）编写程序，提示用户输入三个整数。以非降序的形式显示这三个整数。
 */

package Homework5;

import java.util.Scanner;

public class Homework5_3 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Please enter three integers: ");

    //変数numberを定義し、コンソールから文字列を受け取って代入する
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    //順番つけ
    if (number1 < number2 && number2 < number3) {
      System.out.println(number1 + " " + number2 + " " + number3);
    } else if (number1 < number3 && number3 < number2) {
      System.out.println(number1 + " " + number3 + " " + number2);
    } else if (number2 < number1 && number1 < number3) {
      System.out.println(number2 + " " + number1 + " " + number3);
    } else if (number2 < number3 && number3 < number1) {
      System.out.println(number2 + " " + number3 + " " + number1);
    } else if (number3 < number1 && number1 < number2) {
      System.out.println(number3 + " " + number1 + " " + number2);
    } else {
      System.out.println(number3 + " " + number2 + " " + number1);
    }
  }

}
