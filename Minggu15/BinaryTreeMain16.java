package Minggu15;
public class BinaryTreeMain16 {
    public static void main(String[] args) {
        BinaryTree16 bst = new BinaryTree16();

        bst.add(new Mahasiswa16("244160121", "Ali", "kelas:A", 3.57));
        bst.add(new Mahasiswa16("244160221", "Badar", "kelas:B", 3.85));
        bst.add(new Mahasiswa16("244160185", "Candra", "kelas:C", 3.21));
        bst.add(new Mahasiswa16("244160201", "Dewi", "kelas:B", 3.54));

        System.out.println("\nx:Daftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nx:Pencarian data mahasiswa:");
        System.out.print("x:Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("x:Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa16("244160131", "Devi", "kelas:A", 3.72));
        bst.add(new Mahasiswa16("244160205", "Ehlan", "kelas:D", 3.37));
        bst.add(new Mahasiswa16("244160170", "Fizi", "kelas:B", 3.46));

        System.out.println("\nx:Daftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("x:InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("x:PreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("x:PostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nx:Penghapusan data mahasiswa:");
        bst.delete(3.57);

        System.out.println("\nx:Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
