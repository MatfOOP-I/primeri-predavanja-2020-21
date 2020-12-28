package rs.math.oop1.z130501.strukturisanjePodataka.z02.listaObjekata;

public class PokretanjePovezanaLista
{
	public static void main( String[] args )
	{
		PovezanaLista ll = new PovezanaLista( "baba" );
		ll.dodajElemenat( "zaba" );
		ll.dodajElemenat(  1  );
		ll.dodajElemenat( Integer.valueOf( 2 ) );
		ll.dodajElemenat(  3  );
		ll.dodajElemenat( 4.5 );
		
		Object o = ll.getPrvi();
		while (o != null)
		{
			System.out.println( o );
			o = ll.getSledeci();
		} 
	}
	
}
