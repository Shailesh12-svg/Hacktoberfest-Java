class Super()
{
 final public int calc(int a,int b)
  {
    return a+b;
  }
}
class Sub extends Super
{
  public int calc(int a,int b)
  {
   return a+b;
  }
}
public class Midq4
{
  public static void main(String[] args)
   {
    Sub sub = new Sub();
    System.out.println("x= "+ subcalc(0,1));
   }
}