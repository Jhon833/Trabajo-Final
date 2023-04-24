package TF;


public class App {
    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro("0000", "Test", "20/09/1990", 450, 3, "Marechal", "Gredos");
        Revista rev1 = new Revista("R001", "Users", "16/04/2022", 400, 1, "?");

        Item item1 = new Item(libro1, true, 1);
        Item item2 = new Item(rev1, false, 1);

        item1.comprobarStock();
        //item1.getItemInfo();
        //System.out.println("");

        item2.comprobarStock();
        //item2.getItemInfo();

        Carrito carrito = new Carrito();
        carrito.agregarItem(item1);
        carrito.agregarItem(item2);
        carrito.mostrarCarrito();
        carrito.costoTotal();
    }
}
