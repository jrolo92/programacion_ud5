package ejercicio11;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainLinkedList {

	public static void main(String[] args) {
		
//	1. Crear una cola de tareas con LinkedList:
		List<String> colaTareas = new LinkedList();
		String tarea1 = "Lavar los platos";
		String tarea2 = "Hacer la compra";
		String tarea3 = "Estudiar Java";
		String tarea4 = "Ir al gimnasio";
		String tarea5 = "Leer un libro";
		
//		Añadimos los elementos al final ya que es una cola (FIFO).
		colaTareas.addLast(tarea1);
		colaTareas.addLast(tarea2);
		colaTareas.addLast(tarea3);
		colaTareas.addLast(tarea4);
		colaTareas.addLast(tarea5);
		
//	2. Mostrar las tareas usando un método:
		mostrarTareas(colaTareas);
		
//	3. El usuario añada una nueva tarea:
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nueva tarea: ");
		String tareaUsuario = sc.nextLine();
		colaTareas.addLast(tareaUsuario);
//		Comprobamos que la nueva tarea se ha añadido al final
		mostrarTareas(colaTareas);

//	4. Completar la primera tarea:
		colaTareas.removeFirst();
		System.out.println("La tarea [" + tarea1 + "] ha sido completada");
		
//	5. Consultar la próxima tarea:
		System.out.println("Proxima tarea: " + colaTareas.getFirst());
		
//	6. Añadir tarea urgente (se añade al principio de la lista):
		System.out.println("Introduce una nueva tarea urgente: ");
		String tareaUrgente = sc.nextLine();
		colaTareas.addFirst(tareaUrgente);
		
//	7. Mostrar el estado final de la cola:
		mostrarTareas(colaTareas);
		
		sc.close();
	}

	public static void mostrarTareas(List<String> lista) {
		for (String s : lista) {
			System.out.println(s);
		}
	}
}
