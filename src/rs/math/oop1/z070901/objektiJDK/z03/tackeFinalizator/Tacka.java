package rs.math.oop1.z070901.objektiJDK.z03.tackeFinalizator;

public class Tacka {
   private int x;
   private int y;
   private String oznaka;

   Tacka(int xKoord, int yKoord, String o) {
      x = xKoord;
      y = yKoord;
      oznaka = o;
   }

   Tacka(final Tacka t) {
      this(t.x, t.y, t.oznaka);
   }

   Tacka(String o) {
      this(0, 0, o);
   }

   Tacka() {
      this(0, 0, "O");
   }

   void setX(int xKoord) {
      x = xKoord;
   }

   void setY(int yKoord) {
      y = yKoord;
   }

   @Override
   public String toString(){
      return oznaka + ":(" + x + "," + y + ")";
   }

   void prikaziSe() {
      System.out.print(this);
   }

   double rastojanje(Tacka drugaTacka) {
      return Math.sqrt(Math.pow(x - drugaTacka.x, 2) + Math.pow(y - drugaTacka.y, 2));
   }

   @Override
   protected void finalize() {
      System.out.println("Recikliram " + oznaka + ":(" + x + "," + y + ")");
   }
}
