//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Jose pablo Ortega Grajeda, 14565
//Guillermo Javier de Leon Archila, 14022
//Edwin Fernando Coronado Roche, 14148

//Codigo base obtenido de: http://www.javabeat.net/binary-search-tree-traversal-java/ 
//El codigo fue modificado segun las necesidades del programa

public class Node {
	//clase nodo que para el arbol de busqueda binaria
	public Association<String,String> value;
	public Node left;
	public Node right;

	public Node(Association<String, String> value) {
	   this.value = value;
	}
}

