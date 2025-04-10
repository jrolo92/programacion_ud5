package ejercicio1;
import java.util.*;

/*
 * Crea una aplicación en Java que:
 * Permita almacenar los nombres de los libros en un HashSet<String>, evitando duplicados.
 * Permita al usuario agregar libros y mostrarlos.
 * Recorra el conjunto usando tanto un Iterator como un for-each.
*/
public class ClubLectura {
	public static void main(String[] args) {
		Set <String> nombreLibros = new HashSet<>(); //<-- Set no permite duplicados.
		
		// Agregar libro:
		Scanner sc =new Scanner (System.in);
		String nombreLibro = null;
		System.out.println("Agregue algun libro a continuación o escriba salir para terminar");
		nombreLibro = sc.nextLine();
		while (!nombreLibro.equalsIgnoreCase("salir")) { //<-- Mientras lo que introduzca no sea salir
			nombreLibros.add(nombreLibro); //<-- Esta línea se puede omitir ya que está en la condición del if siguiente.
			if (nombreLibros.add(nombreLibro)) {
				System.out.println("Libro añadido");
			}else {
				System.out.println("El libro ya está añadido");
			}
			
			System.out.println("Introduzca otro libro: ");
			nombreLibro = sc.nextLine();
		}
		
		// Mostrar libros:
		// 1.Recorrer con for each
		System.out.println("Lista de libros for-each: ");
		for (String s : nombreLibros) {
			System.out.println(s);
		}
		// 2.Recorrer con iterador
		System.out.println("Lista de libros iterator: ");
		Iterator <String> it = nombreLibros.iterator();
		String s;
		while(it.hasNext()) {
			s=it.next();
			System.out.println(s);
		}
		
		sc.close();
	}
}
