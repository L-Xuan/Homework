/*
2.(将千克转换成磅）编写程序，显示下面的表格（注意：1 千克为2.2 磅）
 */

package Homework8;

public class Homework8_2 {

  public static void main(String[] args) {
    //final変数を定義する（1キログラム＝2.2ポンド）
    final double POUNDS_PER_KILOGRAM = 2.2;

    //タイトルの出力
    System.out.println("Kilograms      Pounds");

    //変数の更新
    for (int i = 1; i <= 199; i += 2) {
      System.out.printf("%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
    }

  }

}
