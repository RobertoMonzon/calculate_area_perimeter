
public class Rectangulo  implements FiguraGeometrica{
	private String Nombre;
	private double Base;
	private double Altura;
	
	public double CalcularPerimetro() {
		return((getBase()*2)+(getAltura()*2));
	}
	
	public double CalcularArea() {
		return(getBase()*getAltura());
	}

	public Rectangulo(String nombre, double base, double altura) {
		super();
		Nombre = nombre;
		Base = base;
		Altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [Nombre=" + Nombre + ", Base=" + Base + ", Altura=" + Altura + "]";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	
}
