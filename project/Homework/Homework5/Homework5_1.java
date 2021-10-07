/*
1.（随机月份）编写一个随机产生1和12之间整数的程序，并且根据数字1，2，……，12显示相应的英文月份：January，February，……，December。
 */

package Homework5;

public class Homework5_1 {

  public static void main(String[] args) {
    //1から12までの乱数を発生させる
    int month = (int) ((Math.random() * 12) + 1);

    //switch文を使い実行させる
    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
    }
  }

}
