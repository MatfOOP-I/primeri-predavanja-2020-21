public class P050601MatematikaZ02MathSlucajnoPokretanje {


   public static void main(String[] args) {
      int brojPonavljanja = 1000;

      double sumaSlucajnih = 0;
      for (int i = 1; i <= brojPonavljanja; i++) {
         double slucajan = Math.random();
         sumaSlucajnih += slucajan;
         System.out.printf("%5d. Math.random(): %f%n", i, slucajan);
      }
      System.out.printf("Prosek slucajnih: %f%n%n", sumaSlucajnih / brojPonavljanja);

      int pocetak = 40;
      int kraj = 47;
      sumaSlucajnih = 0;
      for (int i = 1; i <= brojPonavljanja; i++) {
         int slucajan = slucajanCeoIzIntervala(pocetak, kraj);
         sumaSlucajnih += slucajan;
         System.out.printf("%d. slucajan iz [%d,%d]: %d%n", i, pocetak, kraj, slucajan);
      }
      System.out.printf("Prosek slucajnih: %f%n%n", sumaSlucajnih / brojPonavljanja);
   }

   static int slucajanCeoIzIntervala(int intervalOd, int intervalDo) {
      double slucajan = Math.random();
      return (int) (slucajan * (intervalDo - intervalOd) + intervalOd);
   }

}
