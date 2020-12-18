/*

Написати Јава програм који омогућује да се оформи низ дате димензије, 
да сви чланови низа добију унаред задату вредност 
и да се потом применом бројачког for циклуса прикажу вредности свих 
чланова низа. 

*/

// Програм илуструје алокацију низа, постављање вредности за елементе низа,
// очитавање вредности за елементе низа и колекцијску for петљу. 

class PokretanjeAlolkacijaJednodimenzionalnogNiza {
    public static void main(String[] args) {
        System.out.println("Unesite dimenziju niza i pocetnu vrednost");
        java.util.Scanner citac = new java.util.Scanner(System.in);
        int n = citac.nextInt();
        double x = citac.nextDouble();
        citac.close();

        // deklaracija i alokacija
        double[] niz = new double[n];
        // inicijalizacija
        for (int i = 0; i < niz.length; i++)
            niz[i] = x + 3 * i;
        System.out.println();

        // prikaz
        for (int i = 0; i < niz.length; i++)
            System.out.printf("%8.2f ", niz[i]);
        System.out.println();

        // prikaz 2
        for (double a : niz)
            System.out.printf("%8.2f ", a);
        System.out.println();

    }
}
