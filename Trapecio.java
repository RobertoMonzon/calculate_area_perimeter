
public class Trapecio   implements FiguraGeometrica {
	private String Nombre;
	private double BaseLarga;
	private double BaseCorta;
	private double Lado;
	
	
	public double CalcularArea() {
		return(getLado()*(getBaseLarga()*getBaseCorta()))/2;
	}
	
	public double CalcularPerimetro() {
		return(getLado()+getLado()+getBaseLarga()+getBaseCorta());
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getBaseLarga() {
		return BaseLarga;
	}

	public void setBaseLarga(double baseLarga) {
		BaseLarga = baseLarga;
	}

	public double getBaseCorta() {
		return BaseCorta;
	}

	public void setBaseCorta(double baseCorta) {
		BaseCorta = baseCorta;
	}

	public double getLado() {
		return Lado;
	}

	public void setLado(double lado) {
		Lado = lado;
	}

	public Trapecio(String nombre, double baseLarga, double baseCorta, double lado) {
		super();
		Nombre = nombre;
		BaseLarga = baseLarga;
		BaseCorta = baseCorta;
		Lado = lado;
	}

	@Override
	public String toString() {
		return "Trapecio [Nombre=" + Nombre + ", BaseLarga=" + BaseLarga + ", BaseCorta=" + BaseCorta + ", Lado=" + Lado
				+ "]";
	}
	
	

}
