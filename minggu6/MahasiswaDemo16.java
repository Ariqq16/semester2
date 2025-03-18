package minggu6;
import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();
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

        System.out.println("Data Mahasiswa sesudah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampilInformasi();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampilInformasi();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.insertionSortDescending();
        list.tampilInformasi();
    }
}