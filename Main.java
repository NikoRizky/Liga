package UAS;
import UAS.Divisi;
import UAS.Klub;
import UAS.Liga;

/**
 * Created by Ritz on 07/07/2015.
 */
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga Malang = new Liga("Malang");
        Liga Dampit = new Liga("Dampit");

        //Divisi
        Divisi serieA = new Divisi("Serie A",Malang);
        Divisi serieB = new Divisi("Serie B",Malang);
        Divisi divisi1 = new Divisi("Divisi1",Dampit);
        Divisi divisi2 = new Divisi("Divisi2",Dampit);

        //Klub
        Klub Sawojajar = new Klub("Sawojajar",serieA,Malang);
        Klub Polehan = new Klub("Polehan",serieA,Malang);
        Klub Jodipan = new Klub("Jodipan",serieB,Malang);
        Klub Kebalen = new Klub("Kebalen",serieB,Malang);
        Klub Pamotan = new Klub("Pamotan",divisi1,Dampit);
        Klub KaliMas = new Klub("KaliMas",divisi1,Dampit);
        Klub KaliAyu = new Klub("KaliAyu",divisi2,Dampit);
        Klub KaliDoyo = new Klub("KaliDoyo",divisi2,Dampit);

        Malang.setDaftarDivisi(serieA);
        Malang.setDaftarDivisi(serieB);
        Dampit.setDaftarDivisi(divisi1);
        Dampit.setDaftarDivisi(divisi2);

        serieA.setDaftarKlub(Sawojajar);
        serieA.setDaftarKlub(Polehan);
        serieB.setDaftarKlub(Jodipan);
        serieB.setDaftarKlub(Kebalen);
        divisi1.setDaftarKlub(Pamotan);
        divisi1.setDaftarKlub(KaliMas);
        divisi2.setDaftarKlub(KaliAyu);
        divisi2.setDaftarKlub(KaliDoyo);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Malang : ");
        Malang.getDaftarDivisi("Malang");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Malang : ");
        serieA.getDaftarKlubLiga("Malang");
        System.out.println("Liga Dampit : ");
        divisi1.getDaftarKlubLiga("Dampit");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        Sawojajar.getDivisi("Sawojajar");
        Pamotan.getDivisi("Pamotan");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        Pamotan.getLiga("Pamotan");
    }
}


