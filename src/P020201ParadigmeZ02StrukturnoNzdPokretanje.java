/**
 * Програм (у виду конзолне апликације) за одређивање најмањег зајдничког делиоца за три броја.
 * Програмски код је организован сагласно концепту структурног програмирања.
 **/

class PokretanjeStrukturnoNzd {

    // одређивање НЗД за два броја
    static int NZD(int prvi, int drugi) {
        while (true)
            if (prvi > drugi)
                // први је већи
                if (prvi % drugi == 0)
                    return drugi;
                else
                    prvi %= drugi;
            else
                // први је мањи или једнак
                if (drugi % prvi == 0)
                    return prvi;
                else
                    drugi %= prvi;
    }

    // одређивање НЗД за три броја
    static int NZD(int prvi, int drugi, int treci) {

        return NZD(NZD(prvi, drugi), treci);
    }

    // улазна тачка програма
    public static void main(String[] args) {
        // бројеви чији се НЗД тражи
        int prviBroj = 48;
        int drugiBroj = 120;
        int treciBroj = 56;

        // приказ бројева чији се НЗД тражи
        System.out.println("Први број је " + prviBroj);
        System.out.println("Други број је " + drugiBroj);
        System.out.println("Трећи број је " + treciBroj);

        // одређивање НЗД за ова три броја
        int nzd = NZD(prviBroj, drugiBroj, treciBroj);

        // приказ резултата
        System.out.println("НЗД ова три броја је " + nzd);
    }

}
