package minggu1;
import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        // Deklarasi array KODE dan KOTA
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] KOTA = {"'Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"};

        // Scanner input pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char InputKode = input.next().charAt(0);  

        // Mencari kode plat dan mencetak kota yang sesuai
        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (InputKode == KODE[i]) {
                System.out.println("Kota dari plat nomor " + InputKode + " adalah " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak sesuai");
        }
    }
}
