import java.util.Scanner;
public class SiakadNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa [] daftarMahasiswa = {
            new Mahasiswa ("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa ("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa ("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };
        MataKuliah [] daftarMK = {
            new MataKuliah ("MK001", "Struktur Data", 3),
            new MataKuliah ("MK002", "Basis Data", 3),
            new MataKuliah ("MK003", "Desain Web", 3)
        };
        Penilaian[] penilaian = {
            new Penilaian(daftarMahasiswa[0], daftarMK[0], 80, 85, 90),
            new Penilaian(daftarMahasiswa[0], daftarMK[1], 60, 75, 70),
            new Penilaian(daftarMahasiswa[1], daftarMK[0], 75, 70, 80),
            new Penilaian(daftarMahasiswa[2], daftarMK[1], 85, 90, 95),
            new Penilaian(daftarMahasiswa[2], daftarMK[2], 80, 90, 65)
        };
        int pilih = -1;
        while (pilih != 0) {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            if(pilih == 1){
                System.out.println("\nDaftar Mahasiswa");
                for (Mahasiswa m : daftarMahasiswa){
                    m.tampilMahasiswa();
                }
            } else if (pilih == 2){
                System.out.println("\nDatar Mata Kuliah");
                for (MataKuliah mk : daftarMK){
                    mk.tampilMataKuliah();
                }
            } else if (pilih == 3){
                System.out.println("\nDaftar Nilai");
                for (Penilaian p : penilaian){
                    p.tampilPenilaian();
                }
            } else if (pilih == 4) {
                System.out.println("\nDaftar Urutan Nilai Berdasarkan Nilai Akhir");
                SiakadPerhitungan.bubbleSortPenilaian(penilaian);
                for (Penilaian p : penilaian){
                    p.tampilPenilaian();
                }
            } else if (pilih == 5){
                System.out.print("Masukkan NIM: ");
                String nimDicari = sc.nextLine();

                Mahasiswa m = SiakadPerhitungan.linearSearchCariNilaiMahasiswa(daftarMahasiswa, nimDicari);
                if (m!= null){
                    System.out.println("Mahasiswa Ditemukan");
                    m.tampilMahasiswa();
                } else {
                    System.out.println("Mahasiswa dengan NIM "+nimDicari+" tidak ditemukan");
                }
            } else if (pilih == 0){
                System.out.println("Terima Kasih");
            } else {
                System.out.println("Menu Tidak Tersedia");
            }
        }
    }   
}
