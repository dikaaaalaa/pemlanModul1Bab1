public class Mobil4 {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s) {p
        noPlat = s;
    }
    public void setWarna(String s) {
        warna = s;
    }
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    public void setKecepatan(int i) {
        kecepatan = i;
    }
    public void setWaktu(double w) {
        waktu = w;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerk " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("waktu perjalanan " + waktu + " jam");
    }
 }
