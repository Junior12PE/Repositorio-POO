package Biblioteca;

public class Libro {
	private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro() {
    }

	public Libro(String titulo, String autor, int añoPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	 public void mostrarLibro() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Año de Publicación: " + añoPublicacion);
	        System.out.println("---------------------------");
	    }

}
