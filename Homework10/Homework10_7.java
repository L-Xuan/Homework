/*
7.（冒泡排序）使用冒泡排序算法编写一个排序方法。冒泡排序算法遍历数组几次。在每次遍历中，对相邻的两个元素进行比较。
如果这一对元素是降序，则交换他们的值；否则，保持不变。由于较小的值像气泡一样逐渐“浮向”顶部，同时较大的值“沉向”底部，
所以，这种技术称为冒泡排序法或下沉排序法。编写一个测试程序，读取10个double型的值，调用这个方法，然后显示排好序的数字。
 */

package Homework10;

public class Homework10_7 {

  // メインメソッド
  public static void main(String[] args) {
    //　Scannerの初期化
    java.util.Scanner input = new java.util.Scanner(System.in);

    // 長さ10の配列を作成
    double[] numbers = new double[10];

    // 指示の出力
    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }

    // bubbleSort
    bubbleSort(numbers);

    // 結果の出力
    for (double e : numbers) {
      System.out.print(e + " ");
    }
    System.out.println();
  }

  // bubbleSortメソッド
  public static void bubbleSort(double[] list) {
    double temp;
    boolean swapped;

    do {
      swapped = false;
      for (int i = 0; i < list.length - 1; i++) {
        // 隣接するペアが順番でない場合、値を交換する
        if (list[i] > list[i + 1]) {
          temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          swapped = true;
        }
      }
    } while (swapped); //値が交換された場合、繰り返す
  }

}
