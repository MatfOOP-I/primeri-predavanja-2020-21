package rs.math.oop1.z080402.solid.z018.dobarDKlijentServerPrekoKonstruktora;

public class PokretanjeKlijentServer {

   public static void main(String[] args){
      Servis sB = new ServisB();
      Servis sC = new ServisC();
      Servis sD = new ServisD();

      Klijent kA = new KlijentA(sB);
      kA.uradiNesto();

      kA = new KlijentA(sC);
      kA.uradiNesto();

      kA = new KlijentA(sD);
      kA.uradiNesto();
   }

}
