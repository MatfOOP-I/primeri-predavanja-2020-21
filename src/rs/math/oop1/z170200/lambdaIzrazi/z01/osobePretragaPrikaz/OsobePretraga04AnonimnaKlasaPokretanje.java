package rs.math.oop1.z170200.lambdaIzrazi.z01.osobePretragaPrikaz;

import java.util.List;

public class OsobePretraga04AnonimnaKlasaPokretanje {

    public static void prikazi(List<Osoba> osobe, KriterijumPretrageOsoba kriterijum) {
        for (Osoba o : osobe) {
            if (kriterijum.proveri(o)) {
                o.prikazi();
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrageOsoba() {
            public boolean proveri(Osoba o) {
                return o.getBrojGodina() >= 50;
            }
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrageOsoba() {
            public boolean proveri(Osoba o) {
                return o.getBrojGodina() >= 80;
            }
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrageOsoba() {
            public boolean proveri(Osoba o) {
                return o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85;
            }
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrageOsoba() {

            public boolean proveri(Osoba o) {
                return o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });

        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrageOsoba() {
            public boolean proveri(Osoba o) {
                return o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });
        System.out.println("---");
    }

}
