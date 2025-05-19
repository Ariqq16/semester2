package Minggu12.Tugas;
class Mahasiswa {
    String nama;
    String nim;
    Mahasiswa next;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.next = null;
    }
}

class AntrianMahasiswa {
    private Mahasiswa head, tail;
    private int size;

    public AntrianMahasiswa() {
        this.head = this.tail = null;
        this.size = 0;
    }

    // Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Cek antrian penuh 
    public boolean isFull() {
        return false; 
    }

    // Tambah antrian
    public void enqueue(String nama, String nim) {
        Mahasiswa baru = new Mahasiswa(nama, nim);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    // Panggil antrian
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang bisa dipanggil.");
        } else {
            System.out.println("Memanggil: " + head.nama + " (NIM: " + head.nim + ")");
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
        }
    }

    //  mahasiswa di antrian terdepan
    public void tampilDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan: " + head.nama + " (NIM: " + head.nim + ")");
        }
    }

    //  mahasiswa di antrian terakhir
    public void tampilBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terakhir: " + tail.nama + " (NIM: " + tail.nim + ")");
        }
    }

    //  jumlah mahasiswa dalam antrian
    public void tampilJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    // Kosongkan antrian
    public void kosongkan() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    //  seluruh isi antrian
    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            Mahasiswa current = head;
            int nomor = 1;
            while (current != null) {
                System.out.println(nomor++ + ". " + current.nama + " (NIM: " + current.nim + ")");
                current = current.next;
            }
        }
    }
}



