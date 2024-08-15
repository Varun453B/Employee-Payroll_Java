import java.util.ArrayList;
// make abstract Employee  --> Access Modifier
/*  name and id */
abstract class Employee{
	private String name;
	private int id;
	
// Constructor
	public Employee(String name,int id){	
		this.name=name;
		this.id=id;
	     }
	
// Public Method
	public String getName() {
		return name;
	    }
	public int getId() {
		return id;
	    }
	
// Abstract Method
	public abstract double calculateSalary() ;
	
// Override toString
	@Override
	public String toString() {		
		System.out.println("\nEmployee Details -->");
	return "Name = "+name+"\nid = "+id+"\nSalary = "+calculateSalary();
	}	
}

//Create class = FulltimeEmployee
/* Calculate MonthlySalary  */

class FullTimeEmployee extends Employee{
	private double monthlySalary;
	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	
//Poly
	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}

//  Create class = PartTimeEmployee
/*  Calculate Salary using hourWorked and hourlyRate 
 *   formula = hourWorked*hourlyRate                          */

class PartTimeEmployee extends Employee{
	int hourWorked;
	double hourlyRate;
		
	PartTimeEmployee(String name, int id, int hourWorked,double hourlyRate){
		super(name,id);
		this.hourWorked = hourWorked;
		this.hourlyRate=hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return hourWorked*hourlyRate;
	}
}

//  Create class = PayrollSystem
/*  Arrange in Array and Add Employee        */

class PayrollSystem {
	private ArrayList<Employee> employeeList;
	public PayrollSystem(){
		employeeList = new ArrayList<>();
	}
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
//  For Removing Employee in Array using that particular id
	
	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for (Employee employee : employeeList) {
			if(employee.getId()==id) {
				employeeToRemove = employee;
				break;
			}
		}
		if(employeeToRemove !=null) {
			employeeList.remove(employeeToRemove);
		}
	}
	
//  for Display Employee	
	public void displyEmployee() {
		for(Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}

public class Manager {
	public static void main(String [] args) {
		PayrollSystem payrollSystem = new PayrollSystem();

		 FullTimeEmployee emp1 = new FullTimeEmployee("Varun", 101, 5000.0);
		 payrollSystem.addEmployee(emp1);
		 
	     PartTimeEmployee emp2 = new PartTimeEmployee("Bawa", 102, 30, 15.0);
	     payrollSystem.addEmployee(emp2);
		
		System.out.println("DataBase: ");
		payrollSystem.displyEmployee();
		
		//Remove Employee on ID :
		payrollSystem.removeEmployee(102);
		
		System.out.println("\nTotal Employees :");
		payrollSystem.displyEmployee();
	}
}
