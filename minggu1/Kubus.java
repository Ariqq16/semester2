package minggu1;
import java.util.Scanner;
public class Kubus {
    
    //menghitung volume kubus
    public static double hitungVolume(double sisi){
        return sisi *sisi*sisi;
    }

    //menghitung luas permukaan
    public static double hitungLuasPermukaan(double sisi){
        return 6 * (sisi * sisi);
    }

    //menghitung kelilng
    public static double hitungKeliling(double sisi){
        return 12 * sisi;
    }

    //menampilkan menu dan pilihan user
    public static void tampilkanMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih perhitungan yang akan di lakukan: ");
        System.out.println("1.Hitung Volume ");
        System.out.println("2.Hitung Luas Permukaan ");
        System.out.println("3.Hitung Keliling ");
        System.out.println("Masukkan Pilihan (1-3): ");

        int pilihan = sc.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }


    }

    //untuk menjalankan program 
    public static void main(String[] args) {
        tampilkanMenu();
    }
    }

