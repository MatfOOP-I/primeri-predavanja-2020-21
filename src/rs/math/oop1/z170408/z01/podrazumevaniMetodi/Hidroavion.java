package rs.math.oop1.z170408.z01.podrazumevaniMetodi;

public class Hidroavion extends Vozilo implements BrzoLetenje, Plovidba {
    
    private int visina = 0;

    public void setVisina(int visina) {
        this.visina = visina;
    }

    // ...
    public void krstarenje() {
        System.out.print("Hidroavion::krstarenje trenutno ima sledeci oblik : ");
        if (visina > 0)
            BrzoLetenje.super.krstarenje();
        else
            Plovidba.super.krstarenje();
    }
}
