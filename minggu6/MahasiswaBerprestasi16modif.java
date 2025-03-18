package minggu6;
public class MahasiswaBerprestasi16modif {
    Mahasiwa16[] listMhs;
    int idx = 0;

    MahasiswaBerprestasi16modif(int jumlahMahasiswa) {
        listMhs = new Mahasiwa16[jumlahMahasiswa];
    }

    void tambah(Mahasiwa16 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilInformasi() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) { 
                    Mahasiwa16 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    
}