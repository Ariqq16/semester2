package minggu1;
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //menginput nilai tugas,kuis,UTS,UAS
        System.out.print("Masukkan Nilai Tugas (0-100): ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis (0-100): ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS (0-100): ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS (0-100): ");
        double uas = sc.nextDouble();

        //mengvalidasi input
        if(tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai yang dimasukkan tidak valid");
            return;
        }

        //meghitung nilai akhir
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        //menentukan nilai huruf dan status lulus
        String nilaiHuruf;
        boolean lulus;

        if(nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            lulus = true;
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            lulus = true;
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            lulus = true;
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            lulus = true;
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            lulus = true;
        } else {
            nilaiHuruf = "D";
            lulus = false;
        }

    //hasil output
    System.out.printf("Nilai Akhir: %.2f%n", nilaiAkhir);
    System.out.println("Nilai Huruf: " + nilaiHuruf);
    System.out.println(lulus ? "lulus" : "tidak lulus");

    }
}