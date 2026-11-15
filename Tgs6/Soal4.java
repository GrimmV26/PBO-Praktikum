package P6.Tugas;

import java.util.Scanner;

public class Soal4 {
    final Scanner input = new Scanner(System.in);
    final int BTS = 50;

    int jml;
    String[] nm;
    int[] nil;
    String[] sts;

    void bacaInput() {
        System.out.println("=== Soal 4: Daftar Nilai Mahasiswa ===");
        System.out.print("Masukkan jumlah mahasiswa : ");
        jml = input.nextInt();
        input.nextLine();
        if (jml > 0) {
            nm = new String[jml];
            nil = new int[jml];
            sts = new String[jml];
            for (int i = 0; i < jml; i++) {
                System.out.println("Mahasiswa ke-" + (i + 1));
                System.out.print("  Nama  : ");
                nm[i] = input.nextLine();
                System.out.print("  Nilai : ");
                nil[i] = input.nextInt();
                input.nextLine();
                if (nil[i] <= BTS) {
                    sts[i] = "Tidak Lulus";
                } else {
                    sts[i] = "Lulus";
                }
            }
        }
    }

    String ulang(String teks, int kali) {
        String hsl = "";
        for (int i = 0; i < kali; i++) {
            hsl = hsl + teks;
        }
        return hsl;
    }

    String kolom(String teks, int lbr) {
        return teks + ulang(" ", lbr - teks.length());
    }

    public void tampilkan() {
        String jdl = "Daftar Nilai Mahasiswa";
        int lnm = 4;
        for (int i = 0; i < jml; i++) {
            if (nm[i].length() > lnm) {
                lnm = nm[i].length();
            }
        }
        int lbr = 5 + (lnm + 2) + 8 + 11;
        System.out.println();
        System.out.println(ulang(" ", (lbr - jdl.length()) / 2) + jdl);
        System.out.println(ulang("-", lbr));
        System.out.println(kolom("No", 5) + kolom("Nama", lnm + 2) + kolom("Nilai", 8) + "Status");
        System.out.println(ulang("-", lbr));
        for (int i = 0; i < jml; i++) {
            System.out.println(kolom(String.valueOf(i + 1), 5) + kolom(nm[i], lnm + 2)
                    + kolom(String.valueOf(nil[i]), 8) + sts[i]);
        }
        System.out.println(ulang("-", lbr));
    }

    public void run() {
        bacaInput();
        if (jml <= 0) {
            System.out.println("Input tidak valid: jumlah mahasiswa harus lebih dari 0.");
        } else {
            tampilkan();
        }
    }
}
