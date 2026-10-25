package p4.Tugas;

import java.util.Scanner;

public class Soal3 {
    final int PTP = 10;
    final int PTA = 5;

    final Scanner input = new Scanner(System.in);

    String nik;
    String nm;
    int kdg;
    int stts;
    int jml;

    void bacaInput(){
        System.out.println("=== Soal 3: Gaji Bersih Karyawan ===");
        System.out.println("Kode golongan (menentukan gaji pokok):");
        System.out.println("  1. Menikah                  Rp 1.200.000");
        System.out.println("  2. Belum menikah            Rp 1.500.000");
        System.out.println("  3. Cerai                    Rp 1.750.000");
        System.out.println("  4. Menikah dan punya anak   Rp 2.000.000");
        System.out.println("Status pernikahan: 1 = Menikah, 2 = Belum menikah, 3 = Cerai");
        System.out.println();

        System.out.print("NIK                     : ");
        nik = input.nextLine();
        System.out.print("Nama                    : ");
        nm = input.nextLine();
        System.out.print("Kode golongan (1-4)     : ");
        kdg = input.nextInt();
        System.out.print("Status pernikahan (1-3) : ");
        stts = input.nextInt();
        System.out.print("Jumlah anak             : ");
        jml = input.nextInt();
    }

    boolean dataValid() {
        if (kdg < 1 || kdg > 4){
            System.out.println("Input tidak valid: kode golongan harus 1 sampai 4.");
            return false;
        }
        if (stts < 1 || stts > 3){
            System.out.println("Input tidak valid: status pernikahan harus 1, 2, atau 3.");
            return false;
        }
        if (jml < 0) {
            System.out.println("Input tidak valid: jumlah anak tidak boleh negatif.");
            return false;
        }
        return true;
    }

    public double hitungGajiPokok(){
        return switch (kdg) {
            case 1 -> 1200000;
            case 2 -> 1500000;
            case 3 -> 1750000;
            case 4 -> 2000000;
            default -> 0;
        };
    }

    public double hitungTunjanganPasangan(){
        if (stts == 1){
            return hitungGajiPokok() * PTP / 100;
        }
        return 0;
    }

    public double hitungTunjanganAnak(){
        return hitungGajiPokok() * PTA / 100 * jml;
    }

    public double hitungTunjangan(){
        return hitungTunjanganPasangan() + hitungTunjanganAnak();
    }

    public double hitungGajiBersih(){
        return hitungGajiPokok() + hitungTunjangan();
    }

    String getKeteranganGolongan(){
        return switch (kdg){
            case 1 -> "Menikah";
            case 2 -> "Belum menikah";
            case 3 -> "Cerai";
            default -> "Menikah dan punya anak";
        };
    }

    String getNamaStatus(){
        return switch (stts){
            case 1 -> "Menikah";
            case 2 -> "Belum menikah";
            default -> "Cerai";
        };
    }

    String rupiah(double nilai){
        if (nilai == (long) nilai) {
            return "Rp " + (long) nilai;
        }
        return "Rp " + nilai;
    }

    public void tampilkan(){
        System.out.println();
        System.out.println("==================================================");
        System.out.println("                SLIP GAJI KARYAWAN");
        System.out.println("==================================================");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nm);
        System.out.println("Kode golongan      : " + kdg + " (" + getKeteranganGolongan() + ")");
        System.out.println("Status pernikahan  : " + getNamaStatus());
        System.out.println("Jumlah anak        : " + jml);
        System.out.println("--------------------------------------------------");
        System.out.println("Gaji pokok         : " + rupiah(hitungGajiPokok()));
        System.out.println("Tunjangan pasangan : " + rupiah(hitungTunjanganPasangan())
                + "  (" + PTP + "% x gaji pokok)");
        System.out.println("Tunjangan anak     : " + rupiah(hitungTunjanganAnak())
                + "  (" + PTA + "% x gaji pokok x " + jml + " anak)");
        System.out.println("Total tunjangan    : " + rupiah(hitungTunjangan()));
        System.out.println("--------------------------------------------------");
        System.out.println("GAJI BERSIH        : " + rupiah(hitungGajiBersih()));
        System.out.println("==================================================");
    }

    public void jalankan(){
        bacaInput();
        if (dataValid()){
            tampilkan();
        }
    }
}
