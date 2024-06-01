public class EmpleadoMedioTiempo extends Empleado{

    private double salarioPorHora;
    private int horasTrabajadasPorSemana;
    
    public EmpleadoMedioTiempo(String nombre, String numerodeIdentificacion, double salarioPorHora,
            int horasTrabajadasPorSemana) {
            super(nombre, numerodeIdentificacion);
            this.salarioPorHora = salarioPorHora;
            this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    @Override
    public double calcularSalario(){
        return salarioPorHora * horasTrabajadasPorSemana * 4;
    }

    
}
