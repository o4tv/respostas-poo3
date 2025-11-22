public class Car extends Vehicle {
    private double speedEmKM = 0;

    @Override
    public void speedUp() {
        this.speedEmKM += 20;
    }

    public double getSpeed() {
        return this.speedEmKM;
    }
}
