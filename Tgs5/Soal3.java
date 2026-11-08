package P5.Tugas;

import java.util.Scanner;

public class Soal3 {
    final Scanner input = new Scanner(System.in);

    int brs;

    void bacaInput() {
        System.out.println("=== Soal 3: Floyd's Triangle ===");
        System.out.print("Masukkan banyak baris : ");
        brs = input.nextInt();
    }

    public void tampilkan() {
        int ang = 1;
        int lbr = String.valueOf(brs * (brs + 1) / 2).length();
        System.out.println();
        for (int i = 1; i <= brs; i++) {
            for (int j = 1; j <= i; j++) {
                String teks = String.valueOf(ang);
                for (int s = teks.length(); s < lbr; s++) {
                    System.out.print(" ");
                }
                System.out.print(teks);
                if (j < i) {
                    System.out.print(" ");
                }
                ang++;
            }
            System.out.println();
        }
    }

    public void jalankan() {
        bacaInput();
        if (brs <= 0) {
            System.out.println("Input tidak valid: banyak baris harus lebih dari 0.");
        } else {
            tampilkan();
        }
    }
}
