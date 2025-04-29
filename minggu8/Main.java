package minggu8;
import java.util.*;
public class Main {
    static List<Mahasiswa16> daftarMahasiswa = new ArrayList<>();
    static List<MataKuliah16> daftarMataKuliah = new ArrayList<>();
    static List<Penilaian16> daftarPenilaian = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initData();

        int pilihan;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanMahasiswa();
                    break;
                case 2:
                    tampilkanMataKuliah();
                    break;
                case 3:
                    tampilkanPenilaian();
                    break;
                case 4:
                    urutkanBerdasarkanNilaiAkhir();
                    break;
                case 5:
                    cariMahasiswaBerdasarkanNIM();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    static void initData() {
        Mahasiswa16 m1 = new Mahasiswa16("22001", "Ali Rahman", "Informatika");
        Mahasiswa16 m2 = new Mahasiswa16("22002", "Budi Santoso", "Informatika");
        Mahasiswa16 m3 = new Mahasiswa16("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        daftarMahasiswa.addAll(Arrays.asList(m1, m2, m3));

        MataKuliah16 mk1 = new MataKuliah16("MK001", "Struktur Data", 3);
        MataKuliah16 mk2 = new MataKuliah16("MK002", "Basis Data", 3);
        MataKuliah16 mk3 = new MataKuliah16("MK003", "Desain Web", 3);

        daftarMataKuliah.addAll(Arrays.asList(mk1, mk2, mk3));

        daftarPenilaian.add(new Penilaian16(m1, mk1, 80, 85, 90));
        daftarPenilaian.add(new Penilaian16(m1, mk2, 75, 65, 70));
        daftarPenilaian.add(new Penilaian16(m2, mk1, 85, 70, 65));
        daftarPenilaian.add(new Penilaian16(m3, mk2, 85, 90, 95));
        daftarPenilaian.add(new Penilaian16(m3, mk3, 90, 80, 65));
    }

    static void tampilkanMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa16 m : daftarMahasiswa) {
            System.out.println("NIM: " + m.NIM + " | Nama: " + m.nama + " | Prodi: " + m.prodi);
        }
    }

    static void tampilkanMataKuliah() {
        System.out.println("\nDaftar Mata Kuliah:");
        for (MataKuliah16 mk : daftarMataKuliah) {
            System.out.println("Kode MK: " + mk.kodeMK + " | Nama: " + mk.namaMK + " | SKS: " + mk.sks);
        }
    }

    static void tampilkanPenilaian() {
        System.out.println("\nData Penilaian:");
        for (Penilaian16 p : daftarPenilaian) {
            System.out.print(p.mahasiswa16.nama + " | ");
            System.out.print(p.mataKuliah16.namaMK + " | ");
            System.out.println("Nilai Akhir: " + p.nilaiAkhir);
        }

        System.out.println("\nData yang digunakan:");
        System.out.println("No\tNIM\tNama Mahasiswa\tKode MK\tNama Mata Kuliah\tNilai Tugas\tUTS\tUAS");
        int no = 1;
        for (Penilaian16 p : daftarPenilaian) {
            System.out.printf("%d\t%s\t%s\t\t%s\t%s\t\t%.1f\t\t%.1f\t%.1f\n",
                no++, p.mahasiswa16.NIM, p.mahasiswa16.nama,
                p.mataKuliah16.kodeMK, p.mataKuliah16.namaMK,
                p.nilaiTugas, p.nilaiUTS, p.nilaiUAS);
        }
    }

    static void urutkanBerdasarkanNilaiAkhir() {
        daftarPenilaian.sort((a, b) -> Double.compare(b.nilaiAkhir, a.nilaiAkhir));
        System.out.println("\nData Penilaian (Diurutkan):");
        for (Penilaian16 p : daftarPenilaian) {
            System.out.println(p.mahasiswa16.nama + " | " + p.mataKuliah16.namaMK + " | Nilai Akhir: " + p.nilaiAkhir);
        }
    }

    static void cariMahasiswaBerdasarkanNIM() {
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        String nim = scanner.nextLine();
        boolean ditemukan = false;
        for (Mahasiswa16 m : daftarMahasiswa) {
            if (m.NIM.equals(nim)) {
                System.out.println("Mahasiswa Ditemukan: NIM: " + m.NIM + " | Nama: " + m.nama + " | Prodi: " + m.prodi);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}
