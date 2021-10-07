/*
4.(千克与磅之间的互换）编写一个程序，并排显示下列两个表格。
 */

package Homework8;

public class Homework8_4 {

  public static void main(String[] args) {
    //final変数を定義する（1キログラム＝2.2ポンド）
    final double POUNDS_PER_KILOGRAM = 2.2;

    //タイトルの出力
    System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");

    //変数の更新
    for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
      System.out.printf("%-12d%7.1f", k, (k * POUNDS_PER_KILOGRAM));
      System.out.print("     |     ");
      System.out.printf("%-9d%12.2f\n", p, (p / POUNDS_PER_KILOGRAM));
    }
  }

}
