/*
2.计算圆柱体的体积
编写程序，读入圆柱体的半径和高，使用下列公式计算圆柱体的体积：
面积= 半径 x 半径 x p
体积= 面积 x 高
运行例子：
Enter the radius and length of a cylinder: 5.5 12
The area is 95.0331
The volume is 1140.4
*/

package Homework4;

import java.util.Scanner;

public class Homework4_2 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);
    final double PI = 3.14159265359;

    //文字列の入力を受け取る
    System.out.println("Enter the radius and length of a cylinder: ");

    //変数radius, lengthを定義し、コンソールから文字列を受け取って代入する
    double radius = input.nextDouble();
    double length = input.nextDouble();

    //面積と体積の計算
    double area = radius * radius * PI;
    double volume = area * length;

    //出力する
    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);
  }

}
