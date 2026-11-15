
package P6.Tugas;

public class Soal10 {
    Object[] data = {19, 0.2, 'C', "Java", true};

    public void tampilkan() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Indeks " + i + " : " + data[i] + " (" + data[i].getClass().getSimpleName() + ")");
        }
    }

    public void run() {
        System.out.println("=== Soal 10: Array Berisi Data Campuran ===");
        System.out.println("Array bertipe Object[] karena isinya bertipe campuran.");
        System.out.println();
        tampilkan();
    }
}
