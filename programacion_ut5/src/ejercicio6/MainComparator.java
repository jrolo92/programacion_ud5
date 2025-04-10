package ejercicio6;

import java.util.*;

public class MainComparator {

	public static void main(String[] args) {
		Persona p1 = new Persona ("Pedro", 33);
		Persona p2 = new Persona ("Luis", 31);
		Persona p3 = new Persona ("Paco", 32);
		Persona p4 = new Persona ("Javi", 32);
		
		SortedSet<Persona> colegas = new TreeSet<>();
		colegas.add(p1);
		colegas.add(p2);
		colegas.add(p3);
		colegas.add(p4);
		
		for (Persona p : colegas) {
			System.out.println(p);
		}
		
	}

}
