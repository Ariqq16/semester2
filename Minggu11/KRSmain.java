package Minggu11;
import java.util.Scanner;

public class KRSmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3. Lihat 2 Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Paling Belakang");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Sudah Proses");
            System.out.println("8. Cetak Jumlah Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.tambah(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.lihat2Terdepan();
                    break;
                case 4:
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah proses KRS: " + antrian.getJumlahDiproses());
                    break;
                case 8:
                    System.out.println("Jumlah belum proses KRS: " + antrian.getJumlahBelumProses());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
