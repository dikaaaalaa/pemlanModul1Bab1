public class Mobil78 {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }
    public void setWarna(String s) {
        warna = s;
    }
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    public void setKecepatan(double k) {
        kecepatan = (int) rubahKecepatan(k);
    }
    public void setWaktu(double w) {
        waktu = rubahSekon(w);
    }

    private double rubahKecepatan( double kmh) {
        return (kmh * 1000) / 3600;
    }
    private double rubahSekon(double jam) {
        return jam * 3600;
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerk " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("waktu perjalanan " + waktu + " detik");
        System.out.println("jarak tempuh " + hitungJarak()/1000 + " km ");
    }
}
