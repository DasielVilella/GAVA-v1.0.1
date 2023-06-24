package logica;


public class AfectPared extends Afectacion {
	
	public boolean carga;
	
	
	public AfectPared(boolean afectTotal, float dim1, float dim2,
			 Material material,boolean carga) {
		super(afectTotal, dim1, dim2, material); //Constructor de la superclase Afectacion
		this.carga=carga;
	}

	public boolean getCarga() {
		return carga;
	}
	
	public void setCarga(boolean carga) {
		this.carga = carga;
	}
}
