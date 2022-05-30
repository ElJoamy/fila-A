package E1;

public class Peaje{
    private static Peaje instnce;
    private int saldo = 0;

    public static Peaje getInsPeaje(){
        if(instnce == null){
            instnce = new Peaje();
        }
        return instnce;
    }

    public void registro(Vehiculo vehiculo){
        vehiculo.showInfo();
    }

    public void cobrar(int cantidad){
        System.out.println("Cantidad recibida: " + cantidad);
        saldo += cantidad;
        System.out.println("Saldo recaudado: " + saldo);
    }

    public void showCantidad(){
        System.out.println("Saldo actual: " + saldo);
    }

}