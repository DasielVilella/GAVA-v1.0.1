package logica;

import java.io.Serializable;

import utiles.Validaciones;

public class NucleoFamiliar implements Serializable{

	private static final long serialVersionUID = 4;
	private String ciJefe;
	private int totalPersonas;
	private int cantAncianos;
	private int cantNinnos;
	private int cantEmbarazadas;
	
	
	public NucleoFamiliar(String ciJefe,int totalPersonas, int cantAncianos, 
			int cantNinnos, int cantEmbarazadas){
		this.setCIJefe(ciJefe);
		this.setTotalPersonas(totalPersonas);;
		this.setCantAncianos(cantAncianos);
		this.setCantNinnos(cantNinnos);;
		this.setCantEmbarazadas(cantEmbarazadas);;
		
	}
	
	public String getCIJefe(){
		return ciJefe;
	}
	
	public int getTotalPersonas() {
		return totalPersonas;
	}

	public int getCantAncianos() {
		return cantAncianos;
	}

	public int getCantNinnos() {
		return cantNinnos;
	}

	public int getCantEmbarazadas() {
		return cantEmbarazadas;
	}

	public void setCIJefe(String ciJefe){
		if(ciJefe != null){
			if(Validaciones.validarCIJefe(ciJefe))
				this.ciJefe = ciJefe;
			else
				throw new IllegalArgumentException("El carné es incorrecto");
		}		
	}
	
	public void setTotalPersonas(int totalPersonas){
		if(totalPersonas > 0){
			this.totalPersonas = totalPersonas;
		}
		else
			throw new IllegalArgumentException("El total de personas debe ser mayor o igual que 1");
	}
	
	public void setNucleoFam(int ancianos, int ninnos, int embarazadas){
		if((ancianos + ninnos + embarazadas) <= this.getTotalPersonas()){
			setCantAncianos(ancianos);
			setCantNinnos(ninnos);
			setCantEmbarazadas(embarazadas);
		}
		else
			throw new IllegalArgumentException("El número de habitantes vulnerables no puede ser mayor al total de habitantes");
	}

	public void setCantAncianos(int cantAncianos){
		if(cantAncianos >= 0){
			this.cantAncianos = cantAncianos;
		}
		else
			throw new IllegalArgumentException("La cantidad de ancianos es errónea");
	}
	
	public void setCantNinnos(int cantNinnos){
		if(cantNinnos >= 0){
			if(cantNinnos == this.totalPersonas && this.cantAncianos == 0 && this.cantEmbarazadas == 0){
				throw new IllegalArgumentException("El único habitante de la vivienda no puede ser un niño");
			}
			else 
				this.cantNinnos = cantNinnos;
		}
		else
			throw new IllegalArgumentException("La cantidad de niños es errónea");
	}
	
	public void setCantEmbarazadas(int cantEmbarazadas) {
		if(cantEmbarazadas >= 0)
			this.cantEmbarazadas = cantEmbarazadas;	
		else
			throw new IllegalArgumentException("La cantidad de embarazadas es errónea");
	}
	
	public int getCantVulnerables(){
		return cantAncianos + cantEmbarazadas + cantNinnos;
	}
	

	
}
