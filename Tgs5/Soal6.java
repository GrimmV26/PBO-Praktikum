package P5.Tugas;

public class Soal6 {
    int kali;

    public void hitung() {
        int i;
        kali = 0;
        for (i = 0; i < 10; i++) {
            if (i % 5 == 0) {
                System.out.println(11);
                kali++;
            }
        }
    }

    public void jalankan() {
        System.out.println("=== Soal 6: Angka Sebelas Dua Kali ===");
        System.out.println("Bagian yang diisi: if (i % 5 == 0) { System.out.println(11); }");
        System.out.println();
        hitung();
        System.out.println();
        System.out.println("Angka 11 tampil sebanyak " + kali + " kali.");
    }
}
