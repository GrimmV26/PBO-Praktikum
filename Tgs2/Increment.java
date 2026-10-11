package P2.Tugas;

class Increment{
    int n;

    void post(){
        int x = n;
        System.out.println("-- Post-increment (x++)");
        System.out.println("Nilai awal         : " + x);
        System.out.println("Hasil ekspresi x++ : " + (x++));
        System.out.println("Nilai x sesudahnya : " + x);
    }

    void pre(){
        int x = n;
        System.out.println("-- Pre-increment (++x)");
        System.out.println("Nilai awal         : " + x);
        System.out.println("Hasil ekspresi ++x : " + (++x));
        System.out.println("Nilai x sesudahnya : " + x);
    }
}
