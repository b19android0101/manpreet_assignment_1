package btes;
import java.util.Scanner;
public class factorial 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int fact=1,i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter no=");
		int n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);

	}

}
