public class Main {
  public static void main(String[] args){
    Empleado emp = new Empleado();
    System.out.println(emp);
    
    Gerente ger = new Gerente();
    System.out.println(ger);
    
    ger.setNombre("Raul Jimenez");
    ger.setNumEmpleado(13531);
    ger.setSueldo(25_000);

    System.out.println(ger);
    ger.aumentarSueldo(20);
    ger.asignarPresupuesto(50_000);
    System.out.println(ger);
    System.out.println("Nombre del gerente:" +ger.getNombre());
    
    Gerente ger2 = new Gerente("Karen Avalos", 20202, 80_000, 120_000);
    System.out.println(ger);

    Gerente ger3 = new Gerente("Samantha Rios", 53162, 35_000);
    System.out.println(ger);
    if (ger3 instanceof Gerente){System.out.println("Gerente el instancia de Gerente");}
    if (ger3 instanceof Empleado){System.out.println("Gerente el instancia de Empleado");}
    if (ger3 instanceof Object){System.out.println("Gerente el instancia de Object");}
  }
}