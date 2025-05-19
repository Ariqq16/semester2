package Minggu12;

public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa16() {

    }

    Mahasiswa16(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.ipk = ip;
        this.kelas = kls;
    }

    public void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}

