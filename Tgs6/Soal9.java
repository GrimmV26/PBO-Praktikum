package P6.Tugas;

public class Soal9 {
    int[] age = {12, 4, 5, 2, 6};

    public void tampilkan() {
        System.out.print("Perulangan for     :");
        for (int i = 0; i < age.length; i++) {
            System.out.print(" " + age[i]);
        }
        System.out.println();

        System.out.print("Perulangan foreach :");
        for (int n : age) {
            System.out.print(" " + n);
        }
        System.out.println();
    }

    public void run() {
        System.out.println("=== Soal 9: Dua Macam Perulangan pada Array ===");
        tampilkan();
    }
}
