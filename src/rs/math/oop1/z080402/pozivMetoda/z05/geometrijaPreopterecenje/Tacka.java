package rs.math.oop1.z080402.pozivMetoda.z05.geometrijaPreopterecenje;

import java.io.PrintStream;

class Tacka {
   double x;
   double y;
   String oznaka;

   void init(String o, double xKoord, double yKoord) {
      oznaka = o;
      x = xKoord;
      y = yKoord;
   }

   void prikaziSe() {
      System.out.print(oznaka + "(" + x + "," + y + ")");
   }

   void prikaziSe(boolean bezOznake) {
      if (!bezOznake)
         System.out.print(oznaka + "(" + x + "," + y + ")");
      else
         System.out.print("(" + x + "," + y + ")");
   }

   void prikaziSe(PrintStream tok, boolean bezOznake) {
      if (!bezOznake)
         tok.print(oznaka + "(" + x + "," + y + ")");
      else
         tok.print("(" + x + "," + y + ")");
   }

}
