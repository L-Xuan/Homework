/*
5.编写一个方法，使用下面的方法头求出一个整数数组中的最小元素：
public static double min(double[] array)
 */

package Homework10;

public class Homework10_5 {

  // メインメソッド
  public static void main(String[] args) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    // 配列を作成
    double[] numbers = new double[10];

    // 指示の出力
    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }

    // 結果の出力
    System.out.println("The minimum number is: " + min(numbers));
  }

  // minメソッド
  public static double min(double[] array) {

    double min = array[0];

    for (double e : array) {
      if (e < min) {
        min = e;
      }
    }
    return min;
  }

}
