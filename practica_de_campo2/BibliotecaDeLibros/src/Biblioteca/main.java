package Biblioteca;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cuántos libros desea registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Libro[] libros = new Libro[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Libro #" + (i + 1) + " ---");

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Año de publicación: ");
            int año = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            libros[i] = new Libro(titulo, autor, año);
        }

        System.out.println("\n--- Libros publicados después del 2015 ---");
        boolean encontrados = false;
        for (Libro libro : libros) {
            if (libro.getAñoPublicacion() > 2015) {
                libro.mostrarLibro();
                encontrados = true;
            }
        }

        if (!encontrados) {
            System.out.println("No se encontraron libros posteriores a 2015.");
        }

        sc.close();
    }
	

}
