package oposicion;

public class Main {

	public static void main(String[] args) {
		 int nTemas=31;
		 int nTemasAElegir=4;
		 System.out.println("Número de temas=31");
		 System.out.println("Número de temas a elegir=4");
		 System.out.println();
		 System.out.println("Temas preparados     ||     Probabilidad (en porcentaje) de que te toque uno de los preparados");
		 System.out.println("----------------------------------------------------------------------------------------------");
		 for (int nTemasPreparados=1; nTemasPreparados<nTemas+1; nTemasPreparados++) {		 		 
			 long casosFavorables=1;
			 for (int i=0; i<nTemasAElegir; i++) casosFavorables*=(nTemas-nTemasPreparados-i);
		 
			 long casosPosibles=1;
			 for (int i=0; i<nTemasAElegir; i++) casosPosibles*=(nTemas-i);
			 
			 double pAFavor=1-(casosFavorables/(double) casosPosibles);
			 double porcentaje=pAFavor*100;
			 
			 System.out.println("     "+nTemasPreparados+"                             "+porcentaje);
		 }
	}

}
