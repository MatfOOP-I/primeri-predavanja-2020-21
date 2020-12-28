/**
 * Програм (у виду конзолне апликације) за одређивање најмањег зајдничког
 * делиоца за три броја. Програм је реализован коришћењем објектно-орјентисане
 * парадигме. Програмски код је модуларно организован - реализовано je чување
 * Јава кода у различитим датотекама. Покретање програма је могуће само из
 * датотеке која у себи садржи методу main.
 */

class P050402ObjektniTipoviZ03CeoBrojImutabilni {
    // вредност датог целог броја
    int vrednostBroja;

    // конструктор
    P050402ObjektniTipoviZ03CeoBrojImutabilni() {
    }

    // конструктор
    P050402ObjektniTipoviZ03CeoBrojImutabilni(int vrednost) {

        vrednostBroja = vrednost;
    }

    // метод за приказ целог броја
    void prikaz() {
        System.out.print(vrednostBroja);
        System.out.println();
    }

    // одређивање НЗД датог броја и другог целог броја
    P050402ObjektniTipoviZ03CeoBrojImutabilni promeniZnak() {
        return new P050402ObjektniTipoviZ03CeoBrojImutabilni(-vrednostBroja);
    }

    P050402ObjektniTipoviZ03CeoBrojImutabilni saberi(P050402ObjektniTipoviZ03CeoBrojImutabilni sabirak) {
        return new P050402ObjektniTipoviZ03CeoBrojImutabilni(vrednostBroja + sabirak.vrednostBroja);
    }

    P050402ObjektniTipoviZ03CeoBrojImutabilni oduzmi(P050402ObjektniTipoviZ03CeoBrojImutabilni umanjilac) {
        return new P050402ObjektniTipoviZ03CeoBrojImutabilni(vrednostBroja - umanjilac.vrednostBroja);
    }

    boolean jednak(P050402ObjektniTipoviZ03CeoBrojImutabilni drugi) {
        return vrednostBroja == drugi.vrednostBroja;
    }

    boolean manji(P050402ObjektniTipoviZ03CeoBrojImutabilni drugi) {
        return vrednostBroja < drugi.vrednostBroja;
    }

    boolean manjiIliJednak(P050402ObjektniTipoviZ03CeoBrojImutabilni drugi) {
        return manji(drugi) || jednak(drugi);
    }

    boolean veci(P050402ObjektniTipoviZ03CeoBrojImutabilni drugi) {
        return !manjiIliJednak(drugi);
    }

}

class PokretanjeCeoBroj2 {
    // улазна тачка програма
    public static void main(String[] args) {

        P050402ObjektniTipoviZ03CeoBrojImutabilni cb = new P050402ObjektniTipoviZ03CeoBrojImutabilni();
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
