package minggu3;
import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        DataDosen16[] daftarDosen = new DataDosen16[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data untuk dosen ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
            boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            daftarDosen[i] = new DataDosen16(nama, usia, jenisKelamin);
        }

        // Menampilkan data menggunakan FOREACH
        System.out.println("\n=== Data Dosen ===");
        for (DataDosen16 dosen : daftarDosen) {
            dosen.tampilkanData();
        }

        //menampilkan hasil
        DataDosen16.dataSemuaDosen(daftarDosen);
        DataDosen16.jumlahDosenBerdasarkanJenisKelamin(daftarDosen);
        DataDosen16.rataRataUsiaBerdasarkanJenisKelamin(daftarDosen);
        DataDosen16.infoDosenPalingTua(daftarDosen);
        DataDosen16.infoDosenPalingMuda(daftarDosen);


    }
}
