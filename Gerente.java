public class Gerente extends Empleado {
  private int presupuesto;
  private boolean presupuestoAsignado;
  
  public Gerente(){}

  public Gerente(String nombre, int numEmpleado, int sueldo){
    super(nombre, numEmpleado, sueldo);
  }

  public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto){
    super(nombre, numEmpleado, sueldo);
    this.presupuesto = presupuesto;
    presupuestoAsignado = true;
  }
  
  public int getPresupuesto(){
    return presupuesto;
  }
  
  public void setPresupuesto(int presupuesto){
    this.presupuesto = presupuesto;
  }
  
  public void asignarPresupuesto(int presupuesto){
    this.presupuesto = presupuesto;
    presupuestoAsignado = true;
  }
  
    @Override
  public String toString(){
    //return "Gerente["+presupuesto+","+presupuestoAsignado+"]";
    return super.toString() + "Gerente["+presupuesto+","+presupuestoAsignado+"]";
  }
}