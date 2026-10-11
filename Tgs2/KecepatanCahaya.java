package P2.Tugas;

class KecepatanCahaya{
    double jb, v, jm;

    double waktuBulan(){
        return jb/v;
    }

    double waktuMatahari(){
        return jm/v;
    }

    void tampil(){
        double tm = jm / v;
        double m = tm / 60;
        double d = tm - (m*60);

        System.out.println("Kecepatan cahaya    : " + v + " km/s");
        System.out.println("Bumi -> Bulan       : " + jb + " km");
        System.out.println("Waktu tempuh        : " + waktuBulan() + " detik");
        System.out.println("Bumi -> Matahari    : " + jm + " km");
        System.out.println("Waktu tempuh        : " + waktuMatahari() + " detik (" + m + " menit " + d + " detik)");
    }
}
