
import java.util.Scanner;

public abstract class Course {
    Scanner s = new Scanner(System.in) ;
    String course_name;
    public abstract double marks();
    public abstract String print();

    public Course(String course_name){
        System.out.println("\n Course constructor calling in progress . . . ");
        this.course_name = course_name;
    }

    public String getCourseName(){
        return course_name;
    }
}
