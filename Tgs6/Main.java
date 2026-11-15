package P6.Tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Soal1 s1 = new Soal1();
        Soal2 s2 = new Soal2();
        Soal3 s3 = new Soal3();
        Soal4 s4 = new Soal4();
        Soal5 s5 = new Soal5();
        Soal6 s6 = new Soal6();
        Soal7 s7 = new Soal7();
        Soal8 s8 = new Soal8();
        Soal9 s9 = new Soal9();
        Soal10 s10 = new Soal10();

        Scanner input = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("==================================================");
            System.out.println(" LATIHAN PRAKTIKUM ARRAY, EXCEPTION HANDLING, THREAD");
            System.out.println("==================================================");
            System.out.println("  1. Soal 1 ");
            System.out.println("  2. Soal 2 ");
            System.out.println("  3. Soal 3 ");
            System.out.println("  4. Soal 4 ");
            System.out.println("  5. Soal 5 ");
            System.out.println("  6. Soal 6 ");
            System.out.println("  7. Soal 7 ");
            System.out.println("  8. Soal 8 ");
            System.out.println("  9. Soal 9 ");
            System.out.println(" 10. Soal 10 ");
            System.out.println("  0. Keluar");
            System.out.println("--------------------------------------------------");

            System.out.print("Pilih s (0-10): ");
            pilihan = input.nextLine().trim();
            System.out.println();

            switch (pilihan) {
                case "1"  -> s1.run();
                case "2"  -> s2.run();
                case "3"  -> s3.run();
                case "4"  -> s4.run();
                case "5"  -> s5.run();
                case "6"  -> s6.run();
                case "7"  -> s7.run();
                case "8"  -> s8.run();
                case "9"  -> s9.run();
                case "10" -> s10.run();
                case "0"  -> System.out.println("Program selesai.");
                default   -> System.out.println("Pilihan tidak valid, masukkan angka 0 sampai 10.");
            }
            System.out.println();

        } while (!pilihan.equals("0"));

    }
}

