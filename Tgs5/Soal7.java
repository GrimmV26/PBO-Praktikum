package P5.Tugas;

public class Soal7 {
    final int BTS = 5;

    void postfix() {
        int i = 0;
        System.out.print("Hasil i++ :");
        while (i < BTS) {
            System.out.print(" " + i++);
        }
        System.out.println();
    }

    void prefix() {
        int i = 0;
        System.out.print("Hasil ++i :");
        while (i < BTS) {
            System.out.print(" " + ++i);
        }
        System.out.println();
    }

    public void tampilkan() {
        postfix();
        prefix();
        System.out.println();
        System.out.println("i++ : nilai i dipakai dulu, baru ditambah 1.");
        System.out.println("++i : nilai i ditambah 1 dulu, baru dipakai.");
    }

    public void jalankan() {
        System.out.println("=== Soal 7: Perbedaan i++ dan ++i (while) ===");
        tampilkan();
    }
}
