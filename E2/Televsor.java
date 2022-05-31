package E2;

public class Televsor implements ITelevsor {
    private String sisOp;
    private String vSO;
    private int pg;
    private int resolucion;
    private Boolean pHDMI;
    private int pUSB;
    private Boolean controlRemoto;
    private Boolean bluetooth;
    private  String serialTV;

    public Televsor(){}

    public String getSisOp() {
        return sisOp;
    }

    public void setSisOp(String sisOp) {
        this.sisOp = sisOp;
    }

    public String getvSO() {
        return vSO;
    }

    public void setvSO(String vSO) {
        this.vSO = vSO;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getpHDMI() {
        return pHDMI;
    }

    public void setpHDMI(Boolean pHDMI) {
        this.pHDMI = pHDMI;
    }

    public int getpUSB() {
        return pUSB;
    }

    public void setpUSB(int pUSB) {
        this.pUSB = pUSB;
    }

    public Boolean getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(Boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerialTV() {
        return serialTV;
    }

    public void setSerialTV(String serialTV) {
        this.serialTV = serialTV;
    }

    @Override
    public Object clone(){
        Televsor clone = new Televsor();
        clone.setSisOp(this.getSisOp());
        clone.setvSO(this.getvSO());
        clone.setPg(this.getPg());
        clone.setResolucion(this.getResolucion());
        clone.setpHDMI(this.getpHDMI());
        clone.setpUSB(this.getpUSB());
        clone.setControlRemoto(this.getControlRemoto());
        clone.setBluetooth(this.getBluetooth());
        clone.setSerialTV(this.getSerialTV());
        return clone;
    }


}
