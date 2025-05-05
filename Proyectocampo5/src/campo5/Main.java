package campo5;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hola desde el main!");
		CalculadoraDeAreas calc = new CalculadoraDeAreas();
		
		System.out.println("Area del circulo: " + calc.calcularArea(0.5));
		System.out.println("Area del circulo: " + calc.calcularArea(4.0, 6.0));
		System.out.println("Area del circulo: " + calc.calcularArea(4.0, 6.0, true));
		System.out.println("Area del circulo: " + calc.calcularArea(4));
	}

}
