package rs.math.oop1.z170200.lambdaIzrazi.z02.osobePretragaPrikazGeneric;

import java.util.List;

public class OsobePretraga01AnonimnaGenerckaPokretanje {

    public static <T>  void prikazi(Iterable<T> prolazna, KriterijumPretrage<T> kriterijum) {
        for (T elem : prolazna) {
            if (kriterijum.proveri(elem)) {
                System.out.println(elem);
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrage<Osoba>() {
            public boolean proveri(Osoba o) {
                return o.getBrojGodina() >= 50;
            }
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrage<Osoba>() {
            public boolean proveri(Osoba o) {
                return o.getBrojGodina() >= 80;
            }
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrage<Osoba>() {
            public boolean proveri(Osoba o) {
                return o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85;
            }
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrage<Osoba>() {

            public boolean proveri(Osoba o) {
                return o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrage<Osoba>() {
            public boolean proveri(Osoba o) {
                return o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });
        System.out.println("---");
    }

}
