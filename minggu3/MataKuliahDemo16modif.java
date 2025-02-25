package minggu3;
import java.util.Scanner;
public class MataKuliahDemo16modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlahMK = Integer.parseInt(sc.nextLine());

       MataKuliah16[] arrayMataKuliah16 = new MataKuliah16[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: "); 
            String nama = sc.nextLine();
            System.out.print("SKS: ");
            int sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam: ");
            int jumlahJam = Integer.parseInt(sc.nextLine()); 

           
            arrayMataKuliah16[i] = new MataKuliah16(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Mata Kuliah yang telah dimasukkan:");
        for (MataKuliah16 mk : arrayMataKuliah16) {
            mk.cetakInfo();
        }
    }
}
