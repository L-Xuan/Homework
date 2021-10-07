/*
6.编写一个方法，返回个数不确定的整数的最大公约数。指定这个方法头如下所示：
public static int gcd(int… numbers)
编写测试程序，提示用户输人 5 个数字，调用该方法找出这些数的最大公约数，并显示这个最大公约数。
 */

package Homework10;

public class Homework10_6 {

  // メインメソッド
  public static void main(String[] args) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    // 長さ5の配列を作成
    int[] numbers = new int[5];

    // 指示の出力
    System.out.print("Enter five numbers: ");

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }

    //　結果を出力する
    System.out.println("The greatest common divisor is " + gcd(numbers));
  }

  // 値をgcdメソッドに返す
  public static int gcd(int... numbers) {
    int gcd = 1;
    boolean isDivisor;
    for (int i = 2; i < min(numbers); i++) {
      isDivisor = true;
      for (int e : numbers) {
        if (e % i != 0) {
          isDivisor = false;
        }
      }
      if (isDivisor) {
        gcd = i;
      }
    }
    return gcd;
  }

  //　最小値を返す
  public static int min(int... numbers) {
    int min = numbers[0];
    for (int e : numbers) {
      if (e < min) {
        min = e;
      }
    }
    return min;
  }

}
