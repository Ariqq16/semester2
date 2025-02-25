package minggu3;
import java.util.Scanner;
public class MataKuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah16[] arrayofMatakuliah16 = new MataKuliah16[3];
        String kode, nama, dummy;
        int sks, jumlahJam;
        

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah16[i].cetakInfo();
            System.out.print("Kode  : ");
            kode = sc.nextLine();
            System.out.print("Nama  : ");
            nama = sc.nextLine();
            System.out.print("SKS   : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam   : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------");

            arrayofMatakuliah16[i] = new MataKuliah16(kode,  nama, sks, jumlahJam);
            System.out.println("------------------------------");
            arrayofMatakuliah16[i].tambahData(kode, nama, sks, jumlahJam);

            
        }
        for(int i=0; i < 3; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            System.out.println("Kode      : " + arrayofMatakuliah16[i].kode);
            System.out.println("Nama      : " + arrayofMatakuliah16[i].nama);
            System.out.println("SKS:      : " + arrayofMatakuliah16[i].sks);
            System.out.println("Jumlah Jam: " + arrayofMatakuliah16[i].jumlahJam);
            System.out.println("------------------------------------------------");
        }


    }
}
