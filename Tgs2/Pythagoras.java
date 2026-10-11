package P2.Tugas;

class Pythagoras{
    int a, b;

    double sisiC(){
        return Math.sqrt((a*a) + (b*b));
    }

    double keliling(){
        return a + b + sisiC();
    }

    void tampil(){
        System.out.println("a        : " + a);
        System.out.println("b        : " + b);
        System.out.println("c        : " + sisiC());
        System.out.println("Keliling : " + keliling());
    }
}
