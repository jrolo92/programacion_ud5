package ejercicio6;

import java.util.Comparator;

public class ComparadorApellidosNombreEdad implements Comparator<Persona>{
	
	@Override
	public int compare(Persona o1, Persona o2) {
//		Primero comparamos los apellidos.
		int resultado = o1.getApellidos().compareTo(o2.getApellidos());
		if (resultado == 0){
//			Si los apellidos son iguales comparamos el nombre.
			resultado = o1.getNombre().compareTo(o2.getNombre());
		} else if (resultado == 0) {
//			Si el nombre también es igual comparamos por edad.
			if (o1.getEdad() == o2.getEdad()) {
				resultado = 0;
			} else if (o1.getEdad()>o2.getEdad()) {
				resultado = 1;
			} else {
				resultado = -1;
			}
			
		} 
		return resultado;
	}
}