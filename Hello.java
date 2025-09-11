public class Hello
{
public static void main(String[] args)
{
  String num1 = System.getenv("num1");
  String num2 = System.getenv("num2");
  int num3 = Integer.parseInt(num1);
  int num4 = Integer.parseInt(num2);
  int result = num3 + num4;
  System.out.println(result);
}
}
