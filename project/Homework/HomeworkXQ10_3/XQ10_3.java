package HomeworkXQ10_3;

public class XQ10_3 {

  public static void main(String[] args) {

    /*
    1 请声明各种类型的变量，并且不赋初始值。
    输出各个类型的变量，来看下他们的默认初始值
    例如
    int i;
    System.out.println(i);
     */
    int a = 0;
    double b = 0;
    float c = 0;
    byte d = 0;
    long e = 0;
    short f = 0;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    //3 整数3除以整数2等于1

    //4 整数3除以浮点型类型的2等于1.5

    //5 请声明一个常量，并对其赋值
    final int I = 888;

    /*
    6 分别写出以下几种命名来体现命名规则，具体名字不限(要有3个英文单词链接)
    6-1  类        UsernameAndPassword
    6-2  方法      costOfDriving
    6-3  变量      annualInterestRate
    6-4  常量      USERNAME_AND_PASSWORD,
     */

    //7 分别声明值是2的float型，double型，long型
    float g = 2f;
    double h = 2;
    long j = 2l;

    //8 声明变量x,y,z 并且分别赋值，输出，x加y的的结果再乘以z
    int x = 3;
    double y = 3.3;
    double z = 3.33;
    System.out.println( (x + y) * z);

    //9 请写一段代码来阐述前置加，后置加的区别 (++i,i++的区别)
    int m = 5;
    int newNum1 = 100 * m++;
    int n =5;
    int newNum2 = 100 * ++n;
    System.out.println("newNum1: " + newNum1);
    System.out.println("newNum2: " + newNum2);
    System.out.println("m: " + m);
    System.out.println("n: " + n);   //m: 6, newNum1: 500, n: 6, newNum2: 600

    /*
    10 解释 int x = 5/2.0
    10-1为什么以上有编译错误, （原因文字写出来就行）　　　　　→int代表整数类型
    10-2解释什么情况需要显示的转型，什么时候发生自动转型，（原因文字写出来就行）   →想从整数类型得到浮点类型的结果是需要显示转型，整数类型和浮点类型计算时自动转型
    10-3 写出两个例子，自动转型和显示转型    → (自动转型）System.out.println(5.0 / 2);
                                       → (显示转型）System.out.println((double)13 / 4);
    */
  }

}
