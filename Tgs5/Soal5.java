package P5.Tugas;

public class Soal5 {
    final int BRS = 5;
    final int TGH = 3;

    public void halfTriangle() {
        for (int i = 1; i <= BRS; i++) {
            for (int j = 1; j <= BRS - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void fullTriangle() {
        for (int i = 1; i <= 2 * TGH - 1; i++) {
            int k = i <= TGH ? i : 2 * TGH - i;
            for (int j = 1; j <= TGH - k; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * k - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void tampilkan() {
        System.out.println("Half Triangle");
        halfTriangle();
        System.out.println();
        System.out.println("Full Triangle");
        fullTriangle();
    }

    public void jalankan() {
        System.out.println("=== Soal 5: Half Triangle dan Full Triangle ===");
        System.out.println();
        tampilkan();
    }
}
