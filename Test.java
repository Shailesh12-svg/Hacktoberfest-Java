class X
{
 int x;
 static int y;
 static
  {
    System.out.println("I am inside static Block of super class");
    y=12;
  }
 public X()
       {
         System.out.println("I am inside constructor Block of super class");
         x=23;
       }
}
class Y extends X
{
  static
   {
     System.out.println("I am inside static Block of sub class");
     y=24;
   }
  public Y()
  { 
     System.out.println("I am inside constructor Block of super class");
     x=45;
  }
 public void showVal()
 {
  System.out.println("The value of x is:"+x+ " and the value of y is:"+y);
 }
}
class Test
{
  public static void main(String [] s)
{
   Y y = new Y();
   y.showVal();
}
}