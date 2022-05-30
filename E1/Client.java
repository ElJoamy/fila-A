package E1;

public class Client {
    public static void main(String[]args){
        Peaje peaje = Peaje.getInsPeaje();

        Vehiculo v1 = new Vehiculo();
        v1.setPlaca("ABC123");
        v1.setModelo("Toyota");
        v1.setColor("Rojo");
        v1.setPeaje(15);
        peaje.registro(v1);
        peaje.cobrar(v1.getPeaje());
        System.out.println();

        Vehiculo v2 = new Vehiculo();
        v2.setPlaca("ABC456");
        v2.setModelo("Suzuki");
        v2.setColor("Azul");
        v2.setPeaje(25);
        peaje.registro(v2);
        peaje.cobrar(v2.getPeaje());
        System.out.println();

        Vehiculo v3 = new Vehiculo();
        v3.setPlaca("ABC789");
        v3.setModelo("Nissan");
        v3.setColor("Verde");
        v3.setPeaje(23);
        peaje.registro(v3);
        peaje.cobrar(v3.getPeaje());
        System.out.println();

        Vehiculo v4 = new Vehiculo();
        v4.setPlaca("ABC101");
        v4.setModelo("Toyosa");
        v4.setColor("Blanco");
        v4.setPeaje(14);
        peaje.registro(v4);
        peaje.cobrar(v4.getPeaje());
        System.out.println();

        Vehiculo v5 = new Vehiculo();
        v5.setPlaca("ABC102");
        v5.setModelo("Poarch");
        v5.setColor("Rojo");
        v5.setPeaje(5);
        peaje.registro(v5);
        peaje.cobrar(v5.getPeaje());
        System.out.println();

        Vehiculo v6 = new Vehiculo();
        v6.setPlaca("ABC103");
        v6.setModelo("Camaro");
        v6.setColor("Cafe");
        v6.setPeaje(16);
        peaje.registro(v6);
        peaje.cobrar(v6.getPeaje());
        System.out.println();

        peaje.showCantidad();


    }
}
