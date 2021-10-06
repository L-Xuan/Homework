/*
4.编写两个重载的方法，使用下面的方法头返回一个数组的平均数：
public static int average(int[] array)
public static double average(double[] array)
 */

package Homework10;

public class Homework10_4 {

  // メインメソッド
  public static void main(String[] args) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    // 長さ10の配列を作成
    double[] values = new double[10];

    // 指示の出力
    System.out.print("Enter ten values of double type: ");

    for (int i = 0; i < values.length; i++) {
      values[i] = input.nextDouble();
    }

    // 平均値の出力
    System.out.println("The average value: " + average(values));
  }

  // averageメソッドのオーバーロード(int[] array)
  public static int average(int[] array) {

    int average = 0;

    for (int i : array) {
      average += i;
    }
    return average / array.length;
  }

  // averageメソッドのオーバーロード(double[] array)
  public static double average(double[] array) {

    double average = 0;

    for (double i : array) {
      average += i;
    }
    return average / array.length;
  }

}
