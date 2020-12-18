/*
  
Написати Јава програм који омогућује да се две секвенце реалних бројева
и једна секвенца ниски прикажу у обрнутом редоследу, и то тако
да се прво прикаже прво обрнута прва, па обрнута трећа и на крају обрнута
друга секвенце.

Структуре за стек целих и реалних бројева, које се користе у решењу, су 
издвојене у посебну класу.
 
 */

// Програм илуструје реализацију стека. Стек не може да расте.
// Стекови за разне типове података су реализовани као одвојене класе.

package rs.math.oop1.z080401.definicjeMetoda.z01stekPrekoNizaFiksan;

import java.util.Scanner;

public class PokretanjeOkretanjeStek {

   public static void main(String[] args) {
      String sekvenca1 = "107 13.4 7.4 6.3  3.2  4  51  6.2  4.7  3  14.5 10 -7.6";
      String sekvenca2 = "-3.4 -0.4 -3.3 83.2 -4";
      String sekvenca3 = "jedan 2 tri 4 pet";
      
      System.out.println("Sekvence");
      System.out.printf("%s", sekvenca1);
      System.out.println();
      System.out.printf("%s", sekvenca2);
      System.out.println();
      System.out.printf("%s", sekvenca3);
 
      StekRealnihBrojeva stek1 = new StekRealnihBrojeva();
      stek1.init(10);
      Scanner ulaz = new Scanner(sekvenca1);
      while (ulaz.hasNext())
         stek1.push(ulaz.nextDouble());
      ulaz.close();

      StekRealnihBrojeva stek2 = new StekRealnihBrojeva();
      stek2.init(300);
      ulaz = new Scanner(sekvenca2);
      while (ulaz.hasNext())
         stek2.push(ulaz.nextDouble());
      ulaz.close();

      StekNiski stek3 = new StekNiski();
      stek3.init(50);
      ulaz = new Scanner(sekvenca3);
      while (ulaz.hasNext())
         stek3.push(ulaz.next());
      ulaz.close();

      System.out.println("%nObrnute sekvence");
      while (stek1.brojElemenata() > 0)
         System.out.printf("%10.4f", stek1.pop());
      System.out.println("---");
      while (stek3.brojElemenata() > 0)
         System.out.printf("%s\t", stek3.pop());
      System.out.println("---");
      while (stek2.brojElemenata() > 0)
         System.out.printf("%10.4f", stek2.pop());
      System.out.println("---");
   }
}
