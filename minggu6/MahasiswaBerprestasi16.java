package minggu6;
public class MahasiswaBerprestasi16 {
    Mahasiswa16[] listMhs = new Mahasiswa16[5]; 
    int idx = 0;

    void tambah(Mahasiswa16 m1) { 
        if (idx < listMhs.length) {
            listMhs[idx] = m1;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilInformasi() {
        for (int i = 0; i < idx; i++) { 
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) { 
                if (listMhs[j].ipk > listMhs[j + 1].ipk) {
                    Mahasiswa16 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) { 
            int idxMin = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa16 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSortDescending() {
        for (int i = 1; i < idx; i++) { 
            Mahasiswa16 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { 
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    

}
