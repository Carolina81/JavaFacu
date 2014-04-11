import java.util.ArrayList;

public class Ejercicio4 {
	private static ArrayList<Integer> nros = new ArrayList<Integer>();

	public static ArrayList getNros() {
		return nros;
	}

	public static void setNros(ArrayList nros) {
		Ejercicio4.nros = nros;
	}

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
			System.out.println("................................." + menores[i++]);
		}
	}
	
	public static void carga(){
		int nro = 15;
		for(int i = 0; i < 10; i++){
			nros.add(i, nro);
			nro += 3;
		}
		
		for(int i = 0; i < 10; i++){
			if(nros.get(i)%2 == 0){
				nros.set(i, nros.get(i)/2);
			}
		}
	}
	
	public static int sumatoria(){
		int suma = 0;
		
		for(int i = 0; i < 10; i++){
			suma += nros.get(i);
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
			if(nros.get(i) < prom){
				menor[j++] = nros.get(i);
			}
		}
		return menor;
	}
}