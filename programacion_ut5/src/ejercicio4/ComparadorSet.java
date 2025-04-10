package ejercicio4;
import java.util.*;

public class ComparadorSet {

	public static void main(String[] args) {
		// Crea un conjunto de cada tipo:
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();

		
		// Agregar elementos a cada Set:
		String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
		for (String elemento : elementos) {
			hashSet.add(elemento);
			treeSet.add(elemento);
			linkedHashSet.add(elemento);
		}
		
		// Imprimir cada Set:
		System.out.println("HashSet: " + hashSet);
		System.out.println("TreeSet: " + treeSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
		// Medir tiempo de inserción para cada Set:
		medirTiempoInsercion (new HashSet<>());
		medirTiempoInsercion (new TreeSet<>());
		medirTiempoInsercion (new LinkedHashSet<>());
		
		// Imprimir elementos con metodo iterador:
		System.out.println("HashSet: ");
		mostrarElementosConIterador(hashSet);
		System.out.println("TreeSet: ");
		mostrarElementosConIterador(treeSet);
		System.out.println("LinkedHashSet: ");
		mostrarElementosConIterador(linkedHashSet);
		
		// Crear un treeset de numeros aleatorios (0-100):
		SortedSet<Integer> treeSetAleatorio = new TreeSet<>();
		treeSetAleatorio.addAll(Arrays.asList(22,36,10,15,30,82,12));
		Iterator<Integer> itRemove = treeSetAleatorio.iterator();
		Integer e;
		while (itRemove.hasNext()) {
			e = itRemove.next();
			if (e%2==0) {
				itRemove.remove();// El que opera sobre el conjunto es el iterador y no el conjunto en sí.
			}
			treeSetAleatorio.add(1000);// No nos deja insertar usando el iterador. Usando el conjunto nos dará error de excepción
		}
	}
		
		// Función de medir el tiempo en nanosegundos:
		private static void medirTiempoInsercion (Set<Integer> set) {
			long inicio = System.nanoTime();
			for (int i = 0; i < 100000; i++) {
				set.add(i);
			}
			long fin = System.nanoTime();
			System.out.println("Tiempo de inserción para " +
					set.getClass().getSimpleName() + ": " 
					+ (fin - inicio) + " ns");	
	}
		
		// Método iteración básica:
		private static void mostrarElementosConIterador(Set<String> s) {
			Iterator it = s.iterator();
			int i = 1;
			while(it.hasNext()) {
				System.out.println("Elemento #" + i + ": " + it.next());
				i++;
			}
		}

}
