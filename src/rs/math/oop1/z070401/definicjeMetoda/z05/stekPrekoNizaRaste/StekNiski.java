/*

Класа за реализацију стека који садржи ниске.

Стек се реализује преко низа. 

Стек може да расте по потреби.
 
 */

package rs.math.oop1.z070401.definicjeMetoda.z05.stekPrekoNizaRaste;

import java.util.Arrays;

class StekNiski {

   String[] elementi;
   int vrhSteka;

   void init() {
      elementi = new String[3];
      vrhSteka = -1;
   }

   void push(String elem) {
      if (vrhSteka == elementi.length - 1) {
         String[] temp = elementi;
         elementi = Arrays.copyOf(temp, 2 * temp.length);
      }
      elementi[++vrhSteka] = elem;
   }

   String pop() {
      if (vrhSteka == -1) {
         System.out.println("Greska POP: StekNiski je prazan!");
         return "<nema>";
      }
      return elementi[vrhSteka--];
   }

   int brojElemenata() {
      return (vrhSteka + 1);
   }
}
