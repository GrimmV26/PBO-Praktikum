package P5.Tugas;

import java.util.Scanner;

public class Soal2 {
    final Scanner input = new Scanner(System.in);

    int jml;
    long ttl;
    double rt;

    void bacaInput() {
        System.out.println("=== Soal 2: Penjumlahan dan Rata-rata Bilangan ===");
        System.out.print("Berapa bilangan yang akan dimasukkan : ");
        jml = input.nextInt();
    }

    public void hitung() {
        ttl = 0;
        for (int i = 1; i <= jml; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            ttl += input.nextInt();
        }
        rt = (double) ttl / jml;
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("Jumlah bilangan : " + jml);
        System.out.println("Total           : " + ttl);
        System.out.println("Rata-rata       : " + Math.round(rt * 100) / 100.0);
    }

    public void jalankan() {
        bacaInput();
        if (jml <= 0) {
            System.out.println("Input tidak valid: jumlah bilangan harus lebih dari 0.");
        } else {
            hitung();
            tampilkan();
        }
    }
}
