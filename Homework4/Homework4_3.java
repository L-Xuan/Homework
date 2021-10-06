/*
3.(将英尺转换为米）
编写程序，读人英尺数，将其转换为米数并显示结果。一英尺等于0.305米。
下面是运行示例：
Enter a value for feet: 16.5
16.5 feet is S.0325 meters
*/

package Homework4;

import java.util.Scanner;

public class Homework4_3 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter a value for feet: ");

    //変数feetを定義し、コンソールから文字列を受け取って代入する
    double feet = input.nextDouble();

    //メートルへの変更
    double meters = feet * 0.305;

    //出力する
    System.out.println(feet + " feet is " + meters + " meters");
  }

}
