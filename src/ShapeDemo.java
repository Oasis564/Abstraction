public class ShapeDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 20);
        Shape tri = new Triangle(10, 15);
        Shape cir = new Circle(7);

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}
