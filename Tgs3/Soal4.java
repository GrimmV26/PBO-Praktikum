package P3.Tugas;

import java.util.Scanner;

public class Soal4 {
    double m, v, r, fc;

    void Input(Scanner input) {
        System.out.println("=== Soal 4: Gaya Sentripetal (Fc = M.V^2 / r) ===");
        System.out.print("Masukkan Massa benda (M)    : ");
        m = input.nextDouble();
        System.out.print("Masukkan Kecepatan (V)      : ");
        v = input.nextDouble();
        System.out.print("Masukkan Jari-jari (r)      : ");
        r = input.nextDouble();
    }

    void hitung() {
        fc = (m * v * v) / r;
    }

    void tampilkan() {
        System.out.println("Gaya Sentripetal (Fc)       = " + fc + " N");
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        Input(input);
        hitung();
        tampilkan();
    }
}