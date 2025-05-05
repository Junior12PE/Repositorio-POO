package Colecciones;
import java.util.*;

public class ColeccionesConMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        HashSet<String> conjunto = new HashSet<>();
        HashMap<Integer, String> mapa = new HashMap<>();

        int opcion;

        do {
            System.out.println("\n--- MENÚ DE COLECCIONES ---");
            System.out.println("1. Agregar a ArrayList");
            System.out.println("2. Agregar a HashSet");
            System.out.println("3. Agregar a HashMap");
            System.out.println("4. Mostrar todas las colecciones");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un nombre para ArrayList: ");
                    String nombreLista = scanner.nextLine();
                    lista.add(nombreLista);
                    System.out.println("Agregado a ArrayList.");
                    break;

                case 2:
                    System.out.print("Ingrese un nombre para HashSet: ");
                    String nombreSet = scanner.nextLine();
                    if (conjunto.add(nombreSet)) {
                        System.out.println("Agregado a HashSet.");
                    } else {
                        System.out.println("Elemento ya existe en HashSet.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese una clave numérica: ");
                    int clave = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese un valor: ");
                    String valor = scanner.nextLine();
                    mapa.put(clave, valor);
                    System.out.println("Agregado a HashMap.");
                    break;

                case 4:
                    System.out.println("\nContenido de ArrayList:");
                    System.out.println(lista);

                    System.out.println("\nContenido de HashSet:");
                    System.out.println(conjunto);

                    System.out.println("\nContenido de HashMap:");
                    for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
                        System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}