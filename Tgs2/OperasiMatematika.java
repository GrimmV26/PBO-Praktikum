package P2.Tugas;

class OperasiMatematika{
    int x, y;

    int tambah(){
        return x+y;
    }

    int kurang(){
        return x-y;
    }

    int kali(){
        return x*y;
    }

    double bagi(){
        return (double)x/y;
    }

    void tampil(){
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(x + " + " + y + " = " + tambah());
        System.out.println(x + " - " + y + " = " + kurang());
        System.out.println(x + " * " + y + " = " + kali());
        System.out.println(x + " / " + y + " = " + bagi());
    }
}
