package Proyecto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		Estudiante[] estudiante;
		
		System.out.println("¿Cuantos estudiante deseas regristrar?");
		int cantestudiante= sc.nextInt();
		estudiante= new Estudiante[cantestudiante];
		
		System.out.println("¿Cuantos notas deseas regristrar?");
		int cantenotas= sc.nextInt();
		
		for(int i=0; i <cantestudiante; i++) {
			
			System.out.println("Estudiante "+(i+1)+"...");
			System.out.print("Ingresar Nombre: ");
			String nombre=sc.next();
			System.out.print("Ingresar Edad: ");
			int edad =sc.nextInt();
			
			double[] nota=new double[cantenotas];
			for(int j=0; j<cantenotas;j++) {
				System.out.print("Ingresar Nota "+(j+1)+"..");
				nota[j] =sc.nextDouble();
			}
			estudiante[i]=new Estudiante(nombre,edad,nota);
		}
		System.out.println("......Estudiante Aprobados........");
		for(Estudiante e: estudiante) {
			if(e.Calcularpromedio()>=14) {
				e.mostrar();
			}
		}
		Estudiante mejor = estudiante[0];
		for(Estudiante e: estudiante) {
			if(e.Calcularpromedio()>mejor.Calcularpromedio()) 
				mejor=e;		
		}
		System.out.println("Estudiante con mayor promedio ");
		mejor.mostrar();
		
		Arrays.sort(estudiante, new Comparator<Estudiante>() {
			public int compare(Estudiante a, Estudiante b) {
				return Double.compare(b.Calcularpromedio(),a.Calcularpromedio());
			}
		});
		 System.out.println("Mostrar ranking de estudiantes");
		
		 int pos = 1;
		 for(Estudiante e: estudiante) {			 
			 System.out.println(pos);
			 e.mostrar();
		 }
		 
		
	}

}
