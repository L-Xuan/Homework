/*
1.(统计正教和负数的个数然后计算这些数的平均值）
 */

package Homework8;

import java.util.Scanner;

public class Homework8_1 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //変数positives, negatives, count, totalの初期化
    int positives = 0;
    int negatives = 0;
    int count = 0;
    double total = 0;

    //文字列の入力を受け取る
    System.out.println("Enter an integer, the input ends if it is 0: ");

    //変数numberを定義し、コンソールから文字列を受け取って代入する
    int number = input.nextInt();

    //0を入力する場合
    if (number == 0) {
      System.out.println("No numbers are entered except 0");
      System.exit(1);
    }

    //0以外の数字を入力する場合
    while (number != 0) {
      if (number > 0) {
        positives++;
      } else {
        negatives++;
      }
      //合計
      total += number;
      count++;
      number = input.nextInt();
    }

    //平均値を求める
    double average = total / count;

    //結果を出力する
    System.out.println("The number of positive is " + positives +
        "\nThe number of negatives is " + negatives +
        "\nThe total is total " + total +
        "\nThe average is " + average);

  }

}
