public class App {
    public static void main(String[] args) throws Exception {

        Empleado [] empleadoss = new Empleado[2];

        empleadoss[0]= new EmpleadoTIempoCompleto("Marcos", "124", 600900);
        //Medio tiempo
        empleadoss[1]= new EmpleadoMedioTiempo("Jefferson", "210", 200, 1400);
       
        for(Empleado empleado: empleadoss){
            System.out.println("Los nombre de los empleados son: "+empleado.getNombre()+" Su salario mensual "+empleado.calcularSalario());
        }
    }
}
