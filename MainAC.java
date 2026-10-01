public class MainAC {
    public static void main(String[] args) {
        // Membuat objek baru dari class Ab
        Ab akun = new Ab("Gading", 212121);

        // Mengambil data
        System.out.println("Nama AC: " + akun.getnamaAC());
        System.out.println("PIN AC : " + akun.getpinAC());

        // Mengubah data dengan setter
        akun.setnamaAC("Budi");   // Output: Nama Tidak sesuai
        akun.setpinAC(123456);     // Output: Pin Salah
    }
}