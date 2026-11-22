package P7.Tugas;

import java.util.ArrayList;

public class Soal6{

    class Dosen{
        String nm;
        String sts;

        Dosen(String nm){
            this.nm = nm;
            this.sts = "Dosen";
        }
    }

    class Mahasiswa{
        String nm;
        String sts;

        Mahasiswa(String nm){
            this.nm = nm;
            this.sts = "Mahasiswa";
        }
    }

    class Staff{
        String nm;
        String sts;

        Staff(String nm){
            this.nm = nm;
            this.sts = "Staff";
        }
    }

    class Civitas{
        String nm;
        ArrayList<Dosen> dsn;
        ArrayList<Mahasiswa> mhs;
        ArrayList<Staff> stf;

        Civitas(String nm){
            this.nm = nm;
            dsn = new ArrayList<>();
            mhs = new ArrayList<>();
            stf = new ArrayList<>();
        }

        void tambah(Dosen d){
            dsn.add(d);
        }

        void tambah(Mahasiswa m){
            mhs.add(m);
        }

        void tambah(Staff s){
            stf.add(s);
        }

        void tampil(){
            System.out.println("Civitas Akademika : " + this.nm);
            for(Dosen d : dsn){
                System.out.println("Nama : " + d.nm + " | Status : " + d.sts);
            }
            for(Mahasiswa m : mhs){
                System.out.println("Nama : " + m.nm + " | Status : " + m.sts);
            }
            for(Staff s : stf){
                System.out.println("Nama : " + s.nm + " | Status : " + s.sts);
            }
        }
    }

    public void run(){
        System.out.println("=== Soal 6: Civitas Akademika Fakultas Teknik ===");
        System.out.println();

        Civitas ctv = new Civitas("Fakultas Teknik");
        Dosen ds1 = new Dosen("Kazaoka Mari");
        Dosen ds2 = new Dosen("Touma Youko");
        Mahasiswa mh1 = new Mahasiswa("Touma Kazusa");
        Mahasiswa mh2 = new Mahasiswa("Ogiso Setsuna");
        Staff sf1 = new Staff("Slamet Riyadi");

        ctv.tambah(ds1);
        ctv.tambah(ds2);
        ctv.tambah(mh1);
        ctv.tambah(mh2);
        ctv.tambah(sf1);
        ctv.tampil();

        System.out.println();
        System.out.println("Hubungan yang terjalin : Agregasi");
        System.out.println("- Civitas memiliki Dosen, Mahasiswa, dan Staff sebagai bagiannya");
        System.out.println("- Dosen, Mahasiswa, dan Staff tetap bisa ada tanpa Civitas");
    }
}
