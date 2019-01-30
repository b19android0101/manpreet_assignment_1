package btes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class student
{
		String roll_no;//instance variables
	    String name;
	    float eng_marks;
	    float maths_marks;
	    float hindi_marks;
	    int avg;
	    BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	    student()throws IOException
	    {
	        System.out.println("Enter roll_no.");
	        roll_no=s.readLine();
	        System.out.println("Enter eng_marks");
	        eng_marks=Float.parseFloat(s.readLine());
	        System.out.println("Enter name");
	        name=s.readLine();
	    }
	   
	   
	    /*Student(int r,String n,float e, float m,float h)
	    {
	        roll_no=r;
	        name=n;
	        eng_marks=e;
	        maths_marks=m;
	        hindi_marks=h;
	    }*/
	   
	    void average()
	    {
	        avg=(int)(eng_marks+maths_marks+hindi_marks)/3;
	    }
	    void display()
	    {
	        System.out.println(name+" "+avg);
	    }
	   
	    public static void main(String[] args)throws IOException
	    {
	        student s1=new student();
	        //Student s2=new Student(2,"Sarita",78,82,98);
	        //Student s1=new Student();
	        student s2=new student();
	        s1.average();
	        s2.average();
	        s1.display();
	        s2.display();
	       
	    }
	}
