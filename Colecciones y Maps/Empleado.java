public class Empleado extends Persona{

    private double salario;

    public Empleado () {
    }

    public Empleado (int num, String nombre, int edad, double salario) {
        super(num, nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", salario: " + salario;
    }

}
