package ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;


public class ejemploCompareTo {

	public static void main(String[] args) {
		SortedSet<Persona> personas = new TreeSet<>();
		Persona fran = new Persona ("Fran", 20);
		Persona ana = new Persona ("Ana", 30);
		Persona fran1 = new Persona ("Fran", 10);
		personas.add(fran);
		personas.add(ana);
		personas.add(fran1);
		
		// Mostramos el orden por el que se han añadido los objetos al conjunto TreeSet
		for (Persona p: personas) {
			System.out.println(p);
		}

	}

}
