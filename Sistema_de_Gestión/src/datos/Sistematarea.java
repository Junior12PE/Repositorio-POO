package datos;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistematarea {
	Scanner sc=new Scanner(System.in);
	private List<Sistematarea> tarea = new ArrayList<>();
	private String nombre;
	private String descripcion;
	private LocalDate fecha;
	private String prioridad;
	private String estado;
	public Sistematarea(String nombre, String descripcion, LocalDate fecha, String prioridad, String estado) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.prioridad = prioridad;
		this.estado = estado;
	}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	public LocalDate getFecha() {return fecha;}
	public void setFecha(LocalDate fecha) {this.fecha = fecha;}
	public String getPrioridad() {return prioridad;}
	public void setPrioridad(String prioridad) {this.prioridad = prioridad;}
	public String getEstado() {return estado;}
	public void setEstado(String estado) {this.estado = estado;}
	
	public long fecharestante() {
		return ChronoUnit.DAYS.between(LocalDate.now(), fecha);
	}
	public void mostrar() {
		System.out.println("Tarea: "+nombre);
		System.out.println("Descripcion: "+descripcion);
		System.out.println("Fecha de entrega: "+fecha);
		System.out.println("Prioridad de la tarea: "+prioridad);
		System.out.println("Estado de la tara: "+estado);
	}
	public void registrartarea() {		
		try {
			System.out.println("Nombre de la tarea");
			String nombre = sc.next();
			System.out.println("Descripcion");
			String descripcion = sc.next();
			System.out.println("Fecha de entrega (yyyy-mm-dd)");
			String fechaSTR = sc.next();
			LocalDate fecha=LocalDate.parse(fechaSTR);
			
			System.out.println("Prioridad (alta, medio, bajo)");
			String prioridad = sc.next();
			System.out.println("Estado (Pendiente, En proceso, Completada)");
			String estado = sc.next();
			
			Sistematarea tarea = new Sistematarea(nombre,descripcion,fecha,prioridad,estado);
			((List<Sistematarea>) tarea).add(tarea);
			System.out.println("Registro exitoso");
			
		}catch(DateTimeParseException e) { 
			System.out.println("ERROR!! fecha invalido");
		}
	}
	public void Prioridad() {
		System.out.println("Ingrese la prioridad a filtrar(Alta, media, baja)");
		String prioridad=sc.next();
		tarea.stream().filter(t -> t.prioridad.equalsIgnoreCase(prioridad)).forEach(t ->{
		System.out.print("---------------------");
		System.out.print(t);
		});
		
	}

	
}

