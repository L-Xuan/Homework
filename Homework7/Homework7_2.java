/*
2.(随机字符) 编写一个程序，使用Math.random()方法显示一个随机的大写字母。
 */

package Homework7;

public class Homework7_2 {

  public static void main(String[] args) {
    int number = 65 + (int) (Math.random() * (91 - 65));
    System.out.println((char) (number));
  }

}
