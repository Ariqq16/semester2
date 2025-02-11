package minggu1;
import java.util.Scanner;
public class Fungsi {
    static int[][] stock = {
        {10, 5, 15, 7},  // Royal Garden 1
        {6, 11, 9, 12},  // Royal Garden 2
        {2, 10, 10, 5},  // Royal Garden 3
        {5, 7, 12, 9}    // Royal Garden 4
    };
    
    // Harga masing-masing bunga (Aglonema, Keladi, Alocasia, Mawar)
    static int[] harga = {75000, 50000, 60000, 10000};

    // 1. Menghitung pendapatan setiap cabang jika semua bunga terjual
    public static void hitungPendapatan() {
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("Pendapatan Royal Garden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }

    // 2. Menampilkan total stok setiap jenis bunga dari semua cabang
    public static void totalStockBunga() {
        int[] totalStok = new int[4]; // Menyimpan total stok per jenis bunga

        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                totalStok[j] += stock[i][j];  // Jumlahkan stok berdasarkan kolom
            }
        }

        System.out.println("Total stock Aglonema: " + totalStok[0]);
        System.out.println("Total stock Keladi: " + totalStok[1]);
        System.out.println("Total stock Alocasia: " + totalStok[2]);
        System.out.println("Total stock Mawar: " + totalStok[3]);
    }

    public static void main(String[] args) {
        System.out.println("Pendapatan dari masing-masing cabang jika semua bunga terjual: ");
        hitungPendapatan();

        System.out.println("\nTotal stok setiap jenis bunga di semua cabang: ");
        totalStockBunga();
    }
}
