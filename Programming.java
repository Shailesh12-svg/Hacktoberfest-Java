public class Advance
{
private void printMessage()
{
System.out.println("Programming");
}
public void fun()
{
  printMessage();
}
public class Programming extends Advance
{
private void printMessage()
{
System.out.println("Advance");
}
public static void main(String[] args)
{
 Advance ap = new Programming();
 ap.fun();
}
}