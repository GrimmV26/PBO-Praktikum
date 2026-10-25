package p4.Tugas;

import java.util.Scanner;

public class Soal2 {
    final Scanner input = new Scanner(System.in);

    int kdH;

    void bacaInput(){
        System.out.println("=== Soal 2: Kode Hari menjadi Nama Hari ===");
        System.out.println("Kode hari: 1=Senin, 2=Selasa, 3=Rabu, 4=Kamis, 5=Jumat, 6=Sabtu, 7=Minggu");
        System.out.print("Masukkan kode hari (1-7) : ");
        kdH = input.nextInt();
    }

    public void tampilkan() {
        String nmH;
        switch(kdH){
            case 1 -> nmH = "Senin";
            case 2 -> nmH = "Selasa";
            case 3 -> nmH = "Rabu";
            case 4 -> nmH = "Kamis";
            case 5 -> nmH = "Jumat";
            case 6 -> nmH = "Sabtu";
            case 7 -> nmH = "Minggu";
            default -> nmH = null;
        };

        System.out.println();
        if (nmH == null){
            System.out.println("Kode hari " + kdH + " tidak ada, masukkan angka 1 sampai 7.");
        } else {
            System.out.println("Kode hari " + kdH + " adalah hari " + nmH + ".");
        }
    }

    public void jalankan(){
        bacaInput();
        tampilkan();
    }
}