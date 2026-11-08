package P5.Tugas;

import java.util.Scanner;

public class Main {

    void tampilkanMenu() {
        System.out.println("==============================================");
        System.out.println("     LATIHAN PRAKTIKUM PERULANGAN");
        System.out.println("==============================================");
        System.out.println(" 1. Soal 1 ");
        System.out.println(" 2. Soal 2 ");
        System.out.println(" 3. Soal 3 ");
        System.out.println(" 4. Soal 4 ");
        System.out.println(" 5. Soal 5 ");
        System.out.println(" 6. Soal 6 ");
        System.out.println(" 7. Soal 7 ");
        System.out.println(" 8. Soal 8 ");
        System.out.println(" 0. Keluar");
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        Main menu = new Main();
        Scanner input = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            menu.tampilkanMenu();
            System.out.print("Pilih soal (0-8): ");

            if (!input.hasNextLine()) {
                break;
            }
            String pilihan = input.nextLine().trim();

            System.out.println();
            switch (pilihan) {
                case "1" -> {
                    Soal1 soal1 = new Soal1();
                    soal1.jalankan();
                }
                case "2" -> {
                    Soal2 soal2 = new Soal2();
                    soal2.jalankan();
                }
                case "3" -> {
                    Soal3 soal3 = new Soal3();
                    soal3.jalankan();
                }
                case "4" -> {
                    Soal4 soal4 = new Soal4();
                    soal4.jalankan();
                }
                case "5" -> {
                    Soal5 soal5 = new Soal5();
                    soal5.jalankan();
                }
                case "6" -> {
                    Soal6 soal6 = new Soal6();
                    soal6.jalankan();
                }
                case "7" -> {
                    Soal7 soal7 = new Soal7();
                    soal7.jalankan();
                }
                case "8" -> {
                    Soal8 soal8 = new Soal8();
                    soal8.jalankan();
                }
                case "0" -> berjalan = false;
                default -> System.out.println("Pilihan tidak valid, masukkan angka 0 sampai 8.");
            }
            System.out.println();
        }

        System.out.println("Program selesai.");
    }
}
