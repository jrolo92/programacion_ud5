package ejemplos;

import java.util.*;

public class EjemploConjuntos {
	public static void main(String[] args) {
		/*
		 * Es mejor poner al principio siempre que sea posible el padre (en este caso la interfaz Set está por encima de HashSet)
		 * Es conveniente ponerle al conjunto el tipo de valores que va a tener dentro 
		 * (para evitar posibles problemas de casting), si no sería de tipo genérico 
		 * A la hora de implementarlo se puede poner solo <> para hacerlo mas corto.
		 */
		Set <Integer> naturales = new HashSet<Integer>(); 
		//Añadimos valores al conjunto usando add() (pertenece a Collection).
		naturales.add(1);
		naturales.add(2);
		naturales.add(3);
		naturales.add(4);
		
		System.out.println("Valor del conjunto: " + naturales); // Imprime el contenido en forma de array, no la referencia.
		System.out.println("Referencia: " + naturales.hashCode()); // Imprime la referencia (la referencia cambia si se modifica el conjunto)

		
		Set <Integer> naturales2 = new HashSet<Integer>(); 
		//Añadimos valores al conjunto usando add() (pertenece a Collection).
		naturales2.add(1);
		naturales2.add(2);
		naturales2.add(3);
		naturales2.add(4);
		
		System.out.println("Valor del conjunto: " + naturales2); // Imprime el contenido en forma de array, no la referencia.
		System.out.println("Referencia: " + naturales2.hashCode()); // Imprime la referencia (la referencia cambia si se modifica el conjunto)
		
		//Comparamos ambos conjuntos de naturales:
		System.out.println(naturales == naturales2);
		System.out.println(naturales.equals(naturales2));
		
		Set<Integer> primos = new HashSet<>();
		primos.add(2);
		primos.add(3);
		
		System.out.println("Valor del conjunto: " + primos); // Imprime el contenido en forma de array, no la referencia.
		System.out.println("Referencia: " + primos.hashCode()); // Imprime la referencia (la referencia cambia si se modifica el conjunto)
		
		// Comprobar si naturales contiene a primos con containsAll() ()También pertenece a Collection):
		boolean result = naturales.containsAll(primos);
		System.out.println("Es primos un subconjunto de naturales?: " + result);
	}
}
