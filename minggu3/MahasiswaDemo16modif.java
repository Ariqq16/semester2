package minggu3;
import java.util.Scanner;
public class MahasiswaDemo16modif {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            Mahasiswa16[] arrayOfMahasiswa = new Mahasiswa16[3];
            String dummy;

            for(int i=0; i < 3; i++) {
                arrayOfMahasiswa[i] = new Mahasiswa16();

                System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
                System.out.print("NIM: ");
                arrayOfMahasiswa[i].nim = sc.nextLine();
                System.out.print("Nama: ");
                arrayOfMahasiswa[i].nama = sc.nextLine();   
                System.out.print("Kelas: ");
                arrayOfMahasiswa[i].kelas = sc.nextLine();
                System.out.print("IPK: ");
                dummy = sc.nextLine();
                arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
                System.out.println("------------------------------");
            }
            arrayOfMahasiswa[0] = new Mahasiswa16();
            arrayOfMahasiswa[0].nim = "244107020161";
            arrayOfMahasiswa[0].nama = "Muhammad Rizki Fauzi";
            arrayOfMahasiswa[0].kelas = "TI - 1E";
            arrayOfMahasiswa[0].ipk =  (float)3.75;

            arrayOfMahasiswa[1] = new Mahasiswa16();
            arrayOfMahasiswa[1].nim = "244107020162";
            arrayOfMahasiswa[1].nama = "Muhammad Ridho";
            arrayOfMahasiswa[1].kelas = "TI - 3B";
            arrayOfMahasiswa[1].ipk = (float)3.65;

            arrayOfMahasiswa[2] = new Mahasiswa16();
            arrayOfMahasiswa[2].nim = "244107020163";
            arrayOfMahasiswa[2].nama = "Faisal Fariada";
            arrayOfMahasiswa[2].kelas = "TI - 2A";
            arrayOfMahasiswa[2].ipk = (float)3.85;

            System.out.println("NIM    : " + arrayOfMahasiswa[0].nim);
            System.out.println("Nama   : " + arrayOfMahasiswa[0].nama);
            System.out.println("Kelas  : " + arrayOfMahasiswa[0].kelas);
            System.out.println("IPK    : " + arrayOfMahasiswa[0].ipk);
            System.out.println("------------------------------------");
            System.out.println("NIM  : " + arrayOfMahasiswa[1].nim);
            System.out.println("Nama : " + arrayOfMahasiswa[1].nama);
            System.out.println("Kelas: " + arrayOfMahasiswa[1].kelas);
            System.out.println("IPK  : " + arrayOfMahasiswa[1].ipk);
            System.out.println("------------------------------------");
            System.out.println("NIM  : " + arrayOfMahasiswa[2].nim);
            System.out.println("Nama : " + arrayOfMahasiswa[2].nama);
            System.out.println("Kelas: " + arrayOfMahasiswa[2].kelas);
            System.out.println("IPK  : " + arrayOfMahasiswa[2].ipk);

           for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println();
           }
        }
}
