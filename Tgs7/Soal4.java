package P7.Tugas;

public class Soal4{
    String awal;

    Soal4(){
        awal = "Kami putra dan putri Indonesia";
    }

    public void sumpahPertama(){
        System.out.println("Pertama : " + awal + ", mengaku bertumpah darah yang satu, tanah air Indonesia.");
    }

    public void sumpahKedua(){
        System.out.println("Kedua   : " + awal + ", mengaku berbangsa yang satu, bangsa Indonesia.");
    }

    public void sumpahKetiga(){
        System.out.println("Ketiga  : " + awal + ", menjunjung bahasa persatuan, bahasa Indonesia.");
    }

    public void run(){
        System.out.println("=== Soal 4: Sumpah Pemuda (28 Oktober 1928) ===");
        System.out.println();
        sumpahPertama();
        sumpahKedua();
        sumpahKetiga();
    }
}
