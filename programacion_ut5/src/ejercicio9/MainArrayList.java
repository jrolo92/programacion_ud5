package ejercicio9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainArrayList {
	public static void main(String[] args) {
//		1. Crear una lista (ArrayList) y añadirle 5 cadenas:
		List<String> lista = new ArrayList<>();
		String nombre1 = "Pepe";
		String nombre2 = "Paco";
		String nombre3 = "Pedro";
		String nombre4 = "Luis";
		String nombre5 = "Antonio";
		
//		En las listas de Arrays el orden será el de inserción.
		lista.add(nombre1);
		lista.add(nombre2);
		lista.add(nombre3);
		lista.add(nombre4);
		lista.add(nombre5);

//		2. Recorrer la lista usando un método:
		mostrarNombre(lista);
		
		
//		3. Añadir a la lista un nuevo string introducido por el usuario:
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre6 = sc.nextLine();
		lista.add(nombre6);
		
//		4. Eliminar un nombre introducido por el usuario si existe:
//		4.1 Eliminar usando un iterador:
		System.out.println("Introduce nombre para borrar: ");
		String nombre7 = sc.nextLine();
//		Iterator<String> it = lista.iterator();
//		boolean encontrado = false;
//		while (!encontrado && it.hasNext()) {
//			if(it.next().equals(nombre7)) {
//				it.remove();
//				encontrado = true;
//				System.out.println("El nombre se ha borrado de la lista");
//			}
//		}	
//		if(!encontrado) {
//			System.out.println("El nombre no se encuentra en la lista.");
//		}
		
//		4.2 Eliminar usando compareTo (MAS ADECUADO):
		if (lista.contains(nombre7)) {
			lista.remove(nombre7);
		}
		
//		5. Mostrar el numero total de nombres:
		System.out.println("El tamaño de la lista es : " + lista.size());
		
//		Comprobar el contenido de la lista:
		mostrarNombre(lista);
		
		sc.close();
	}
	
	/**
	 * Método que muestra el contenido de la lista:
	 * @param lista será la lista que queremos mostrar.
	 */
	private static void mostrarNombre(List<String> lista) {
		for (String s : lista) {
			System.out.println(s);
		}
	}
}
