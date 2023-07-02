package logica;
import java.io.Serializable;
import java.util.ArrayList;




public class Ficha implements Serializable{
	
	private static final long serialVersionUID = 2L;
	public Dictamen dictamen;
	public NucleoFamiliar nucleo;
	public ArrayList<Afectacion> AfectacionesVivienda;
	public ArrayList<ElementoAfectado> listaElementos;
	
	
	public Ficha(){
	
		this.dictamen = new Dictamen(null, null, null, null, null, 1, 1, false);
		this.nucleo = new NucleoFamiliar(null, 1, 0, 0, 0);
		this.AfectacionesVivienda = new ArrayList<Afectacion>();
		this.listaElementos = null;
	}

	public Dictamen getDictamen(){
		return dictamen;
	}

	public NucleoFamiliar getNucleo(){
		return nucleo;
	}

	public ArrayList<ElementoAfectado> getListaElementos() {
		return listaElementos;
	}
	public ArrayList<Afectacion> getAfectacionesVivienda(){
		return AfectacionesVivienda;
	}

	public void setListaElementos(ArrayList<ElementoAfectado> listaE){
		this.listaElementos = listaE;
	}
	public void setListaAfectaciones(ArrayList<Afectacion> listaAfect){
		if(listaAfect != null){
			this.AfectacionesVivienda = listaAfect;
		}
		else
			throw new IllegalArgumentException("Lista de afectaciones vacía");
	}

	
	public AfectPared nuevaAfectacionPared(){
		return new AfectPared(false, 1, 1, null, false);
	}
	
	public AfectTecho nuevaAfectacionTecho(){
		return new AfectTecho(false, 1, 1, null);
	}
	
	public void agregarAfectacionVivienda(Afectacion afectacion){
		AfectacionesVivienda.add(afectacion);
	}
	
	public void nuevaListaElementos(){
		this.listaElementos = new ArrayList<ElementoAfectado>();
	}
	
	public ElementoAfectado nuevoElemento(){
		return new ElementoAfectado(null, 1);
	}
	
	public void agregarElemento(ElementoAfectado elemento){
		listaElementos.add(elemento);
	}
	
	public Plantilla crearPlantilla(String municipio){
		Plantilla plantilla = new Plantilla(this, municipio);
		return plantilla;
	}
	
	public float areaAfectaciones(){
		float area = 0;
		for(Afectacion a: AfectacionesVivienda){
			area += a.Area();
		}
		return area;
	}

}
	