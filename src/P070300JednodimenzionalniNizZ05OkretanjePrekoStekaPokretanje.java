/*

Написати Јава програм који омогућује да се секвенца реалних бројева
прикаже у обрнутом редоследу.

 */

// Програм илуструје реализацију стека  преко глобалних променљивих. 

class PokretanjeJednodimenzionalniNizOkretanjePrekoSteka {

   static double[] stek;
   static int vrhSteka;

   static void initStek(int dimenzija) {
      stek = new double[dimenzija];
      vrhSteka = -1;
   }

   static void push(double elem) {
      if (vrhSteka == stek.length - 1) {
         System.err.println("Greska PUSH: Stek double vrednosti je pun!");
         return;
      }
      stek[++vrhSteka] = elem;
   }

   static double pop() {
      if (vrhSteka == -1) {
         System.err.println("Greska POP: Stek double vrednosti je prazan!");
         return -1;
      }
      return stek[vrhSteka--];
   }

   static int brojElemenata() {
      return (vrhSteka + 1);
   }

   public static void main(String[] args) {
      String sekvenca = "13.4  7.4 6.3  3.2 8 42 33.2";
      System.out.printf("Sekvenca: %s", sekvenca);
      initStek(60);
      java.util.Scanner sc = new java.util.Scanner(sekvenca);
      while (sc.hasNext()) {
         double x = sc.nextDouble();
         push(x);
      }
      sc.close();
      System.out.println("\nObrnuta sekvenca");
      while (brojElemenata() > 0)
         System.out.printf("%10.4f", pop());
   }
}
