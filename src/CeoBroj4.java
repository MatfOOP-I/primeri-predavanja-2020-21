/**
 * Програм (у виду конзолне апликације) за одређивање најмањег зајдничког
 * делиоца за три броја. Програм је реализован коришћењем објектно-орјентисане
 * парадигме. Програмски код је модуларно организован - реализовано je чување
 * Јава кода у различитим датотекама. Покретање програма је могуће само из
 * датотеке која у себи садржи методу main.
 */

class CeoBroj4 {
    // вредност датог целог броја
    int vrednostBroja;

    // конструктор
    CeoBroj4() {
    }

    // конструктор
    CeoBroj4(int vrednost) {

        vrednostBroja = vrednost;
    }

    // метод за приказ целог броја
    void prikaz() {
        System.out.print(vrednostBroja);
        System.out.println();
    }

    // одређивање НЗД датог броја и другог целог броја
    CeoBroj4 promeniZnak() {
        return new CeoBroj4(-vrednostBroja);
    }

    CeoBroj4 saberi(CeoBroj4 sabirak) {
        return new CeoBroj4(vrednostBroja + sabirak.vrednostBroja);
    }

    CeoBroj4 oduzmi(CeoBroj4 umanjilac) {
        return new CeoBroj4(vrednostBroja - umanjilac.vrednostBroja);
    }

    boolean jednak(CeoBroj4 drugi) {
        return vrednostBroja == drugi.vrednostBroja;
    }

    boolean manji(CeoBroj4 drugi) {
        return vrednostBroja < drugi.vrednostBroja;
    }

    boolean manjiIliJednak(CeoBroj4 drugi) {
        return manji(drugi) || jednak(drugi);
    }

    boolean veci(CeoBroj4 drugi) {
        return !manjiIliJednak(drugi);
    }

}

class PokretanjeCeoBroj2 {
    // улазна тачка програма
    public static void main(String[] args) {

        CeoBroj4 cb = new CeoBroj4();
        System.out.println(cb.vrednostBroja);

        // System.out.println("---");
        // int a = 1;
        // int b = 4_200_000;
        // int s = 0;
        // while (a <= b) {
        // s += a;
        // a++;
        // }
        // System.out.println(s);

        // System.out.println("---");

        // CeoBroj2 broj1 = new CeoBroj2(1);
        // CeoBroj2 aa = new CeoBroj2(1);
        // CeoBroj2 bb = new CeoBroj2(b);
        // CeoBroj2 ss = new CeoBroj2(0);
        // while (aa.manjiIliJednak(bb)) {
        // ss = ss.saberi(aa);
        // aa = aa.saberi(broj1);
        // }
        // ss.prikaz();

    }

}
