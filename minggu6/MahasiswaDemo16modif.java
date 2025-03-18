package minggu6;
import java.util.Scanner;
public class MahasiswaDemo16modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi16modif list = new MahasiswaBerprestasi16modif(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiwa16 mhs = new Mahasiwa16(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("\nData Mahasiswa sebelum sorting:");
        list.tampilInformasi();

        list.bubbleSort();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampilInformasi();
    }
}
