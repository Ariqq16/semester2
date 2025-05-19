package Minggu12;

public class SLLMain16 {
    public static void main(String[] args) {
        SingleLinkedList16 list = new SingleLinkedList16();

        System.out.println("Linked list kosong");
        list.print();

        Mahasiswa16 mhs1 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);
        Mahasiswa16 mhs2 = new Mahasiswa16("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa16 mhs3 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
        Mahasiswa16 mhs4 = new Mahasiswa16("23212201", "Bimon", "2B", 3.8);

        tambahDanCetak("Tambah di Awal", () -> list.addFirst(mhs1), list);
        tambahDanCetak("Tambah di Akhir", () -> list.addLast(mhs2), list);
        tambahDanCetak("Tambah di Index ke-1", () -> list.InsertAt(1, mhs3), list);
        tambahDanCetak("Tambah di Index ke-2", () -> list.InsertAt(2, mhs4), list);

        
        System.out.println("\nData index ke-1:");
        list.getData(1);

        System.out.println("\nData mahasiswa bernama Bimon berada pada index:");
        System.out.println(list.indexOf("Bimon"));

        System.out.println("\n== Setelah removeFirst ==");
        list.removeFirst();
        list.print();

        System.out.println("\n== Setelah removeLast ==");
        list.removeLast();
        list.print();

        System.out.println("\n== Setelah removeAt index 0 ==");
        list.removeAt(0);
        list.print();
    }

    public static void tambahDanCetak(String aksi, Runnable perintah, SingleLinkedList16 list) {
        System.out.println("\n== " + aksi + " ==");
        perintah.run();
        list.print();
    }
}
