package TF;

//package Trabajointegrador;

import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Item> Items;

	// Constructor
	public Carrito() {
		this.Items = new ArrayList<Item>();
	}
	// Metodos
	public void agregarItem(Item item) {
		this.Items.add(item);
	}

	public void quitarItem(Item item) {
		this.Items.remove(item);
	}

	public void mostrarCarrito() {
		if(Items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for(Item i: Items) {
				i.getItemInfo();
				System.out.println("");
			}
		}
	}

	public void costoTotal(){
		double suma = 0;
		for(Item i: Items) {
			suma = suma + i.getprecioVenta();
		}
		System.out.println("Costo Total: " + suma);
	}
}
	

