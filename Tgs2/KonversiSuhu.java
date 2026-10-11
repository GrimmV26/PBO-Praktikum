package P2.Tugas;

class KonversiSuhu{
    double c, f, r;

    double cKeF(){
        return (c*9/5) + 32;
    }

    double fKeC(){
        return (f-32) * 5/9;
    }

    double cKeR(){
        return (c*4) / 5;
    }

    double rKeC(){
        return (r*5) / 4;
    }

    double fKeR(){
        return (f-32) * (4/9);
    }

    double rKeF(){
        return (r*9 / 4) + 32;
    }

    void tampil(){
        System.out.println("a. Celsius dan Fahrenheit");
        System.out.println("   "+ c +" C = " + cKeF() + " F");
        System.out.println("   "+ f +" F = " + fKeC() + " C");

        System.out.println("b. Celsius dan Reamur");
        System.out.println("   "+ c +" C = " + cKeR() + " R");
        System.out.println("   "+ r +" R = " + rKeC() + " C");

        System.out.println("c. Fahrenheit dan Reamur");
        System.out.println("   "+ f +" F = " + fKeR() + " R");
        System.out.println("   "+ r +" R = " + rKeF() + " F");
    }
}
