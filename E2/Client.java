package E2;

public class Client {
    public static void main(String[] args) {
        Televsor tv1 = new Televsor();
        tv1.setSisOp("Android");
        tv1.setvSO("11.0");
        tv1.setPg(80);
        tv1.setResolucion(50);
        tv1.setpHDMI(true);
        tv1.setpUSB(4);
        tv1.setControlRemoto(true);
        tv1.setBluetooth(true);
        tv1.setSerialTV("0123456789");

        System.out.println("TV1");
        System.out.println("Sistema Operativo: " + tv1.getSisOp());
        System.out.println("Version SO: " + tv1.getvSO());
        System.out.println("Pulgadas: " + tv1.getPg());
        System.out.println("Resolucion: " + tv1.getResolucion());
        System.out.println("PuertoHDMI: " + tv1.getpHDMI());
        System.out.println("PuertoUSB: " + tv1.getpUSB());
        System.out.println("Control Remoto: " + tv1.getControlRemoto());
        System.out.println("Bluetooth: " + tv1.getBluetooth());
        System.out.println("Serial TV: " + tv1.getSerialTV());
        System.out.println();

        Televsor tv2 = (Televsor) tv1.clone();
        tv2.setSerialTV("0123456780");
        System.out.println("TV2");
        System.out.println("Serial TV: " + tv2.getSerialTV());
        System.out.println();

        Televsor tv3 = (Televsor) tv1.clone();  
        tv3.setSerialTV("0123456770");
        System.out.println("TV3");
        System.out.println("Serial TV: " + tv3.getSerialTV());
        System.out.println();

        Televsor tv4 = (Televsor) tv1.clone();
        tv4.setSerialTV("0123456760");
        System.out.println("TV4");
        System.out.println("Serial TV: " + tv4.getSerialTV());
        System.out.println();

        Televsor tv5 = (Televsor) tv1.clone();
        tv5.setSerialTV("0123456750");
        System.out.println("TV5");
        System.out.println("Serial TV: " + tv5.getSerialTV());
        System.out.println();
        
    }
}
