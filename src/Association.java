//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Jose pablo Ortega Grajeda, 14565
//Guillermo Javier de Leon Archila, 14022
//Edwin Fernando Coronado Roche, 14148

import java.util.*;

public class Association<K, V> implements Map.Entry<K, V> {
	
	private K key;
	private V value;
	
	public Association(K key, V value){
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
	public V setValue(V value) {
		return value;
	}

}
