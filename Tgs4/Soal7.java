package p4.Tugas;

import java.util.Scanner;

public class Soal7 {
    final Scanner input = new Scanner(System.in);

    double baca(String label) {
        System.out.print(label);
        return Double.parseDouble(input.next().replace(',', '.'));
    }

    boolean valid(double... uk) {
        for (double u : uk) {
            if (u <= 0) {
                System.out.println("Input tidak valid: ukuran harus > 0.");
                return false;
            }
        }
        return true;
    }

    String fmt(double n) {
        return (n == (long) n) ? String.valueOf((long) n) : String.valueOf(n);
    }

    void hasil(String nama, double luas, String rumus) {
        System.out.printf("\nBangun datar : %s\nPerhitungan  : %s\nLuas %s = %s satuan luas\n", 
                nama, rumus, nama, fmt(Math.round(luas * 100) / 100.0));
    }

    public void jalankan() {
        System.out.println("=== Soal 7: Luas Bangun Datar ==="
                + "\n 1. Persegi"
                + "\n 2. Segitiga"
                + "\n 3. Lingkaran"
                + "\n 4. Trapesium"
                + "\n 5. Layang-layang");
        System.out.print("Pilih bangun datar (1-5) : ");
        int pil = input.nextInt();

        switch (pil) {
            case 1 -> {
                double s = baca("Sisi (s) : ");
                if (valid(s)) hasil("Persegi", s * s, "s x s = \n" 
                        + fmt(s) + " x " + fmt(s));
            }
            case 2 -> {
                double a = baca("Alas   : "), t = baca("Tinggi : ");
                if (valid(a, t)) hasil("Segitiga", 0.5 * a * t, "1/2 x a x t = "
                        + "1/2 x " + fmt(a) + " x " + fmt(t));
            }
            case 3 -> {
                double r = baca("Jari-jari (r) : ");
                if (valid(r)) hasil("Lingkaran", Math.PI * r * r, "pi x r x r = "
                        + "pi x " + fmt(r) + " x " + fmt(r));
            }
            case 4 -> {
                double a = baca("Sisi a : "), b = baca("Sisi b : "), t = baca("Tinggi : ");
                if (valid(a, b, t)) hasil("Trapesium", 0.5 * (a + b) * t, "1/2 x (a+b) x t = "
                        + "1/2 x (" + fmt(a) + "+" + fmt(b) + ") x " + fmt(t));
            }
            case 5 -> {
                double d1 = baca("Diagonal 1 : "), d2 = baca("Diagonal 2 : ");
                if (valid(d1, d2)) hasil("Layang-layang", 0.5 * d1 * d2, "1/2 x d1 x d2 = "
                        + "1/2 x " + fmt(d1) + " x " + fmt(d2));
            }
            default -> System.out.println("Input tidak valid: pilihan harus 1-5.");
        }
    }
}