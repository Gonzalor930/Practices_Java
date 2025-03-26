package objetos_ejercicio1;

public class Libro {
    // Atributos
    private String autor;
    private String titulo;
    private int paginas;

    // Constructor vacío
    public Libro() {}

    // Constructor con parámetros
    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Método para mostrar la información del libro
    public void mostrarLibro() {
        System.out.println("El libro " + titulo + ", del autor " + autor + ", tiene " + paginas + " páginas.");
    }

    // Método para comparar dos libros por número de páginas
    public static void compararLibros(Libro libro1, Libro libro2) {
        if (libro1.getPaginas() > libro2.getPaginas()) {
            System.out.println("El libro \"" + libro1.getTitulo() + "\" tiene más páginas.");
        } else if (libro1.getPaginas() < libro2.getPaginas()) {
            System.out.println("El libro \"" + libro2.getTitulo() + "\" tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}