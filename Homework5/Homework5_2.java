/*
2.(找到将来的日期）编写一个程序，提示用户输入代表今天日期的数字（周日 为 0, 周一为 1,……， 周六为 6 )。
同时，提示用户输入一个今天之后的天数，作为代表将来某天的数字，然后显示这天是星期几。
下面是一个运行示例：
Enter today’s day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
 */

package Homework5;

import java.util.Scanner;

public class Homework5_2 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("Enter today’s day: ");
    System.out.println("Enter the number of days elapsed since today: ");

    //変数day,daysElapsedを定義し、コンソールから文字列を受け取って代入する
    int day = input.nextInt();
    int daysElapsed = input.nextInt();

    //将来の日について
    int futureDay = (day + daysElapsed) % 7;

    //今日の曜日により将来の日の曜日を計算する
    System.out.println("Today is ");
    switch (day) {
      case 0 -> System.out.print("Sunday");
      case 1 -> System.out.print("Monday");
      case 2 -> System.out.print("Tuesday");
      case 3 -> System.out.print("Wednesday");
      case 4 -> System.out.print("Thursday");
      case 5 -> System.out.print("Friday");
      case 6 -> System.out.print("Saturday");
    }

    System.out.println(" and the future day is ");
    switch (futureDay) {
      case 0 -> System.out.println("Sunday");
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thursday");
      case 5 -> System.out.println("Friday");
      case 6 -> System.out.println("Saturday");
    }
  }

}
