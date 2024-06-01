public class EmpleadoTIempoCompleto extends Empleado {

    private double salarioAnual;

    public EmpleadoTIempoCompleto(String nombre, String numerodeIdentificacion, double salarioAnual){
        super(nombre, numerodeIdentificacion);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalario(){
        return salarioAnual / 12;
    }
}
