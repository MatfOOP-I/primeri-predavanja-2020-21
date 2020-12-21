package rs.math.oop1.z130500.generickiInterfejs.z04.minMax;

public class Util {

	static interface Par<K, V> {
		public K getKey();

		public V getValue();
	}

	static class UredjeniPar<K, V> implements Par<K, V> {
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

	// Generic static method
	public static <T extends Comparable> Par<T, T> minMax(T[] a) {
		if (a == null || a.length == 0)
			return new UredjeniPar(null, null);
		Par<T, T> najmNajv = new UredjeniPar<>(a[0], a[0]);
		for (int i = 1; i < a.length; i++)
			if (najmNajv.getKey().compareTo(a[i]) > 0)
				najmNajv = new UredjeniPar<>(a[i], najmNajv.getValue());
			else if (najmNajv.getValue().compareTo(a[i]) < 0)
				najmNajv = new UredjeniPar<>(najmNajv.getKey(), a[i]);
		return najmNajv;
	}
}