package src.UsefulClasses;

import java.util.*;

public class Dictionary<K, V> {

	List<K> key;
	List<V> value;

	public void add(K add1, V add2) {
		key.add(add1);
		value.add(add2);
	}

	public K getKey(int index) {
		return key.get(index);
	}

	public V getValue(int index) {
		return value.get(index);
	}

	public Dictionary() {
		key = new LinkedList<>();
		value = new LinkedList<>();
	}

	public void setKey(int index, K keyInput) {
		key.set(index, keyInput);
	}

	public void setValue(int index, V valueInput) {
		value.set(index, valueInput);
	}

	public void remove(int index) {
		key.remove(index);
		value.remove(index);
	}
}
