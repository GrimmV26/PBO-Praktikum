package P6.Tugas;

import java.util.Scanner;

public class Soal6 {
    Scanner input;

    int jml;
    int[] arr;
    long ttl;
    double rt;

    void bacaInput() {
        System.out.println("=== Soal 6: Rata-rata dengan Penanganan Kesalahan ===");
        System.out.print("Berapa bilangan yang akan dimasukkan : ");
        jml = input.nextInt();
        if (jml > 0) {
            arr = new int[jml];
            for (int i = 0; i < jml; i++) {
                System.out.print("Bilangan ke-" + (i + 1) + " : ");
                arr[i] = input.nextInt();
            }
        }
    }

    public void hitung() {
        ttl = 0;
        for (int n : arr) {
            ttl += n;
        }
        rt = (double) ttl / jml;
    }

    public void tampilkan() {
        System.out.println();
        System.out.print("Isi array : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Total     : " + ttl);
        System.out.println("Rata-rata : " + rt);
    }

    public void run() {
        input = new Scanner(System.in);
        try {
            bacaInput();
            if (jml <= 0) {
                System.out.println("Input tidak valid: jumlah bilangan harus lebih dari 0.");
            } else {
                hitung();
                tampilkan();
            }
        } catch (Exception e) {
            System.err.println("Input harus berupa bilangan bulat.");
        } finally {
            System.out.println("Proses selesai.");
        }
    }
}
