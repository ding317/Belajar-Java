public class Achecking {
    public boolean verifikasi (Ab akun, String namaInput, int pininput){
        boolean namacocok = akun.getnamaAC().equals(namaInput);
        boolean pincocok = akun.getpinAC() == pininput;
        
        return namacocok && pincocok;

    }
}
