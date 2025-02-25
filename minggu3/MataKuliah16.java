package minggu3;

public class MataKuliah16 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah16(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah16() {

    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        }

    public void cetakInfo() {
        System.out.println("kode     : " + kode);
        System.out.println("nama     : " + nama);
        System.out.println("sks      : " + sks);
        System.out.println("jumlahJam: " + jumlahJam);
        System.out.println("------------------------");
        
    }
}