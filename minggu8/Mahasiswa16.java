package minggu8;

public class Mahasiswa16 {
    String NIM;
    String nama;
    String prodi;

    public Mahasiswa16(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}
