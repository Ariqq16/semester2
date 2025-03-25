package minggu7;

public class Dosen16 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen16(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia: " + usia);
    }
}

class DataDosen {
    Dosen16[] dataDosen = new Dosen16[10];
    int idx = 0;

    public void tambah(Dosen16 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void SortingASC() { // Bubble Sort
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen16 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() { // Selection Sort
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen16 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    // a. Sequential Search berdasarkan nama
    public void pencarianDataSequential16(String namaCari) {
        int count = 0;
        System.out.println("Hasil pencarian nama \"" + namaCari + "\":");
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(namaCari)) {
                dataDosen[i].tampil();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Data tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
        }
    }

    // b. Binary Search berdasarkan usia
    public void pencarianDataBinary16(int usiaCari) {
        sortingDSC();
        int left = 0, right = idx - 1;
        int mid, count = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (dataDosen[mid].usia == usiaCari) {
                System.out.println("Hasil pencarian usia " + usiaCari + ":");
                dataDosen[mid].tampil();
                count++;

                // Cek apakah ada hasil lain dengan usia yang sama (di kiri & kanan)
                int tempMid = mid;
                while (--tempMid >= 0 && dataDosen[tempMid].usia == usiaCari) {
                    dataDosen[tempMid].tampil();
                    count++;
                }
                tempMid = mid;
                while (++tempMid < idx && dataDosen[tempMid].usia == usiaCari) {
                    dataDosen[tempMid].tampil();
                    count++;
                }

                if (count > 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
                }
                return;
            } else if (dataDosen[mid].usia > usiaCari) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
    }
}
}