package minggu7;
import java.util.Scanner;
public class MahasiswaDemo16modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        
        MahasiswaBerprestasi16modif list = new MahasiswaBerprestasi16modif(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("---------------------------");

            list.tambah(new Mahasiswa16(nim, nama, kelas, ipk));
        }

        list.tampilInformasi();

        // Menambahkan data mahasiswa ke dalam list
        Mahasiswa16 m1 = new Mahasiswa16("123", "Zidan", "2A", 3.5);
        Mahasiswa16 m2 = new Mahasiswa16("245", "Ilham", "3A", 3.9);
        Mahasiswa16 m3 = new Mahasiswa16("345", "Hanif", "1A", 3.6);
        Mahasiswa16 m4 = new Mahasiswa16("543", "Fika", "3B", 3.7);
        Mahasiswa16 m5 = new Mahasiswa16("666", "Abid", "1H", 2.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampilInformasi();

        System.out.println("Data Mahasiswa sesudah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampilInformasi();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampilInformasi();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC): ");
        list.insertionSortDescending();
        list.tampilInformasi();

        
    }
}
