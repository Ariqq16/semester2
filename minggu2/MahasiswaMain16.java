package minggu2;

public class MahasiswaMain16 {
    public static void main(String[] args) {
        Mahasiswa16 mhs1 = new Mahasiswa16();
        mhs1.nama = "Mohammad Ariq Baihaqi";
        mhs1.nim = "244107020161";
        mhs1.kelas = "TI - 1A";
        mhs1.ipk = 3.62;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI - 1B");
        mhs1.updateIPK(3.67);
        mhs1.tampilkanInformasi();

        Mahasiswa16 mhs2 = new Mahasiswa16 ("Shafiqa Nabila","244108090251",3.65,"TI 1B");
        mhs2.updateIPK(3.70);
        mhs2.tampilkanInformasi();

        Mahasiswa16 mhsRizky = new Mahasiswa16("Fazel Priyono", "244107020162", 3.80, "TI 1C");
        mhsRizky.tampilkanInformasi();
    }


}

