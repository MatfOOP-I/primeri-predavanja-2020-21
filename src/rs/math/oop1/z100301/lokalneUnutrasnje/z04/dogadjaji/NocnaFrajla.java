package rs.math.oop1.z100301.lokalneUnutrasnje.z04.dogadjaji;

import rs.math.oop1.z090501.dogadjaji.z03.koriscenje.Cvet;

public class NocnaFrajla extends Cvet  {
   @Override
   public String toString() {
      return String.format("Noćna frajla{%x}", this.hashCode()) ;
   }
}
