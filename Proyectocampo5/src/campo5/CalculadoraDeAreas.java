package campo5;

public class CalculadoraDeAreas {
	
	public double calcularArea(double radio) {
		return Math.PI * radio * radio;
	}
	
	public double calcularArea(double base, double altura ) {
		return base * altura;
	}
	
	public double calcularArea(double base, double altura, boolean esTriangulo) {
		if(esTriangulo) { 
			return (base * altura) / 2;
		} else {
			return base * altura;
		}
	}
	
	public int calcularArea(int lado) {
		return lado * lado;
	}

}
