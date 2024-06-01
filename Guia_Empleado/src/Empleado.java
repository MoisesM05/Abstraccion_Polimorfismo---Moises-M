abstract class Empleado {

    private String nombre;
    private String numerodeIdentificacion;

    public Empleado(String nombre, String numerodeIdentificacion){
        this. nombre = nombre;
        this.numerodeIdentificacion = numerodeIdentificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public String numerodeIdentificacion(){
        return numerodeIdentificacion;
    }

    public abstract double calcularSalario();
}
