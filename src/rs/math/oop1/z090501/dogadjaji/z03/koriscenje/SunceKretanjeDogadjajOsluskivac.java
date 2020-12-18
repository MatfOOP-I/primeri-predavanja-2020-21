package rs.math.oop1.z090501.dogadjaji.z03.koriscenje;

import java.util.EventListener;

/**
 * ugovor izmedju izvora dogadjaja i objekata koji osluskuju
 */
public interface SunceKretanjeDogadjajOsluskivac extends EventListener {
   /**
    * Poyiva se kada bude ispaljen dogadjaj da je sunce izaslo/zaslo
    */
   public void sunceSePomerilo(SunceKretanjeDogadjaj e);
}

