package minggu2;

public class Dosen16 {
    String idDosen, nama, bidangKeahlian;
    boolean StatusAktif;
    int tahunBergabung;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Status Aktif: " + StatusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
    }

    void setStatusAktif(boolean status) {
        this.StatusAktif = status;
        System.out.println("Status aktif dosen telah diubah menjadi: " + (StatusAktif ? "Aktif" : "Tidak Aktif" ));
    }

    int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - this.tahunBergabung;
    }

    void ubahKeahlilan(String bidang) {
        this.bidangKeahlian = bidang;
    }

    public Dosen16() {

    }

    public Dosen16(String idDosen, String nama, String bidangKeahlian, boolean statusAktif, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.StatusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }
}

