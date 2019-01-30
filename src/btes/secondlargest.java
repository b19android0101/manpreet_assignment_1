package btes;

import java.util.Scanner;

public class secondlargest {

	public static void main(String[] args) {
		int[] arr=new int[5];
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
		System.out.print(" second maximum element is="+max);


	}

}
