package logica;
import utiles.Validaciones;
import utiles.ValorPorDefecto;


public class Material implements Identificador{
	
	private String nombre;
	private double precioU;
	private String unidadMedida;
	private int cantMetCuad;
	private String ID;
	
	public Material(String ID,String nombre,double precioU,String unidadMedida, int cantMetCuad){
		this.nombre=nombre;
		this.precioU=precioU;
		this.unidadMedida=unidadMedida;
		this.ID=ID;
		this.cantMetCuad = cantMetCuad;
	}
	
	public int getCantMetCuad(){
		return cantMetCuad;
	}
	public String getID(){
		return ID;
	}
	public String getNombre(){
		return nombre;
	}
	public double getPrecioU(){
		return precioU;
	}
	public String getUnidadMedida(){
		return unidadMedida;
	}
	
	public void setCantMetCuad(int cant){
		if(Validaciones.validarCant(cant, 0, ValorPorDefecto.limiteCantMetCuad)){
			this.cantMetCuad = cant;
		}
	}
	public void setNombre(String nombre){
		if(Validaciones.validarNombre(nombre))
			this.nombre=nombre;
		else
			throw new IllegalArgumentException("El nombre debe ser menor de 20 caracteres");
	}
	public void setPrecioU(double precioU) throws Exception{
		if(precioU > 0)
			this.precioU=precioU;
		else
			throw new IllegalArgumentException("El precio debe ser un valor positivo");
	}
	public void setUnidadMedida(String unidadMedida){
		if (Validaciones.validarUnidad(unidadMedida))
			this.unidadMedida = unidadMedida;
	}

}
