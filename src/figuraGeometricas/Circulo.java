package figuraGeometricas;

public class Circulo extends FiguraGeometrica{
	protected double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		calcularArea();
	}
	

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
		calcularArea();
	}

	@Override
	public double getArea() {
		return this.area;
	}
	
	@Override
	public void calcularArea() {
		this.area = Math.PI*Math.pow(raio, 2);
	}


	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", area=" + area + "]";
	}
	
	
	
	

}
