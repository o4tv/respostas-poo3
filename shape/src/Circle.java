public class Circle extends Shape {
    private double raio;

    public Circle() {}

    public Circle(double r) {
        this.raio = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.raio * this.raio;
    }

    public void setRaio(double r) {
        this.raio = r;
    }
    public double getRaio() {
        return this.raio;
    }
}
