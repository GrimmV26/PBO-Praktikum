package p4.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        boolean cek = true;

        Soal1 s1 = new Soal1();
        Soal2 s2 = new Soal2();
        Soal3 s3 = new Soal3();
        Soal4 s4 = new Soal4();
        Soal5 s5 = new Soal5();
        Soal6 s6 = new Soal6();
        Soal7 s7 = new Soal7();
        
        do {
            System.out.println("==============================================");
            System.out.println("   LATIHAN PRAKTIKUM STRUKTUR KONTROL (JAVA)");
            System.out.println("==============================================");
            System.out.println(" 1. Soal 1 - Bilangan genap atau ganjil");
            System.out.println(" 2. Soal 2 - Kode hari menjadi nama hari");
            System.out.println(" 3. Soal 3 - Gaji bersih karyawan");
            System.out.println(" 4. Soal 4 - Tahun kabisat");
            System.out.println(" 5. Soal 5 - Pendapatan salesman");
            System.out.println(" 6. Soal 6 - Kasir sederhana (if-else)");
            System.out.println(" 7. Soal 7 - Luas bangun datar (switch-case)");
            System.out.println(" 0. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih soal (0-7): ");

            String pil = input.nextLine();

            System.out.println();
            switch (pil){
                case "1" -> s1.jalankan();
                case "2" -> s2.jalankan();
                case "3" -> s3.jalankan();
                case "4" -> s4.jalankan();
                case "5" -> s5.jalankan();
                case "6" -> s6.jalankan();
                case "7" -> s7.jalankan();
                case "0" -> cek = false;
                default -> System.out.println("Pilihan tidak valid, masukkan angka 0 sampai 7.");
            }
            System.out.println();
            
        } while (cek);

        System.out.println("Program selesai.");
    }
}