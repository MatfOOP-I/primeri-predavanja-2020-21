package rs.math.oop1.z080402.pozivMetoda.z05.geometrijaPreopterecenje;

class Duz {
   String oznaka;
   Tacka a;
   Tacka b;

   void initNeValja(String o, Tacka a, Tacka b) {
      oznaka = o;
      this.a = a;
      this.b = b;
   }

   void init(String o, Tacka a, Tacka b) {
      oznaka = o;
      this.a = new Tacka();
      this.a.init(a.oznaka, a.x, a.y);
      this.b = new Tacka();
      this.b.init(b.oznaka, b.x, b.y);
   }

   void prikaziSe() {
      System.out.print(oznaka + ":[");
      a.prikaziSe(false);
      System.out.print(";");
      b.prikaziSe(false);
      System.out.print("]");
   }

}
