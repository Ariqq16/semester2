package Minggu12.Tugas;
import java.util.Scanner;
public class LayananKemahasiswaan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        AntrianMahasiswa antrian = new AntrianMahasiswa();
        int pilihan;

        do {
            System.out.println("\n=== MENU LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian Terdepan");
            System.out.println("4. Tampilkan Antrian Terakhir");
            System.out.println("5. Tampilkan Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Tampilkan Seluruh Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = sc.nextLine();
                    antrian.enqueue(nama, nim);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilDepan();
                    break;
                case 4:
                    antrian.tampilBelakang();
                    break;
                case 5:
                    antrian.tampilJumlah();
                    break;
                case 6:
                    antrian.tampilkanAntrian();
                    break;
                case 7:
                    antrian.kosongkan();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

    }
}
