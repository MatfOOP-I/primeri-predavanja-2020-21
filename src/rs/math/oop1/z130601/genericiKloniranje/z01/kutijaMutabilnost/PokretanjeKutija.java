package rs.math.oop1.z130601.genericiKloniranje.z01.kutijaMutabilnost;

public class PokretanjeKutija
{
	
	
	public static void main( String[] args )
	{
		Student pera = new Student("Petar", "Petrovic");
		Kutija<Student> kutija = new Kutija<>(pera);
		System.out.println( kutija );
		pera.setIme( "Mitar" );
		System.out.println( kutija );

		Kutija<Student> kutija2 = new Kutija<>(pera);
		kutija2.get().setIme( "Žika" );
		System.out.println( kutija + ", " + kutija2);
		
		
	}
	
}
