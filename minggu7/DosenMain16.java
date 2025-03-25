package minggu7;
import java.util.Scanner;
public class DosenMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DataDosen data = new DataDosen();
        int pilihan;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan ASC (Usia Muda ke Tua) - Bubble Sort");
            System.out.println("4. Urutkan DSC (Usia Tua ke Muda) - Selection Sort");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen16(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("Data telah diurutkan ASC.");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data telah diurutkan DSC.");
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
        
    }
}


