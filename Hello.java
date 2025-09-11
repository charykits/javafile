public class Hello
{
public static void main(String[] args)
{
  int num1 = System.getenv("num1");
  int num2 = System.getenv("num2");
  int result = int.parse(num1) + int.parse(num2);
System.out.println(result);
}
}
