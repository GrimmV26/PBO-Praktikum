package P3.Tugas;

import java.io.*;
import java.util.Scanner;

public class Soal2 {
    String nmIn;
    double tbIn, discIn, ttlIn, byrIn, kmblIn;

    void ambilInput(Scanner input) {
        System.out.println("=== Soal 2: Pembelanjaan ===");
        System.out.print("Nama          : ");
        nmIn = input.nextLine();
        System.out.print("Total Belanja : ");
        tbIn = input.nextDouble();
        System.out.print("Diskon (%)    : ");
        discIn = input.nextDouble();
        System.out.print("Bayar         : ");
        byrIn = input.nextDouble();
    }

    void hitung() {
        ttlIn = tbIn - (tbIn * discIn / 100);
        kmblIn = byrIn - ttlIn;
    }

    void simpanKeFile() throws IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream("Belanja.dat"));
        output.writeUTF(nmIn);
        output.writeDouble(tbIn);
        output.writeDouble(discIn);
        output.writeDouble(ttlIn);
        output.writeDouble(byrIn);
        output.writeDouble(kmblIn);
        output.close();
    }

    void bacaDariFile() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("Belanja.dat"));
        System.out.println("\n--- Struk dari DataInputStream (Belanja.dat) ---");
        System.out.println("Nama          : " + dis.readUTF());
        System.out.println("Total Belanja : " + dis.readDouble());
        System.out.println("Diskon (%)    : " + dis.readDouble());
        System.out.println("Total         : " + dis.readDouble());
        System.out.println("Bayar         : " + dis.readDouble());
        System.out.println("Kembalian     : " + dis.readDouble());
        dis.close();
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        try {
            ambilInput(input);
            hitung();
            simpanKeFile();
            bacaDariFile();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan I/O: " + e.getMessage());
        }
    }
}