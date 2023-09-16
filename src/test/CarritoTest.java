package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Carrito;
import main.Categoria;
import main.Producto;

class CarritoTest {
	
	private Carrito carrito;
	
	@BeforeEach
	public void crearCarrito() {
		carrito = new Carrito();
	}

	@Test
	void verificarCantidadCeroEnCarritoTest() {
		assertEquals(0, carrito.getCantidadProductos());
	}
	
	@Test
	void verificarCantidadUnoEnCarritoTest() {
		/*Agregar producto*/
		carrito.agregarProducto(new Producto("Celular moto g", 90000.0, Categoria.TECNOLOGIA));
		
		assertEquals(1, carrito.getCantidadProductos());
	}
	
	@Test
	void calcularPrecioTotalTest() {
		/*Agregar producto*/
		carrito.agregarProducto(new Producto("Celular moto g", 90000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("Televisor 4k", 120000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("Cocina", 90000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("Lavaropas", 90000.0, Categoria.TECNOLOGIA));
		assertEquals(390000.0, carrito.getPrecioTotal());
	}
	
	@Test
	void calcularPrecioTotalTecnologiaTest() {
		/*Agregar producto*/
		carrito.agregarProducto(new Producto("Celular moto g", 90000.0, Categoria.TECNOLOGIA));
		carrito.agregarProducto(new Producto("Asado", 5000.0, Categoria.ALIMENTO));
		carrito.agregarProducto(new Producto("Martillo", 2000.0, Categoria.FERRETERIA));
		carrito.agregarProducto(new Producto("Monitor", 90000.0, Categoria.TECNOLOGIA));
		assertEquals(180000.0, carrito.getPrecioTotal(Categoria.TECNOLOGIA));
	}

}
