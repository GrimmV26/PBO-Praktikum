package P2.Tugas;

public class Main {
    public static void main(String[] args) {

        System.out.println("No 1");
        Increment N1 = new Increment();
        N1.n = 5;
        N1.post();
        N1.pre();

        System.out.println("\nNo 2");
        PersegiPanjang N2 = new PersegiPanjang();
        N2.p = 50;
        N2.l = 45;
        N2.tampil();

        System.out.println("\nNo 3");
        PersamaanKuadrat N3 = new PersamaanKuadrat();
        N3.a = 2;
        N3.b = 10;
        N3.c = 5;
        N3.tampil();

        System.out.println("\nNo 4");
        OperasiMatematika N4 = new OperasiMatematika();
        N4.x = 12;
        N4.y = 67;
        N4.tampil();

        System.out.println("\nNo 5");
        Segitiga N5 = new Segitiga();
        N5.a = 6;
        N5.t = 8;
        N5.tampil();

        System.out.println("\nNo 6");
        Pythagoras N6 = new Pythagoras();
        N6.a = 9;
        N6.b = 18;
        N6.tampil();

        System.out.println("\nNo 7");
        UbahString N7 = new UbahString();
        N7.a = "WHITE ALBUM 2 GOAT";
        N7.b = "white album 2 goat";
        System.out.println("Sebelum:");
        N7.tampil();
        System.out.println("Sesudah:");
        N7.kecil(); N7.besar();
        N7.tampil();

        System.out.println("\nNo 8");
        KecepatanCahaya N8 = new KecepatanCahaya();
        N8.jb = 384400;
        N8.jm = 152100000;
        N8.v = 300000;
        N8.tampil();

        System.out.println("\nNo 9");
        KonversiSuhu N9 = new KonversiSuhu();
        N9.c = 10;
        N9.f = 15;
        N9.r = 5;
        N9.tampil();
    }
}
