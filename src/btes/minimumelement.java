package btes;

import java.util.Scanner;

public class minimumelement {

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
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.print(" minimum element is="+min);


	}

}
