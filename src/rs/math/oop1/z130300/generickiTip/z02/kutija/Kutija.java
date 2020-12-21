package rs.math.oop1.z130300.generickiTip.z02.kutija;

public class Kutija<T>
{
	private T uKutiji;
	
	public void set( T uKutiji )
	{
		this.uKutiji = uKutiji;
	}
	
	public T get()
	{
		return uKutiji;
	}
}