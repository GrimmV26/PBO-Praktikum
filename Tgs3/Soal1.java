package P3.Tugas;

import java.util.Scanner;

public class Soal1 {
    String nik, nm, alamat, jbt;
    double p1, p2, p3, p4;
    double totg, pj, gjb;

    void Input(Scanner input) {
        System.out.println("=== Soal 1: Gaji Bersih Pegawai ===");
        System.out.print("Nomor Induk Karyawan : ");
        nik = input.nextLine();
        System.out.print("Nama Karyawan        : ");
        nm = input.nextLine();
        System.out.print("Alamat               : ");
        alamat = input.nextLine();
        System.out.print("Jabatan              : ");
        jbt = input.nextLine();
        System.out.print("Gaji Pokok           : ");
        p1 = input.nextDouble();
        System.out.print("Tunjangan Jabatan    : ");
        p2 = input.nextDouble();
        System.out.print("Tunjangan Istri      : ");
        p3 = input.nextDouble();
        System.out.print("Tunjangan Anak       : ");
        p4 = input.nextDouble();
    }

    void hitung() {
        totg = p1 + p2 + p3 + p4;
        pj = 0.10 * (p1 + p2 + p3); 
        gjb = totg - pj;
    }

    void tampilkan() {
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nm);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jbt);
        System.out.println("Gaji Pokok (P1)      : " + p1);
        System.out.println("Tunjangan Jab. (P2)  : " + p2);
        System.out.println("Tunjangan Istri (P3) : " + p3);
        System.out.println("Tunjangan Anak (P4)  : " + p4);
        System.out.println("Total Gaji           : " + totg);
        System.out.println("Pajak Penghasilan    : " + pj);
        System.out.println("Gaji Bersih          : " + gjb);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        Input(input);
        hitung();
        tampilkan();
    }
}