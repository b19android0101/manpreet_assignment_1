import java.util.Scanner;
class Marriage
{
	public static void main(String args[])
   {
		int age;
		String g;
		Scanner in=new Scanner(System.in);
		System.out.println("enter gender=");
		g=in.nextLine();
		System.out.println("enter age=");
		age=in.nextInt();
		
		if(g.equals("male") || g.equals("m") && age>=21)
		{
			System.out.println("eligible for marriage");
		}
		else if(g.equals("female") || g.equals("f") && age>=18)
		{
			System.out.println("eligible for marriage");
		}
		else
		{
			System.out.println("not eligible");
		}
		
	}
}