package p4.Tugas;

import java.util.Scanner;

public class Soal4 {
    final Scanner input = new Scanner(System.in);

    int thn;

    void bacaInput(){
        System.out.println("=== Soal 4: Tahun Kabisat ===");
        System.out.print("Masukkan tahun : ");
        thn = input.nextInt();
    }

    public boolean isKabisat(){
        return(thn % 4 == 0 && thn % 100 != 0) || (thn % 400 == 0);
    }

    String getAlasan(){
        if(thn % 400 == 0){
            return "habis dibagi 400";
        } else if (thn % 100 == 0) {
            return "habis dibagi 100 tetapi tidak habis dibagi 400";
        } else if (thn % 4 == 0) {
            return "habis dibagi 4 dan tidak habis dibagi 100";
        } else {
            return "tidak habis dibagi 4";
        }
    }

    public void tampilkan(){
        System.out.println();
        if(isKabisat()){
            System.out.println("Tahun " + thn + " adalah TAHUN KABISAT (" + getAlasan() + ").");
        }else{
            System.out.println("Tahun " + thn + " BUKAN tahun kabisat (" + getAlasan() + ").");
        }
    }

    public void jalankan(){
        bacaInput();
        if(thn <= 0){
            System.out.println("Input tidak valid: tahun harus lebih besar dari 0.");
        }else{
            tampilkan();
        }
    }
}
