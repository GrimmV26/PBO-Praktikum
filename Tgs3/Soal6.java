package P3.Tugas;

import java.util.Scanner;

public class Soal6 {
    int jam1, mnt1, dtk1, jam2, mnt2, dtk2;
    int hslJam, hslMenit, hslDetik;

    void Input(Scanner input) {
        System.out.println("=== Soal 6: Selisih Waktu ===");
        System.out.println("-> Waktu Pertama");
        System.out.print("   Jam   : "); jam1 = input.nextInt();
        System.out.print("   Menit : "); mnt1 = input.nextInt();
        System.out.print("   Detik : "); dtk1 = input.nextInt();

        System.out.println("-> Waktu Kedua");
        System.out.print("   Jam   : "); jam2 = input.nextInt();
        System.out.print("   Menit : "); mnt2 = input.nextInt();
        System.out.print("   Detik : "); dtk2 = input.nextInt();
    }

    void hitung() {
        int totalDetik1 = (jam1 * 3600) + (mnt1 * 60) + dtk1;
        int totalDetik2 = (jam2 * 3600) + (mnt2 * 60) + dtk2;
        int selisih = Math.abs(totalDetik1 - totalDetik2);

        hslJam = selisih / 3600;
        hslMenit = (selisih % 3600) / 60;
        hslDetik = selisih % 60;
    }

    void tampilkan() {
        System.out.println("\nSelisih waktu adalah: " + hslJam + " Jam " + hslMenit + " Menit " + hslDetik + " Detik.");
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        Input(input);
        hitung();
        tampilkan();
    }
}