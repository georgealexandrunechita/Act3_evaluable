package persona;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private int anyo_nacimiento;
	private String pais_nacimiento;
	private char genero;
	
public Persona (String nombre, String apellidos, String dni, int anyo_nacimiento, String pais_nacimiento, char genero) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
	this.anyo_nacimiento = anyo_nacimiento;
	this.pais_nacimiento = pais_nacimiento;
	this.genero = genero;
	
	imprimirXPantalla();
	
   }
// ACT:1 Vamos a crear el metodo imprimir por pantalla para los datos de cada persona
// ACT2: A�adimos los atributos pais de nacimiento y genero con sus respectivas impresiones
public void imprimirXPantalla() {
	System.out.println("Persona: ");
	System.out.println("Nombre: " + nombre);
	System.out.println("Apellidos: " + apellidos);
	System.out.println("DNI: " + dni);
	System.out.println("Anyo de Nacimiento: " + anyo_nacimiento);
	System.out.println("Pais de nacimiento: " + pais_nacimiento);
	System.out.println("Genero: " + genero);
  

}
}
