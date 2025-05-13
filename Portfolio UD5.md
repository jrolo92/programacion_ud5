



# ![ref1]![ref1]![ref1]![ref1]**Portfolio: TAD**
**PROGRAMACIÓN UD-5**

**Javier Rodríguez**

## *Ejercicios*

1. ` `Proyecto 1: Uso de un conjunto de tipo HashSet<> y de funciones básicas como añadir o mostrar valores del conjunto. Recorrer conjunto usando for each e iterador.
1. ` `Proyecto 2: Uso de un conjunto de tipo LinkedHashSet. Comprobamos que no admite valores repetidos, pero sí admite un valor nulo. Así como que el orden que sigue va a ser el mismo que el de la inserción de los valores del conjunto.
1. ` `Proyecto 3: Uso de un conjunto de tipo TreeSet. Recorrer conjunto en orden inverso y comprobar que los valores se almacenan en orden natural.
1. ` `Proyecto 4: Principales diferencias entre los conjuntos (Set). Ventajas y desventajas de cada uno. Llevar a cabo funciones para añadir o borrar valores de un conjunto usando para ello un iterador.
1. ` `Proyecto 5: Implementar la interfaz comparable de nuestra clase Persona para ordenar los objetos de esta clase primero por el nombre, luego por edad y por último, que tenga en cuenta en los casos de personas con el mismo nombre se ordene por edad.
1. ` `Proyecto 6: Crear otros comparadores para ordenar solo por apellidos, por apellidos, nombre y edad y por último muestre al principio del conjunto a las personas que no tengan apellido registrado
1. ` `Proyecto 7: Diferencias entre TreeSet implementado por la interfaz Set y SortedSet. Uso de funciones de SortedSet como first(), last() o headSet().
1. ` `Proyecto 8: Características principales de los métodos equals() y compareTo().
1. ` `Proyecto 9: Uso de una lista de tipo ArrayList y de funciones básicas como añadir, eliminar, recorrer valores y mostrar el número total de valores de la lista.
1. ` `Proyecto 10: Uso de ListIterator para recorrer una lista en ambos sentidos y realizar modificaciones durante el recorrido. Uso de métodos para mostrar el indice actual del iterador.
1. ` `Proyecto 11: Uso de una lista de tipo LinkedList añadiendo los valores al final para crear una cola. Eliminar los valores que se vayan completando de la lista y mostrar estado de la cola.
1. ` `Proyecto 12: Uso de un diccionario de tipo HashMap y comprobar que no admite claves pero si valores duplicados. Uso de funciones básicas de los mapas como añadir o eliminar claves y valores, obtener el valor de una clave en concreto, modificar ambas partes del diccionario y recorrer el mismo mostrando solo claves o mostrando tanto claves como valores.
1. ` `Proyecto 13: Usar un Map para contar las veces que aparece una misma palabra en un texto introducido por el usuario de forma que el valor del diccionario sea el número de veces que aparece la palabra y la clave sea la propia palabra en sí.
1. ` `Proyecto 14: Crear una colección de objetos de tipo envoltorio (o de tipo objeto de una clase) y probar métodos para desordenar, ordenar, ponerla en orden inverso, realizar búsqueda binaria y por último crear una lista a partir de un array.
1. ` `Proyecto 15: Crear una baraja de cartas española mediante un Map en el cual la clave será el numero de la carta y el valor el palo. Jugar con ellas: primero barajar y luego repartir 5 cartas y mostrarlas. Ordenar las cartas por valor o por palo.
1. ` `Proyecto 16: Comprobamos que los valores de una variable tipo Integer no cambia una vez que apunta a un objeto con un valor específico ya que cuando lo modificamos se crea un nuevo Integer y el anterior se mantiene sin modificaciones, es decir, es inmutable.

## *Apuntes*
### Elementos principales:

|**Elemento**|**Descripción**|**Ejemplo**|
| :- | :- | :- |
|**Tipos Abstractos de Datos (TAD)**|Modelos de datos avanzados que permiten representar estructuras como listas, pilas y colas.|List<String> lista = new \*List<>();|
|**Collection**|Interfaz base que define métodos comunes para todas las colecciones.|add(), remove(), contains(),...|
|**Set**|Colección que no permite elementos duplicados. Es una interfaz.|-|
|**HashSet**|Implementación de ‘Set’ que usa una tabla hash para almacenar elementos sin orden específico.|Set<String> nombres = new HashSet<>();|
|**LinkedHashSet**|Implementación de ‘Set’ que mantiene el orden de inserción de elementos.|Set<String> ordenInsercion =  new HashSet<>();|
|**SortedSet**|Es una interfaz que extiende Set garantizando el orden natural de los elementos.|-|
|**TreeSet**|Implementación de ‘SortedSet’ que mantiene los elementos ordenados de manera ascendente.|Set<String> ordenNatural =    new TreeSet<>();|
|**List**|Colección ordenada que permite elementos duplicados y acceso secuencial. Es una interfaz.|-|
|**ArrayList**|Implementación de ‘List’ basada en arrays.|List<String> lista =         new ArrayList<>();|
|**LinkedList**|<p>Implementación de ‘List’ basada en listas enlazadas entre ellas.</p><p></p>|List<String> listaEnlazada =    new LinkedList<>();|
|**Map**|Estructura clave-valor que no permite elementos duplicados (No claves pero si valores duplicados). Es una Interfaz.|<p></p><p>-</p>|
|**HashMap**|Implementación de ‘Map’ basada en tablas hash, sin orden garantizado.|Map<Integer, String> mapa = new HashMap<>();|
|**LinkedHashMap**|Implementación de ‘Map’ que mantiene el orden de inserción de las claves.|Map<Integer, String> ordenado = new LinkedHashMap<>();|
|**SortedMap**|Extiende ‘Map’, garantizando un orden natural de las claves. Es una interfaz|-|
|**TreeMap**|Implementación de ‘SortedMap’ basada en árboles, ordenando los elementos por clave.|Map<Integer, String> ordenado = new TreeMap<>();|
|**Iterator**|Objeto que permite recorrer colecciones secuencialmente.|Iterator<String> it = lista.iterator();|
|**ListIterator**|Similar a ‘Iterator’, pero con navegación en ambas direcciones. Permite el uso de mas funciones pero solo funciona con listas.|ListIterator<String> it = lista.listIterator();|
|**Comparable**|Interfaz que permite definir el orden natural de los objetos.|<p>class Persona implements Comparable<Persona>{</p><p>public int compareTo()};</p>|
|**CompareTo**|Método de ‘Comparable’ para comparar objetos.|persona1.compareTo(persona2);|
|**Comparator**|Interfaz que permite definir múltiples criterios de ordenación.|-|
|**Tipos Genéricos**|<p>Permiten clases y métodos parametrizados con tipos de datos. <></p><p></p>|List<String> lista = new ArrayList<>();|
|**Tipos Envoltorios**|Clases que encapsulan tipos primitivos para tratarlos como objetos. También llamados ‘Wrappers’.|Integer numero|
|**Collections**|Clase de utilidades con métodos para manipular colecciones.|Collections.sort(lista);|
|**Inmutables**|Objetos cuyo estado no puede modificarse después de su creación.|final String texto = "Hola";|



Notas de clase:

**Ejercicio 4.**

<a name="docs-internal-guid-d6558b2d-7fff-5723-b7ec-a53b01dcc15c"></a>Después de ejecutar el programa ComparadorSet, responde a las siguientes preguntas:

1. ¿Qué diferencias observas en el orden de los elementos de cada Set?

En cada uno lleva un orden distinto.

HashSet lo ordena de forma aleatoria.

`	`TreeSet lo ordena por orden alfabético y no permite nulos.

`	`LinkedHashSet lo ordena por orden de inserción.

1. ¿Por qué crees que el TreeSet ordena los elementos alfabéticamente?

   `	`Porque sigue un orden natural de los elementos.

1. ¿Qué Set elimina los elementos duplicados? ¿Por qué ocurre esto?

   `	`Ninguno de los HashSet permite duplicados. Esto se debe a que en un conjunto un elemento 	solo puede aparecer una vez.

1. ¿Cuál es el Set más rápido para insertar elementos? Basándote en los resultados, ¿por qué crees que es así?

   `	`El más rápido es el HashSet ya que no sigue ningún orden específico.

   <a name="docs-internal-guid-3e4cd01b-7fff-28b8-2874-807099c961a7"></a>**Investiga y responde a las siguientes cuestiones:**

1. ` `Enumera las principales ventajas y desventajas de cada implementación de Set (HashSet, TreeSet y LinkedHashSet).

   |**Tipo Set**|**Ventajas**|**Desventajas**|
   | :-: | :-: | :-: |
   |**HashSet**|<p>Es el más rápido</p><p></p>|No sigue ningún orden|
   |**TreeSet**|<p>Ordena los elementos según su orden natural</p><p></p>|Es el mas lento. No permite nulos.|
   |**LinkedHashSet**|Sigue el orden de inserción que le hayamos especificado|Un poco mas lento que HashSet|

1. ` `Describe al menos dos situaciones prácticas en las que sería más apropiado usar cada tipo de Set. Justifica tu respuesta.

   `	`HashSet → Usar cuando se le de mas importancia a la velocidad que al orden (pe: cuando 	tengamos grandes volúmenes de datos). También cuando tengamos un valor nulo en nuestro 	conjunto.

   `	`TreeSet → Usar cuando se le de mas importancia a tener los elementos ordenados de forma 	natural.

   `	`LinkedHashSet → Usar cuando queramos mantener un orden específico por llegada en 	nuestro 	conjunto.


   `	`3. Introducimos un método para imprimir cada conjunto con un iterador<a name="docs-internal-guid-3d05e1af-7fff-19e1-b849-936a200e1f54"></a> y probamos el método con 	los tres tipos de Set y explica:

- ¿En qué orden se recorren los elementos en cada caso?

  `	`HashSet no sigue ningún orden.

`		`TreeSet lo ordena por orden alfabético.

`	`LinkedHashSet lo ordena por orden de inserción.

- ¿Coincide este orden con lo visto en las partes anteriores?

`		`Si, sigue el orden previsto.


**Ejercicio 8.**

|**equals()**||
| :- | :- |
|¿Para qué sirve?|Compara el contenido de dos objetos|
|¿De dónde sale?|De la clase Object|
|Relación con hashCode()|Es necesario sobrescribir el hashcode cuando se cambien los atributos que va a tener en cuenta el equals()|
|Tipo del parámetro explícito|Es un object por lo que habrá que tener en cuenta realizar un casting si es necesario según el caso (según lo que se ponga en el parámetro implícito).|
|Valor de retorno|` `Booleano|


|**compareTo()**||
| :- | :- |
|¿Para qué sirve?|Compara el contenido de dos objetos pero para ver si es mayor o menor|
|¿De dónde sale?|De la interfaz Comparable, por tanto hay que implementarla.|
|Relación con equals()|Ambos deben tener los mismos atributos.  |
|Tipo del parámetro explícito|Es un object por lo que habrá que tener en cuenta realizar un casting si es necesario según el caso (según lo que se ponga en el parámetro implícito). O especificar el tipo <> en nuestra implementación.|
|Valor de retorno|` `Int – entero: si es igual (0), si es menor (-1) y si es mayor (+1)|

[ref1]: Aspose.Words.854dae06-3bb3-41a2-8a9a-67967e1decf8.001.png
