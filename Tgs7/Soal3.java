package P7.Tugas;

import java.util.Scanner;

public class Soal3{
    final Scanner input = new Scanner(System.in);

    int bln;
    int tgl;
    int hsl;

    void bacaInput(){
        System.out.println("=== Soal 3: Trik Menebak Bulan dan Tanggal Lahir ===");
        System.out.print("Bulan lahir (1-12) : ");
        bln = input.nextInt();
        System.out.print("Tanggal lahir      : ");
        tgl = input.nextInt();
    }

    int kali(int a, int b){
        return a * b;
    }

    int tambah(int a, int b){
        return a + b;
    }

    int kurang(int a, int b){
        return a - b;
    }

    int hariMax(int b){
        if(b == 2){
            return 29;
        }
        if(b == 4 || b == 6 || b == 9 || b == 11){
            return 30;
        }
        return 31;
    }

    public int hitung(int b, int t){
        int h1 = kali(b, 2);
        System.out.println("1. " + b + " x 2 = " + h1);
        int h2 = tambah(h1, 5);
        System.out.println("2. " + h1 + " + 5 = " + h2);
        int h3 = kali(h2, 50);
        System.out.println("3. " + h2 + " x 50 = " + h3);
        int h4 = tambah(h3, t);
        System.out.println("4. " + h3 + " + " + t + " = " + h4);
        int h5 = kurang(h4, 250);
        System.out.println("5. " + h4 + " - 250 = " + h5);
        return h5;
    }

    public void tampilkan(){
        System.out.println();
        System.out.println("Hasil akhir : " + hsl);
        System.out.println("Artinya     : bulan " + (hsl / 100) + ", tanggal " + (hsl % 100));
    }

    public void run(){
        bacaInput();
        if(bln < 1 || bln > 12) {
            System.out.println("Input tidak valid: bulan harus 1 sampai 12.");
        }else if(tgl < 1 || tgl > hariMax(bln)){
            System.out.println("Input tidak valid: tanggal harus 1 sampai " + hariMax(bln) + ".");
        }else{
            System.out.println();
            hsl = hitung(bln, tgl);
            tampilkan();
        }
    }
}
