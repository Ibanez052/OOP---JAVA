package assignment;

public class Employee {
	static int employeeCount = 0;
	String name;
	double salary;
	
	public Employee (String n, double s) {
		name = n;
		salary = s;
		employeeCount++;
	}
	
	public void increaseSalary(Employee e) {
		e.salary = e.salary + 5000;
		employeeCount = employeeCount + 1;
	}
	
	public void display() {
		System.out.println(name + " " + salary + " " + employeeCount);
	}
	
	public static void main (String [] args) {
		Employee e1 = new Employee("Anna", 20000);
		Employee e2 = new Employee ("Brian", 25000);
		Employee e3 = e1;
		
		e3.salary = 22000;
		e2 = e1; //e2 will point to the same obj as e1 so magiging "Anna", 20000 na sya
		e1 = null; //mawawala reference ni e1 pero ndi nawala yung "Anna", 20000 kase nirereference nya ni e2
		e3.increaseSalary(e2); // 22000 + 5000 = 27000
		e2 = null; //mawawala reference ni e2
		e3.display(); // edi display
	}
}
