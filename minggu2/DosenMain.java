package minggu2;

public class DosenMain {
    public static void main(String[] args) {
        Dosen16 dosen1 = new Dosen16();
        dosen1.tampilInformasi();

        int Masa = dosen1.hitungMasaKerja(2025);;
        dosen1.setStatusAktif(true);
        System.out.println("Masa Kerja dosen: " + Masa) ;
        dosen1.ubahKeahlilan("Dasar Pemrograman");

        Dosen16 dosen2 = new Dosen16("D0003", "Pak Hasyim", "CTPS", true, 2019);
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(false);
        System.out.println("Masa kerja dosen: " + dosen2.hitungMasaKerja(2024) + " tahun");
        dosen2.ubahKeahlilan("Kecerdasan Buatan");
    }
}
