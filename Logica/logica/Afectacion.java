package logica;

import utiles.Utiles;
import utiles.Validaciones;
import utiles.ValorPorDefecto;


abstract public class Afectacion implements Identificador, Dimensiones {
	
	protected boolean afectTotal;
	protected String ID;
	protected float dim1;
	protected float dim2;
	public Material material;
	public Cubicacion cubicacion;
	
	
	public Afectacion(boolean afectTotal, float dim1,float dim2,Material material) {
		this.setAfectTotal(afectTotal);
		this.ID = Utiles.autoID();
		this.setDim1(dim1);
		this.setDim2(dim2);
		this.material = material;
		this.cubicacion = new Cubicacion(this.material, Area());;
	}

	
	public boolean getAfectTotal() {
		return afectTotal;
	}
	public String getID(){
		return this.ID;
	}
	public float getDim1(){
		return dim1;
	}
	public float getDim2(){
		return dim2;
	}	
	public Cubicacion getCubicacion() {
		return cubicacion;
	}	
	public Material getMaterial() {
		return material;
	}

	public void setMaterialTecho(String nombreMat) {
		if(Validaciones.validarMaterialTecho(nombreMat))
			this.material = ConsejoAdmin.getInstance().definirMaterialNec(nombreMat);
		else
			throw new IllegalArgumentException(
					"El material insertado no se encuentra en la Lista disponible");
	}
	
	public void setMaterialPared(String nombreMat){
		if(Validaciones.validarMaterialPared(nombreMat))
			this.material = ConsejoAdmin.getInstance().definirMaterialNec(nombreMat);
		else
			throw new IllegalArgumentException(
					"El material insertado no se encuentra en la Lista disponible");
	}

	public void setAfectTotal(boolean afectTotal) {	
		this.afectTotal = afectTotal;
	}

	public void setDim1(float dim1){
		boolean esDim1 = true;
		setDimensiones(dim1, esDim1);
	}
	public void setDim2(float dim2){
		boolean esDim1 = false;
		setDimensiones(dim2, esDim1);
	}
	
	public void setDimensiones(float dim, boolean esDim1){
		String mensaje = "";
		if(Validaciones.validarDim(dim, ValorPorDefecto.limiteMinAfectacion , ValorPorDefecto.limiteMaxAfectacion))
			if(esDim1)
				this.dim1 = dim;
			else
				this.dim2 = dim;
		else{
			if(esDim1)
				mensaje = "largo";
			else
				mensaje = "ancho";
			throw new IllegalArgumentException("El " + mensaje + " insertado es inválido");
		}
	}
	
	//Calcular el área afectada
	public float Area(){
		return dim1*dim2;
	}
}
