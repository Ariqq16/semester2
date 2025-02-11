package minggu1;
import java.util.Scanner;
public class JadwalKuliah16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama mata kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            if (pilihan == 1) {
                System.out.println("Seluruh Jadwal Kuliah:");
                for (int i = 0; i < n; i++) {
                    System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                String hari = sc.nextLine();
                System.out.println("Jadwal kuliah untuk hari " + hari + ":");
                for (int i = 0; i < n; i++) {
                    if (hariKuliah[i].equalsIgnoreCase(hari)) {
                        System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
                    }
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester yang ingin ditampilkan: ");
                int sem = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.println("Jadwal kuliah untuk semester " + sem + ":");
                for (int i = 0; i < n; i++) {
                    if (semester[i] == sem) {
                        System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - " + hariKuliah[i]);
                    }
                }
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah yang dicari: ");
                String cari = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < n; i++) {
                    if (namaMataKuliah[i].equalsIgnoreCase(cari)) {
                        System.out.println("Data Mata Kuliah: " + namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Mata kuliah tidak ditemukan.");
                }
            } else if (pilihan == 5) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        
    }
}
