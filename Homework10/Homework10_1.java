/*
1.编写一个程序，读入学生成绩，获取最高分best，然后根据下面的规则赋等级值。
如果分数>=best-10,等级为A
如果分数>=best-20,等级为B
如果分数>=best-30,等级为C
如果分数>=best-40,等级为D
其他情况下，等级为F
程序提示用户输入学生总数，然后提示用户输入所有的分数，最后显示等级得出结论。下面是一个运行实例：
Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
 */

package Homework10;

public class Homework10_1 {

  //　メインメソッド
  public static void main(String[] args) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    //　すべでの学生人数を受け取る
    System.out.print("Enter the number of students: ");

    //　変数scores, gradesを定義し、コンソールから配列の要素を受け取って代入する
    int[] scores = new int[input.nextInt()];
    char[] grades = new char[scores.length];

    //　ユーザーからすべでの点数を受け取る
    System.out.print("Enter " + scores.length + " scores: ");

    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextInt();
    }

    //　scoresとgradesを受け取る
    getGrades(scores, grades);

    //　結果を出力する
    for (int i = 0; i < scores.length; i++) {
      System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
    }
  }

  //　戻り値があるメソッド
  public static int max(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  //　getGradesメソッド
  public static void getGrades(int[] scores, char[] grades) {
    int best = max(scores);
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= best - 10) {
        grades[i] = 'A';
      } else if (scores[i] >= best - 20) {
        grades[i] = 'B';
      } else if (scores[i] >= best - 30) {
        grades[i] = 'C';
      } else if (scores[i] >= best - 40) {
        grades[i] = 'D';
      } else {
        grades[i] = 'F';
      }
    }
  }

}
