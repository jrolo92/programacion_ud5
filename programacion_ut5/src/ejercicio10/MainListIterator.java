package ejercicio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MainListIterator {

	public static void main(String[] args) {
//		1. Declara e inicializa una arrayList con 10 números enteros:
		List<Integer> lista = new ArrayList<>();
		Collections.addAll(lista,10,20,30,40,50,60,70,80,90,100);
		
//		TODO Hacerlo todo en una linea con el constructor especifico:
//		List<Integer> lista2 = new ArrayList<>(Collection<? extends E>10,20,30,40,50,60,70,80,90,100);
		
//		2. Usa un listIterator para recorrer de principio a fin:
		ListIterator<Integer> li = lista.listIterator();
		while (li.hasNext()) {
			Integer numero = li.next();
			if (numero>50) {
				li.set(numero*2);
			}
			System.out.println("Elemento nº: " + li.nextIndex());
			System.out.println(numero);

		}
		System.out.println("Lista modificada" + lista);

		
//		3. Usa el listIterator para recorrer hacia atrás:
		while (li.hasPrevious()) {
			Integer numero = li.previous();
			if (numero<30) {
				li.add(25);
				// Para que no se quede en bucle al añadir el 25 le decimos que salte al siguiente (10)
				if (li.hasPrevious()){ 
					li.previous();
				}
			}
			System.out.println("elemento nº: " + (li.previousIndex()+2));
			System.out.println(numero);
		}
		System.out.println("Lista modificada" + lista);
	}
}
