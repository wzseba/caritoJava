package main;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> productos;

	public Carrito() {
		productos = new ArrayList<Producto>();
	}

	public int getCantidadProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public double getPrecioTotal() {
		double precioTotal = 0;

		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public double getPrecioTotal(Categoria categoria) {
		double precioTotal = 0;

		for (Producto producto : productos) {
			if(producto.getCategoria().equals(categoria))
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

}
