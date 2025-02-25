package minggu3;

public class DataDosen16 {
    String nama;
    int usia;
    boolean jenisKelamin; 

    public DataDosen16(String nama, int usia, boolean jenisKelamin) {
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }

    // Method untuk menampilkan data dosen
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println();
    }

    // a. Data semua dosen
    public static void dataSemuaDosen(DataDosen16[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (DataDosen16 d : arrayOfDosen) {
            d.tampilkanData();
        }
    }

    // b. Menampilkan jumlah dosen berdasarkan jenis kelamin
    public static void jumlahDosenBerdasarkanJenisKelamin(DataDosen16[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (DataDosen16 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen:");
        System.out.println("Pria: " + pria);
        System.out.println("Wanita: " + wanita);
    }

    // c. Menghitung rata-rata usia dosen berdasarkan jenis kelamin
    public static void rataRataUsiaBerdasarkanJenisKelamin(DataDosen16[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (DataDosen16 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                countPria++;
            } else {
                totalUsiaWanita += d.usia;
                countWanita++;
            }
        }

        double rataPria = (countPria == 0) ? 0 : (double) totalUsiaPria / countPria;
        double rataWanita = (countWanita == 0) ? 0 : (double) totalUsiaWanita / countWanita;

        System.out.println("\nRata-rata Usia Dosen:");
        System.out.println("Pria: " + rataPria);
        System.out.println("Wanita: " + rataWanita);
    }

    // d. Menampilkan dosen paling tua
    public static void infoDosenPalingTua(DataDosen16[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        DataDosen16 tertua = arrayOfDosen[0];

        for (DataDosen16 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        tertua.tampilkanData();
    }

    // e. Menampilkan dosen paling muda
    public static void infoDosenPalingMuda(DataDosen16[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        DataDosen16 termuda = arrayOfDosen[0];

        for (DataDosen16 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        termuda.tampilkanData();
    }
}