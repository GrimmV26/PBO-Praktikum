package P2.Tugas;

class PersegiPanjang{
    int p, l;

    int luas() {
        return p*l;
    }

    void tampil(){
        System.out.println("Panjang : " + p);
        System.out.println("Lebar   : " + l);
        System.out.println("Luas    : " + luas());
    }
}
