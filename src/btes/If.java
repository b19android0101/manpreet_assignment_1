import java.util.Scanner;
class If

{
   public static void main(String args[])
   {
		int year;
		System.out.println("enter year=");
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		if(year%4==0)
		{
		System.out.println("leap yera");

		}
		else
		{
		System.out.println("not leap year");
		}

}
}