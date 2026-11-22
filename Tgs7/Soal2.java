package P7.Tugas;

import java.util.Scanner;

public class Soal2{
    final Scanner input = new Scanner(System.in);

    int p;
    int l;
    int kll;

    void bacaInput(){
        System.out.println("=== Soal 2: Keliling Persegi Panjang ===");
        System.out.print("Panjang : ");
        p = input.nextInt();
        System.out.print("Lebar   : ");
        l = input.nextInt();
    }

    public int hitungKeliling(int p, int l){
        return 2 * (p + l);
    }

    public void tampilkan(){
        System.out.println();
        System.out.println("Keliling = 2 x (" + p + " + " + l + ") = " + kll);
    }

    public void run(){
        bacaInput();
        if (p <= 0 || l <= 0){
            System.out.println("Input tidak valid: panjang dan lebar harus lebih dari 0.");
        }else{
            kll = hitungKeliling(p, l);
            tampilkan();
        }
    }
}
