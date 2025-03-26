package objetos_ejercicio2;

public class Contactos {
private String nombre;
private int num;


public Contactos (String nombre, int num) {
	this.nombre = nombre;
    this.num = num;
}
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getTelefono() {
    return num;
}

public void setTelefono(int num) {
    this.num = num;
}

public void mostrarContacto() {
    System.out.println("Nombre: " + nombre + ", Teléfono: " + num);
}
}

