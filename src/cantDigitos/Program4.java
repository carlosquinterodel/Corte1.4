package cantDigitos;

public class Program4 {

	public static void main(String[] args) {
		int numero = 19887666;
		int resp = tamañoNumero(numero, 0);
		System.out.println("El numero "+numero+" tiene "+resp+" digitos");

	}
	
	public static int tamañoNumero (int x, int contador) {
		if (x == 0) {
			if(contador == 0) {
				contador ++;
			}
			return contador;
		}else {
			return tamañoNumero (x/10, contador+1);
		}
	}

}
