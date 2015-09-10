//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Jose pablo Ortega Grajeda, 14565
//Guillermo Javier de Leon Archila, 14022
//Driver: clase para interaccion con el usuario

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Driver {

	public static void main(String[] arsgs) {
		BufferedReader reader;
		String linea = "";
		int cantLineas = 0;
		int contador = 0;
		BinaryTree dicc = new BinaryTree();
		try {//revisa la cantidad de líneas que hay en el archivo
			reader = new BufferedReader(new FileReader("diccionario.txt"));
			while (reader.readLine() != null) cantLineas++;
			reader.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		String[] lineas = new String [cantLineas];//se instancia un arreglo donde se guardará cada línea del archivo
		try {
			reader = new BufferedReader(new FileReader("diccionario.txt"));
			while((linea = reader.readLine()) != null)
			{
			    lineas[contador] = linea;//se guarda cada línea del archivo
			    contador++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] parte;
		Association<String, String>[] palabras = new Association[cantLineas];//se instancia un arreglo de asociaciones para guardar las palabras
		for(int i = 0; i < cantLineas; i++){
			parte = lineas[i].split(",");//se separa la palabra donde se encuentre la coma
			parte[0] = parte[0].substring(1);//se obtiene la primera palabra
			parte[1] = parte[1].substring(1, parte[1].length()-1);//se obtiene la segunda palabra
			palabras[i] = new Association<String, String>(parte[0], parte[1]);//se colocan en el arreglo
		}
		
		for(int i = 0; i<cantLineas; i++){
			dicc.insert(palabras[i]);
		}
		
		dicc.printInorder();
		
		
		try {
			reader = new BufferedReader(new FileReader("texto.txt"));
			linea = reader.readLine();//se lee la línea del archivo
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		String[] texto = linea.split("\\s");//se separa palabra por palabra
		for(int i = 0; i < texto.length; i++){
			System.out.print(texto[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < texto.length; i++){
			if(dicc.busqueda(texto[i])!=null)
				System.out.print(dicc.busqueda(texto[i]) + " ");
			else
				System.out.print("*" + texto[i] + "* ");
		}
	}

}
