package lab6;

public class Employee implements EmployeeRules {

	private String name;
	private double salary;
	
	 public Employee(String name, double salary) {  //obj rules
	        this.name = name;
	        this.salary = salary;
	    }
	 
	 public Employee() { //default constructor
	        this.name = "";
	        this.salary = 0.0;
	    }
	 
	 public String getName() { //returns name
	        return name;
	    }
	 
	 public double getSalary() {  //returns salary
	        return salary;
	    }
	 
	 public String toString() {
	        return "Employee [name=" + name + ", salary=" + salary + "]";
	    }

}
