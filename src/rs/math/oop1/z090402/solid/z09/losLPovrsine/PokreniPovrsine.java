package rs.math.oop1.z090402.solid.z09.losLPovrsine;

import static java.lang.System.out;
import static java.lang.System.err;

public class PokreniPovrsine {

   public static void povrsinaProvera(Pravougaonik p) {
      p.setSirina(3);
      p.setVisina(2);
      double povrsina = p.povrsina();
      if( povrsina == 6 )
         out.printf("Sve OK! Izracunata povrsina je %f%n", povrsina);
      else
         err.printf("Problem! Izracunata povrsina je %f, treba da bude %f%n", povrsina, 6.0);
   }

   public static void main(String[] argumenti){
      Pravougaonik p = new Pravougaonik();
      povrsinaProvera(p);
      Kvadrat k = new Kvadrat();
      povrsinaProvera(k);
   }
}
