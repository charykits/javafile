public class Hello
{
public static void main(String[] args)
{
  String num1 = System.getenv("num1");
  String num2 = System.getenv("num2");
  String result = num1 + num2;
System.out.println(result);
}
}
