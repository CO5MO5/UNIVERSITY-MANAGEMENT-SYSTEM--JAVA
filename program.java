import java.util.*;
import java.lang.String;
import java.util.Scanner;
public class program extends University{

	public void checklog( String username , String password){
	  String a="saiprakash";
	  String b="123456";
	  if( username.equals(a) && password.equals(b) ){
	    System.out.println("login successful");
	  }
	  else{
	    System.out.println("Loggin failed wrong id or password");
	  }
	}


	public static void main(String args[])
	{
		String username,password;
		System.out.println("Welcome to UNIVERSITY MANAGEMENT SYSTEM\n");
		System.out.println("Login Form\n");
		System.out.println("Select any one of option\n");
		System.out.println("1.Student login \n2.signup");
		System.out.println("NOTE:Enter the numerical value for selecting option\n");
		Scanner S1= new Scanner(System.in);
		int option= S1.nextInt();
		S1.nextLine();
		program l=new program();
		if(option==1)
		{
		  System.out.println("Student Login\n");
	  	  System.out.println("Enter the Username:");
          	  username= S1.nextLine();
          	  System.out.println("Enter the Password:");
	  	  password= S1.nextLine();
		  l.checklog(username,password);
		}
		else if(option==2)
		{
		  String fullname, nation, address, n_username, n_password;
	          String age, phno;  
	  	  System.out.println("signup form");
	  	  System.out.println("Enter your fullname:");
	  	  fullname= S1.nextLine();
	  	  System.out.println("Enter your age:");
	  	  age= S1.nextLine();
	  	  System.out.println("Enter your nationality:");
	  	  nation= S1.nextLine();
	  	  System.out.println("Enter your address:");
	  	  address= S1.nextLine();
	  	  System.out.println("Enter phone number:");
	  	  phno= S1.nextLine();
	  	  System.out.println("create a new username:");
	  	  n_username= S1.nextLine();
	  	  System.out.println("enter a password:");
	  	  n_password= S1.nextLine();
	  	  System.out.println("Details saved successfully");
		}
		else{
		  System.out.println("Wrong Input.please Try Again");		
        }

        
		do{

            System.out.println("***********************************UNIVERSITY MANAGEMENT SYSTEM**********************************************");
            System.out.println("Press 1 to add Student ");
		        System.out.println("Press 2 to Add Faculty");
            System.out.println("Press 3 to know Fee Structure");
            System.out.println("Press 4 to display Entered student & Faculty details");
            System.out.println("Press 5 to exit");
            Scanner obj1=new Scanner(System.in);
		        System.out.println("Enter any Number");
		        int a=obj1.nextInt();
            switch(a)
            {

                case 1:
                    University aa=new University();
                    aa.add_student();
                    break;
                case 2:
                    University bb=new University();
                    bb.add_faculty();
                    break;
                case 3:
                    University cc=new University();
                    cc.fee();
                    break;
                case 4:
                    University dd=new University();
                    dd.display();
                    break;
                case 5:
                    University ee=new University();
                    ee.exit();
                    break;
                default:
                    System.out.println("Please Input a valid Value");
            }
            System.out.println("Type Y or N to select next option");
            r=obj1.next().charAt(0);
            }
            while(r=='y'||r=='Y');
            if(r=='n'||r=='N')
		    {
			University z=new University();
			z.exit();
		    }
	}
}
class University
{
  static String student_name = new String();
  static String student_dob = new String();
  static String student_gender = new String();
  static String student_pno = new String();
  static String student_email = new String();
  static String student_address = new String();
  static String cn = new String();// course name
  static String str = new String();// stream name
  static String fn = new String();// fathername
  static String faculty_name = new String();
  static String faculty_pno = new String();
  static String faculty_email = new String();
  static String faculty_subject = new String();

  public void add_student() throws ArithmeticException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the details asked below of the student\n\n");

    System.out.print("\nPlease Enter Your Name:");
    student_name = sc.nextLine();
    if (student_name.length() == 0)
      throw new ArithmeticException();
    System.out.print("\nEnter Your Date Of Birth(dd/mm/yyyy) :");
    student_dob = sc.next();

    if (student_dob.length() < 10)
      throw new ArithmeticException();
    System.out.print("\nEnter Your Gender(m / f) :");
    student_gender = sc.next();
    if (student_gender.length() == 0)
      throw new ArithmeticException();
    System.out.print("\nEnter Your Mobile Number:");
    student_pno = sc.next();
    if (student_pno.length() < 10)
      throw new ArithmeticException();
    System.out.print("\nEnter Your Email ID :");
    student_email = sc.next();
    if (student_email.length() == 0)
      throw new ArithmeticException();

    System.out.print("\nEnter Your Course Name :");
    cn = sc.next();

    if (cn.length() == 0)
      throw new ArithmeticException();
    System.out.print("\nEnter Your Stream :");
    str = sc.next();

    if (str.length() == 0)
      throw new ArithmeticException();

    System.out.print("\nEnter Your  Home Address :");
    student_address = sc.next();
    if (student_address.length() == 0)
      throw new ArithmeticException();

    System.out.print("\nEnter Your Father Name :");
    fn = sc.next();
    if (fn.length() == 0)
      throw new ArithmeticException();

  }

  public void add_faculty() throws ArithmeticException {

    System.out.println("Enter Name of the Faculty:");
    Scanner obj2 = new Scanner(System.in);
    faculty_name = obj2.nextLine();
    if (faculty_name.length() == 0)
      throw new ArithmeticException();

    System.out.println("Enter the phone number of the Faculty:");
    faculty_pno = obj2.next();
    if (faculty_pno.length() < 10)
      throw new ArithmeticException();

    System.out.println("Enter the faculty Email:");
    faculty_email = obj2.next();
    if (faculty_email.length() == 0)
      throw new ArithmeticException();

    System.out.println("Enter the subject faculty teaches:");
    faculty_subject = obj2.next();
    if (faculty_subject.length() == 0)
      throw new ArithmeticException();
  }

  public void fee() {
    System.out.println("The Fee structure for different courses are as Below:");
    System.out.println("For BTECH -80000");
    System.out.println("For   MBA -90000");
    System.out.println("For GAMING-65000");
    System.out.println("For   BBA -65000");

  }

  public void display() {

    System.out.print("\n\n\n**Displaying Student Details**");
    System.out.print("\n\nName Of The Student: " + University.student_name);
    System.out.print("\n\nDate Of Birth : " + University.student_dob);
    System.out.print("\n\nGender : " + University.student_gender);
    System.out.print("\n\nMobile Number : " + University.student_pno);
    System.out.print("\n\nEmail ID :" + University.student_email);
    System.out.print("\n\nHome Address : " + University.student_address);
    System.out.print("\n\nCourse Name : " + University.cn);
    System.out.print("\n\nStream : " + University.str);
    System.out.print("\n\nFather's Name : " + University.fn);

    System.out.println("\n\n\n\n***Displaying faculty Details****");
    System.out.print("\n\nName Of The Faculty: " + University.faculty_name);
    System.out.print("\n\nMobile Number : " + University.faculty_pno);
    System.out.print("\n\nEmail ID :" + University.faculty_email);
    System.out.print("\n\nName Of The Subject of the Faculty:: " + University.faculty_subject);



}

public static void exit()
{

    System.exit(0);

}

    
}
