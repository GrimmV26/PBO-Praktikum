package P7.Tugas;

import java.util.Scanner;

public class Soal5{
    final Scanner input = new Scanner(System.in);
    final int MAKS = 20;

    int bil;
    long hsl;

    void bacaInput(){
        System.out.println("=== Soal 5: Method Rekursif (Faktorial) ===");
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
    }

    public long faktorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public void tampilkan(){
        System.out.println();
        System.out.println(bil + "! = " + hsl);
    }

    public void run(){
        bacaInput();
        if(bil < 0){
            System.out.println("Input tidak valid: bilangan tidak boleh negatif.");
        }else if (bil > MAKS){
            System.out.println("Input terlalu besar: maksimal " + MAKS + " (batas tipe long).");
        }else{
            hsl = faktorial(bil);
            tampilkan();
        }
    }
}
