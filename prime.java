class prime
{
	public static void main(String a[])
	{
	 int b=7;
	 int i,f=0;
	 for(i=2;i<b;i++)
	 {
	   if(b%i==0)
	   {
	     f=1;
	   }
	 }
	 if(f==0)
	{
	 System.out.print("prime");
	}
 	 else
	 {
	   System.out.print("not prime");
	 }
	}
}