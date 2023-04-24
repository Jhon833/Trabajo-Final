package TF;

/*
    Un libro tiene 
    un título,
    un autor principal,
    una fecha de publicación,
    una editorial y un
    código.

    Una revista tiene
    un nombre,
    una fecha de publicación,
    un editor
    y un código. Cada
    producto (libro o revista) puede venderse como una copia física o digital.
    */

    // nombre -> titulo
    // fecha publicacion -> fecha publicacion
    // codigo -> codigo
    // autor -> Editor
    // editorial 

public abstract class Producto {
    
    // Atributos de instancia
    private String codigo;
    private String titulo;
    private String fechaPublicacion;
    private double precioCompra;
    private int stock;

    // Constructor
    public Producto(String codigo, String titulo, String fechaPublicacion, double precioCompra, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.precioCompra = precioCompra;
        this.stock = stock;
    }

    // Getters
    public String getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }
    
    public String getFechaPublicacion() {
        return this.fechaPublicacion;
    }
    
    public double getPrecioCompra() {
        return this.precioCompra;
    }

    public double getStock() {
        return this.stock;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setFecha(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
       
    public void setStock(int stock) {
        this.stock = stock;
    }
}
