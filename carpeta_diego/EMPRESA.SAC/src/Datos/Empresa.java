package Datos;
import java.util.ArrayList;
import java.util.List; 

public class Empresa {
	// Lista donde se almacenan todos los empleados
	private List<Empleado> empleados = new ArrayList<>();
	
	
	public Empresa() {		
	}
    
	public boolean agregarEmpleado(Empleado e) {
		for (Empleado emp : empleados) {
            if (emp.getDni() == e.getDni()) {
                System.out.println("❌ El empleado con DNI " + e.getDni() + " ya existe.");
                return false;
            }
        }
        empleados.add(e);
        return true;   
	}
	public void mostrarResumenBonificacionesTotales() {
		
	}
	public void buscarEmpleadoPorDNI() {
		
	}
}
