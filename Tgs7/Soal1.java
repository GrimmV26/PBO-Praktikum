package P7.Tugas;

public class Soal1 {
    class VisualNovel{
        String jdl;
        String dev;
        int thn;
        String tkh;
        String hrn;

        VisualNovel(String jdl, String dev, int thn, String tkh, String hrn) {
            this.jdl = jdl;
            this.dev = dev;
            this.thn = thn;
            this.tkh = tkh;
            this.hrn = hrn;
        }

        void tampilkan(){
            System.out.println("Judul       : " + jdl);
            System.out.println("Pengembang  : " + dev);
            System.out.println("Rilis       : " + thn);
            System.out.println("Tokoh utama : " + tkh);
            System.out.println("Heroine     : " + hrn);
        }

        void sinopsis(){
            System.out.println("Sinopsis    : " + tkh + " membentuk band bersama " + hrn);
            System.out.println("              dan persahabatan mereka berubah menjadi kisah cinta yang rumit.");
        }
    }

    public void run(){
        System.out.println("=== Soal 1: Class Menjadi Objek (Visual Novel) ===\n");
        System.out.println("Mekanisme class menjadi objek:");
        System.out.println("1. Class dibuat lebih dulu sebagai cetak biru yang berisi atribut dan method (class VisualNovel).");
        System.out.println("2. Class VisualNovel tadi dibuatkan objeknya karena class masih abstrak belum spesifik semisal white album 2 (disingkat wa2).");
        System.out.println("3. Kata kunci new itu untuk membuat objek baru, lalu konstruktor dipanggil untuk mengisi atributnya (class yang isinya berisi parameter).");
        System.out.println("4. Alamat objek disimpan di variabel wa2, lalu atribut dan method dipanggil pake titik: wa2.tampilkan();");
        System.out.println("Satu class bisa dipakai untuk membuat banyak objek, masing-masing punya data sendiri.");
        System.out.println();

        VisualNovel wa2 = new VisualNovel("White Album 2", "Leaf", 2010, "Kitahara Haruki", "Ogiso Setsuna dan Touma Kazusa");

        System.out.println("Objek wa2 dibuat dari class VisualNovel:");
        wa2.tampilkan();
        wa2.sinopsis();
    }
}
