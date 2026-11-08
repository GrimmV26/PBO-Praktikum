package P5.Tugas;

import java.util.Scanner;

public class Soal4 {
    final Scanner input = new Scanner(System.in);

    int jml;
    long ttl;

    void bacaInput() {
        System.out.println("=== Soal 4: Angka Ganjil dan Jumlahnya ===");
        System.out.print("Masukkan banyak angka : ");
        jml = input.nextInt();
    }

    public void tampilkan() {
        int ganjil = 1;
        ttl = 0;
        System.out.println();
        for (int i = 1; i <= jml; i++) {
            if (i > 1) {
                System.out.print(" ");
            }
            System.out.print(ganjil);
            ttl += ganjil;
            ganjil += 2;
        }
        System.out.println();
        System.out.println("Total penjumlahan : " + ttl);
    }

    public void jalankan() {
        bacaInput();
        if (jml <= 0) {
            System.out.println("Input tidak valid: banyak angka harus lebih dari 0.");
        } else {
            tampilkan();
        }
    }
}
