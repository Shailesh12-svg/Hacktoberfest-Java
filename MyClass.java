public class MyClass
{
  public int getVal()
  {
    return 0;
  }
  public long getVal()
  {
    return 1;
  }
  public static void main(String[] args)
  {
    MyClass my = new MyClass();
    System.out.println(my.getVal());   
   }
}