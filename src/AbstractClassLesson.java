public class AbstractClassLesson {
    public static class JuniorChamps extends Course{
        double subject1, subject2, subject3;

        public JuniorChamps(String course_name, double subject1, double subject2, double subject3) {
            super(course_name);
             System.out.println("\n JuniorChamps constructor calling in progress . . .");
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        @Override
        public double marks() {
            double percentage= (subject1 + subject2+ subject3)/300 *100; 
            return percentage;
        }
    }
}