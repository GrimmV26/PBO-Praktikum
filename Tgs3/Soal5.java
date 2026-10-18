package P3.Tugas;

import java.io.*;

public class Soal5 {
    int mangga, tetangga, jambuperttg, busuk, ttlBuahDibeli;

    void ambilInput(BufferedReader br) throws IOException {
        System.out.println("=== Soal 5: Total Buah Ibu Sisca ===");
        System.out.print("Banyaknya mangga yang dibeli pertama   : ");
        mangga = Integer.parseInt(br.readLine());
        System.out.print("Jumlah tetangga yang diberi jambu      : ");
        tetangga = Integer.parseInt(br.readLine());
        System.out.print("Jumlah jambu per tetangga              : ");
        jambuperttg = Integer.parseInt(br.readLine());
        System.out.print("Banyaknya mangga busuk (dikembalikan)  : ");
        busuk = Integer.parseInt(br.readLine());
    }

    void hitung() {
        int sisaMangga = mangga - busuk;
        int totalJambu = tetangga * jambuperttg;
        ttlBuahDibeli = sisaMangga + totalJambu;
    }

    void tampilkan() {
        System.out.println("\nTotal buah yang dibeli (setelah diretur) : " + ttlBuahDibeli + " pcs");
    }

    public void run() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr); 
        ambilInput(br);
        hitung();
        tampilkan();
    }
}