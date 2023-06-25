package logica;
import java.util.ArrayList;

import cu.edu.cujae.ceis.tree.binary.BinaryTree;
import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import utiles.Utiles;



public class Reporte {
	
	private ConsejoAdmin admin;
	
	/////Arbol de decisiones/////
	private BinaryTreeNode<PlantillaIndice> arbolPrioridad;
	
	
	public Reporte(ConsejoAdmin admin) {
		this.admin = admin;
		arbolPrioridad = new BinaryTreeNode<PlantillaIndice>();
	}
	
	public class IDIndicePrioridad{
		private String ID;
		private float indice;
		
		public IDIndicePrioridad(String id, float indice){
			this.ID = id;
			this.indice = indice;			
		}
		
		public String getID(){
			return ID;
		}
		public float getIndice(){
			return indice;
		}
	}
	
	public IDIndicePrioridad buscarIDViviendaPrioridad(){
		String ID = "";
		float indiceMayor = 0;
		float indice = 0;
		for(Plantilla p: admin.getListaPlantillas()){
			indice = indicePrioridad(p);
			if(indiceMayor < indice)
				indiceMayor = indice;
			if(indiceMayor == indice)
				ID = p.getFicha().getDictamen().getID();
		}
		return new IDIndicePrioridad(ID, indiceMayor);
	}
	
	private float indicePrioridad(Plantilla p){
		Ficha f = p.getFicha();
		Dictamen d = f.getDictamen();
		NucleoFamiliar n = f.getNucleo();
		float altura = 4;   //altura promedio de una vivienda.
		
		float indice = 0;
		
		float areaBasesCasa = d.Area() * 2;
		float perimetroCasa = (d.getDim1() + d.getDim2()) * 2;
		float areaLateralCasa = perimetroCasa * altura;
		float areaCasaTotal = areaBasesCasa + areaLateralCasa; 
		
		float areaAfectada = f.areaAfectaciones();
		
		float concentracionAfectacion = areaAfectada / areaCasaTotal;
		
		float valorNucleo = n.getTotalPersonas() + n.getCantVulnerables();
		
		int facilidadTemporal = 1;
		if(d.getFacilidadTemporal())
			facilidadTemporal = 2;
		
		indice = (concentracionAfectacion + valorNucleo)/ facilidadTemporal;
		
		return indice;
	}
	
	public double calcularPromedioFondos(){
		double totalFondos = 0;
		int totalCubicaciones = 0;
		if(!admin.getListaPlantillas().isEmpty()){
			for(Plantilla p: admin.getListaPlantillas()){
				for(Cubicacion c: p.getListaCubViv()){
					totalFondos += c.getPrecioMatP();
					totalCubicaciones++;
				}							
			}
		}
		else
			totalCubicaciones = 1;
		
		return Utiles.formatoDinero(totalFondos/totalCubicaciones);
	}
	
	
	public double calcularTotalFondos() {
		double totalFondos = 0;
			for(Plantilla p: admin.getListaPlantillas()){
				for(Cubicacion c: p.getListaCubViv()){
					totalFondos += c.getPrecioMatP();
				}
			}
			return totalFondos;
		}
		
	public class ViviendaMayorHab{
		public ArrayList<String> ids; 
		public int cantHab;
		
		public ViviendaMayorHab(ArrayList<String> ids,int cantHab){
			this.ids = ids;
			this.cantHab = cantHab;
		}
		
		public ArrayList<String> getIds(){
			return ids;
		}
		public int getCantHab(){
			return cantHab;
		}
	}	
		
	
	public ViviendaMayorHab buscarViviendaMayorHab(){
		ArrayList <String> ids = new ArrayList<String>();
		int cantHab = 0;
		
		for(Plantilla p: admin.getListaPlantillas()){
			Ficha f = p.getFicha();
			
			int total = f.getNucleo().getTotalPersonas();
			if(total > cantHab){
				cantHab = total;			    
			    ids.clear();			    
	        }
			if(total == cantHab){
				ids.add(f.getDictamen().getID());
			}
			
		}		
		return new ViviendaMayorHab(ids, cantHab);		
	}
	
	
	public class MaterialMasFondos{
		public String nombre;
		public double fondos;
		
		public MaterialMasFondos(String nombre, double fondos){
			this.nombre = nombre;
			this.fondos = fondos;
		}
		
		public String getNombre(){
			return nombre;
		}
		public double getFondos(){
			return fondos;
		}
	}
	
	public MaterialMasFondos buscarMaterialMasFondos(){
		ArrayList<MaterialMasFondos> lista = new ArrayList<MaterialMasFondos>();
		String material = "";
		String nombre = "";
		double fondosAux = 0;
		double masFondos = 0;
		
		for(Material m: admin.getListaMateriales()){
			fondosAux = 0;
			nombre = m.getNombre();
			for(Plantilla p: admin.getListaPlantillas()){
				for(Cubicacion c: p.getListaCubViv()){
					if(c.getMaterial().getNombre().equals(nombre))
						fondosAux += c.getPrecioMatP();
				}
			}
			
			lista.add(new MaterialMasFondos(nombre, fondosAux));
		}
		
		for(MaterialMasFondos m: lista){
			if(m.getFondos() > 0){
				if(m.getFondos() > masFondos)
					masFondos = m.getFondos();
				if(m.getFondos() == masFondos)
					material = m.getNombre();
			}
		}
		return new MaterialMasFondos(material, masFondos);
	}
	
	public class DatosMaterialSelec{
		public String nombre;
		public double fondo;
		public int cantidad;
		public String medida;
		
		public DatosMaterialSelec(String nombre, double fondo, int cantidad, String medida){
			this.nombre = nombre;
			this.fondo = fondo;
			this.cantidad = cantidad;
			this.medida = medida;
		}
		
		public String getNombre() {
			return nombre;
		}
		public double getFondo() {
			return fondo;
		}
		public int getCantidad() {
			return cantidad;
		}
		public String getMedida() {
			return medida;
		}
	}
	
	public DatosMaterialSelec buscarDatosMaterialSelec(String nombre){
		double fondo = 0;
		int cantidad = 0;
		String medida = "";
		for(Plantilla p: admin.getListaPlantillas()){
			for(Afectacion a: p.getFicha().getAfectacionesVivienda()){
				Cubicacion c = a.getCubicacion();
				if(nombre.equals(c.getMaterial().getNombre())){
					cantidad += c.getCantMaterialP();
					fondo += c.getPrecioMatP();
					medida = c.getMaterial().getUnidadMedida();
			}
			
		    }
		}
		return new DatosMaterialSelec(nombre, fondo, cantidad, medida);
	}	
	

	/////Funcionalidades del arbol de decisiones/////
	
	public class PlantillaIndice{
		
		private Plantilla plantilla;
		private float indicePrioridad;
		
		public PlantillaIndice(Plantilla plantilla) {
			this.plantilla = plantilla;
			this.indicePrioridad = indicePrioridad(plantilla);
		}

		public Plantilla getPlantilla() {
			return plantilla;
		}
		
		public void setPlantilla(Plantilla plantilla) {
			this.plantilla = plantilla;
		}
		
		public float getIndicePrioridad() {
			return indicePrioridad;
		}
		
		public void setIndicePrioridad(float indicePrioridad) {
			this.indicePrioridad = indicePrioridad;
		}
		
		
	}
	
	
	public BinaryTree<PlantillaIndice> crearArbol(){
		BinaryTree<PlantillaIndice> arbol = new BinaryTree<PlantillaIndice>();
		ArrayList<Plantilla> plantillas = admin.getListaPlantillas();
		float indiceRaiz = indicePrioridad(plantillas.get(0));
		arbol.setRoot(new BinaryTreeNode<PlantillaIndice>(new PlantillaIndice(plantillas.get(0))));
		
		for(int i=1 ; i < plantillas.size();i++){
			PlantillaIndice pi = new PlantillaIndice(plantillas.get(i));
			if(pi.getIndicePrioridad() > indiceRaiz){
				((BinaryTreeNode<PlantillaIndice>)arbol.getRoot()).setLeft(new BinaryTreeNode<PlantillaIndice>(pi));
			
			}
				
			
				
		}
		
		return arbol;
	}
	
	
	
	
	
}