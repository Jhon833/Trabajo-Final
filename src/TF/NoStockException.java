package TF;



public class NoStockException extends Exception {
    public NoStockException() {
        super("No hay stock");
    }
}
