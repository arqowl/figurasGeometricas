package figuraGeometricas;

public class Triangulo extends FiguraGeometrica{
	protected double altura, base;
	
	

	public Triangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;
		calcularArea();
	}



	public double getAltura() {
		return this.altura;
	}

	public double getBase() {
		return this.base;
	}
	
	@Override
	public double getArea() {
		return this.area;
	}

	


	public void setAltura(double altura) {
		this.altura = altura;
		calcularArea();
	}



	public void setBase(double base) {
		this.base = base;
		calcularArea();
	}


	
	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + ", area=" + area + "]";
	}



	@Override
	public void calcularArea() {
		this.area = (this.altura*this.base)/2;
	}

}
