package figuraGeometricas;

public class Quadrilatero extends FiguraGeometrica{
	protected double base, altura;

	public Quadrilatero(double base, double altura) {
		this.base = base;
		this.altura = altura;
		calcularArea();
	}
	
	protected Quadrilatero(double lado) {
		this.base=lado;
		this.altura=lado;
		calcularArea();
	}
	
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
		calcularArea();
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
		calcularArea();
	}


	@Override
	public double getArea() {
		return this.area;
	}
	
	@Override
	public void calcularArea() {
		this.area = this.base*this.altura;
	}



	@Override
	public String toString() {
		return "Quadrilatero [base=" + base + ", altura=" + altura + ", area=" + area + "]";
	}
	
	

}
