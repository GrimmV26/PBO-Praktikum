package P6.Tugas;

public class Soal1 {

    void tampilArray(String nama, int[] ar) {
        System.out.print("Isi " + nama + "   : ");
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void tampilkan() {
        int[] ar1 = new int[3];
        ar1[0] = 10;
        ar1[1] = 20;
        ar1[2] = 30;

        int[] ar2 = {40, 50, 60};

        int[] ar3 = new int[]{70, 80, 90};

        System.out.println("Variasi 1 : int[] ar1 = new int[3]; lalu isi per indeks");
        tampilArray("ar1", ar1);
        System.out.println();
        System.out.println("Variasi 2 : int[] ar2 = {40, 50, 60};");
        tampilArray("ar2", ar2);
        System.out.println();
        System.out.println("Variasi 3 : int[] ar3 = new int[]{70, 80, 90};");
        tampilArray("ar3", ar3);
    }

    public void run() {
        System.out.println("=== Soal 1: Tiga Variasi Syntaks Array Integer ===");
        System.out.println();
        tampilkan();
    }
}
