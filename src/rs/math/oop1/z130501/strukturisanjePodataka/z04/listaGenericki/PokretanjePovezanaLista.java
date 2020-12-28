package rs.math.oop1.z130501.strukturisanjePodataka.z04.listaGenericki;

public class PokretanjePovezanaLista
{
	
	public static void main( String[] args )
	{
		PovezanaLista<String> ll1 = new PovezanaLista<>( "baba" );
		ll1.addItem( "zaba" );
		PovezanaLista<Integer> ll2 = new PovezanaLista<>();
		ll2.addItem( 1 );
		ll2.addItem( 2 );
		ll2.addItem(3);

		System.out.println( ll2 );
		System.out.println("---");
		System.out.println( ll1 );
		System.out.println("---");}
	
}
