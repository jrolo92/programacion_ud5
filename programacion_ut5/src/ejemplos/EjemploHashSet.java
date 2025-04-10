package ejemplos;

import java.util.*;


public class EjemploHashSet {

	public static void main(String[] args) {
		// 1. Crear un conjunto de Strings:
		Set<String> conjuntoCadenas = new HashSet<>();
		
		String alumno1 = "Alumno 1";
		String alumno2 = "Alumno 2";
		String alumno3 = "Alumno 3";
		
		// 2. Añadirle elementos y 3. Añadir un elemento duplicado:
		// .add solo permite meter los elementos de 1 en 1.
		conjuntoCadenas.add(alumno1);
		conjuntoCadenas.add(alumno2);
		conjuntoCadenas.add(alumno3);
		
		// Si quiesieramos añadir varios elementos de una vez usamos .addAll()
		String [] alumnos = {alumno1, alumno2, alumno3}; //<-- Para ello habría que tener un array con los elementos.
		conjuntoCadenas.addAll(Arrays.asList(alumnos));
		
		
		// Los elementos no se meten si ya están dentro (no duplicados).
		System.out.println(conjuntoCadenas);
		
		// 4. Añade varios null--> Solo permite incluir un nulo.
		String alumno4 = null;
		conjuntoCadenas.add(alumno4);
		conjuntoCadenas.add(null);
		System.out.println(conjuntoCadenas);
		
	}

}
