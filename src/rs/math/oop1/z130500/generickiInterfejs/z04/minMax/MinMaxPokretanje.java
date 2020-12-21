package rs.math.oop1.z130500.generickiInterfejs.z04.minMax;

class Zaposleni implements Comparable<Zaposleni> {
    private String imePrezime;
    private double plata;

    public Zaposleni(String n, double s) {
        imePrezime = n;
        plata = s;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public double getPlata() {
        return plata;
    }

    public void povecajPlatu(double zaProcenat) {
        double iznosPovisice = plata * zaProcenat / 100;
        plata += iznosPovisice;
    }

    @Override
    public String toString() {
        return "Zaposleni: imePrezime=" + imePrezime + ",plata=" + plata;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Zaposleni e = (Zaposleni) o;
        return imePrezime.equals(e.imePrezime) && plata == e.plata;
    }

    @Override
    public int hashCode() {
        return 3 * imePrezime.hashCode() + 7 * (Double.valueOf(plata)).hashCode();
    }

    @Override
    public int compareTo(Zaposleni e) {
        if (plata > e.plata)
            return -1;
        if (plata < e.plata)
            return 1;
        return -1;
    }
}

public class MinMaxPokretanje {

    public static void main(String args[]){
        Integer[] niz1 = { 1, -7, -3, 5, 12};
        Util.Par<Integer, Integer> rez1 = Util.minMax(niz1);
        System.out.println(rez1);

        Double[] niz2 = { 145.2, -7.3, -3.0, 512.0, 12.0};
        Util.Par<Double, Double> rez2 = Util.minMax(niz2);
        System.out.println(rez2);

        Zaposleni[] osoblje = new Zaposleni[4];
        osoblje[0] = new Zaposleni("Marko Markovic", 38000);
        osoblje[1] = new Zaposleni("Janko Jankovic", 75000);
        osoblje[2] = new Zaposleni("Tony Tester", 38000);
        osoblje[3] = new Zaposleni("Milena Milenkovic", 18000);
        Util.Par<Zaposleni, Zaposleni> rez3 = Util.minMax(osoblje);
        System.out.println(rez3);

    }
    
}
