package p4.Tugas;

import java.util.Scanner;

public class Soal1 {
    final Scanner input = new Scanner(System.in);

    long bil;

    void bacaInput(){
        System.out.println("=== Soal 1: Bilangan Genap atau Ganjil ===");
        System.out.print("Masukkan bilangan bulat : ");
        bil = input.nextLong();
    }

    public long hitungSisa(){
        return bil % 2;
    }

    public boolean isGenap(){
        return hitungSisa() == 0;
    }

    public void tampilkan(){
        System.out.println();
        System.out.println(bil + " % 2 = " + hitungSisa());
        if (isGenap()){
            System.out.println("Bilangan " + bil + " adalah bilangan GENAP.");
        }else{
            System.out.println("Bilangan " + bil + " adalah bilangan GANJIL.");
        }
    }

    public void jalankan(){
        bacaInput();
        tampilkan();
    }
}
