package ejemplos;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("1", "Juan Pérez");
		
//		Recorrer claves:
		for (String clave : m.keySet()) {
			System.out.println(clave + m.get(clave));
		}
		
//		Recorrer valores:
		
	}
}
