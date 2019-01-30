import java.util.Scanner;
class Ifelse

{
   public static void main(String args[])
   {
		int marks;
		System.out.println("enter marks=");
		Scanner in=new Scanner(System.in);
		marks=in.nextInt();
		if(marks>=85)
		{
		System.out.println("Excellent");
		}
		else if(marks>=70&&marks<85)
		{
		System.out.println("very good");
		}
		else if(marks>=50&&marks<70)
		{
		System.out.println(" good");
		}
		else if(marks>=40&&marks<50)
		{
		System.out.println("average");
		}
		else if(marks<40)
		{
		System.out.println("fail");
		}

}
}