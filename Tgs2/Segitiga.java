package P2.Tugas;

class Segitiga{
    int a, b;

    double luas(){
        return (a*b) / 2.0;
    }

    void tampil(){
        System.out.println("a    : " + a);
        System.out.println("b    : " + b);
        System.out.println("Luas : " + luas());
    }
}
