package minggu2;

public class Mahasiswa16 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
    } else {
        System.out.println("IPK tidak valid. Harus Antara 0.0 dan 4.0");
    }
    }

    String nilaiKerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public Mahasiswa16(String string, String string2, String string3, double d) {

    }

    public Mahasiswa16(String nama, String nim, double ipk, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    public Mahasiswa16(String string, String string2, String string3, double d) {
        //TODO Auto-generated constructor stub
    }


    


}   


