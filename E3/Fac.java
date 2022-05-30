package E3;

public class Fac {
   public static Artefactos crear(String tipo) {
      Artefactos artefactos;
        switch (tipo) {
            case "microondas":
                artefactos = new Microondas();
                break;
            case "batidora":
                artefactos = new Batidora();
                break;
            case "radio":
                artefactos = new Radio();
                break;
            case "refrigerador":
                artefactos = new Refrigerador();
                break;
            case "televsion":
                artefactos = new Televsion();
                break;
            default:
                artefactos = null;
                break;
        }
        return artefactos;
   }    
}
