package Gestion_Citas;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de citas médicas a registrar: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        CitaMedica[] citas = new CitaMedica[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Cita #" + (i + 1) + " ---");
            System.out.print("Nombre del paciente: ");
            String paciente = sc.nextLine();

            System.out.print("Nombre del doctor: ");
            String doctor = sc.nextLine();

            System.out.print("Hora de la cita: ");
            String hora = sc.nextLine();

            System.out.print("Fecha de la cita: ");
            String fecha = sc.nextLine();

            citas[i] = new CitaMedica(paciente, doctor, hora, fecha);
        }

        System.out.println("\n--- Todas las citas ---");
        for (CitaMedica cita : citas) {
            cita.MostarCitas();
        }

        System.out.print("\nIngrese el nombre del paciente a buscar: ");
        String nombreBuscar = sc.nextLine();

        boolean encontrado = false;
        for (CitaMedica cita : citas) {
            if (cita.getPaciente().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("\nCita encontrada:");
                cita.MostarCitas();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron citas para el paciente: " + nombreBuscar);
        }

        sc.close();
    }

}
