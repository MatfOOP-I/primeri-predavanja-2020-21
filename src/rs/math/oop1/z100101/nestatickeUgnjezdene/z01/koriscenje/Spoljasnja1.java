package rs.math.oop1.z100101.nestatickeUgnjezdene.z01.koriscenje;

public class Spoljasnja1
{
	private int j = 42;
	
	public class Unutrasnja
	{
		private int i = 84;
		
		@Override
		public String toString()
		{
			return "Unutrasnja: " + "i = " + i + ", j=" + j;
		}
	}
	
}
