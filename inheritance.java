import java.util.Scanner;

class Employee{
	String Name,Address;
	int Age;
	long Salary,phonenumber;
	
	void printSalary(){
		System.out.println("salary:"+Salary);
	}
}


	class Officer extends Employee{
		String specialization;
	}
	class Manager extends Employee{
		String Department;
	}
	
	public class inheritance{
		public static void main(String[]args) {
			System.out.println("Details of the Officer");
			Scanner sc=new Scanner(System.in);
			Officer of=new Officer();
			System.out.println("name of the ofiicer");
			of.Name =sc.nextLine();
			System.out.println("enter the address of the officer");
			of.Address =sc.nextLine();
			System.out.println("enter the age of the officer");
			of.Age =sc.nextInt();
			sc.nextLine();
			System.out.println("enter the salary of the officer");
			of.Salary =sc.nextLong();
			sc.nextLine();
			System.out.println("enter the phone number of the officer");
			of.phonenumber =sc.nextLong();
			sc.nextLine();
			System.out.println("enter the specialization of officer");
			of.specialization =sc.nextLine();
			
			
			
				System.out.println("Details of the Manager");
				Manager man=new Manager();
				System.out.println("name of the manager");
				man.Name =sc.nextLine();
				System.out.println("enter the address of the manager");
				man.Address =sc.nextLine();
				System.out.println("enter the age of the manager");
				man.Age =sc.nextInt();
				sc.nextLine();
				System.out.println("enter the salary of the manger");
				man.Salary =sc.nextLong();
				sc.nextLine();
				System.out.println("enter the phone number of the manager");
				man.phonenumber =sc.nextLong();
				sc.nextLine();
				System.out.println("enter the department of the manager");
				man.Department =sc.nextLine();
			
				System.out.println("officer");
				System.out.println("Name:"+of.Name+"\n Address:"+of.Address+
						"\n Age:"+of.Age+"\n phone number:"+of.phonenumber+
						"specialization:"+of.specialization);
				
				of.printSalary();
				System.out.println("manager");
				System.out.println("Name: " + man.Name + "\nAddress: " + man.Address +
				        "\nAge: " + man.Age + "\nPhone number: " + man.phonenumber +
				        "\nDepartment: " + man.Department);

				man.printSalary();
				
		}
	}