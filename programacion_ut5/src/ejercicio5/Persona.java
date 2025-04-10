package ejercicio5;

import java.util.Objects;

//Plantilla general de la clase Persona.
public class Persona implements Comparable <Persona> {
	// Atributos
	private String nombre;
	private int edad;
	private double estatura;
	
	// Métodos
	
	//CompareTo por nombre:
//	@Override
//	public int compareTo (Persona otra) {
//		return this.nombre.compareTo(otra.nombre);
//	}
	
	//CompareTo por edad cuando es int:
	@Override
	public int compareTo(Persona otra) {
		int iguales;
		if (this.edad < otra.edad) {
			iguales=-1;
		} else if (this.edad < otra.edad){
			iguales=1;
		}else {
			iguales=0;
		}
		return iguales;
	}
//	CompareTo por edad cuando la edad es integer
//	@Override
//	public int compareTo (Persona otra) {
//		return this.edad.compareTo(otra.edad);
//	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Persona other = (Persona) obj;
		return edad == other.edad && Double.doubleToLongBits(estatura) == Double.doubleToLongBits(other.estatura)
				&& Objects.equals(nombre, other.nombre);
	}


	// Constructor de persona con parámetros.
	public Persona(String nombre, int edad, double estatura) {
		// Primero el atributo y luego el parámetro del método.
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	
	// Constructor con dos parámetros
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}


	

}