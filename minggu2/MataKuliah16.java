package minggu2;

public class MataKuliah16 {
    String kodeMK;
    String nama;
    int SKS;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + SKS);
        System.out.println("Jumlah Jam: " + jumlahJam);
     }

     void ubahSKS(int sksBaru) {
        this.SKS = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + SKS);
     }

     void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
            } else {
                System.out.println("Jumlah jam tidak cukup untuk dikurangi");
    }

 
}
public MataKuliah16(String kodeMK, String nama, int SKS, int jumlahJam) {
    this.kodeMK = kodeMK;
    this.nama = nama;
    this.SKS = SKS;
    this.jumlahJam = jumlahJam;
    }

public MataKuliah16(){
}
}