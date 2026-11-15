package P6.Tugas;

public class Soal2 {
    final String LAMA = "Suzuki";
    final String BARU = "Toyota";

    int ubah(String[] mobil) {
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals(LAMA)) {
                mobil[i] = BARU;
                return i;
            }
        }
        return -1;
    }

    void tampilArray(String label, String[] ar) {
        System.out.print(label);
        for (String m : ar) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public void run() {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        System.out.println("=== Soal 2: Ubah Nilai Suzuki pada Array ===");
        System.out.println();
        tampilArray("Array sebelum      : ", mobil);
        int idx = ubah(mobil);
        System.out.println("Indeks yang diubah : " + idx);
        System.out.println("Nilai baru         : " + mobil[idx]);
        tampilArray("Array sesudah      : ", mobil);
    }
}
