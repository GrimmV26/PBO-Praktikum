package P5.Tugas;

public class Soal8 {
    int[] arr = {10, 20, 30, 40, 50};

    public void tampilkan() {
        for (int n : arr) {
            System.out.println("Nilai : " + n);
        }
    }

    public void jalankan() {
        System.out.println("=== Soal 8: Foreach pada Array ===");
        tampilkan();
    }
}
