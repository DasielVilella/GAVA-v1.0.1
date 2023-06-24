package logica;
import java.util.ArrayList;

public class Plantilla {
	private Ficha ficha;
	private ArrayList<Cubicacion> listaCubVivienda;
	
	public Plantilla(Ficha ficha){
		this.ficha = ficha;
		this.listaCubVivienda = crearListaCubViv();	
	}
	
	
	public Ficha getFicha(){
		return ficha;
	}
	
	public ArrayList<Cubicacion> getListaCubViv(){
		return listaCubVivienda;
	}

	private ArrayList<Cubicacion> crearListaCubViv(){
		ArrayList<Cubicacion> listaCub = new ArrayList<Cubicacion>();
		for(Afectacion a: ficha.AfectacionesVivienda){
			listaCub.add(a.getCubicacion());
		}
		return listaCub;
	}
	
	public double totalCubicacion(){
		int totalCubicacion = 0;
    	for(Cubicacion c: listaCubVivienda){
    		totalCubicacion += c.getPrecioMatP();
    	}
    	return totalCubicacion;
		
	}
}
