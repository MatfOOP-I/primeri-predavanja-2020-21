package rs.math.oop1.z130500.generickiInterfejs.z01.kljucVrednost;

public class UredjeniPar<K, V> implements Par<K, V> {
	private K key;
	private V value;

	public UredjeniPar(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "(" + getKey() + "," + getValue() + ")";
	}
}