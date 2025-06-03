package Minggu15;
public class BinaryTreeArray16 {
    Mahasiswa16[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray16() {
        this.dataMahasiswa = new Mahasiswa16[10];
    }

    void populateData(Mahasiswa16 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }

    public void add(Mahasiswa16 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("x:Array pohon penuh, tidak bisa menambahkan data lagi.");
            return;
        }
        if (idxLast == -1) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }
    }

     public void traversePreOrder() {
        System.out.println("x:PreOrder Traversal (Array):");
        traversePreOrder(0); 
    }

    private void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);       
                traversePreOrder(2 * idxStart + 2);       
            }
        }
    }
}

