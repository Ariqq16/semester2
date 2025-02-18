package minggu2;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah16 mk1 = new MataKuliah16();
        mk1.ubahSKS(1);
        mk1.tambahJam(3);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();
        
        
        MataKuliah16 mk2 = new MataKuliah16("MK005","Desain AntarMuka", 4, 6);
        mk2.tampilkanInformasi();

        mk2.ubahSKS(5);
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
    }
}
