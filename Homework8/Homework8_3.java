/*
3.(将英里转換成千米）编写程序，显示下面的表格（注意：1 英里为1.609 千米）。
 */

package Homework8;

public class Homework8_3 {

  public static void main(String[] args) {
    //final変数を定義する（1マイル＝1.609キロメートル）
    final double KILOMETERS_PER_MILE = 1.609;

    //タイトルの出力
    System.out.println("Miles        Kilometers");

    //変数の更新
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%-13d%-10.3f\n", i, (i * KILOMETERS_PER_MILE));
    }

  }

}