package rs.math.oop1.z090402.solid.z06.dobarOPovrsine;

import static java.lang.Math.PI;

public class Krug implements Mera {
   private double poluprecnik;

   public Krug(double poluprecnik) {
      this.poluprecnik = poluprecnik;
   }

   public double getPoluprecnik() {
      return poluprecnik;
   }

   @Override
   public double povrsina() {
      return PI * poluprecnik * poluprecnik;
   }
}
