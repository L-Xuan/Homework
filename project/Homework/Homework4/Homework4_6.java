/*
6.(求一个整数各位数的和）
编写程序，读取一个在0 和1000 之间的整数，并将该整数的各位数字相加。例如：整数是932 , 各位数字之和为14。
提示：利用操作符%分解数字，然后使用操作符/ 去掉分解出来的数字。例如：932%10=2 , 932/10=930 下面是一个运行示例：
Enter a number between 0 and 1000: 999
The sum of the digits is 27
*/

package Homework4;

import java.util.Scanner;

public class Homework4_6 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter a number between 0 and 1000: ");

    //変数numberを定義し、コンソールから文字列を受け取って代入する
    int number = input.nextInt();

    //一桁の処理
    int lessThan10 = number % 10;
    number /= 10;
    //二桁の処理
    int tens = number % 10;
    number /= 10;
    //三桁の処理
    int hundreds = number % 10;
    number /= 10;
    //各桁の和
    int sum = hundreds + tens + lessThan10;

    //出力する
    System.out.println("The sum of the digits is " + sum);
  }

}