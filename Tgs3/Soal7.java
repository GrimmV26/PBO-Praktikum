package P3.Tugas;

import java.util.Scanner;

public class Soal7 {
    int bnykNovel, tblLembar;
    int hr, jam, mnt, dtk;

    void Input(Scanner input) {
        System.out.println("=== Soal 7: Waktu Pencetakan Novel ===");
        System.out.print("Banyaknya novel yang akan dicetak : ");
        bnykNovel = input.nextInt();
        System.out.print("Tebalnya lembar per novel         : ");
        tblLembar = input.nextInt();
    }

    void hitung() {
        int totalLembar = bnykNovel * tblLembar;
        int totalDetik = totalLembar * 1; 

        hr = totalDetik / 86400;
        int sisaDetik = totalDetik % 86400;
        jam = sisaDetik / 3600;
        sisaDetik = sisaDetik % 3600;
        mnt = sisaDetik / 60;
        dtk = sisaDetik % 60;
    }

    void tampilkan() {
        System.out.println("\nKeluaran:");
        System.out.println("Hari  : " + hr);
        System.out.println("Jam   : " + jam);
        System.out.println("Menit : " + mnt);
        System.out.println("Detik : " + dtk);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        Input(input);
        hitung();
        tampilkan();
    }
}