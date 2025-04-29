package Minggu10;

public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa16(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
    
}