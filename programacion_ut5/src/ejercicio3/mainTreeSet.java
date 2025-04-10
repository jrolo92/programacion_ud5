package ejercicio3;

import java.util.*;

public class mainTreeSet {

	public static void main(String[] args) {
//		Creamos un conjunto TreeSet y le añadimos 3 numeros:
		SortedSet<Integer> numeros = new TreeSet<>();
		Integer num1 = 3;
		Integer num2 = 2;
		Integer num3 = 1;
		numeros.add(num1);
		numeros.add(num2);
		numeros.add(num3);
		System.out.println(numeros);
		
//		Recorremos su contenido y lo imprimimos de menor a mayor:
		for (Integer i:numeros) {
			System.out.println(i);
		}
		
//		Lo podemos recorrer en orden inverso usando el iterador:
//		Iterator it = numeros.descendingIterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		Repetir el proceso pero con nombres de alumnos.
		SortedSet<String> alumnos = new TreeSet();
		String alumno1 = "Pepe";
		String alumno2 = "Ana Belen";
		String alumno3 = "Luis";
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		System.out.println(alumnos);
		
		for(String s: alumnos){
			System.out.println(s);
		}
	}

}
