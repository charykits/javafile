public class Hello
{
public static void main(String[] args)
{
  String num1 = System.getenv("num1");
  String num2 = System.getenv("num2");
  String result = Integer.parseInt(num1) + Integer.parseInt(num2);
  int sum = Integer.parseInt(result);
System.out.println(sum);
}
}
