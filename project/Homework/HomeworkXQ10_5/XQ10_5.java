package HomeworkXQ10_5;

public class XQ10_5 {

  public static void main(String[] args) {
    //11 请输出如下字符串
    //my uncle's dog eats nothing \ . "what a strange dog"
    String s1 = "my uncle's dog eats nothing.";
    String s2 = "what a strange dog";
    System.out.println(s1);
    System.out.println(s2);

    //12 有一个字符串"sdflskjdfw2234234l" 判断 字符大写A是否在该字符串中。
    //不区分大小写，比如字符串"abc"的话，大写B或者小写b都算在"abc"中
    String s3 = "sdflskjdfw2234234l";
    System.out.println(s3.contains("A"));
    System.out.println(s3.toUpperCase().contains("abc"));

    //13 如何比较两个字符串 用== 可以判断吗，如果不能应该用什么方法，写出正确的比较方法
    System.out.println(s1.equals(s2));

    //14 已知字符串"abcd...xyz"，26个字母都包括的一个字符串，键盘输入2个字符，比如第一次输入e ，第二次如数 m，
    //那么请返回 "fghijkl"这样的一个字符串，也就是 2个字母之前的字符串
    String s4 = "abcdefghijklmnopqrstuvwxyz";

    java.util.Scanner input = new java.util.Scanner(System.in);
    String string1 = input.nextLine();
    String string2 = input.nextLine();

    int index1 = s4.indexOf(string1);
    int index2 = s4.indexOf(string2);

    System.out.println(s4.substring(index1 + 1, index2));

  }

}
