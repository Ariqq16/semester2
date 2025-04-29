package Minggu10;
import java.util.Stack;
public class StackSurat16 {
    private Stack<Surat16> stackSurat = new Stack<>();

    public void terimaSurat(Surat16 surat) {
        stackSurat.push(surat);
    }

    public Surat16 prosesSurat() {
        if (!stackSurat.isEmpty()) {
            return stackSurat.pop();
        }
        return null;
    }

    public Surat16 lihatSuratTerakhir() {
        if (!stackSurat.isEmpty()) {
            return stackSurat.peek();
        }
        return null;
    }

    public Surat16 cariSurat(String namaMahasiswa) {
        for (int i = stackSurat.size() - 1; i >= 0; i--) {
            Surat16 s = stackSurat.get(i);
            if (s.namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return s;
            }
        }
        return null;
    }
}
