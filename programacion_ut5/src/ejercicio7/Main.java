package ejercicio7;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import ejercicio6.Persona;

public class Main {

	public static void main(String[] args) {
//		Crear conjunto personas Set y obtener el primer elemento:

		Persona p1 = new Persona ("Pedro", 33);
		Persona p2 = new Persona ("Luis", 31);
		Persona p3 = new Persona ("Antonio", 32);
		Persona p4 = new Persona ("Javi", 32);
		
		
		Set<Persona> personas1 = new TreeSet<>();
		personas1.add(p1);
		personas1.add(p2);
		personas1.add(p3);
		personas1.add(p4);
		
		
		Iterator<Persona> it = personas1.iterator();
			if(it.hasNext()) {
				System.out.println("Primero en el Set: " + it.next());
			}
		
//		Creamos un segundo conjunto SortedSet con el mismo contenido:
		SortedSet<Persona> personas2 = new TreeSet<>(personas1);
	
		
//		Podemos imprimir directamente el primer valor del conjunto así:
		System.out.println("Primero en el SortedSet: " + personas2.first());

		
//		Y el último del conjunto:
		System.out.println("Último en el SortedSet: " + personas2.last());
		
//		Se pueden imprimir también los objetos anteriores a algún objeto en concreto:
		System.out.println("Anteriores a Pedro en el SortedSet: " + personas2.headSet(p4));
	}

}
