package TF;



public class Libro extends Producto implements Detallable{

    String autor;
    String editorial;
    String tipo = "Libro";

    public Libro(String codigo, String titulo, String fechaPublicacion, double precioCompra, int stock, String autor, String editorial) {
        super(codigo, titulo, fechaPublicacion, precioCompra, stock);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Fecha de publicación: " + getFechaPublicacion());    
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        //System.out.println("Precio de compra: " + getPrecioCompra());
    }
}
