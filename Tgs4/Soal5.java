package p4.Tugas;

import java.util.Scanner;

public class Soal5 {
    final double BATAS_1 = 2000000;
    final double BATAS_2 = 5000000;

    final Scanner input = new Scanner(System.in);

    String nm;
    double pnjln;

    double ujs;
    int pkom;
    double kms;
    double pdptn;

    double bacaAngka(String label){
        System.out.print(label);
        return Double.parseDouble(input.next().replace(',', '.'));
    }

    void bacaInput(){
        System.out.println("=== Soal 5: Pendapatan Salesman ===");
        System.out.print("Nama salesman               : ");
        nm = input.nextLine();
        pnjln = bacaAngka("Penjualan hari ini (Rp)     : ");
    }

    public void hitung(){
        if (pnjln <= BATAS_1){
            ujs = 100000;
            pkom = 10;
        }else if (pnjln <= BATAS_2){
            ujs = 200000;
            pkom = 15;
        }else{
            ujs = 300000;
            pkom = 20;
        }
        kms = pnjln * pkom / 100;
        pdptn = ujs + kms;
    }

    String rupiah(double nilai) {
        if(nilai == (int) nilai){
            return "Rp " + (int) nilai;
        }
        return "Rp " + nilai;
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("==================================================");
        System.out.println("               PENDAPATAN SALESMAN");
        System.out.println("==================================================");
        System.out.println("Nama salesman      : " + nm);
        System.out.println("Penjualan hari ini : " + rupiah(pnjln));
        System.out.println("Uang jasa          : " + rupiah(ujs));
        System.out.println("Komisi (" + pkom + "%)       : " + rupiah(kms));
        System.out.println("--------------------------------------------------");
        System.out.println("TOTAL PENDAPATAN   : " + rupiah(pdptn));
        System.out.println("==================================================");
    }

    public void jalankan() {
        bacaInput();
        if (pnjln < 0) {
            System.out.println("Input tidak valid: penjualan tidak boleh negatif.");
        } else {
            hitung();
            tampilkan();
        }
    }
}
