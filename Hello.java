public class Hello
{
public static void main(String[] args)
{
String name = System.getenv("var1");
if(name != null) {
System.out.println("Hello, " + name);
}
else {
System.out.println("Environment variable is not set in jenkins");
}
}
}
