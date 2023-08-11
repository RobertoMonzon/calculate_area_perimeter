
public class Rombo  implements FiguraGeometrica{
	private String Nombre;
	private double DiagonalMayor;
	private double DiagonalMenor;
	private double Lado;
	
	public double CalcularPerimetro() {
		return (getLado()*4);
	}
	
	public double CalcularArea() {
		return(getDiagonalMayor()*getDiagonalMenor())/2;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getDiagonalMayor() {
		return DiagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		DiagonalMayor = diagonalMayor;
	}

	public double getDiagonalMenor() {
		return DiagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		DiagonalMenor = diagonalMenor;
	}

	public double getLado() {
		return Lado;
	}

	public void setLado(double lado) {
		Lado = lado;
	}

	@Override
	public String toString() {
		return "Rombo [Nombre=" + Nombre + ", DiagonalMayor=" + DiagonalMayor + ", DiagonalMenor=" + DiagonalMenor
				+ ", Lado=" + Lado + "]";
	}

	public Rombo(String nombre, double diagonalMayor, double diagonalMenor, double lado) {
		super();
		Nombre = nombre;
		DiagonalMayor = diagonalMayor;
		DiagonalMenor = diagonalMenor;
		Lado = lado;
	}
	
	

	
}