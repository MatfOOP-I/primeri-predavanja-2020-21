package rs.math.oop1.z080501.dogadjaji.z02.koriscenje;

public class NocnaFrajla extends Cvet implements SunceKretanjeDogadjajOsluskivac {
   @Override
   public void sunceSePomerilo(SunceKretanjeDogadjaj e) {
      if (e.isIzaslo())
         System.out.println("Nocna frajla je sakupila svoj cvet");
      if (e.isZaslo())
         System.out.println("Nocna frajla je rasirila svoj cvet");
   }
   
   @Override
   public String toString() {
      return String.format("Nocna frajla");
   }
}
