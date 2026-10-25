package p4.Tugas;

import java.util.Scanner;

public class Soal6 {
    final double d50 = 50000;
    final double d15 = 15000;
    final double d10 = 10000;

    final Scanner input = new Scanner(System.in);

    boolean mbr;
    boolean jwbvld;
    double tblj;
    double uang;

    double dsk;
    double tbyr;
    double kmbl;

    double bacaAngka(String label) {
        System.out.print(label);
        return Double.parseDouble(input.next().replace(',', '.'));
    }

    void bacaInput() {
        System.out.println("=== Soal 6: Kasir Sederhana ===");
        System.out.print("Apakah memiliki kartu member? (y/n) : ");
        String jwb = input.next().trim().toLowerCase();
        mbr = jwb.equals("y") || jwb.equals("ya");
        jwbvld = mbr || jwb.equals("n") || jwb.equals("tidak");

        tblj = bacaAngka("Total belanja (Rp)                : ");
        uang = bacaAngka("Uang yang diberikan (Rp)        : ");
    }

    boolean dataValid() {
        if (!jwbvld) {
            System.out.println("Input tidak valid: jawab dengan y (ya) atau n (tidak).");
            return false;
        }
        if (tblj < 0) {
            System.out.println("Input tidak valid: total belanja tidak boleh negatif.");
            return false;
        }
        if (uang < 0) {
            System.out.println("Input tidak valid: uang yang diberikan tidak boleh negatif.");
            return false;
        }
        return true;
    }

    public void hitung() {
        if (mbr) {
            if (tblj > 500000) {
                dsk = d50;
            } else if (tblj > 100000) {
                dsk = d15;
            } else {
                dsk = 0;
            }
        } else {
            if (tblj > 100000) {
                dsk = d10;
            } else {
                dsk = 0;
            }
        }
        tbyr = tblj - dsk;
        kmbl = uang - tbyr;
    }

    String rupiah(double nilai) {
        if (nilai == (long) nilai) {
            return "Rp " + (long) nilai;
        }
        return "Rp " + nilai;
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("=====================================");
        System.out.println("             STRUK KASIR");
        System.out.println("=====================================");
        System.out.println("Kartu member   : " + (mbr ? "Ya" : "Tidak"));
        System.out.println("Total belanja  : " + rupiah(tblj));
        System.out.println("Diskon         : " + rupiah(dsk));
        System.out.println("Total bayar    : " + rupiah(tbyr));
        System.out.println("Uang diberikan : " + rupiah(uang));
        if (kmbl >= 0) {
            System.out.println("Kembalian      : " + rupiah(kmbl));
        } else {
            System.out.println("Kekurangan     : " + rupiah(-kmbl));
            System.out.println("Uang yang diberikan belum cukup untuk membayar.");
        }
        System.out.println("=====================================");
    }

    public void jalankan() {
        bacaInput();
        if (dataValid()) {
            hitung();
            tampilkan();
        }
    }
}
