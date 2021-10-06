/*
4.(对三个城市排序）编写一个程序，提示用户输入三个城市名称，然后以升序进行显示。下面是一个运行示例：
Enter the first city: Chicago
Enter the second city: Los Angeles
Enter the third city: Atlanta
The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */

package Homework7;

import java.util.Scanner;

public class Homework7_4 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter the first city: ");
    System.out.println("Enter the second city: ");
    System.out.println("Enter the third city: ");

    //変数cityを定義し、コンソールから文字列を受け取って代入する
    String city1 = input.nextLine();
    String city2 = input.nextLine();
    String city3 = input.nextLine();

    //順番つけ
    if (city1.compareTo(city2) < 0 && city2.compareTo(city3) < 0) {
      System.out.println(
          "The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
    } else if (city1.compareTo(city3) < 0 && city3.compareTo(city2) < 0) {
      System.out.println(
          "The three cities in alphabetical order are " + city1 + " " + city3 + " " + city2);
    } else if (city2.compareTo(city1) < 0 && city1.compareTo(city3) < 0) {
      System.out.println(
          "The three cities in alphabetical order are " + city2 + " " + city1 + " " + city3);
    } else if (city2.compareTo(city3) < 0 && city3.compareTo(city1) < 0) {
      System.out.println(
          "The three cities in alphabetical order are " + city2 + " " + city3 + " " + city1);
    } else if (city3.compareTo(city1) < 0 && city1.compareTo(city2) < 0) {
      System.out.println(
          "The three cities in alphabetical order are " + city3 + " " + city1 + " " + city2);
    } else {
      System.out.println(
          "The three cities in alphabetical order are " + city3 + " " + city2 + " " + city1);
    }
  }

}
