package Minggu13.Tugas;
import java.util.Scanner;

class FilmNode {
    int id;
    String judul;
    double rating;

    FilmNode prev, next;

    FilmNode(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = this.next = null;
    }
}

class DoubleLinkedListFilm {
    private FilmNode head, tail;
    private int size = 0;

    public void addFirst(int id, String judul, double rating) {
        FilmNode newNode = new FilmNode(id, judul, rating);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        FilmNode newNode = new FilmNode(id, judul, rating);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addAt(int index, int id, String judul, double rating) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid!");
            return;
        }
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            FilmNode newNode = new FilmNode(id, judul, rating);
            FilmNode current = head;
            for (int i = 0; i < index; i++) current = current.next;

            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (head == null) return;
        if (head == tail) head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (tail == null) return;
        if (head == tail) head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid!");
            return;
        }
        if (index == 0) removeFirst();
        else if (index == size - 1) removeLast();
        else {
            FilmNode current = head;
            for (int i = 0; i < index; i++) current = current.next;

            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void print() {
        FilmNode current = head;
        while (current != null) {
            System.out.println("ID: " + current.id);
            System.out.println("Judul Film: " + current.judul);
            System.out.println("IMDB Rating: " + current.rating);
            System.out.println();
            current = current.next;
        }
    }

    public void searchById(int id) {
        FilmNode current = head;
        int pos = 0;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Data ID Film: " + id + " berada di node ke-" + pos);
                System.out.println("IDENTITAS:");
                System.out.println("ID Film: " + current.id);
                System.out.println("Judul Film: " + current.judul);
                System.out.println("IMDB Rating: " + current.rating);
                return;
            }
            current = current.next;
            pos++;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void sortByRatingDesc() {
        if (head == null || head.next == null) return;
        for (FilmNode i = head; i != null; i = i.next) {
            for (FilmNode j = i.next; j != null; j = j.next) {
                if (i.rating < j.rating) {
                    int tempId = i.id;
                    String tempJudul = i.judul;
                    double tempRating = i.rating;

                    i.id = j.id;
                    i.judul = j.judul;
                    i.rating = j.rating;

                    j.id = tempId;
                    j.judul = tempJudul;
                    j.rating = tempRating;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan rating (desc).\n");
    }
}

public class Film {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListFilm list = new DoubleLinkedListFilm();

        int pilih;
        do {
            System.out.println("====================================");
            System.out.println("        DATA FILM LAYAR LEBAR       ");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    inputData(sc, list, 1);
                    break;
                case 2:
                    inputData(sc, list, 2);
                    break;
                case 3:
                    System.out.print("Masukkan indeks: ");
                    int idx = sc.nextInt();
                    inputDataAt(sc, list, idx);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan indeks data yang akan dihapus: ");
                    int delIdx = sc.nextInt();
                    list.removeAt(delIdx);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    list.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int id = sc.nextInt();
                    list.searchById(id);
                    break;
                case 9:
                    list.sortByRatingDesc();
                    break;
                case 10:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilih != 10);
    }

    public static void inputData(Scanner sc, DoubleLinkedListFilm list, int posisi) {
        System.out.print("ID Film: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Judul Film: ");
        String judul = sc.nextLine();
        System.out.print("Rating Film: ");
        double rating = sc.nextDouble();
        if (posisi == 1) list.addFirst(id, judul, rating);
        else list.addLast(id, judul, rating);
    }

    public static void inputDataAt(Scanner sc, DoubleLinkedListFilm list, int idx) {
        System.out.print("ID Film: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Judul Film: ");
        String judul = sc.nextLine();
        System.out.print("Rating Film: ");
        double rating = sc.nextDouble();
        list.addAt(idx, id, judul, rating);
    }
}
