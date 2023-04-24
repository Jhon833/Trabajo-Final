package TF;

//import java.util.Date;

public class Item {
	Producto producto;
	private boolean esFisico;
	private int cantidad;

	public Item(Producto producto, boolean esFisico, int cantidad) {
		this.producto = producto;
		this.esFisico = esFisico;
		this.cantidad = cantidad;
	}

	public boolean comprobarStock() throws NoStockException {
		if (producto.getStock() != 0) {
			return true;
		} else {
			throw new NoStockException();
		}
	}

	public double getprecioVenta() {
		double incrementoPorcentaje = 0;

		if (producto instanceof Libro) {  
			
			if (esFisico) {
				// Si es libro y es fisico
				incrementoPorcentaje = 1.18;
			} else {
				// Si es libro y es digital
				incrementoPorcentaje = 1.08;
			}
		} else {
			if (esFisico) {
				// Si es revisdta y es fisico
				incrementoPorcentaje = 1.22;
			} else {
				// revista digital
				incrementoPorcentaje = 1.12;
			}
		}
		return (producto.getPrecioCompra() * incrementoPorcentaje)*cantidad;  
		}

	public void getItemInfo() {
        if (producto instanceof Detallable) {
            Detallable detallable = (Detallable) producto;
			if(esFisico){
				System.out.println("Formato: Físico");
			} else {
				System.out.println("Formato: Digital");
			}
            detallable.mostrarDetalles();
			System.out.println("Cantidad" + cantidad);
			System.out.println("Precio: " + getprecioVenta());
        	}
    	}
	}

	// public double Stock() {
	// 	if(comprobarStock()){
	// 		return getprecioVenta(esFisico);
	// 	} else {
	// 		System.out.println("No hay stock");
	// 		return 0.0;
	// 	}
	// }