import java.util.Scanner;
class Findlarge
{
	public static void main(String args[])
   {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("enter value of A=");
		a=in.nextInt();
		System.out.println("enter value of B=");
		b=in.nextInt();
		System.out.println("enter value of C=");
		c=in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
		
}