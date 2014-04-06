
public class Ejercicio1 {
	private int[] nros = new int[10];

	public static void main(String[] args) {
		
	}

	public int[] getNros() {
		return nros;
	}

	public void setNros(int[] nros) {
		this.nros = nros;
	}
	
	public void carga(){
		nros[0] = 15;
		for(int i = 1; i < 10; i++){
			nros[i] += 3;
		}
		
		for(int i = 0; i < 10; i++){
			if(nros[i]%2 == 0){
				nros[i] /= 2;
			}
		}
	}
	
	public int sumatoria(){
		int suma = 0;
		
		for(int i = 0; i < 10; i++){
			suma += nros[i];
		}
		
		return suma;
	}
	
	public float promedio(){
		int suma = sumatoria();
		float prom;
		prom = suma / 10;
		return prom;
	}
}
