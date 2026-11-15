package P6.Tugas;

import java.util.Scanner;

public class Soal3 {
    final Scanner input = new Scanner(System.in);

    int jml;
    int[] arr;
    int ib;
    int ik;
    long ttl;
    double rt;
    long jgnj;
    long jgnp;

    void bacaInput() {
        System.out.println("=== Soal 3: Operasi Array Satu Dimensi ===");
        System.out.print("(a) Masukkan jumlah elemen array : ");
        jml = input.nextInt();
        if (jml > 0) {
            arr = new int[jml];
            System.out.println("(b) Masukkan nilai tiap elemen:");
            for (int i = 0; i < jml; i++) {
                System.out.print("    arr[" + i + "] : ");
                arr[i] = input.nextInt();
            }
        }
    }

    void tampilArray(String label, int[] ar) {
        System.out.print(label);
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    String jenis(long nilai) {
        if (nilai % 2 == 0) {
            return "genap";
        }
        return "ganjil";
    }

    public void hitung() {
        ib = 0;
        ik = 0;
        ttl = 0;
        jgnj = 0;
        jgnp = 0;
        for (int i = 0; i < jml; i++) {
            if (arr[i] > arr[ib]) {
                ib = i;
            }
            if (arr[i] < arr[ik]) {
                ik = i;
            }
            ttl += arr[i];
            if (i % 2 == 1) {
                jgnj += arr[i];
            } else {
                jgnp += arr[i];
            }
        }
        rt = (double) ttl / jml;
    }

    public void tampilkan() {
        System.out.println();
        tampilArray("Data array                        : ", arr);
        System.out.println("(c) Nilai terbesar                : " + arr[ib] + " (indeks " + ib + ")");
        System.out.println("(c) Nilai terkecil                : " + arr[ik] + " (indeks " + ik + ")");
        System.out.println("(d) Jumlah semua elemen           : " + ttl);
        System.out.println("(d) Rata-rata                     : " + rt);
        System.out.println("(e) Jumlah elemen indeks ganjil   : " + jgnj);
        System.out.println("(f) Jumlah elemen indeks genap    : " + jgnp);
    }

    public void cekHasil() {
        System.out.println("(g) Hasil langkah e (" + jgnj + ") bernilai " + jenis(jgnj));
        System.out.println("(g) Hasil langkah f (" + jgnp + ") bernilai " + jenis(jgnp));
    }

    public void urutkan() {
        for (int i = 0; i < jml - 1; i++) {
            for (int j = 0; j < jml - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        tampilArray("(h) Array diurutkan (naik)        : ", arr);
    }

    public void run() {
        bacaInput();
        if (jml <= 0) {
            System.out.println("Input tidak valid: jumlah elemen harus lebih dari 0.");
        } else {
            hitung();
            tampilkan();
            cekHasil();
            urutkan();
        }
    }
}
