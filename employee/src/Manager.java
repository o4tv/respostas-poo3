public class Manager extends Employee {
    private double precoHora;
    private int horasTrabalhadas;

    public Manager() {}
    public Manager(double p, int h) {
        this.precoHora = p;
        this.horasTrabalhadas = h;
    }

    @Override
    public double calculeSalary() {
        return precoHora * horasTrabalhadas;
    }

    public double getPrecoHora() {
        return this.precoHora;
    }
    public void setPrecoHora(double p) {
        this.precoHora = p;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int h) {
        this.horasTrabalhadas = h;
    }
}
