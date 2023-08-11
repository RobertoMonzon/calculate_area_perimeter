
public class testFiguras {

	public static void main(String[] args) {
		Triangulo t1= new Triangulo("Triangulo t1", 20.0,10.0,15.0);
		Cuadrado c1= new Cuadrado("Cuadrado c1", 24.0);
		Rectangulo r1= new Rectangulo("Rectangulo r1",20.0,10.0);
		Romboide rom1= new Romboide("Romboide rom1",20.0,10.0);
		Rombo ro1= new Rombo("Rombo ro1",10.0,12.0,14.0);
		Trapecio tra1= new Trapecio("Trapecio tra1",10.0,20.0,30.0);
		imprimirCalculo(t1);
		imprimirCalculo1(c1);
		imprimirCalculo2(r1);
		imprimirCalculo3(rom1);
		imprimirCalculo4(ro1);
		 imprimirCalculo5(tra1);



	}
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("El araea del:  "+t.getNombre()+ " es: " + t.CalcularArea());
		System.out.println("El perimetro del:  "+t.getNombre()+ " es: " + t.CalcularPerimetro());
		System.out.println(" ");
	}
	public static void imprimirCalculo1(FiguraGeometrica  c) {
		System.out.println(c);
		System.out.println("El araea del:  "+c.getNombre()+ " es: " + c.CalcularArea());
		System.out.println("El perimetro del:  "+c.getNombre()+ " es: " + c.CalcularPerimetro());
		System.out.println(" ");
	}
	
	public static void imprimirCalculo2(FiguraGeometrica  r) {
		System.out.println(r);
		System.out.println("El araea del:  "+r.getNombre()+ " es: " + r.CalcularArea());
		System.out.println("El perimetro del:  "+r.getNombre()+ " es: " + r.CalcularPerimetro());
		System.out.println(" ");
	}
	
	public static void imprimirCalculo3(FiguraGeometrica  rom) {
		System.out.println(rom);
		System.out.println("El araea del:  "+rom.getNombre()+ " es: " + rom.CalcularArea());
		System.out.println("El perimetro del:  "+rom.getNombre()+ " es: " + rom.CalcularPerimetro());
		System.out.println(" ");
	}
	
	public static void imprimirCalculo4(FiguraGeometrica  ro) {
		System.out.println(ro);
		System.out.println("El araea del:  "+ro.getNombre()+ " es: " + ro.CalcularArea());
		System.out.println("El perimetro del:  "+ro.getNombre()+ " es: " + ro.CalcularPerimetro());
		System.out.println(" ");
	}
	
	public static void imprimirCalculo5(FiguraGeometrica  tra) {
		System.out.println(tra);
		System.out.println("El araea del:  "+tra.getNombre()+ " es: " + tra.CalcularArea());
		System.out.println("El perimetro del:  "+tra.getNombre()+ " es: " + tra.CalcularPerimetro());
		System.out.println(" ");
	}
	
	

}
