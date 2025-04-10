package ejemplos;

import java.util.*;

// Iterable es la clase padre de todos los TAD y sirve para 
public class EjemploIterador {
	public static void main(String[] args) {
		
	Set<String> conjuntoCadenas = new HashSet<>();
	String alumno1 = "Alumno 1";
	String alumno2 = "Alumno 2";
	String alumno3 = "Alumno 3";
	conjuntoCadenas.add(alumno1);
	conjuntoCadenas.add(alumno2);
	conjuntoCadenas.add(alumno3);
	
	// Recorrer colecciones con for each.
	for(String s:conjuntoCadenas) {
		System.out.println(s);
	}
	
	// Recorrer colecciones con Iterator.
	// Se pone el nombre del conjunto porque tb necesitamos los datos contenidos en él.
	// Permite realizar operaciones con un elemento del conjunto: eliminar...
	Iterator <String> it = conjuntoCadenas.iterator();
	String s;
	while (it.hasNext()) {
		s = it.next();//<-- Si no especificamos el tipo <> del iterator daría fallo
		System.out.println(s);
	}
	
	//Eliminar el alumno 2 usando Iterator:
	Iterator <String> it1 = conjuntoCadenas.iterator();
	String s1;
	while (it1.hasNext()) {
		s1= it1.next();
		if (s1.equals(alumno2)) {
			it1.remove();//<-- El iterador ya tiene seleccionado el elemento que queremos eliminar,
		}
	}
	System.out.println("Lista de libros tras eliminar el libro 2 con iterator: ");
	System.out.println(conjuntoCadenas);//<-- Aqui ya me ha borrado el alumno 2.

	// Eliminar el alumno 2 con for each (da error de excepción).
	// Primero añado el alumno 2 (lo he borrado antes con el iterator)
	conjuntoCadenas.add(alumno2);

	for(String s2 : conjuntoCadenas) {
		//System.out.println(s2);
		conjuntoCadenas.remove("Alumno 2");
		
	}
	System.out.println("Lista de libros tras eliminar el libro 3 con for-each: ");
	System.out.println(conjuntoCadenas);
	}
}
