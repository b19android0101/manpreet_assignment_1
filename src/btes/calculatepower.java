package btes;

import java.util.Scanner;

public class calculatepower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		Scanner s=new Scanner(System.in);
		System.out.print("enter no =");
		int n=s.nextInt();
		System.out.print("enter power =");
		int p=s.nextInt();
		
		for(int i=1;i<=p;i++)
		{
			k=k*n;
			
		}
		System.out.print("power is="+k);
		
		
	}

	}


