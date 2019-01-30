 package btes;

import java.util.Scanner;

public class array {

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
		System.out.print(arr[4]);
		
		//for print the all array elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//for the reverse array
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}

}
