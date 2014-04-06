
public class Ejercicio1 {
	private static int[] nros = new int[10];

	public static void main(String[] args) {
		carga();
		int suma = sumatoria();
		System.out.println("La sumatoria es: " + suma);
		float prom = promedio();
		System.out.println("El promedio es: " + prom);
		int[] menores = menores();
		System.out.println("Los nros menores al promedio son:");
		int i = 0;
		while(menores[i] != 0){
			System.out.println(menores[i++]);
		}
	}

	public int[] getNros() {
		return nros;
	}

	@SuppressWarnings("static-access")
	public void setNros(int[] nros) {
		this.nros = nros;
	}
	
	public static void carga(){
		nros[0] = 15;
		for(int i = 1; i < 10; i++){
			nros[i] = nros[i-1] + 3;
		}
		
		for(int i = 0; i < 10; i++){
			if(nros[i]%2 == 0){
				nros[i] /= 2;
			}
		}
	}
	
	public static int sumatoria(){
		int suma = 0;
		
		for(int i = 0; i < 10; i++){
			suma += nros[i];
		}
		
		return suma;
	}
	
	public static float promedio(){
		int suma = sumatoria();
		float prom;
		prom = suma / 10;
		return prom;
	}
	
	public static int[] menores(){
		float prom = promedio();
		int[] menor = new int[10];
		int j = 0;
		for(int i = 0; i < 10; i++){
			if(nros[i] < prom){
				menor[j++] = nros[i];
			}
		}
		return menor;
	}
}
