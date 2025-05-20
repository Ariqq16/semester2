package Minggu13.Tugas;
import java.util.Scanner;

// Node untuk double linked list
class Node {
    int nomor;
    String nama;
    Node prev, next;

    public Node(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
        this.prev = null;
        this.next = null;
    }
}

// Queue berbasis double linked list
class DoubleLinkedQueue {
    private Node head, tail;
    private int size = 0;

    // Tambah data ke antrian (enqueue)
    public void enqueue(int nomor, String nama) {
        Node newNode = new Node(nomor, nama);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Hapus data dari antrian (dequeue)
    public void dequeue() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        String nama = head.nama;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;

        // Cetak status vaksinasi
        System.out.println(nama + " telah selesai divaksinasi.\n");
        printQueue();
    }

    // Menampilkan seluruh antrian dan sisa
    public void printQueue() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("        Daftar Penerima Vaksin        ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.printf("| %-5s | %-20s |\n", "No.", "Nama");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Node current = head;
        while (current != null) {
            System.out.printf("| %-5d | %-20s |\n", current.nomor, current.nama);
            current = current.next;
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Sisa Antrian: " + size);
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class AntrianVaksin16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedQueue queue = new DoubleLinkedQueue();
        int pilih;
        int nomor = 123; 

        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("     PENGANTRI VAKSIN    ");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama penerima: ");
                    String nama = sc.nextLine();
                    queue.enqueue(nomor++, nama);
                    System.out.println("Data berhasil ditambahkan!\n");
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan vaksin.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }
            System.out.println();
        } while (pilih != 4);
    }
}


