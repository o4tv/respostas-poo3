public class Rectangle extends Shape {
    private double base;
    private double altura;

    public Rectangle() {}

    public Rectangle(double b, double a) {
        this.base = b;
        this.altura = a;
    }

    @Override
    public double calculateArea() {
        return base * altura;
    }

    public void setBase(double b) {
        this.base = b;
    }
    public void setAltura(double a) {
        this.altura = a;
    }
    public double getBase() {
        return this.base;
    }
    public double getAltura() {
        return this.altura;
    }
}
