
class PokretanjeSkenerNiskaZ01Sumiranje {

   public static void main(String[] args) {
      String izvor = "paja patak \n miki\tmaus 12 23\n dusko dugousko";
      java.util.Scanner parser = new java.util.Scanner(izvor);
      StringBuilder rez = new StringBuilder();
      while (parser.hasNext()) {
         String s = parser.next();
         rez.append(s);
         rez.append("|");
      }
      parser.close();
      System.out.printf("nalepljene reci niske %n \"%s\":%n%s%n%n", izvor, rez);

      izvor = " 1 2 3 4 -3 -8 10";
      parser = new java.util.Scanner(izvor);
      int suma = 0;
      while (parser.hasNext()) {
         int i = parser.nextInt();
         suma += i;
      }
      parser.close();
      System.out.printf("suma celih brojeva niske%n \"%s\":%n%d%n%n", izvor, suma);

      izvor = "1 2 3.5 4.3 -3e1";
      parser = new java.util.Scanner(izvor);
      double suma1 = 0;
      while (parser.hasNext()) {
         double x = parser.nextDouble();
         suma1 += x;
      }
      parser.close();
      System.out.printf("suma brojeva niske \"%s\":%n%f%n%n", izvor, suma1);

   }
}
