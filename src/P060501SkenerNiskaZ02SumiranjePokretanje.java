
class PokretanjeSkenerNiskaZ02Sumiranje {


   public static void main(String[] args) {
      String izvor = "paja-patak miki-maus 12-23 dusko-dugousko";
      java.util.Scanner parser = new java.util.Scanner(izvor);
      parser.useDelimiter("-");
      StringBuilder rez = new StringBuilder();
      while (parser.hasNext()) {
         String s = parser.next();
         rez.append(s);
         rez.append("|");
      }
      parser.close();
      System.out.printf("nalepljene reci niske \"%s\":\n%s\n\n", izvor, rez);

      izvor = " 11 2 3 4 -8 10";
      parser = new java.util.Scanner(izvor);
      parser.useRadix(16);
      int suma = 0;
      while (parser.hasNext()) {
         int i = parser.nextInt();
         suma += i;
      }
      parser.close();
      System.out.printf("suma celih brojeva niske%n \"%s\":%n%d%n%n", izvor, suma);

   }
}
