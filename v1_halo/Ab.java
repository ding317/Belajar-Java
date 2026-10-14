public class Ab {
    private String namaAC;
    private int pinAC;

    public Ab (String namaAC, int pinAC){
        this.namaAC = namaAC;
        this.pinAC = pinAC;
    }
    public String getnamaAC(){
        return this.namaAC;
    }
    public void setnamaAC(String namaAC){
        if("Gading".equals(namaAC)){
        this.namaAC = namaAC;}
        else {
            System.out.println("Nama Tidak sesuai");
        }
    }
    public int getpinAC(){
        return this.pinAC;
    }
    public void setpinAC(int pinAC){
        if(pinAC == 212121){
            this.pinAC = pinAC;
        }else {
            System.out.println("Pin Salah");
        }
    }
}
