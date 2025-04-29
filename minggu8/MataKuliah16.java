package minggu8;

public class MataKuliah16 {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah16(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMataKuliah() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS : " + sks);
    }
}
