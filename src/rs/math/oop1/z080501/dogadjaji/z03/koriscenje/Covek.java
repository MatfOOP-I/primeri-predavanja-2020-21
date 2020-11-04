package rs.math.oop1.z080501.dogadjaji.z03.koriscenje;

public abstract class Covek {
   private String ime;
   private int status = Status.SPAVANJE;

   public Covek(String ime, int status) {
      this.ime = ime;
      this.status = status;
   }

   public String getIme() {
      return ime;
   }

   public int getStatus() {
      return status;
   }

   public void setStatus(int status) {
      this.status = status;
   }

}
