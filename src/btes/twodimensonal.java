package btes;

import java.util.Scanner;

public class twodimensonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks=new int[3][3];
		
		Scanner s=new Scanner(System.in);

		System.out.print("enter array elements=");
		
	
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
			marks[i][j]=s.nextInt();
			}
		}
		System.out.println("metrix");
		
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(+marks[i][j]+"\t");
			}
			System.out.println( );
		}
		


	}

}
