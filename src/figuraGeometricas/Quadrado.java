package figuraGeometricas;

public class Quadrado extends Quadrilatero{
	
	
	public Quadrado(double lado) {
		super(lado);
	}
	

	@Override
	public String toString() {
		return "Quadrado [lado=" + this.base + ", area=" + this.area + "]";
	}

	
	

}
