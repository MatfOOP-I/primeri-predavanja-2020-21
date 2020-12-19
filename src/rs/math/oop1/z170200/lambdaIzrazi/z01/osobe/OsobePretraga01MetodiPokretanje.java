package rs.math.oop1.z170200.lambdaIzrazi.z01.osobe;

import java.util.List;

public class OsobePretraga01MetodiPokretanje {
    
    static void prikaziOsobeStarijeOd(List<Osoba> osobe, int uzrast) {
        for (Osoba o : osobe) {
            if (o.getBrojGodina() >= uzrast) {
                o.prikazi();
            }
        }
    }

    static void prikaziOsobeUzrastaIzmedju(List<Osoba> osobe, int uzrastDonji, int uzrastGornji) {
        for (Osoba o : osobe) {
            if (o.getBrojGodina() >= uzrastDonji && o.getBrojGodina() <= uzrastGornji) {
                o.prikazi();
            }
        }
    }

    static void prikaziOsobeSaEmailomKojiSadrzi( List<Osoba> osobe, String deoEmailAdrese) {
        for (Osoba o : osobe) {
            if (o.getEmailAdresa().indexOf(deoEmailAdrese) >= 0) {
                o.prikazi();
            }
        }
    }

    static void prikaziOsobeZenskogPolaSaEmailomKojiSadrzi( List<Osoba> osobe, String deoEmailAdrese) {
        for (Osoba o : osobe) {
            if (o.getEmailAdresa().indexOf(deoEmailAdrese) >= 0
                    && o.getPol() == Osoba.Pol.ZENA) {
                o.prikazi();
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        prikaziOsobeStarijeOd(Osoba.LIKOVI_CRTANI, 50);
        System.out.println("---");
        prikaziOsobeStarijeOd(Osoba.LIKOVI_CRTANI, 80);
        System.out.println("---");
        prikaziOsobeUzrastaIzmedju(Osoba.LIKOVI_CRTANI, 80, 85);
        System.out.println("---");
        prikaziOsobeSaEmailomKojiSadrzi(Osoba.LIKOVI_CRTANI, "disney");
        System.out.println("---");
        prikaziOsobeZenskogPolaSaEmailomKojiSadrzi(Osoba.LIKOVI_CRTANI, "disney");
        System.out.println("---");
    }

}
