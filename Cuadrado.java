
public class Cuadrado  implements FiguraGeometrica{
	private String Nombre;
	private double Lado;
	
	public double CalcularArea() {
		return(getLado()*getLado());
	}
	
	public double CalcularPerimetro() {
		return(getLado()*getLado()+getLado());
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getLado() {
		return Lado;
	}
	public void setLado(double lado) {
		Lado = lado;
	}
	@Override
	public String toString() {
		return "Cuadrado [Nombre=" + Nombre + ", Lado=" + Lado + "]";
	}
	public Cuadrado(String nombre, double lado) {
		super();
		Nombre = nombre;
		Lado = lado;
	}



	}
	
	
	
