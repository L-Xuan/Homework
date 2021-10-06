/*
1.一个五角数被定义为n(3n-1)/2, 其中n=1,2,…。所以, 开始的几个数字就是1,5,12,22, 编写下面的方法返回一个五角数：
public static int getPentagonalNumber(int n)
编写一个测试程序显示前100 个五角数，每行显示10 个。
 */

package Homework9;

public class Homework9_1 {

  //メインメソッド
  public static void main(String[] args) {
    //final変数を定義（最初の100個の数字を表示し、1行に10個）
    final int NUMBER_OF_PENTAGONALS = 100;
    final int NUMBER_PER_LINE = 10;

    //出力する
    System.out.println("The first 100 pentagonal numbers, ten per line: ");
    for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
      //1行に10個
      if (i % NUMBER_PER_LINE == 0) {
        System.out.printf("%7d\n", getPentagonalNumber(i));
      } else {
        System.out.printf("%7d", getPentagonalNumber(i));
      }
    }
  }

  //戻り値があるメソッド
  public static int getPentagonalNumber(int n) {
    return (n * (3 * n - 1)) / 2;
  }
}
