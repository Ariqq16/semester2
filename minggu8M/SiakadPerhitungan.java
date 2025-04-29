public class SiakadPerhitungan {
    static void bubbleSortPenilaian (Penilaian []data){
        for (int i = 0; i<data.length - 1; i++){
            for (int j = 0; j<data.length-i-1; j++){
                if (data[j].nilaiAkhir <data[j+1].nilaiAkhir){
                    Penilaian temp = data[j];
                    data[j] = data[j+1];
                    data [j+1] = temp;
                }
            }
        }
    }
    static Mahasiswa linearSearchCariNilaiMahasiswa (Mahasiswa [] data, String nim){
        for (int i = 0; i < data.length; i++) {
            if (data[i].NIM.equals(nim)) {
                return data[i];
            }
        }
        return null;
    }
}
