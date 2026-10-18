package P3.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int pil;

        Soal1 s1 = new Soal1();
        Soal2 s2 = new Soal2();
        Soal3 s3 = new Soal3();
        Soal4 s4 = new Soal4();
        Soal5 s5 = new Soal5();
        Soal6 s6 = new Soal6();
        Soal7 s7 = new Soal7();
        
        //pake menu we biar gampang kebaca dah
        do {
            System.out.println("==============================================");
            System.out.println("   LATIHAN PRAKTIKUM INPUT DAN OUTPUT (JAVA)");
            System.out.println("==============================================");
            System.out.println(" 1. Soal 1 - Gaji bersih pegawai");
            System.out.println(" 2. Soal 2 - Pembelanjaan (DataInputStream)");
            System.out.println(" 3. Soal 3 - Perbedaan Scanner & BufferedReader");
            System.out.println(" 4. Soal 4 - Gaya sentripetal");
            System.out.println(" 5. Soal 5 - Buah Ibu Sisca (BufferedReader)");
            System.out.println(" 6. Soal 6 - Selisih waktu");
            System.out.println(" 7. Soal 7 - Waktu pencetakan novel");
            System.out.println(" 0. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih soal (0-7): ");
            pil = input.nextInt();
            input.nextLine();
            
            System.out.println();
            
            switch (pil) {
                case 1 -> s1.run();
                case 2 -> s2.run();
                case 3 -> s3.run();
                case 4 -> s4.run();
                case 5 -> s5.run();
                case 6 -> s6.run();
                case 7 -> s7.run();
                case 0 -> System.out.println("Menutup program...");
                default -> System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pil != 0);

        System.out.println("Program selesai.");
    }
}