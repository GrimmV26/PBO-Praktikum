package P2.Tugas;

class PersamaanKuadrat{
    int a, b, c;

    int diskriminan(){
        return (b*b) - (4*a*c);
    }

    void tampil(){
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("b^2 - 4ac = " + b + "^2 - 4(" + a + ")(" + c + ")");
        System.out.println("          = " + diskriminan());
    }
}
