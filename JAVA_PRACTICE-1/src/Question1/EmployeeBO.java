package Question1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeBO {
	public static void printEmployees(ArrayList<Employee> employee) {
		
		
		
		Iterator<Employee> itr=employee.iterator();
		while(itr.hasNext()) {
			Employee i=itr.next();
			System.out.println(i);
		}
	}

	public static void printChoice(int ch, ArrayList<Employee> employee) {
		switch (ch) {
		case 1: {
			System.out.println("Your choice is:Sort employees by salary");
			Collections.sort(employee);
			
			printEmployees(employee);

		}
			break;
		case 2: {
			System.out.println("Your choice is:Sort employees by age and by date of joining");
			Collections.sort(employee, new AgeComparator());
			printEmployees(employee);

		}
			break;
		default:
			System.out.println("Wrong Choice"); 

		}
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String name;
		String dept;
		String pattern = "MM/dd/yyyy";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date;
		int age;
		int salary;

		Scanner sc = new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("ENTER THE NUMBER OF EMPLOYEE TO ENTER");
		int num = sc.nextInt();
		ArrayList<Employee> emp = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			System.out.println("enter the details for employee " + i + 1);
			System.out.println("Name:");
			name = sc.next();
			System.out.println("Department:");
			dept = sc.next();
			System.out.println("DateOfJoining:");
			date = format.parse(sc.next());
			System.out.println("Age:");
			age = sc.nextInt();
			System.out.println("Salary:");
			salary = sc.nextInt();

			Employee employee = new Employee(i, name, dept, date, age, salary);
			emp.add(employee);
		}
		System.out.println("*************************************");
		System.out.println("PRESS 1: Sort employees by salary");
		System.out.println("PRESS 2: Sort employees by age and by date of joining");
		System.out.println("\nEnter your choice");
		System.out.println("*************************************");
		int choice = sc.nextInt();

		printChoice(choice, emp);

	}

}
