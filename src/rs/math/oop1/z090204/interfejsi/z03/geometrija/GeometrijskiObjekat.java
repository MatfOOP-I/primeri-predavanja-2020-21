package rs.math.oop1.z090204.interfejsi.z03.geometrija;

public abstract class GeometrijskiObjekat {
   public static int brojKreiranih = 0;

   {
      brojKreiranih++;
   }

   private String oznaka;

   public GeometrijskiObjekat(String oznaka) {

      this.oznaka = oznaka;
   }

   public String getOznaka() {
      return oznaka;
   }

   public void setOznaka(String oznaka) {
      this.oznaka = oznaka;
   }

}
