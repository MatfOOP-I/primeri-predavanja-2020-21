/*

Јава класа која представља прeдмет.

Засад садржи само број предмета.

*/

package rs.math.oop1.z070502.prevazilazenje.z01.fakultet;

public class Predmet {

   public static final int BROJ_PREDMETA = 5;

   private static final String[] sifrePredmeta = new String[BROJ_PREDMETA];

   private static final String[] naziviPredmeta = new String[BROJ_PREDMETA];

   // staticki inicijalizacioni blok
   static {
      int i = 0;
      sifrePredmeta[i++] = "P1";
      sifrePredmeta[i++] = "P2";
      sifrePredmeta[i++] = "UOR";
      sifrePredmeta[i++] = "OOP";
      sifrePredmeta[i++] = "UVIT";
      i = 0;
      naziviPredmeta[i++] = "                   Programiranje 1";
      naziviPredmeta[i++] = "                   Programiranje 2";
      naziviPredmeta[i++] = "      Uvod u Organizaciju Racunara";
      naziviPredmeta[i++] = "Objektno Orjentisano Programiranje";
      naziviPredmeta[i++] = " Uvod u Veb i Internet Tehnologije";
   }

   public static String getSifraPredmeta(int predmet) {
      return sifrePredmeta[predmet];
   }

   public static String getNazivPredmeta(int predmet) {
      return naziviPredmeta[predmet];
   }
}
