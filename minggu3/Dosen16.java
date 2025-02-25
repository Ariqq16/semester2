package minggu3;

public class Dosen16 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;    

    
    public Dosen16(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    //menampilkan data dosen
    public void tampilkanData() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama );
        System.out.println("Jenis Kelamin  : " + cariKelamin());
        System.out.println("Usia           : " + usia);
    }

    String cariKelamin() {
        return jenisKelamin ? "Laki-laki" : "Perempuan";
    }
}


