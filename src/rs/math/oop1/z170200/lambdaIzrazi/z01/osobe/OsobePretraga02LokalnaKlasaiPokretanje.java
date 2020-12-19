package rs.math.oop1.z170200.lambdaIzrazi.z01.osobe;

import java.util.List;

interface KriterijumPretrage {
    boolean proveri(Osoba osoba);
}

public class OsobePretraga02LokalnaKlasaiPokretanje {

    public static void prikazi(List<Osoba> osobe, KriterijumPretrage kriterijum) {
        for (Osoba o : osobe) {
            if (kriterijum.proveri(o)) {
                o.prikazi();
            }
        }
    }

    static class ProveriOsobaStarijeOd implements KriterijumPretrage {
        private int god;

        ProveriOsobaStarijeOd(int god) {
            this.god = god;
        }

        public boolean proveri(Osoba o) {
            return o.getBrojGodina() >= god;
        }
    }

    static class ProveriOsobaUzrastaIzmedju implements KriterijumPretrage {
        private int godOd, godDo;

        ProveriOsobaUzrastaIzmedju(int godOd, int godDo) {
            this.godOd = godOd;
            this.godDo = godDo;
        }

        public boolean proveri(Osoba o) {
            return o.getBrojGodina() >= godOd && o.getBrojGodina() <= godDo;
        }
    }

    static void prikaziOsobeUzrastaIzmedju(List<Osoba> osobe, int uzrastDonji, int uzrastGornji) {
        for (Osoba o : osobe) {
            if (o.getBrojGodina() >= uzrastDonji && o.getBrojGodina() <= uzrastGornji) {
                o.prikazi();
            }
        }
    }

    static class ProveriOsobaEmailAdresaSadrzi implements KriterijumPretrage {
        private String deoEmail;

        ProveriOsobaEmailAdresaSadrzi(String deoEmail) {
            this.deoEmail = deoEmail;
        }

        public boolean proveri(Osoba o) {
            return o.getEmailAdresa().indexOf(deoEmail) >= 0;
        }
    }

    static class ProveriOsobaDatogPolaSaEmailAdresomKojaSadrzi implements KriterijumPretrage {
        private Osoba.Pol pol;
        private String deoEmail;

        ProveriOsobaDatogPolaSaEmailAdresomKojaSadrzi(Osoba.Pol pol, String deoEmail) {
            this.pol = pol;
            this.deoEmail = deoEmail;
        }

        public boolean proveri(Osoba o) {
            return o.getPol() == pol && o.getEmailAdresa().indexOf(deoEmail) >= 0;
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new OsobePretraga02LokalnaKlasaiPokretanje.ProveriOsobaStarijeOd(50));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new OsobePretraga02LokalnaKlasaiPokretanje.ProveriOsobaStarijeOd(80));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new OsobePretraga02LokalnaKlasaiPokretanje.ProveriOsobaUzrastaIzmedju(80, 85));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI,
                new OsobePretraga02LokalnaKlasaiPokretanje.ProveriOsobaEmailAdresaSadrzi("disney"));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI,
                new OsobePretraga02LokalnaKlasaiPokretanje.ProveriOsobaDatogPolaSaEmailAdresomKojaSadrzi(Osoba.Pol.ZENA,
                        "disney"));
        System.out.println("---");
    }

}
