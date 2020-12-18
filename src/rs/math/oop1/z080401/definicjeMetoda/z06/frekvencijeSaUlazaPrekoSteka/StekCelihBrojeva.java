/*

Класа за реализацију стека који садржи ниске.

Стек се реализује преко низа. 

Стек може да расте по потреби.
 
 */

package rs.math.oop1.z080401.definicjeMetoda.z06.frekvencijeSaUlazaPrekoSteka;

import java.util.Arrays;

class StekCelihBrojeva {

   int[] elementi;
   int vrhSteka;

   void init() {
      elementi = new int[10];
      vrhSteka = -1;
   }

   void push(int elem) {
      if (vrhSteka == elementi.length - 1) {
         int[] temp = elementi;
         elementi = Arrays.copyOf(temp, 2 * temp.length);
      }
      elementi[++vrhSteka] = elem;
   }

   int pop() {
      if (vrhSteka == -1) {
         System.out.println("Greska POP: StekNiski je prazan!");
         return 0;
      }
      return elementi[vrhSteka--];
   }

   int brojElemenata() {
      return (vrhSteka + 1);
   }
}
