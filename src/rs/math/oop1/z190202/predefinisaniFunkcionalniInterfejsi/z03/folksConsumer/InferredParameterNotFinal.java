package rs.math.oop1.z190202.predefinisaniFunkcionalniInterfejsi.z03.folksConsumer;

public class InferredParameterNotFinal
{
	public static void main( final String[] args )
	{
		Folks.friends.forEach(ime -> {
			ime = ime.toUpperCase().concat( " " + ime );
			System.out.println( ime );
		} );
	}
}
