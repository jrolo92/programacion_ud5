package ejercicio12;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

	public static void main(String[] args) {
//		1. Crear un diccionario de tipo String:
		Map<String, String> dicProg = new HashMap<>();
		
//		2. Introducir 5 entradas:
		String clave1 = "ent";
		String valor1 = "Número entero";
		String clave2 = "dec";
		String valor2 = "Número decimal";
		String clave3 = "cad";
		String valor3 = "Cadena";
		String clave4 = "log";
		String valor4 = "Lógico";
		String clave5 = "bucle";
		String valor5 = "Estructura repetición";
		
		dicProg.put(clave1, valor1);
		dicProg.put(clave2, valor2);
		dicProg.put(clave3, valor3);
		dicProg.put(clave4, valor4);
		dicProg.put(clave5, valor5);
		System.out.println(dicProg);
		
//		3. Introducir valor duplicado con y sin clave duplicada:
		String claveRepe = "bucle";
		String claveNueva = "loop";
		String valorRepe = "Estructura repetición";
		dicProg.put(claveRepe, valorRepe);// No admite claves duplicados.
		dicProg.put(claveNueva, valorRepe);// Si admite valores duplicados si tienen otra clave.
		
		
		System.out.println(dicProg);
		
//		4. Eliminar el último elemento:
		dicProg.remove(clave5);
		System.out.println(dicProg);
		
//		5. Obtener valor de la clave "log":
		dicProg.get("log");
		
//		6. Cambia este valor por “Boolelano”:
		dicProg.replace("log", "Booleano");
		System.out.println("Valor de log cambiado: ");
		dicProg.get("log");

//		7. Recorrer y mostrar con un Iterador:
		
		
	}

}
