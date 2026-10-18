package P3.Tugas;

import java.io.*;
import java.util.Scanner;

public class Soal2 {
    String nmIn;
    double tbIn, discIn, ttlIn, byrIn, kmblIn;

    void Inputan(Scanner input) {
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
        DataInputStream input = new DataInputStream(new FileInputStream("Belanja.dat"));
        System.out.println("\n--- Struk dari DataInputStream (Belanja.dat) ---");
        System.out.println("Nama          : " + input.readUTF());
        System.out.println("Total Belanja : " + input.readDouble());
        System.out.println("Diskon (%)    : " + input.readDouble());
        System.out.println("Total         : " + input.readDouble());
        System.out.println("Bayar         : " + input.readDouble());
        System.out.println("Kembalian     : " + input.readDouble());
        input.close();
    }

    public void run() throws IOException {
        Scanner input = new Scanner(System.in);
        Inputan(input);
        hitung();
        simpanKeFile();
        bacaDariFile();
    }
}
