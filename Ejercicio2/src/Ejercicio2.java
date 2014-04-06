
public class Ejercicio2 {
	private static String[] palabras;

	public static void main(String[] args) {
		carga();
		String separador = " Simpson, ";
		String oracion = getOracion(separador);
		System.out.println(oracion);
	}

	public String[] getPalabras() {
		return palabras;
	}

	@SuppressWarnings("static-access")
	public void setPalabras(String[] palabras) {
		this.palabras = palabras;
	}
	
	public static void carga(){
		palabras = new String[]{"Homer", "Marge", "Bart", "Lisa", "Maggie"};
	}
	
	public static String getOracion(String separador){
		String oracion = palabras[0] + separador;
		for(int i = 1; i < 5; i++){ 
			oracion += palabras[i] + separador;
		}
		return oracion;
	}
}
