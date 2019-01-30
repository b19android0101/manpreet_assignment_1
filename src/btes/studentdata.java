package btes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class studentdata
{
		int roll_no,average;//instance variables
	    String name;
	    char grade;
	    double engmarks,mathmarks,scimarks,totalmarks;
	    
	    BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	    studentdata()throws IOException
	    {
	        System.out.println("\n"+"Enter roll_no=");
	        roll_no=Integer.parseInt(s.readLine());
	       
	        System.out.println("Enter name=");
	        name=s.readLine();
	        
	        System.out.println("enter english marks=");
	        engmarks=Double.parseDouble(s.readLine());
	        
	        System.out.println("enter math marks=");
	        mathmarks=Double.parseDouble(s.readLine());
	        
	        System.out.println("enter sci marks=");
	        scimarks=Double.parseDouble(s.readLine());
	     }
	    void cal_total()
	    {
	    	
	    	totalmarks=(int)(engmarks+mathmarks+scimarks);
	    }
	    void cal_average()
	    {
	    	
	        average=(int)(engmarks+mathmarks+scimarks)/3;
	    }
	    void grade()
	    {
	    	if(average>=85)
			{
			System.out.print("Excellent");
			}
			else if(average>=70 && average<85)
			{
			System.out.print("very good");
			}
			else if(average>=50 && average<70)
			{
			System.out.print(" good");
			}
			else if(average>=40 && average<50)
			{
			System.out.print("average");
			}
			else if(average<40)
			{
			System.out.print("fail");
			}
	    }
	    void display()
	    {
	    	System.out.println("tota marks="+totalmarks);
	    	System.out.println("average="+average);
	    	System.out.print("grade="+"\n");
	    }
	   
	    public static void main(String[] args)throws IOException
	    {
	        studentdata s1=new studentdata();
	        
	        System.out.println("student 1");
	        s1.cal_total();
	        s1.cal_average();
	        s1.display();
	        s1.grade();
	        
	        studentdata s2=new studentdata();
	        System.out.println(" student 2");
	        s2.cal_total();
	        s2.cal_average();
	        s2.display();
	        s2.grade();
	        
	        studentdata s3=new studentdata();
	        System.out.println("student 3=");
	        s3.cal_total();
	        s3.cal_average();
	        s3.display();
	        s3.grade();
	       
	    }
	}

