package d;

import java.util.Scanner;

public abstract class ejemplo_Try_catch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("-----Division-----");
		System.out.println("Ingresa el primer numero");
		int numerador = sc.nextInt();
		System.out.println("Ingresa el segundo numero");
        int denominador = sc.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        
        }

	}

}
