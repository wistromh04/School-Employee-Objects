package lab6;
import java.util.ArrayList;

public class Faculty extends Employee {
	private ArrayList<String> courses;
	
	public Faculty(String name, double salary, ArrayList<String> courses) {
		super(name, salary);
        this.courses = courses;
	}
	
	 public String getName() {     //returns name
	        return "Professor " + super.getName();
	    }
	 
	 public ArrayList<String> getCourses(){  //returns courses
		 return courses;
	 }
	 
	 public void setCourses(ArrayList<String> courses) { 
	        this.courses = courses;
	    }
	 
	 public String toString() {
	        return "Faculty [name=" + getName() + ", salary=" + getSalary() + ", courses=" + courses + "]";
	    }
}
