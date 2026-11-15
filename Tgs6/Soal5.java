package P6.Tugas;

import java.util.Scanner;

public class Soal5 {
    final Scanner input = new Scanner(System.in);

    int brs;
    int kol;
    int[][] ma;
    int[][] mb;
    int[][] mh;

    void bacaMatriks(int[][] mtx, String nama) {
        for (int i = 0; i < brs; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print("  " + nama + "[" + (i + 1) + "][" + (j + 1) + "] : ");
                mtx[i][j] = input.nextInt();
            }
        }
    }

    void bacaInput() {
        System.out.println("=== Soal 5: Penjumlahan Matriks ===");
        System.out.print("Jumlah baris : ");
        brs = input.nextInt();
        System.out.print("Jumlah kolom : ");
        kol = input.nextInt();
        if (brs > 0 && kol > 0) {
            ma = new int[brs][kol];
            mb = new int[brs][kol];
            mh = new int[brs][kol];
            System.out.println("Isi matriks A:");
            bacaMatriks(ma, "A");
            System.out.println("Isi matriks B:");
            bacaMatriks(mb, "B");
        }
    }

    public void hitung() {
        for (int i = 0; i < brs; i++) {
            for (int j = 0; j < kol; j++) {
                mh[i][j] = ma[i][j] + mb[i][j];
            }
        }
    }

    void tampilMatriks(int[][] mtx) {
        for (int i = 0; i < brs; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print(mtx[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("Matriks A:");
        tampilMatriks(ma);
        System.out.println("Matriks B:");
        tampilMatriks(mb);
        System.out.println("Hasil A + B:");
        tampilMatriks(mh);
    }

    public void run() {
        bacaInput();
        if (brs <= 0 || kol <= 0) {
            System.out.println("Input tidak valid: jumlah baris dan kolom harus lebih dari 0.");
        } else {
            hitung();
            tampilkan();
        }
    }
}
