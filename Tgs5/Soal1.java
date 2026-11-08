package P5.Tugas;

import java.util.Scanner;

public class Soal1 {
    final int JML = 10;

    final Scanner input = new Scanner(System.in);

    int bsr;
    int kcl;

    void bacaInput() {
        System.out.println("=== Soal 1: Bilangan Terbesar dan Terkecil ===");
        for (int i = 1; i <= JML; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            int bil = input.nextInt();
            if (i == 1 || bil > bsr) {
                bsr = bil;
            }
            if (i == 1 || bil < kcl) {
                kcl = bil;
            }
        }
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("Bilangan terbesar : " + bsr);
        System.out.println("Bilangan terkecil : " + kcl);
    }

    public void jalankan() {
        bacaInput();
        tampilkan();
    }
}
