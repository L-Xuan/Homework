/*
3.编写一个程序，读入个数不确定的考试分数，并且判断有多少个分数是大于或等于平均分，多少个分数是低于平均分的。
输人一个负数表示输入的结束。假设最高分为100。
 */

package Homework10;

public class Homework10_3 {

  // メインメソッド
  public static void main(String[] args) {
    // 長さ100の配列を作成
    int[] counts = new int[100];
    System.out.print("Enter the integers between 1 and 100: ");

    count(counts);

    // 出力する
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 0) {
        System.out.println((i + 1) + " occurs " + counts[i] +
            " time" + (counts[i] > 1 ? "s" : ""));
      }
    }

  }

  // countメソッド
  public static void count(int[] counts) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    int num;
    do {
      num = input.nextInt();
      if (num >= 1 && num <= 100) {
        counts[num - 1]++;
      }
    } while (num != 0);
  }

}
