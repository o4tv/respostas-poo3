public class Bicycle extends Vehicle {
    private double speedEmKM = 0;

    @Override
    public void speedUp() {
        this.speedEmKM += 5;
    }

    public double getSpeed() {
        return this.speedEmKM;
    }
}
