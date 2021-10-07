/*
2.编写程序，读取10 个整数，然后按照和读入顺序相反的顺序将它们显示出来。
 */

package Homework10;

public class Homework10_2 {

  // メインメソッド
  public static void main(String[] args) {
    // 長さ10の配列を作成
    int[] array = new int[10];
    System.out.print("Enter ten integers: ");

    fill(array);

    // 数字を逆の順序で表示する
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i] + "");
    }
    System.out.println();
  }

  // すべての要素を埋める
  public static void fill(int[] array) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
    }
  }

}
