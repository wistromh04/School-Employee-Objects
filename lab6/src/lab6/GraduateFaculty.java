package lab6;
import java.util.ArrayList;

public class GraduateFaculty extends Faculty {

	 public GraduateFaculty(String name, double salary, ArrayList<String> courses) {
	        super(name, salary, courses);
	    }
	 
	 public String getName() {
	        return "Graduate " + super.getName();
	    }
}
