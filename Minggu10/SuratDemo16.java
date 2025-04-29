package Minggu10;
import java.util.Scanner;
public class SuratDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat16 stack = new StackSurat16();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Masukkan Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    Surat16 surat = new Surat16(id, nama, kelas, jenis, durasi);
                    stack.terimaSurat(surat);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    Surat16 diproses = stack.prosesSurat();
                    if (diproses != null) {
                        System.out.println("Surat berikut telah diproses:");
                        diproses.displaySurat();
                    } else {
                        System.out.println("Tidak ada surat untuk diproses.");
                    }
                    break;

                case 3:
                    Surat16 terakhir = stack.lihatSuratTerakhir();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir:");
                        terakhir.displaySurat();
                    } else {
                        System.out.println("Belum ada surat.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    Surat16 ditemukan = stack.cariSurat(cariNama);
                    if (ditemukan != null) {
                        System.out.println("Surat ditemukan:");
                        ditemukan.displaySurat();
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
    }

