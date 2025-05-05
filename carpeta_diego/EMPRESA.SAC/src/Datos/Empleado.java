package Datos;

public class Empleado {
   private String nombre;
   private int dni;
   private String area;
   private double sueldoBase;
   private int aniosAntiguedad;
   private int puntajeDesempeno;
   
   private static int canttrabajor=0;
   
    // constructor sin parámetros
	public Empleado() {		}

	// constructor con sobrecarga
	public Empleado(String nombre, int dni, String area, double sueldoBase, int aniosAntiguedad, int puntajeDesempeno) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.area = area;
		this.sueldoBase = sueldoBase;
		this.aniosAntiguedad = aniosAntiguedad;
		this.puntajeDesempeno = puntajeDesempeno;
	}
     //los gettes y los settes
	public String getNombre() {	return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public int getDni() {return dni;}
	public void setDni(int dni) {this.dni = dni;}
	public String getArea() {return area;}
	public void setArea(String area) {this.area = area;}
	public double getSueldoBase() {return sueldoBase;}
	//Condición para que el sueldo no sea menor que 0
	public void setSueldoBase(double sueldoBase) {
		if(sueldoBase>0) {
			this.sueldoBase = sueldoBase;
		}else { System.out.println("ERROR!! el saldo no debe ser menor de 0"); }}
	public int getAniosAntiguedad() {	return aniosAntiguedad;}
	//Condición para que la antiguedad no sea negativa
	public void setAniosAntiguedad(int aniosAntiguedad) {
		if(aniosAntiguedad>=0) {
			this.aniosAntiguedad = aniosAntiguedad;
		}else{System.out.println("Los años no pueden ser negativos");}}
	public int getPuntajeDesempeno() {return puntajeDesempeno;}
	//Condición para los puntajes
	public void setPuntajeDesempeno(int puntajeDesempeno) {	
		if(puntajeDesempeno>=1 && puntajeDesempeno <=100) {
			this.puntajeDesempeno = puntajeDesempeno;
		}else {System.out.println("Error!! el rango de puntaje debe ser de 1 al 100");}}
	public static int getCanttrabajor() {	return canttrabajor;}
	public static void setCanttrabajor(int canttrabajor) {	Empleado.canttrabajor = canttrabajor;}

	public void mostrarinfo() {
		System.out.println("Trabajador: "+nombre);
		System.out.println("DNI: "+dni);
		System.out.println("Area de trabajo: "+area);
		System.out.println("Sueldo mensual: "+sueldoBase);
		System.out.println("Años trabajado: "+aniosAntiguedad);
		System.out.println("desempeño"+puntajeDesempeno);
	}
	public void calcularBonificacion(double aumento) {
		if(puntajeDesempeno >= 90 && aniosAntiguedad >= 5) {
			aumento = sueldoBase * 0.30;
			System.out.println("Tienes una bonificacion del 30% : S/. "+aumento);
		} else if (puntajeDesempeno >= 75) {
			aumento = sueldoBase * 0.20;
			System.out.println("Tienes una bonificacion del 20% : S/. "+aumento);
		} else if (puntajeDesempeno >= 60) {
			aumento = sueldoBase * 0.10;
			System.out.println("Tienes una bonificacion del 10% : S/. "+aumento);
		} else {aumento = 0; System.out.println("No tienes ninguna bonificacion");};
	}
	
	
}
