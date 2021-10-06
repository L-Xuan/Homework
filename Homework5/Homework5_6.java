/*
6.（游戏：剪刀、石头、布）编写可以玩流行的剪刀-石头-布游戏的程序。（剪刀可以剪布，石头可以砸剪刀，而布可以包石头。）
程序提示用户随机产生一个数，这个数为0、1或者2，分别表示石头、剪刀和布。程序提示用户输入值0、1或者2，然后显示一条消息，
表明用户和计算机谁赢了游戏，谁输了游戏，或是打成平手。
下面是运行示例：
scissor(0),rock(1),paper(2): 1
The computer is scissor.You are rock.You won
scissor(0),rock(1),paper(2): 2
The computer is paper.You are paper too.It is a draw
 */

package Homework5;

import java.util.Scanner;

public class Homework5_6 {

  public static void main(String[] args) {
    //Scannerの初期化
    Scanner input = new Scanner(System.in);

    //文字列の入力を受け取る
    System.out.println("scissor(0),rock(1),paper(2): ");

    //変数computer,userを定義する
    int computer = (int) (Math.random() * 3);
    int user = input.nextInt();

    //computer結果を出力する
    System.out.println("The computer is ");
    switch (computer) {
      case 0 -> System.out.println("scissor");
      case 1 -> System.out.println("rock");
      case 2 -> System.out.println("paper");
    }

    //user結果を出力する
    System.out.println("You are ");
    switch (user) {
      case 0 -> System.out.println("scissor");
      case 1 -> System.out.println("rock");
      case 2 -> System.out.println("paper");
    }

    //勝ちなのか、負けなのか、その結果を出力する
    if (computer == user) {
      System.out.println(" too. It is a draw");
    } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2
        && computer == 1)) {
      System.out.println(". You won");
    } else {
      System.out.println(". You lose");
    }
  }

}