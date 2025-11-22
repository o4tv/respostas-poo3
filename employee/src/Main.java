public class Main {
    public static void main(String[] args) {
        Manager m = new Manager(120.0, 40);
        System.out.println(m.calculeSalary());
        Programmer p = new Programmer(160.0, 30);
        System.out.println(p.calculeSalary());
    }
}
