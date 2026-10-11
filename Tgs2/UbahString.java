package P2.Tugas;

class UbahString{
    String a, b;

    void kecil(){
        a = a.toLowerCase();
    }

    void besar(){
        b = b.toUpperCase();
    }

    void tampil(){
        System.out.println("a = \"" + a + "\"");
        System.out.println("b = \"" + b + "\"");
    }
}
