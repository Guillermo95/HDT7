import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryTreeTest {

	@Test
	public void testInsert() {
		BinaryTree arbol = new BinaryTree();
		Association<String, String> n = new Association<String, String>("hello", "hola");
		arbol.insert(n);
		if (!arbol.getRoot().value.getKey().equals("hello"))
			fail();
	}

	@Test
	public void testBusqueda() {
		BinaryTree arbol = new BinaryTree();
		Association<String, String> n = new Association<String, String>("hello", "hola");
		Association<String, String> n1 = new Association<String, String>("perro", "dog");
		Association<String, String> n2 = new Association<String, String>("cat", "gato");
		Association<String, String> n3 = new Association<String, String>("blue", "azul");
		Association<String, String> n4 = new Association<String, String>("table", "mesa");
		Association<String, String> n5 = new Association<String, String>("pencil", "lapiz");
		arbol.insert(n);
		if (arbol.busqueda("table")==null)
			fail();
	}

}
