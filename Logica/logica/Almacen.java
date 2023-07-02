package logica;

import java.util.ArrayList;

public class Almacen {
	
	private String localidad;
	private ArrayList<String> municipios;
	
	public Almacen(String localidad, ArrayList<String> municipios){
		setLocalidad(localidad);
		setMunicipios(municipios);
	}
	
	
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public ArrayList<String> getMunicipios() {
		return municipios;
	}
	public void setMunicipios(ArrayList<String> municipios) {
		this.municipios = municipios;
	}
	
}
