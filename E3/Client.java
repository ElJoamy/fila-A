package E3;

public class Client {
    public static void main(String[] args) {
        Artefactos microondas = Fac.crear("microondas");
        microondas.setPrecio(500);
        System.out.println("El precio del microondas es " + microondas.getPrecio());

        Artefactos batidora = Fac.crear("batidora");
        batidora.setPrecio(200);
        System.out.println("El precio de la batidora es " + batidora.getPrecio());

        Artefactos radio = Fac.crear("radio");
        radio.setPrecio(150);
        System.out.println("El precio del radio es " + radio.getPrecio());

        Artefactos refrigerador = Fac.crear("refrigerador");
        refrigerador.setPrecio(3000);
        System.out.println("El precio del refrigerador es " + refrigerador.getPrecio());

        Artefactos televsion = Fac.crear("televsion");
        televsion.setPrecio(1500);
        System.out.println("El precio de la televsion es " + televsion.getPrecio());
    }
}
