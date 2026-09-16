
// Store details of 5 employees using an array of structures. Find and display
// the employee having the highest salary
import java.util.Scanner;

class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class EmployeeSalary {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee[] employees = new Employee[5];

		// Input details of 5 employees
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter details of Employee " + (i + 1));

			System.out.print("ID: ");
			int id = sc.nextInt();

			sc.nextLine(); // clear buffer

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employees[i] = new Employee(id, name, salary);
			System.out.println();
		}

		// Find employee with highest salary
		Employee highest = employees[0];

		for (int i = 1; i < 5; i++) {
			if (employees[i].salary > highest.salary) {
				highest = employees[i];
			}
		}

		// Display result
		System.out.println("Employee with Highest Salary:");
		System.out.println("ID: " + highest.id);
		System.out.println("Name: " + highest.name);
		System.out.println("Salary: " + highest.salary);

		sc.close();
	}
}