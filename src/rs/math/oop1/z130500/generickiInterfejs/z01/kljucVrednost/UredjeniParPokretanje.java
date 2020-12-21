package rs.math.oop1.z130500.generickiInterfejs.z01.kljucVrednost;

public class UredjeniParPokretanje {

	public static void main(String[] args) {
		Par<String, Integer> p1 = new UredjeniPar<String, Integer>("Paran", 8);
		System.out.println(p1);
		Par<String, String> p2 = new UredjeniPar<>("hello", "world");
		System.out.println(p2);
		UredjeniPar<String, Kutija<Integer>> op3 = new UredjeniPar<>("prosti", new Kutija<Integer>(2977));
		Par<String, Kutija<Integer>> p3 = op3;
		System.out.println(p3);
		Par<Par<Integer, Kutija<Double>>, Par<String, String>> p4 = new UredjeniPar<Par<Integer, Kutija<Double>>, Par<String, String>>(
				new UredjeniPar<Integer, Kutija<Double>>(2, new Kutija<>(3.5)),
				new UredjeniPar<String, String>("miki", "maus"));
		System.out.println(p4);
		Par<Par<Kutija<Integer>, String>, Par<Double, Kutija<String>>> p5 = new UredjeniPar<Par<Kutija<Integer>, String>, Par<Double, Kutija<String>>>(
				new UredjeniPar<>(new Kutija<>(3), "tri"), new UredjeniPar<>(2.5, new Kutija<>("baba")));
		System.out.println(p5);
	}

}
