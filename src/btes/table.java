package btes;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter no=");
		int n=in.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			
		}
		


	}

}
