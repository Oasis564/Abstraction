
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\n ********** Welcome to Course Selection Panel **********");
        System.out.println("\n Enter 1 if you belong to Junior Champ Group ");
        System.out.println("\n Enter 2 if you belong to Senior Champ Group \n");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.println("\n Enter the name of course you would like to enroll ? ");
            String course = s.next();
            System.out.println("\n Enter the marks of subject-1 as per your results ? ");
            double marks1 = s.nextDouble();
            System.out.println("\n Enter the marks of subject-2 as per your results ? ");
            double marks2 = s.nextDouble();
            System.out.println("\n Enter the marks of subject-3 as per your results ? ");
            double marks3 = s.nextDouble();

            // JuniorChamps junior_obj = new JuniorChamps(course, subject1, subject2, subject3);
            AbstractClassLesson.JuniorChamps junior_obj = new AbstractClassLesson.JuniorChamps(course, marks1, marks2, marks3);

            System.out.println(junior_obj.print());

        } 
        else if (choice == 2) {
            System.out.println("\n Enter the name of course you would like to enroll ? ");
            String course = s.next();
            System.out.println("\n Enter the marks of subject-1 as per your results ? ");
            double marks1 = s.nextDouble();
            System.out.println("\n Enter the marks of subject-2 as per your results ? ");
            double marks2 = s.nextDouble();
            System.out.println("\n Enter the marks of subject-3 as per your results ? ");
            double marks3 = s.nextDouble();

            AbstractClassLesson.SeniorChamps senior_obj = new AbstractClassLesson.SeniorChamps(course, marks1, marks2, marks3);

            System.out.println(senior_obj.print());

        }

        else{
            System.out.println( "\n Sorry! Thats an invalid choice. ");
        }
    }
}
