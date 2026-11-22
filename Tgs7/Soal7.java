package P7.Tugas;

import java.util.Scanner;

public class Soal7{
    final Scanner input = new Scanner(System.in);

    class Mahasiswa{
        String nm;
        String npm;
        String kls;

        Mahasiswa(String nm, String npm, String kls){
            this.nm = nm;
            this.npm = npm;
            this.kls = kls;
        }

        void tampilkan(){
            System.out.println("Nama  : " + this.nm);
            System.out.println("NPM   : " + this.npm);
            System.out.println("Kelas : " + this.kls);
        }
    }

    public void run(){
        System.out.println("=== Soal 7: Data Mahasiswa dengan this ===");
        System.out.print("Nama  : ");
        String nm = input.nextLine();
        System.out.print("NPM   : ");
        String npm = input.nextLine();
        System.out.print("Kelas : ");
        String kls = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nm, npm, kls);
        System.out.println();
        System.out.println("Data yang tersimpan:");
        mhs.tampilkan();
    }
}
