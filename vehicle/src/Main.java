public class Main {
    public static void main(String[] args) {
        Car carro = new Car();
        System.out.println(carro.getSpeed());
        carro.speedUp();
        System.out.println(carro.getSpeed());
        Bicycle bike = new Bicycle();
        System.out.println(bike.getSpeed());
        bike.speedUp();
        System.out.println(bike.getSpeed());
    }
}
