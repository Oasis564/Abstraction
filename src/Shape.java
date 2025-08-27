abstract class Shape {
    int a, b;

   
    abstract void printArea();
}


class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    @Override
    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Triangle extends Shape {
    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    @Override
    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}


class Circle extends Shape {
    Circle(int radius) {
        a = radius;
    }

    @Override
    void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Area of Circle: " + area);
    }
}