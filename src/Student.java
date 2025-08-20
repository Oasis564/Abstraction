class Student {

    
    void display() {
        System.out.println("Displaying student details...");
    }

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(String name, int age, String city) {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    void display(String name, int age, String city, int roll) {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city + ", Roll No: " + roll);
    }
}