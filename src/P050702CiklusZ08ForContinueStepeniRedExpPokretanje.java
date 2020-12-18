/*

Написати Јава програм који за дато x приближно рачуна exp(x) 
коришћењем степеног реда. 

Приликом рачунања степеног реда, сабрати не више brojSabiraka
чланова степеног реда.

Ако је вредност сабирака мања од унапред задате вредности epsilon,
тада се тај сабирак не треба додати, али треба наставити са 
додавањем елемената у степени ред.

*/

// Задатак представља илустрацију коришћења необележене наредбе continue.

class PokretanjeForContinueStepeniRedExp {

   public static void main(String[] args) {
      double x = 1.00001;
      int brojSabiraka = 300;
      double epsilon = 1e-7;
      double suma = sumiraj(x, brojSabiraka, epsilon);
      System.out.println("Aproksimacija za exp(" + x + ")=" + suma);
   }

   private static double sumiraj(double x, int brojSabiraka, double epsilon) {
      double suma = 1;
      for (int n = 1;; n++) {
         double sabirak = stepenovanje(x, n) / fakt(n);
         if (n > brojSabiraka)
            break;
         if (sabirak < epsilon)
            continue;
         suma += sabirak;
      }
      return suma;
   }

   private static double fakt(int n) {
      double faktorijel = 1;
      for (int i = 1; i <= n; i++)
         faktorijel *= i;
      return faktorijel;
   }

   private static double stepenovanje(double x, int n) {
      double stepen = 1;
      for (int i = 1; i <= n; i++)
         stepen *= x;
      return stepen;
   }
}
