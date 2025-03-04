public class KuisCafe16 {
    // Atribut
    String nama;
    String lokasi;
    int kapasitas;

    //konstuktor
    public KuisCafe16(String nama, String lokasi, int kapasitas) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.kapasitas = kapasitas;
    }
    
    // menampilkan informasi kafe
     public void tampilkanInfo() {
        System.out.println("Nama Cafe: " + nama);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Kapasitas: " + kapasitas + " orang");
    }

    // memesan minuman
    public void pesanMinuman(String minuman) {
        System.out.println("Anda telah memesan: " + minuman);
    }

    
}