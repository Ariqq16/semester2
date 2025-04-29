package minggu8;

public class Penilaian16 {
    Mahasiswa16 mahasiswa16;
    MataKuliah16 mataKuliah16;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    public Penilaian16(Mahasiswa16 mahasiswa16, MataKuliah16 mataKuliah16, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa16 = mahasiswa16;
        this.mataKuliah16 = mataKuliah16;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilNilai() {
        mahasiswa16.tampilMahasiswa();
        mataKuliah16.tampilMataKuliah();
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}