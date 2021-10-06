/*
1.(将摄氏温度转换为华氏温度）
编写程序，从控制台读人double 型的摄氏温度，然后将其转换为华氏温度，并且显示结果。转换公式如下所示：
华氏温度 = (9/5) * 摄氏温度+32
提示：在Java 中，9/5 的结果是1, 但是9.0/5 的结果是1.8。
下面是一个运行例子：
Enter a degree in Celsius: 43
43 Celsius is 109.4 Fahrenheit
*/

package Homework4;

import java.util.Scanner;

public class Homework4_1 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter a degree in Celsius: ");

    //変数celsiusを定義し、コンソールから文字列を受け取って代入する
    double celsius = input.nextDouble();

    //摂氏への変更
    double fahrenheit = (9.0 / 5) * celsius + 32;

    //出力する
    System.out.println(celsius + "　Celsius is　" + fahrenheit + "　Fahrenheit");
  }

}
