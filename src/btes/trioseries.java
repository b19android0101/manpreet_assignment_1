package btes;

import java.util.Scanner;

public class trioseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib,a=0,b=1,c=2,i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter no=");
		int n=in.nextInt();
		System.out.print(a+" "+b+" "+c+" ");
		for(i=1;i<=n;i++)
		{
			fib=a+b+c;
			System.out.print(fib+" ");
			a=b;
			b=c;
			c=fib;
			

		}

	}

}
