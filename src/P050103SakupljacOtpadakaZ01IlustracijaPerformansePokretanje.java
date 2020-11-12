class PokretanjeSakupljacOtpadaka {

    public static void main(String[] komandnaLinija) {
        int n = 1_000;
        long vremePocetka = System.nanoTime();
        double s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                CeoBroj4 o = new CeoBroj4(5);
                s++;
            }
        }
        long trajanje = System.nanoTime() - vremePocetka;
        System.out.println("------");
        System.out.println("Argument: " + n);
        System.out.println("Rezultat: " + s);
        System.out.println("Trajanje racunanja (s): " + trajanje / 1e9);

        vremePocetka = System.nanoTime();
        s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                CeoBroj4 o = new CeoBroj4(5);
                s++;
            }
            System.gc();
        }
        trajanje = System.nanoTime() - vremePocetka;
        System.out.println("------");
        System.out.println("Argument: " + n);
        System.out.println("Rezultat: " + s);
        System.out.println("Trajanje racunanja (s): " + trajanje / 1e9);
    }

}
