/*
5.(生成车牌号码）假设一个车牌号码由三个大写字母和后面的四个数字组成。编写一个程序. 生成一个车牌号码。
 */

package Homework7;

public class Homework7_5 {

  public static void main(String[] args) {
    //前の三桁の変数letterを定義する
    int letter1 = 65 + (int) (Math.random() * (90 - 65));
    int letter2 = 65 + (int) (Math.random() * (90 - 65));
    int letter3 = 65 + (int) (Math.random() * (90 - 65));

    //次の四桁を定義する
    int number1 = (int) (Math.random() * 10);
    int number2 = (int) (Math.random() * 10);
    int number3 = (int) (Math.random() * 10);
    int number4 = (int) (Math.random() * 10);

    //結果を出力する
    System.out.println(
        " " + (char) (letter1) + ((char) (letter2)) + ((char) (letter3)) + number1 + number2
            + number3 + number4);
  }

}
