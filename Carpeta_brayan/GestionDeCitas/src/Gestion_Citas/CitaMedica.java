package Gestion_Citas;

public class CitaMedica {
	private String Paciente;

    private String Doctor;

    private String Hora;

    private String Fecha;
    
    public CitaMedica() {
    }

	public CitaMedica(String paciente, String doctor, String hora, String fecha) {
		super();
		Paciente = paciente;
		Doctor = doctor;
		Hora = hora;
		Fecha = fecha;
	}

	public String getPaciente() {
		return Paciente;
	}

	public void setPaciente(String paciente) {
		Paciente = paciente;
	}

	public String getDoctor() {
		return Doctor;
	}

	public void setDoctor(String doctor) {
		Doctor = doctor;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public void MostarCitas() {
	    System.out.println("Paciente: " + Paciente);
	    System.out.println("Doctor: " + Doctor);
	    System.out.println("Hora: " + Hora);
	    System.out.println("Fecha: " + Fecha);
	    System.out.println("----------------------------");
	}
    
}
