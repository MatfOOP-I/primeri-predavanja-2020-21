
class P050402ObjektniTipoviZ02CeoBrojMutabilni {
    // вредност датог целог броја
    int vrednostBroja;

    // конструктор
    P050402ObjektniTipoviZ02CeoBrojMutabilni(int vrednost) {

        vrednostBroja = vrednost;
    }

    // метод за приказ целог броја
    void prikaz() {
        System.out.print(vrednostBroja);
        System.out.println();
    }

    // одређивање НЗД датог броја и другог целог броја
    void promeniZnak() {
        vrednostBroja = -vrednostBroja;
    }

    void uvecajSeZa(P050402ObjektniTipoviZ02CeoBrojMutabilni sabirak) {
        vrednostBroja += sabirak.vrednostBroja;
    }

    void umanjiSeZa(P050402ObjektniTipoviZ02CeoBrojMutabilni umanjilac) {
        vrednostBroja -= umanjilac.vrednostBroja;
    }

    boolean manjiOd(P050402ObjektniTipoviZ02CeoBrojMutabilni drugi) {
        return vrednostBroja < drugi.vrednostBroja;
    }

    boolean jednakSa(P050402ObjektniTipoviZ02CeoBrojMutabilni drugi) {
        return vrednostBroja == drugi.vrednostBroja;
    }

    boolean manjiIliJednakOd(P050402ObjektniTipoviZ02CeoBrojMutabilni drugi) {
        return manjiOd(drugi) || jednakSa(drugi);
    }

}

class PokretanjeCeoBroj3 {
    // улазна тачка програма
    public static void main(String[] args) {

        P050402ObjektniTipoviZ02CeoBrojMutabilni jedan = new P050402ObjektniTipoviZ02CeoBrojMutabilni(1);
        P050402ObjektniTipoviZ02CeoBrojMutabilni i = new P050402ObjektniTipoviZ02CeoBrojMutabilni(1);
        P050402ObjektniTipoviZ02CeoBrojMutabilni n = new P050402ObjektniTipoviZ02CeoBrojMutabilni(1000);
        P050402ObjektniTipoviZ02CeoBrojMutabilni suma = new P050402ObjektniTipoviZ02CeoBrojMutabilni(0);
        while (i.manjiIliJednakOd(n)) {
            suma.uvecajSeZa(i);
            i.uvecajSeZa(jedan);
        }
        suma.prikaz();

    }

}
