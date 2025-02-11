package minggu1;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        int nim = 61;
        int n = (nim < 10) ? 10 : nim;

        for(int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if(i % 2 == 0) {
                System.out.print(i + " "); 
        } else {
            System.out.print("* ");
        }
    }
}
}
