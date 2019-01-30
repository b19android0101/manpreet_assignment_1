import java.util.Scanner;
class Switchp
{
   public static void main(String args[])
   {
		int marks,m;
		Scanner in=new Scanner(System.in);
		System.out.println("enter marks=");
		marks=in.nextInt();
		m=marks/10;
		switch(m)
		{
			case 10:
			case 9:
			case 8:
			System.out.println("Excellent");
			break;
			
			case 7:
			System.out.println("very good");
			break;
			
			case 6:
			case 5:
			System.out.println("good");
			break;
			
			case 4:
			System.out.println("average");
			break;
			
			default:
			System.out.println("fail");
			
		}
	}
}
		