class PokretanjeNiz {
  
   // улазна тачка програма
   public static void main(String[] argumenti) {
      
      String[] niske = new String[40];
      niske[2] = "miki";
      niske[3] = "maus";
      
      byte celiBrojevi[] = new byte[10];
      celiBrojevi[2] = 45;

      String s = "mika";
      String godisnjeDoba[] = { "prolece", "jesen", s+" mis", "zima" };
      System.out.println(godisnjeDoba);

      int[] niz = {24, 48, 96, 192, 36, 72, 144,
            (int) (Math.random() * 10) };
      System.out.println(niz);
   }
}
