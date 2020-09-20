package arte;

public class Pintura {
	private int largo, ancho;
	
	public Pintura(int l, int a) {
		largo=l;
		ancho=a;
	}
	
	public static void main(String[] args) {
		Pintura p=new Pintura(3, 14);
		System.out.println("Dimensiones: Largo "+p.largo+" Ancho "+p.ancho);
	}

}
