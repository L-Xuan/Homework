/*
8.（对字符串的字符排序）使用以下方法头编写一个方法，返回一个排好序的字符串。
public static String sort(String s)
例如，sort（“acb”）返回abc编写一个测试程序，提示用户输入一个字符串，显示排好序的字符串。
 */

package Homework10;

public class Homework10_8 {

  // メインメソッド
  public static void main(String[] args) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    // 指示の出力
    System.out.print("Enter a string: ");

    // 変数sを定義し、コンソールから文字列を受け取って代入する
    String string = input.nextLine();

    // 出力
    System.out.println(sort(string));
  }

  // sortメソッド
  public static char[] sort(String s) {
    // 配列を作成
    char[] str = new char[s.length()];
    // 配列を文字列の要素で埋める
    for (int i = 0; i < str.length; i++) {
      str[i] = s.charAt(i);
    }

    for (int i = 0; i < str.length - 1; i++) {
      char min = str[i];
      int minIndex = i;

      for (int j = i + 1; j < str.length; j++) {
        if (min > str[j]) {
          min = str[j];
          minIndex = j;
        }
      }
      if (minIndex != i) {
        str[minIndex] = str[i];
        str[i] = min;
      }
    }
    return str;
  }

}