package rs.math.oop1.z100201.unutrasnje.z02.dogadjaji;

import rs.math.oop1.z090501.dogadjaji.z03.koriscenje.Cvet;

public class NocnaFrajla extends Cvet  {
   @Override
   public String toString() {
      return String.format("Noćna frajla{%x}", this.hashCode()) ;
   }
}
