/*
6.（给出字符的Unicode码）编写一个程序，得到一个字符的输入，然后显示其Unicode值。
下面是一个运行示例：
Enter a character: E
The Unicode for the character E is 69
 */

package Homework7;

import java.util.Scanner;

public class Homework7_6 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter a character: ");

    //変数sを定義し、コンソールから文字列を受け取って代入する
    String s = input.nextLine();

    char ch = s.charAt(0);

    System.out.println((int) ch);
  }

}
