package P2.Tugas;

class Segitiga{
    double a, t;

    double luas(){
        return (a*t) * 0.5;
    }

    void tampil(){
        System.out.println("Alas   : " + a);
        System.out.println("Tinggi : " + t);
        System.out.println("Luas   : " + luas());
    }
}
