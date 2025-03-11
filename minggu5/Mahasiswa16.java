package minggu5;

class Mahasiswa16 {
    String nama, nim;
    int tahunMasuk, nilaiUTS, nilaiUAS;

    Mahasiswa16(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

class NilaiMahasiswa {
    Mahasiswa16[] data;

    NilaiMahasiswa(Mahasiswa16[] data) {
        this.data = data;
    }

    // Menentukan nilai UTS tertinggi menggunakan Divide and Conquer
    int cariMaxUTS(int l, int r) {
        if (l == r) {
            return data[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMax = cariMaxUTS(l, mid);
        int rightMax = cariMaxUTS(mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    // Menentukan nilai UTS terendah menggunakan Divide and Conquer
    int cariMinUTS(int l, int r) {
        if (l == r) {
            return data[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMin = cariMinUTS(l, mid);
        int rightMin = cariMinUTS(mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    // Menghitung rata-rata nilai UAS menggunakan Brute Force
    double hitungRataUAS() {
        int total = 0;
        for (Mahasiswa16 m : data) {
            total += m.nilaiUAS;
        }
        return (double) total / data.length;
    }
}