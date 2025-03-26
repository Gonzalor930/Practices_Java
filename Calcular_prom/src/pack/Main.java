package pack;
import java.util.Scanner;


public class Main {
public static void main (String[] args) {
	System.out.println("Ingrese el primer numero");
	Integer num1 = cargarNumero();
	System.out.println("Ingrese el segundo numero");
	Integer num2 = cargarNumero();
	System.out.println("Ingrese el tercer numero");
	Integer num3 = cargarNumero();
	
	Integer suma = num1+num2+num3;
	Double prom = Double.valueOf(suma/3);
	System.out.println("El promedio es "+ prom);
	
	espar();
}


public static int cargarNumero() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = scanner.nextInt();
    return numero;
}

public static void espar() {
	Scanner scan = new Scanner(System.in);
	System.out.println("ingrese un numero para ver si es par");
	Double unNum = scan.nextDouble();
	Boolean par = unNum % 2 == 0;
	if (par) {
		System.out.println("El numero "+unNum+" es par");
	}else {
		System.out.println("El numero "+unNum+ " no es par");
	}
}
}
