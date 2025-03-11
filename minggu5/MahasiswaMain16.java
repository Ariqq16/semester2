package minggu5;
import java.util.Scanner;
public class MahasiswaMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa16[] mahasiswa = {
            new Mahasiswa16("Fika", "220101001", 2022, 78, 82),
            new Mahasiswa16("Alfreda", "220101002", 2022, 85, 88),
            new Mahasiswa16("Nabil", "220101003", 2021, 90, 87),
            new Mahasiswa16("Hanif", "220101004", 2021, 76, 79),
            new Mahasiswa16("Iham", "220101005", 2023, 92, 95),
    };

    NilaiMahasiswa nm = new NilaiMahasiswa(mahasiswa);

    //menampilkan nilai UTS tertinggi
    int maxUTS = nm.cariMaxUTS(0, mahasiswa.length - 1);
    System.out.println("Nilai UTS tertinggi (Divide and conquer): " + maxUTS);

    //menampilkan nilai UTS terendah
    int minusUTS = nm.cariMinUTS(0, mahasiswa.length-1);
    System.out.println("Nilai UTS terendah (Divide and Conquer): " + minusUTS);

    //menampilkan rata-rata nilai uas
    double rataUAS = nm.hitungRataUAS();
    System.out.println("Rata-rata nilai UAS (Brute Force): " + rataUAS);
}
}
