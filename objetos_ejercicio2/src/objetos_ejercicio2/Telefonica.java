package objetos_ejercicio2;

public class Telefonica {

	    public static void main(String[] args) {
	        // Crear un array de 10 objetos Contacto
	        Contactos[] veccontactos = new Contactos[10];

	        // Inicializar el array con objetos Contacto
	        veccontactos[0] = new Contactos("Juan", 123456789);
	        veccontactos[1] = new Contactos("Gonzalo", 987654321);
	        veccontactos[2] = new Contactos("Facundo", 221421266);
	        veccontactos[3] = new Contactos("Camilo", 221434234);
	        veccontactos[4] = new Contactos("Jorge", 221487942);
	        veccontactos[5] = new Contactos("Tomas", 221421242);
	        veccontactos[6] = new Contactos("Martina", 223561242);
	        veccontactos[7] = new Contactos("Clara", 221428788);
	        // Mostrar los contactos
	        for (Contactos contacto : veccontactos) {
	            if (contacto != null) { // Verificar que el elemento no sea nulo
	                contacto.mostrarContacto();
	                int untel = contacto.getTelefono();
	                System.out.print("El numero es "+ untel);
	                System.out.println();
	            }
	        }
	    }
	}

