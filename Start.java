import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.javaconectivity.Student;
import com.javaconectivity.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Wel come to Studnet Managment App");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to Add Studnet ");
			System.out.println("Press 2 to delete Studnet");
			System.out.println("Press 3 to dispaly Studnet");
			System.out.println("Press 4 to exit app");
			
			int c= Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				// adding studnet 
				
				System.out.println("Enter the name of  Studnet ");
				String Name=br.readLine();
				
				System.out.println("age of Studnet  Studnet ");
				int  Age=Integer.parseInt(br.readLine());
				
				System.out.println("enter the Grade  Studnet ");
				String Grade=br.readLine();
				
				//Creating Object of the Studnet 
				
				Student st=new Student(Name,Age,Grade);
				boolean answer=StudentDao.InsertStudnetToDB(st);
				
				if(answer)
				{
					System.out.println(" Studnet add successfully........... ");
				}
				else
				{
					System.out.println(" something went wrong ........... ");
				}
				System.out.println(st);
			 	
			}
			else if(c==2)
			{
				//delete Student
				System.out.println("enter studnet id to delete : ");
				int Rollnum= Integer.parseInt(br.readLine());
			 
				boolean f=StudentDao.DeleteStudnetToDB(Rollnum);
				if(f)
					{
						System.out.println(" Studnet add successfully........... ");
	}
				else
					{
						System.out.println(" something went wrong ........... ");
				}
				
			}
			else if(c==3)
			{
				StudentDao.ShowAllStudnet();
			}
			else if(c==4)
			{
				//Exit App
				break;
			}
			else
			{
				
			}
			
			
		}
		
	System.out.println("Thank You For Using this App");
	}

}
