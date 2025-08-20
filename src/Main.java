public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.display();
        s.display("Alice", 20);
        s.display("Bob", 22, "New York");
        s.display("Charlie", 21, "Los Angeles", 101);
    }
}
