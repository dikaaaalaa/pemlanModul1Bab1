import java.util.Scanner;

public class MainMobil3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mobil mobil1 = new Mobil();

        System.out.println("================================");
        System.out.println("Memasukkan data mobil bos");
        System.out.println("================================");

        System.out.print("Masukkan manufaktur mobil bos: ");
        mobil1.setManufaktur(input.nextLine());

        System.out.print("Masukkan nomor plat mobil bos: ");
        mobil1.setNoPlat(input.nextLine());

        System.out.print("Masukkan warna mobil bos: ");
        mobil1.setWarna(input.nextLine());

        System.out.print("Masukkan kecepatan mobil bos: ");
        mobil1.setKecepatan(input.nextInt());
        input.nextLine();

        mobil1.displayMessage();

        System.out.println("===============================");

        Mobil mobil2= new Mobil();

        System.out.println("================================");
        System.out.println("Memasukkan data mobil kedua bos");
        System.out.println("================================");

        System.out.print("Masukkan manufaktur mobil bos: ");
        mobil2.setManufaktur(input.nextLine());

        System.out.print("Masukkan nomor plat mobil bos: ");
        mobil2.setNoPlat(input.nextLine());

        System.out.print("Masukkan warna mobil bos: ");
        mobil2.setWarna(input.nextLine());

        System.out.print("Masukkan kecepatan mobil bos: ");
        mobil2.setKecepatan(input.nextInt());
        input.nextLine();

        mobil2.displayMessage();

        System.out.println("===============================");

        System.out.println("Merubah warna mobil pertama:");
        System.out.print("Masukkan warna baru mobil pertama: ");
        mobil1.setWarna(input.nextLine());

        System.out.println("Data mobil pertama bos setelah perubahan:");
        mobil1.displayMessage();

        
        input.close();
        
    }
}
