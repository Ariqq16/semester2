package Minggu15;
public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();

        Mahasiswa16 mhs1 = new Mahasiswa16("244160121", "Ali", "kelas:A", 3.57);
        Mahasiswa16 mhs2 = new Mahasiswa16("244160185", "Candra", "kelas:C", 3.41);
        Mahasiswa16 mhs3 = new Mahasiswa16("244160221", "Badar", "kelas:B", 3.75);
        Mahasiswa16 mhs4 = new Mahasiswa16("244160220", "Dewi", "kelas:B", 3.35);

        Mahasiswa16 mhs5 = new Mahasiswa16("244160131", "Devi", "kelas:A", 3.48);
        Mahasiswa16 mhs6 = new Mahasiswa16("244160205", "Ehlan", "kelas:D", 3.61);
        Mahasiswa16 mhs7 = new Mahasiswa16("244160170", "Fizi", "kelas:B", 3.86);

        Mahasiswa16[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6; 

        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("x:\\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0); 
    }
}
