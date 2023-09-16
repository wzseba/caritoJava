package main;

public class Producto {
	
	private String nombre;
	private double precio;
	private Categoria categoria;
	
	public Producto(String nombre, double precio, Categoria categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio(){
		return this.precio;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
}
