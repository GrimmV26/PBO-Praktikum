
package P6.Tugas;

public class Soal7 {

    class ThreadBaru extends Thread {
        ThreadBaru() {
            super("Thread Anak");
            start();
        }

        public void run() {
            System.out.println(getName() + "  : method run() sedang dijalankan.");
        }
    }

    public void run() {
        System.out.println("=== Soal 7: Kelas Turunan Thread ===");
        System.out.println("Thread utama : membuat objek ThreadBaru (start() dipanggil di konstruktor).");
        ThreadBaru tb = new ThreadBaru();
        try {
            tb.join();
        } catch (InterruptedException e) {
            System.out.println("Thread utama : proses menunggu terganggu.");
        }
        System.out.println("Thread utama : thread anak selesai.");
    }
}
