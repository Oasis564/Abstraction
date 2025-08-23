public class AbstractClassLesson {
    public static class JuniorChamps extends Course{
        double subject1, subject2, subject3;

        public JuniorChamps(String course_name, double subject1, double subject2, double subject3){
            super(course_name);
            System.out.println("\n JuniorChamps constructor calling in progress . . .");
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        @Override
        public double marks(){
            double percentage = (subject1 + subject2 + subject3) / 300 * 100;
            return percentage;
        }

        @Override
        public String print(){
            double result = marks();

            if(result <= 60){
                return "\n Sorry! Not eligible for JuniorChamps course name: " + course_name + "  with the scores attained, marks: " + marks()+ "% !!" ;
            }
            else{
                return "\n Congratulations! You are eligible for JuniorChamps course name: " + course_name + "  with the scores attained, marks: " + marks()+ "% !!" ;
            }
        }
    }

    public static class SeniorChamps extends Course{
        double subject1, subject2, subject3;

        public SeniorChamps(String course_name, double subject1, double subject2, double subject3){
            super(course_name);
            System.out.println("\n SeniorChamps constructor calling in progress . . .");
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        @Override
        public double marks(){
            double percentage = (subject1 + subject2 + subject3) / 300 * 100;
            return percentage;
        }

        @Override
        public String print(){
            double result = marks();

            if(result <= 50){
                return "\n Sorry! Not eligible for SeniorChamps course name: " + course_name + "  with the scores attained, marks: " + marks()+ "% !!" ;
            }
            else{
                return "\n Congratulations! You are eligible for SeniorChamps course name: " + course_name + "  with the scores attained, marks: " + marks()+ "% !!" ;
            }
        }
    }
}