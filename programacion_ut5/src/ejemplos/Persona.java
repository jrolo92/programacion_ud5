package ejemplos;

import java.util.Objects;

// Para poder usar el compareTo tenemos que implementar el metodo Comparable
// Le tenemos que especificar que queremos que sea como la clase entre <>.
public class Persona implements Comparable <Persona> {
	private String nombre;
	private Integer edad;
	private double estatura;

	
//	1. CompareTo por nombre:
//	@Override
//	public int compareTo (Persona otra) {
//		return this.nombre.compareTo(otra.nombre);
//	}
	
//	2.1 CompareTo por edad cuando es int:
//	@Override
//	public int compareTo(Persona otra) {
//		int iguales;
//		if (this.edad < otra.edad) {
//			iguales=-1;
//		} else if (this.edad < otra.edad){
//			iguales=1;
//		}else {
//			iguales=0;
//		}
//		return iguales;
//	}
	
//	2.2 CompareTo por edad cuando la edad es integer
//	@Override
//	public int compareTo (Persona otra) {
//		return this.edad.compareTo(otra.edad);
//	}
	
//	3.1 CompareTo por nombre primero y luego por edad (int):
//	@Override
//	public int compareTo (Persona otra) {
//		int resultado;
//		if (this.nombre.equals(otra.nombre)) {
//			resultado = Integer.compare(this.edad,otra.edad);
//		}else {
//			resultado = this.nombre.compareTo(otra.nombre);
//		}
//		return resultado;
//	}
	
//	3.2 CompareTo por nombre primero y luego por edad (integer):
	@Override
	public int compareTo (Persona otra) {
		int resultado;
		if (this.nombre.equals(otra.nombre)) {
			resultado = this.edad.compareTo(otra.edad);
		}else {
			resultado = this.nombre.compareTo(otra.nombre);
		}
		return resultado;
	}
	
//	ToString:
	@Override
	public String toString() {
		return "Persona nombre: " + nombre + ", edad: " + edad + ", estatura: " + estatura;
	}
	
//	Equals (es necesario que tengamos en el equals los atributos 
//	por los que vamos a comparar en el compareTo)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Persona other = (Persona) obj;
		return edad == other.edad && Double.doubleToLongBits(estatura) == Double.doubleToLongBits(other.estatura)
				&& Objects.equals(nombre, other.nombre);
	}

//	Constructor de persona con parámetros:
	public Persona(String nombre, int edad, double estatura) {
		// Primero el atributo y luego el parámetro del método.
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
//	Constructor con dos parámetros:
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
}