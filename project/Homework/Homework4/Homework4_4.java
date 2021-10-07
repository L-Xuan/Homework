/*
4.(将磅转换为千克）
编写程序，将磅数转换为千克数。程序提示用户输人磅数，然后转换成千克并显示结果。一磅等于0.454 千克。下面是一个运行示例：
Enter a number in pounds: 55.5 :
55.5 pounds is 25.197 kilograms
*/

package Homework4;

import java.util.Scanner;

public class Homework4_4 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter a number in pounds: ");

    //変数poundsを定義し、コンソールから文字列を受け取って代入する
    double pounds = input.nextDouble();

    //キログラムへの変更
    double kilograms = pounds * 0.454;

    //出力する
    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  }

}
