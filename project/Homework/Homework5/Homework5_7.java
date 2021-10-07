/*
7.(计算三角形的周长）编写程序，读取三角形的三条边，如果输入值合法就计算这个三角形的周长；否则，显示这些输入值不合法。
如果任意两条边的和大于第三边，那么输人值都是合法的。
 */

package Homework5;

import java.util.Scanner;

public class Homework5_7 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Please enter three edges for a triangle: ");

    //変数edgeを定義し、コンソールから文字列を受け取って代入する
    double edge1 = input.nextDouble();
    double edge2 = input.nextDouble();
    double edge3 = input.nextDouble();

    //トライアングル周辺の長さを計算する
    double perimeter = edge1 + edge2 + edge3;

    //結果を出力する
    if ((edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge1 + edge3 > edge2)) {
      System.out.println("The perimeter of triangle is " + perimeter);
    } else {
      System.out.println("The value you entered is illegal.");
    }
  }

}
