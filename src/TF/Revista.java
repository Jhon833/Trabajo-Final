package TF;



public class Revista extends Producto implements Detallable{

    String editor;
    String tipo = "Revista";

    public Revista(String codigo, String titulo, String fechaPublicacion, double precioCompra, int stock, String editor) {
        super(codigo, titulo, fechaPublicacion, precioCompra, stock);
        this.editor = editor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Fecha de publicación: " + getFechaPublicacion());    
        System.out.println("Editor: " + editor);
        //System.out.println("Precio de compra: " + getPrecioCompra());
    }
}