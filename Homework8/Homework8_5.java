/*
5.(财务应用程序：计算将来的学费）
 */

package Homework8;

import java.util.Scanner;

public class Homework8_5 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    int highestScore = 0;
    String highestScoreName = "";

    //文字列の入力を受け取る
    System.out.print("Enter the number of students: ");

    //変数numberOfStudentsを定義し、コンソールから文字列を受け取って代入する
    int numberOfStudents = input.nextInt();

    // Prompt the user to enter each student's name and score
    System.out.println("Enter each student’s name and score");
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.print("Student: " + (i + 1) + "\n   Name: ");
      String name = input.next();
      System.out.print("   Score: ");
      int score = input.nextInt();

      // Test if score is higher than highest score
      if (score > highestScore) {
        highestScore = score;
        highestScoreName = name;
      }

    }

    // Display the name of the student with the highest score
    System.out.println("Student with the highest score: " + highestScoreName);
  }

}
