//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Jose pablo Ortega Grajeda, 14565
//Guillermo Javier de Leon Archila, 14022
//Edwin Fernando Coronado Roche, 14148
 
//Codigo base obtenido de: http://www.javabeat.net/binary-search-tree-traversal-java/ 
//El codigo fue modificado segun las necesidades del programa, se implemento el metodo buscar que no 
//estaba presente en el codigo original.
public class BinaryTree {

  private Node root;
  

  //se crea un nodo con valor Association. si no existe rais este pasa a ser la rais
  public BinaryTree insert(Association<String, String> a) {
    Node node = new Node(a);

    if (root == null) {
      root = node;
      return this;
    }

    insertRec(root, node);
    return this;
  }
  
  public Node getRoot(){
	  return root;
  }

  //metodo auxiliar para crear el arbol en la forma de un BST
  private void insertRec(Node latestRoot, Node node) {
    if (latestRoot.value.getKey().compareTo(node.value.getKey()) > 0) { 

      if (latestRoot.left == null) {
        latestRoot.left = node;
        return;
      } else {
        insertRec(latestRoot.left, node);
      }
    } else {
      if (latestRoot.right == null) {
        latestRoot.right = node;
        return;
      } else {
        insertRec(latestRoot.right, node);
      }
    }
  }

  //se busca el string en la clave del valor de cada nodo, si no se encuentra regresa null
  public String busqueda(String k){
	  Node n = root;
	  while(n!=null){
		String key = n.value.getKey();
		if(key.equals(k)){
			return n.value.getValue();
		}
		else if(key.compareTo(k)>0){
			n = n.left;
		}
		else if(key.compareTo(k)<0){
			n = n.right;
		}
	  }
	  return null;
	  
  }
  
  //metodo para imprimir los datos en Inorder
  public void printInorder() {
    printInOrderRec(root);
    System.out.println("");
  }

  //metodo auxiliar para la impresión del Inorder
  private void printInOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }
    printInOrderRec(currRoot.left);
    System.out.print("(" + currRoot.value.getKey() + ", " + currRoot.value.getValue() + ") ");
    printInOrderRec(currRoot.right);
  }
}