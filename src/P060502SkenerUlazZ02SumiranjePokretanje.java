
class PokretanjeSkenerUlazZ02Sumiranje {


   public static void main(String[] args) {
      System.out.printf("Unesite brojeve, u novom redu <Ctrl>-Z ili <Ctrl>-D za kraj%n");
      java.util.Scanner skener = new java.util.Scanner(System.in);
      double suma = 0;
      while (skener.hasNext()) {
         double x = skener.nextDouble();
         suma += x;
      }
      skener.close();
      System.out.printf("suma brojeva: %f", suma);

   }
}
