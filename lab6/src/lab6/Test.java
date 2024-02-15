package lab6;

import java.util.ArrayList;

/**
 * Test program to test:
 * Interface: EmployeeRules
 * Class: Employee
 * Inherited Class: Faculty
 *
 * Creighton CSC 222 Lab 6
 */
public class Test
{

    public static void main(String[] args)
    {

        System.out.println("//**********   Faculty Class Test Start **********/");

        // Create a faculty member and his/her set of courses
        System.out.println("Faculty test, should show name and courses.");
        ArrayList<String> testCourses = new ArrayList<String>();
        testCourses.add("121");
        testCourses.add("222");
        testCourses.add("590");
        Faculty sherri = new Faculty("Sherri",65000, testCourses);
        System.out.println(sherri);//be sure you have a toString method for faculty
        System.out.println("Faculty get name and get salary tests.");
        System.out.println("Faculty Name: "+sherri.getName()); // print the faculty name
        System.out.println("Faculty Salary: "+sherri.getSalary()); // print the salary of faculty
        System.out.println("Test faculty constructor, should show name and courses (should NOT contain XYZ).");
        testCourses.set(1, "XYZ");
        System.out.println(sherri); //should not contain XYZ
        System.out.println("Test faculty getCourses should show name and courses (should NOT contain ABC).");
        testCourses = sherri.getCourses();  //remember to return a copy
        testCourses.set(1, "ABC");
        System.out.println(sherri); //should not contain ABC
        System.out.println("See the copy of the testCourses array (should contain ABC).");
        for (String c:testCourses)
        {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("Test faculty set courses, should show name and courses (should contain two new courses).");
        ArrayList<String> fallCourses= new ArrayList<String>();
        fallCourses.add("121");
        fallCourses.add("221");
        sherri.setCourses(fallCourses); // set the courses for faculty
        System.out.println(sherri);

        System.out.println("Test faculty set courses, should show name and courses (should NOT contain PQR).");
        fallCourses.set(1, "PQR");
        System.out.println(sherri);
        System.out.println("//**********   Faculty Class Test End **********");
        System.out.println();

        System.out.println("//********** Faculty as Employee Test Begin **************************");
        // Create a faculty member as an Employee
        System.out.println("Test faculty as an employee. Should show name and courses.");
        ArrayList<String> kevinCourses = new ArrayList<String>();
        kevinCourses.add("121");
        kevinCourses.add("221");
        kevinCourses.add("551");
        Employee kevin = new Faculty("Kevin",65000, kevinCourses);
        System.out.println(kevin);

        System.out.println("Test faculty as an employee get name and get salary tests.");
        System.out.println("Employee Name: "+kevin.getName()); // print the faculty name
        System.out.println("Employee Salary: "+kevin.getSalary()); // print the salary of faculty
        System.out.println("Test faculty as an employee, get courses.");
        fallCourses= new ArrayList<String>(); //reset fallCourses
        fallCourses.add("121");
        fallCourses.add("221");

        if (kevin instanceof Faculty)// why is this needed?
        {
            testCourses = ((Faculty)kevin).getCourses();//cast
            for (String c:testCourses)
                System.out.print(c+" ");
            System.out.println();

            System.out.println("Test faculty set courses, should show name and courses (should contain two new courses).");

            ((Faculty)kevin).setCourses(fallCourses); // set the courses for faculty
            System.out.println(kevin);
        }
        System.out.println("//********** Faculty as Employee Test End **************************");
        System.out.println();

        System.out.println("//********** Faculty as a member of EmployeeRules interface Test Begin **************************");
        // Create a faculty member as an EmployeeRules
        System.out.println("Test faculty as a member of EmployeeRules interface. Should show name and courses.");
        ArrayList<String> daveCourses = new ArrayList<String>();
        daveCourses.add("121");
        daveCourses.add("321");
        daveCourses.add("531");
        EmployeeRules dave = new Faculty("dave",65000, daveCourses);
        System.out.println(dave);
        System.out.println("Test faculty as an a member of EmployeeRules interface get name and get salary tests.");
        System.out.println("EmployeeRules Name: "+dave.getName()); // print the faculty name
        System.out.println("EmployeeRules Salary: "+dave.getSalary()); // print the salary of faculty
        System.out.println("Test faculty as a member of EmployeeRules interface, get courses.");
        if (dave instanceof Faculty)
        {
            testCourses = ((Faculty)dave).getCourses(); //cast
            for (String c:testCourses)
                System.out.print(c+" ");
            System.out.println();
        }
        System.out.println("Test faculty set courses, should show name and courses (should contain two new courses).");
        ((Faculty)dave).setCourses(fallCourses); // set the courses for faculty
        System.out.println(dave);
        System.out.println("//********** Faculty as a member of EmployeeRules interface Test End **************************");
        System.out.println();

        System.out.println("//********** Employee Test Begin **************************");
        System.out.println("Employee test, should show name and salary.");
        Employee joi = new Employee("joi",65000); // employee object
        System.out.println(joi);
        System.out.println("Employee get name and get salary tests.");
        System.out.println("Employee Name: "+joi.getName());
        System.out.println("Employee Salary: "+joi.getSalary());
        System.out.println("//********** Employee Test End **************************");
        System.out.println();

        System.out.println("//********** Employee as a member of EmployeeRules Interface Test Begin **************************");
        System.out.println("EmployeeRules test, should show name and salary.");
        EmployeeRules daniel= new Employee("Daniel",25000); // employee object
        System.out.println(daniel);
        System.out.println("EmployeeRules get name and get salary tests.");
        System.out.println("EmployeeRules Name: "+daniel.getName());
        System.out.println("EmployeeRules Salary: "+daniel.getSalary());
        System.out.println("//********** Employee as a member of EmployeeRules Interface Test End **************************");
 
        System.out.println();
        System.out.println("//**********   GraduateFaculty Class Test Start **********/");

     // Create a graduate faculty member 
     System.out.println("GraduateFaculty test, should show name and courses.");
     ArrayList<String> graduateCourses = new ArrayList<String>();
     graduateCourses.add("Nelking 101");
     graduateCourses.add("Gooning 303");
     graduateCourses.add("Knight Squad 221");
     GraduateFaculty graduateFaculty = new GraduateFaculty("Wistrom", 80000, graduateCourses);
     System.out.println(graduateFaculty);

     System.out.println();
     System.out.println("GraduateFaculty get name and get salary tests.");
     System.out.println("GraduateFaculty Name: " + graduateFaculty.getName());
     System.out.println("GraduateFaculty Salary: " + graduateFaculty.getSalary());

     System.out.println();
     System.out.println("Replacing a course.");
     graduateCourses.set(1, "Drip 353");
     System.out.println(graduateFaculty); // should not contain Gooning 303

     System.out.println();
     System.out.println("Copying courses while changing one.");
     ArrayList<String> coursesCopy = graduateFaculty.getCourses();
     coursesCopy.set(1, "RZZ 471");
     System.out.println(graduateFaculty); // Should not contain Drip 353

     System.out.println();
     System.out.println("Will give myself a new class schedule");
     ArrayList<String> newCourses = new ArrayList<>();
     newCourses.add("Opium 221");
     newCourses.add("Cartinese 542");
     graduateFaculty.setCourses(newCourses);
     System.out.println(graduateFaculty);

     System.out.println("//**********   GraduateFaculty Class Test End **********/");

    }
}