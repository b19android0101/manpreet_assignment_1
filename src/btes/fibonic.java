package btes;

import java.util.Scanner;

public class fibonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib,a=0,b=1,i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter no=");
		int n=in.nextInt();
		System.out.println("1");
		for(i=1;i<=n;i++)
		{
			fib=a+b;
			System.out.println(fib);
			a=b;
			b=fib;
			

		}
		
	}

}
