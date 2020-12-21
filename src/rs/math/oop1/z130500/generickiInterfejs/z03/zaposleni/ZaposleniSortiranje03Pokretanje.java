package rs.math.oop1.z130500.generickiInterfejs.z03.zaposleni;

import rs.math.oop1.z100401.anonimneUnutrasnje.z02.zaposleniSortiranje.Zaposleni;

import java.util.Arrays;
import java.util.Comparator;

public class ZaposleniSortiranje03Pokretanje {
    public static void main(String[] args) {
        Zaposleni[] osoblje = new Zaposleni[4];

        osoblje[0] = new Zaposleni("Marko Markovic", 38000);
        osoblje[1] = new Zaposleni("Janko Jankovic", 75000);
        osoblje[2] = new Zaposleni("Tony Tester", 38000);
        osoblje[3] = new Zaposleni("Milena Milenkovic", 18000);

        System.out.println("-Pre sortiranja-");
        for (Zaposleni e : osoblje)
            System.out.println(e);

        Comparator<Zaposleni> poImenu = new Comparator<Zaposleni>() {
            @Override
            public int compare(Zaposleni e1, Zaposleni e2) {
                return e1.getIme().compareTo(e2.getIme());
            }
        };
        System.out.println("-Po imenu-");
        Arrays.sort(osoblje, poImenu);
        for (Zaposleni e : osoblje)
            System.out.println(e);

        System.out.println("-Po imenu obratno-");
        Arrays.sort(osoblje, poImenu.reversed());
        for (Zaposleni e : osoblje)
            System.out.println(e);

        Comparator<Zaposleni> poPlati = new Comparator<Zaposleni>() {
            @Override
            public int compare(Zaposleni o1, Zaposleni o2) {
                if (o1.getPlata() > o2.getPlata())
                    return -1;
                if (o1.getPlata() < o2.getPlata())
                    return 1;
                return 0;
            }
        };
        System.out.println("-Po plati-");
        Arrays.sort(osoblje, poPlati);
        for (Zaposleni e : osoblje)
            System.out.println(e);

        System.out.println("-Po plati, pa po imenu obratno-");
        Arrays.sort(osoblje, poPlati.thenComparing(poImenu.reversed()));
        for (Zaposleni e : osoblje)
            System.out.println(e);
    
    }
}
