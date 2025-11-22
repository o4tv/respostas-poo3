public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2.0); // pi*r^2
        Rectangle r = new Rectangle(3.0, 4.0);
        Triangle t = new Triangle(2.0, 3.0);

        System.out.println(c.calculateArea());
        System.out.println(r.calculateArea());
        System.out.println(t.calculateArea());
    }
}
