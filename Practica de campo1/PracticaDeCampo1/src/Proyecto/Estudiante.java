package Proyecto;

public class Estudiante {
	private String nombre;
	private int edad;
	private double[] nota;
	
	public Estudiante(String nombre, int edad, double[] nota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public double Calcularpromedio() {
	double suma=0;
	for(double n: nota) {
		suma+=n;
	}
	return suma/nota.length;
	}
	public void mostrar() {
		System.out.println("Nombre "+nombre+" Edad "+edad+" Promedio: "+Calcularpromedio());
	}
}
