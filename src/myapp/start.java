package myapp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.stDao;
import com.student.manage.student;
public class start {
	public static void main(String[] args) throws  IOException {
		System.out.println("Welcome to student app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 0 to Display All Records");

			System.out.println("press 1 to add student");
			System.out.println("press 2 to display student");
			System.out.println("press 3 to delete student");
			System.out.println("press 4 to exit student");
			int  c= Integer.parseInt(br.readLine());
			if (c==1) {
				System.out.println("Add Student Details");
				System.out.println("Enter name: ");
				String name=br.readLine();
				System.out.println("Enter phone:");
				String phone=br.readLine();
				System.out.println("Enter city");
				String city=br.readLine();
				student st=new student(name, phone, city);
				System.out.println(st);
				boolean ans=stDao.inserttoDB(st);
				if(ans) {
					System.out.println("inserted");
				}else {
					System.out.println("false");
				}
			}
			else if (c==2) {
//				display the student record 
//				displaying the student record using name of the student
				System.out.println("Enter the name of student you want to search");
				String name=br.readLine();
				stDao.display(name);
				
				
			}
			else if (c==3) {
				System.out.println("Enter name of student to delete record ");
				String name=br.readLine();
				stDao.deletestudent(name);
			}
			else if (c==0){
				stDao.displayAll();
//				break;
			}
			else {
				break;
			}
			}
		System.out.println("Thankyou for using my application");
		
	}
}
