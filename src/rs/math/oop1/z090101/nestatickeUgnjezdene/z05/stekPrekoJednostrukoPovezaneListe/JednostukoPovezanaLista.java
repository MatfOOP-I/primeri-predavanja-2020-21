package rs.math.oop1.z090101.nestatickeUgnjezdene.z05.stekPrekoJednostrukoPovezaneListe;

public class JednostukoPovezanaLista {

    private class ElemenatListe {
        private String sadrzaj;
        private ElemenatListe sledeci;

        public ElemenatListe(String elem) {
            sadrzaj = elem;
            sledeci = null;
        }

        public String getSadrzaj() {
            return sadrzaj;
        }

        public void setSadrzaj(String sadrzaj) {
            this.sadrzaj = sadrzaj;
        }

        public ElemenatListe getSledeci() {
            return sledeci;
        }

        public void setSledeci(ElemenatListe sledeci) {
            this.sledeci = sledeci;
        }
    }

    private ElemenatListe pocetak = null;
    private ElemenatListe kraj = null;

    public JednostukoPovezanaLista() {
    }
    
    public JednostukoPovezanaLista(String elem) {
        if (elem != null) {
            ElemenatListe el = new ElemenatListe(elem);
            kraj = pocetak = el;
        }
    }

    public void dodajElemenatNaKraj(String elem) {
        ElemenatListe noviKraj = new ElemenatListe(elem);
        if (pocetak == null)
            pocetak = kraj = noviKraj;
        else {
            kraj.setSledeci(noviKraj);
            kraj = noviKraj;
        }
    }

    public String ukloniElemenatSaKraja() {
        if (kraj == null)
            return null;
        if (pocetak == kraj) {
            ElemenatListe jedini = kraj;
            pocetak = kraj = null;
            return jedini.getSadrzaj();
        }
        ElemenatListe poslednji = kraj;
        ElemenatListe pretposlednji = pocetak;
        while (pretposlednji.getSledeci() != poslednji)
            pretposlednji = pretposlednji.getSledeci();
        pretposlednji.setSledeci(null);
        kraj = pretposlednji;
        return poslednji.getSadrzaj();
    }

    public void dodajElemenatNaPocetak(String elem) {
        ElemenatListe noviPocetak = new ElemenatListe(elem);
        if (kraj == null)
            pocetak = kraj = noviPocetak;
        else {
            noviPocetak.setSledeci(pocetak);
            pocetak = noviPocetak;
        }
    }

    public String ukloniElemenatSaPocetka() {
        if (pocetak == null)
            return null;
        if (pocetak == kraj) {
            ElemenatListe jedini = kraj;
            pocetak = kraj = null;
            return jedini.getSadrzaj();
        }
        ElemenatListe prvi = pocetak;
        pocetak = prvi.getSledeci();
        return prvi.getSadrzaj();
    }

    public int duzina() {
        int rez = 0;
        ElemenatListe tekuci = pocetak;
        while (tekuci != null) {
            rez++;
            tekuci = tekuci.getSledeci();
        }
        return rez;
    }
}
