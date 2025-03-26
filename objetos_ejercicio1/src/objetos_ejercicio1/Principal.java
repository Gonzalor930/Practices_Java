package objetos_ejercicio1;

public class Principal {
    public static void main(String[] args) {
        // Crear dos libros
        Libro libro1 = new Libro("Gabriel Garcia Marquez", "Cien años de soledad", 482);
        Libro libro2 = new Libro("J.K. Rowling", "Harry Potter y la piedra filosofal", 320);

        // Mostrar información de los libros
        libro1.mostrarLibro();
        libro2.mostrarLibro();

        // Comparar los libros por número de páginas
        Libro.compararLibros(libro1, libro2);
    }
}