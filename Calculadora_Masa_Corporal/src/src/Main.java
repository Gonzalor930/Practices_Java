package src;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	System.out.println("Quiere comenzar con la calculadora? 1 = SI / 2 = NO ");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	if (num == 1) {
		calculadorIndice();
	}else {
		System.out.println("Entendido, Hasta pronto!!");
	}
scanner.close();
}
	

	private static void calculadorIndice() {
	 Double altura;
	 Double peso;
	 Double indice;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Ingrese su altura en Metros: ");
	 altura = scanner.nextDouble();
	 altura = Math.pow(altura,2);
	 System.out.println("Ingrese su peso en kilos: ");
	 peso = scanner.nextDouble();
	 indice = peso/altura;
	 System.out.println("Su IPC es: "+ indice);
	 scanner.close();
	
	}
}