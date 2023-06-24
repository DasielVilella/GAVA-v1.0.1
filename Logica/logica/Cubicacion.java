package logica;


public class Cubicacion {
	
	private Material material;
	private int cantMaterialP;
	private double precioMatP;

	public Cubicacion(Material material,float area) {
		this.material = material;
		this.cantMaterialP = calcularCantMaterialP(area);
		this.precioMatP = calcularPrecioMatP();
	}
	
	public int getCantMaterialP() {
		return cantMaterialP;
	}

	public double getPrecioMatP (){
		return precioMatP;
	}

	public Material getMaterial() {
		return material;
	}

	/**
	 * Calcular la cantidad de material afectado
	 */
	public int calcularCantMaterialP(float area) {
		int cantMaterial = 0;
		for(Material m: ConsejoAdmin.getInstance().getListaMateriales()){
			if(this.material.getNombre().equals(m.getNombre()))
				cantMaterial = (int)(m.getCantMetCuad() * area) + 1; //mejor que sobre a que no alcance;
		}
		return cantMaterial;
	}
	
	
	/**
	 * Calcular el precio de la cantidad de material necesaria para la reparación
	 */
	public double calcularPrecioMatP() {
		double precioMatP = 0;
		precioMatP = this.material.getPrecioU() * this.cantMaterialP;
		return precioMatP;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}