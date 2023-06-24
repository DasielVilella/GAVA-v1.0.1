package logica;
import utiles.Validaciones;


public class ElementoAfectado {
	
	String nombre;
	int cantidad;
	
	public ElementoAfectado(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setNombre(String nombre) {
		if(Validaciones.validarNombre(nombre))
			this.nombre = nombre;
		else
			throw new IllegalArgumentException("El nombre del elemento es inválido");
		
	}

	public void setCantidad(int cantidad) {
		if(Validaciones.validarCant(cantidad, 1, 100))
			this.cantidad = cantidad;
		else
			throw new IllegalArgumentException("La cantidad debe ser un valor entre 1 y 100");
	}

	
}
