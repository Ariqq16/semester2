package Minggu12;
import java.util.Scanner;

public class SLLMain16modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList16 list = new SingleLinkedList16();

        System.out.println("Linked list kosong");
        list.print();

        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i+1));
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("NIM    : ");
            String nim = sc.nextLine();
            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();
            System.out.print("IPK    : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ipk);
            list.addLast(mhs); 
            System.out.println("Linked list setelah penambahan:");
            list.print();
        }

    }
}
