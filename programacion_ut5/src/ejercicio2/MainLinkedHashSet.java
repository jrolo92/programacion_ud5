package ejercicio2;

import java.util.*;

public class MainLinkedHashSet {

	public static void main(String[] args) {
//		Creamos un conjunto de cadenas usando la interfaz SET.
//		Le añadimos contenido (alumnos).
		Set<String> alumnos = new LinkedHashSet<>();
		String alumno1 = "Pepe";
		String alumno2 = "Paco";
		String alumno3 = "Luis";
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		
//		Imprimimos el contenido del conjunto.
		System.out.println(alumnos);
		
//		Qué ocurre si añadimos un alumno con nombre repetido?
//		Al no permitir duplicados no se va a añadir.
		String alumno4 = "Luis";//<-- Contenido duplicado.
		alumnos.add(alumno4);
		System.out.println(alumnos);

//		Añadimos un valor null, el cual si está permitido.
		String alumno5 = null;
		alumnos.add(alumno5);
		System.out.println(alumnos);
		
//		Si imprimimos cada elemento podemos comprobar que el orden que sigue
//		va a ser el mismo por el que los hemos insertado.
		for (String s : alumnos) {
			System.out.println(s);
		}
		
	}

}
