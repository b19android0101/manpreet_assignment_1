package btes;

import java.util.Scanner;

public class maximumelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.print("enter array elements=");
		
		//for print the location 4 value
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.print(" maximumelement is="+max);

	}

}
