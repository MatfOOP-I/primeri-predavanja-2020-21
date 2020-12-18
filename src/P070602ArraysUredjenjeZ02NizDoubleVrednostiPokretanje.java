
class PokretanjeArraysUredjenjeNizDoubleVrednosti {

    public static void main(String[] args) {
        double[] niz = {23.5, -7.6, 5.0, 6, 4, 34.34, -23, -3.0/1.0};
        for (double x : niz)
            System.out.print(x + " ");
        System.out.println();

        java.util.Arrays.sort(niz);

        for (double x : niz)
            System.out.print(x + " ");
        System.out.println();

    }

}
