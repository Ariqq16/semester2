package Minggu10;

public class StackTugasMahasiswa16 {
    Mahasiswa16[] stack;
    int top;
    int size;

    public StackTugasMahasiswa16(int size) {
        this.size = size;
        stack = new Mahasiswa16[size];
        top = -1;
    }

    public boolean isFull() {
       if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa16 m) {
        if (!isFull()) {
            top++;
            stack[top] = m;
        } else {
            System.out.println("Stack penuh! Tdiak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa16 pop() {
        if (!isEmpty()) {
            Mahasiswa16 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tdiak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tdiak ada tugas untuk dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa16 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi16 stack = new StackKonversi16 ();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
    
}
