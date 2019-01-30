package btes;
import java.util.Scanner;

public class lenthofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter no =");
		int x=s.nextInt();
		while(x>0)
		{
			len++;
			x=x/10;
		}
		System.out.print("lenth is="+len);

	}

}
