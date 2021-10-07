/*
8.(驾驶费用）
编写一个程序，提示用户输人驾驶的距离、以每加仑多少英里的汽车燃油性能，以及每加仑的价格，然后显示旅程的费用。下面是一个运行示例：
*/

package Homework4;

import java.util.Scanner;

public class Homework4_8 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter the driving distance: ");
    System.out.println("Enter miles per gallon: ");
    System.out.println("Enter price per gallon: ");

    //変数distance,milesPerGallon,pricePerGallonを定義し、コンソールから文字列を受け取って代入する
    double distance = input.nextDouble();
    double milesPerGallon = input.nextDouble();
    double pricePerGallon = input.nextDouble();

    //トータル費用の計算
    double costOfDriving = distance / milesPerGallon * pricePerGallon;

    //出力する
    System.out.println("The cost of driving is $" + costOfDriving);
  }

}