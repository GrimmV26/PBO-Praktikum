package P3.Tugas;

import java.io.*;
import java.util.Scanner;

public class Soal3 {
    void cetakPenjelasan() {
        System.out.println("=== Soal 3: Perbedaan Scanner dan BufferedReader ===");
        System.out.println("1. Scanner menggunakan java.util.Scanner, sedangkan BufferedReader menggunakan java.io.*.");
        System.out.println("2. BufferedReader mengharuskan try-catch atau throws IOException.");
        System.out.println("3. Scanner parsing otomatis (nextInt), BufferedReader manual (Integer.parseInt).\n");
    }

    void demoScanner(Scanner input) {
        System.out.println("--- Contoh Scanner ---");
        System.out.print("Masukkan Umur : ");
        int umrSc = input.nextInt();
        System.out.println("Umur (Scanner) : " + umrSc);
        input.nextLine();
    }

    void demoBufferedReader() throws IOException {
        System.out.println("\n--- Contoh BufferedReader ---");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan Umur : ");
        int umrBr = Integer.parseInt(br.readLine());
        System.out.println("Umur (BufferedReader) : " + umrBr);
    }

    public void run() throws IOException {
        Scanner input = new Scanner(System.in);
        cetakPenjelasan();
        demoScanner(input);
        demoBufferedReader();
    }
}