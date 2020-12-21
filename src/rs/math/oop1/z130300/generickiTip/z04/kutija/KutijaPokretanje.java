package rs.math.oop1.z130300.generickiTip.z04.kutija;

public class KutijaPokretanje {

	public static void main(String[] args) {
		Kutija<String> b0 = new Kutija<>("mika");
		System.out.println(b0);
		b0.set("pera");
		System.out.println(b0);

		Kutija<Kutija<String>> b1 = new Kutija<Kutija<String>>(new Kutija<>("alibaba"));
		System.out.println(b1);

		b1.set(new Kutija<>("aladin"));
		System.out.println(b1);
		b1.get().set("sinbad");
		System.out.println(b1);
	}

}
