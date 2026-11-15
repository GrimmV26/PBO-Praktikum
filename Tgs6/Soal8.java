package P6.Tugas;

import java.util.Scanner;

public class Soal8 {
    final Scanner input = new Scanner(System.in);

    class Pekerja extends Thread {
        int no;

        Pekerja(int n) {
            no = n;
        }

        public void run() {
            System.out.println("Thread ke-" + no + " mulai");
            System.out.println("Thread ke-" + no + " selesai");
        }
    }

    public void run() {
        System.out.println("=== Soal 8: Banyak Thread ===");
        System.out.print("Masukkan jumlah thread yang diinginkan : ");
        int jml = input.nextInt();
        if (jml <= 0) {
            System.out.println("Input tidak valid: jumlah thread harus lebih dari 0.");
        } else {
            Pekerja[] pkj = new Pekerja[jml];
            System.out.println("Thread utama membuat " + jml + " thread anak.");
            for (int i = 0; i < jml; i++) {
                pkj[i] = new Pekerja(i + 1);
                pkj[i].start();
            }
            try {
                for (int i = 0; i < jml; i++) {
                    pkj[i].join();
                }
            } catch (InterruptedException e) {
                System.out.println("Thread utama terganggu saat menunggu.");
            }
            System.out.println("Semua thread anak selesai.");
        }
    }
}
