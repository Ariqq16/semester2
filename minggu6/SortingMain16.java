package minggu6;

public class SortingMain16 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        Sorting16 dataurut1 = new Sorting16(a, 5);

        System.out.println("Data awal:");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut1.tampil();

        Sorting16 dataurut2 = new Sorting16(b, 5);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC):");
        dataurut2.tampil();

        Sorting16 dataurut3 = new Sorting16(c, 5);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC):");
        dataurut3.tampil();
    }
}
