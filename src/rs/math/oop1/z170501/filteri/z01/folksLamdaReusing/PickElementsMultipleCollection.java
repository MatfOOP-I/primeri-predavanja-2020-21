package rs.math.oop1.z170501.filteri.z01.folksLamdaReusing;

import static rs.math.oop1.z170501.filteri.z01.folksLamdaReusing.Folks.*;

import java.util.function.Predicate;

public class PickElementsMultipleCollection
{
	public static void main( final String[] args )
	{
		{
			final long countFriendsStartN = friends.stream()
					.filter( ime -> ime.startsWith( "N" ) ).count();
					
			final long countEditorsStartN = editors.stream()
					.filter( ime -> ime.startsWith( "N" ) ).count();
					
			final long countComradesStartN = comrades.stream()
					.filter( ime -> ime.startsWith( "N" ) ).count();
					
			System.out.println( countFriendsStartN );
			System.out.println( countComradesStartN );
			System.out.println( countEditorsStartN );
		}
		
		{
			final Predicate<String> startsWithN = ime -> ime.startsWith( "N" );
			
			final long countFriendsStartN = friends.stream().filter( startsWithN )
					.count();
			final long countEditorsStartN = editors.stream().filter( startsWithN )
					.count();
			final long countComradesStartN = comrades.stream().filter( startsWithN )
					.count();
					
			System.out.println( countFriendsStartN );
			System.out.println( countComradesStartN );
			System.out.println( countEditorsStartN );
		}
	}
}
