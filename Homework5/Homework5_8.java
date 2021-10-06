/*
8.(游戏：挑一张牌）编写程序，模拟从一副 S2 张的牌中选择一张牌。程序应该显示牌的大小 (Ace、2、3、4、5、6、7、8、9、10、
Jack、Queen、King)以及牌的花色（Clubs (黑梅花)、 Diamonds (红方块） 、Hearts (红心） 、Spades (黑桃））。
下面是这个程序的运行示例：
The card you picked is Jack of Hearts
 */

package Homework5;

public class Homework5_8 {

  public static void main(String[] args) {
    //変数rank,suitを定義する
    int rank = (int) ((Math.random() * 13) + 1);
    int suit = (int) (Math.random() * 4);

    //rankの結果を出力する
    System.out.println("The card you picked is ");
    switch (rank) {
      case 1 -> System.out.print("Ace");
      case 2 -> System.out.print(2);
      case 3 -> System.out.print(3);
      case 4 -> System.out.print(4);
      case 5 -> System.out.print(5);
      case 6 -> System.out.print(6);
      case 7 -> System.out.print(7);
      case 8 -> System.out.print(8);
      case 9 -> System.out.print(9);
      case 10 -> System.out.print(10);
      case 11 -> System.out.print("Jack");
      case 12 -> System.out.print("Queen");
      case 13 -> System.out.print("King");
    }

    //suitの結果を出力する
    System.out.println(" of ");
    switch (suit) {
      case 1 -> System.out.println("Clubs");
      case 2 -> System.out.println("Diamonds");
      case 3 -> System.out.println("Hearts");
      case 4 -> System.out.println("Spades");
    }
  }

}
