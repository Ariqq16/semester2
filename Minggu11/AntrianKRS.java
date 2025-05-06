package Minggu11;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max, totalProses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambah(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void panggilKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2. Tidak bisa proses.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalProses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 mahasiswa dalam antrian.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        data[front].tampilkanData();
        data[(front + 1) % max].tampilkanData();
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        totalProses = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDiproses() {
        return totalProses;
    }

    public int getJumlahBelumProses() {
        return 30 - totalProses;
    }
}
