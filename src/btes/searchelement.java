package btes;

import java.util.Scanner;

public class searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
	
		Scanner s=new Scanner(System.in);

		System.out.print("enter array elements=");
		
		
		//for print the location 4 value
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("enter element for serach=");
		int se=s.nextInt();

		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==se)
			{
			
				System.out.print(" element is find="+se);
			
			}
			
		}
		
		
			System.out.print(" element is not find");
	
		
		



	}

}
