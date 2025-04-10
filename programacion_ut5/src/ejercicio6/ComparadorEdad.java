package ejercicio6;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		int resultado;
		if (o1.getEdad() == o2.getEdad()) {
			resultado = 0;
		} else if (o1.getEdad() > o2.getEdad()) {
			resultado = 1;
		}else {
			resultado = -1;
		}
		return resultado;
	}
	
	
}
