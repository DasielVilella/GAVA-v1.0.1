package logica;
import java.util.Date;

import utiles.Utiles;
import utiles.Validaciones;
import utiles.ValorPorDefecto;

 public class Dictamen implements Identificador, Dimensiones {
	
	private String direccion;
	private String docLegal;
	private Date fechaLev;
	private String tipoHabitacional;
	private String tipoConstructiva;
	private String ID;
	private float dim1;
	private float dim2;
	private boolean facilidadTemporal;
	
	public Dictamen(String direccion,Date fechaLev,String docLegal,
			String tipoHabitacional,String tipoConstructiva,float dim1,float dim2, boolean facilidad){
		this.direccion = direccion;
		this.fechaLev = fechaLev;
		this.docLegal = docLegal;
		this.tipoHabitacional = tipoHabitacional;
		this.tipoConstructiva = tipoConstructiva;
	    this.ID = Utiles.autoID();
	    this.dim1 = dim1;
	    this.dim2 = dim2;
	    this.facilidadTemporal = facilidad;
	}
	
	

	public boolean getFacilidadTemporal(){
		return facilidadTemporal;
	}
	public void setFacilidadTemporal(boolean facilidad){
		this.facilidadTemporal = facilidad;
	}
	
	public String getDireccion(){
		return direccion;
	}
	public String getDocLegal(){
		return docLegal;
	}
	public Date getFechaLev(){
		return fechaLev;
	}
	public String getTipoConstructiva(){
		return tipoConstructiva;
	}
	public String getTipoHabitacional(){
		return tipoHabitacional;
	}
	public String getID(){
		return ID;
	}
	public float getDim1(){
		return dim1;
	}
	public float getDim2(){
		return dim2;
	}
	
	
	
	
	public void setDireccion(String direccion){
		if(Validaciones.validarDireccion(direccion))
			this.direccion=direccion;
		else 
			throw new IllegalArgumentException("La dirección insertada no es correcta.");
	}
	public void setDocLegal(String docLegal){
		if(Validaciones.validarDocLegal(docLegal))
			this.docLegal=docLegal;
		else 
			throw new IllegalArgumentException(docLegal + " no es una opción de Documento Legal");
	}
	
	public void setFechaLev(Date fecha_Lev){
		if(fecha_Lev != null)
			this.fechaLev = fecha_Lev;
	}
	
	public void setTipoHabitacional(String tipoHabitacional){
		if(Validaciones.validarTipoHab(tipoHabitacional))
			this.tipoHabitacional=tipoHabitacional;
		else
			throw new IllegalArgumentException(tipoHabitacional + " no es una opción de Tipología Habitacional");
	}
	
	public void setTipoConstructiva(String tipoConstructiva){
		if(Validaciones.validarTipoCons(tipoConstructiva))
			this.tipoConstructiva=tipoConstructiva;
		else 
			throw new IllegalArgumentException(tipoConstructiva + " no es una opción de Tipología Constructiva");
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
		String mensaje = null;
		if(Validaciones.validarDim(dim, ValorPorDefecto.limiteMinDimCasa, ValorPorDefecto.limiteMaxDimCasa)){
			if(esDim1)
				this.dim1 = dim;
			else
				this.dim2 = dim;
		}
		else{
			if(esDim1)
				mensaje = "El largo ";
			else
				mensaje = "El ancho ";
		
			throw new IllegalArgumentException(mensaje + "debe ser un valor entre " + ValorPorDefecto.limiteMinDimCasa + 
					"m y " + ValorPorDefecto.limiteMaxDimCasa + "m.");
		}
	}
	
	@Override
	public float Area(){
		return this.dim1 * this.dim2;
	}


}
