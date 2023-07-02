package logica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import cu.edu.cujae.ceis.graph.LinkedGraph;


public class ConsejoAdmin {
	
	
	private ArrayList <Material>listaMateriales;
	private ArrayList<Plantilla> listaPlantillas;
	private Reporte reporte;
	private Configuracion configuracion;
	private String plantillaPath= "";
	private String materialesPath="";
	private String path=null;
	
	
	
	private static ConsejoAdmin instance = null;
	
	private ConsejoAdmin(){
		
		this.listaMateriales = new ArrayList<Material>();
		this.listaPlantillas = new ArrayList<Plantilla>();
		reporte = new Reporte(this);
		configuracion = new Configuracion(this);
		plantillaPath=path+"\\data\\plantillas.dat";
		materialesPath=path+"\\data\\materiales.dat";
	}
	
	
	/**
	 * @return the instance
	 */
	public static ConsejoAdmin getInstance() {
		if(instance==null)
			instance=new ConsejoAdmin();
		return instance;
	}


	
	public ArrayList<Material> getListaMateriales() {
		return listaMateriales;
	}


	public ArrayList<Plantilla> getListaPlantillas(){
		return listaPlantillas;
	}
	
	public void setMateriales(ArrayList<Material>materiales) {
		
		this.listaMateriales=materiales;
	}


	public void inicializarMateriales(){
		
		Material cemento = new Material("374401110","Cemento",1.50,"kg",1);
		Material bloque = new Material("S/C","Bloque",20.00,"U",12);
		Material ladrillo = new Material("S/C","Ladrillo",10.00,"U",52);
		Material arena = new Material("44210401","Arena",536.00,"m^3",3);
		Material polvoPiedra = new Material("44140503", "Polvo de piedra", 564.00, "m^3",1);
		Material teja = new Material("41545009", "Teja", 1097.00, "U",9);
		Material plancha = new Material("41545010", "Plancha", 1791.00, "U",2);
		Material madera = new Material("N/C", "Madera", 15.00, "m^2",1);
		Material viga = new Material("12010100", "Viga", 130.00, "U",4);
		Material concreto = new Material("N/C", "Concreto", 2.00, "kg",2);
				
		this.listaMateriales.add(cemento);
		this.listaMateriales.add(bloque);
		this.listaMateriales.add(ladrillo);
		this.listaMateriales.add(arena);
		this.listaMateriales.add(polvoPiedra);
		this.listaMateriales.add(teja);
		this.listaMateriales.add(plancha);
		this.listaMateriales.add(madera);
		this.listaMateriales.add(viga);
		this.listaMateriales.add(concreto);		
	}


	public void inicializarValoresPorDefecto(){
		this.configuracion.configurarLimiteDireccion(200);
		this.configuracion.configurarLimiteNombreElemento(20);
		this.configuracion.configurarLimiteCantParedes(20);
		this.configuracion.configurarLimiteMinDimCasa(5);
		this.configuracion.configurarLimiteMaxDimCasa(150);
		this.configuracion.configurarLimiteMaxTotalHabitantes(15);
		this.configuracion.configurarLimiteCantElementos(15);
		this.configuracion.configurarLimiteMinAfectacion((float) 0.1);
		this.configuracion.configurarLimiteMaxAfectacion(150);
	}
	

	public Ficha nuevaFicha(){
		return new Ficha();
	}
	
	
	
	public Material definirMaterialNec(String nombreMaterial) {
		Material material = null;
		
		for (Material m: getListaMateriales()){
			
			if(nombreMaterial.equals(m.getNombre())){
				material = m;
			}
		}
		
		return material;
	}
	
	public void agregarPlantilla(Plantilla plantilla){
		listaPlantillas.add(plantilla);
	}
	
	public void SetPlantillas(ArrayList<Plantilla>plantillas) {
		this.listaPlantillas=plantillas;
		
	}


	
	
	public Reporte.ViviendaMayorHab buscarViviendaMayorHab(){
		return reporte.buscarViviendaMayorHab();
	}
	public Reporte.DatosMaterialSelec buscarDatosMaterialSelec(String nombre){
		return reporte.buscarDatosMaterialSelec(nombre);
	}
	public Reporte.MaterialMasFondos buscarMaterialMasFondos(){
		return reporte.buscarMaterialMasFondos();
	}
	public double buscarTotalFondos(){
		return reporte.calcularTotalFondos();
	}
	public double buscarPromedioFondos(){
		return reporte.calcularPromedioFondos();
	}
	public Reporte.IDIndicePrioridad buscarViviendaPrioridad(){
		return reporte.buscarIDViviendaPrioridad();
	}
	
	
	
	public void nuevoMaterial(String ID,String nombre,double precioU,String unidadMedida,int cantMetCuad){
		Material material = new Material(ID, nombre, precioU, unidadMedida, cantMetCuad);
		this.listaMateriales.add(material);
	}
	
	public void agregarMaterialPared(String ID,String nombre,double precioU,String unidadMedida,int cantMetCuad){
		configuracion.agregarMaterialPared(nombre);
		this.nuevoMaterial(ID, nombre, precioU, unidadMedida, cantMetCuad);
	}
	public void agregarMaterialTecho(String ID,String nombre,double precioU,String unidadMedida,int cantMetCuad){
		configuracion.agregarMaterialTecho(nombre);
		this.nuevoMaterial(ID, nombre, precioU, unidadMedida, cantMetCuad);
	}


	public void eliminarMaterial(String material){
		configuracion.eliminarMaterial(material);
	}
	public void cambiarLimiteDireccion(int limite){
		configuracion.configurarLimiteDireccion(limite);
	}
	public void cambiarLimiteNombreElemento(int limite){
		configuracion.configurarLimiteNombreElemento(limite);
	}
	public void cambiarLimiteCantParedes(int limite){
		configuracion.configurarLimiteCantParedes(limite);
	}
	public void cambiarLimiteMinDimCasa(float limite){
		configuracion.configurarLimiteMinDimCasa(limite);
	}
	public void cambiarLimiteMaxDimCasa(float limite){
		configuracion.configurarLimiteMaxDimCasa(limite);
	}
	public void cambiarLimiteMaxTotalHabitantes(int limite){
		configuracion.configurarLimiteMaxTotalHabitantes(limite);
	}
	public void cambiarLimiteCantElementos(int limite){
		configuracion.configurarLimiteCantElementos(limite);
	}
	public void cambiarLimiteMinAfectacion(float limite){
		configuracion.configurarLimiteMinAfectacion(limite);
	}
	public void cambiarLimiteMaxAfectacion(float limite){
		configuracion.configurarLimiteMaxAfectacion(limite);
	}
	
	//**************************************************************************************************************************************************
	//******************************************************   AlMACENAMIENTO FICHEROS   *******************************************************
	//**************************************************************************************************************************************************
	
	public void MaterialesFichero(){            //Escribir en el fichero de los materiales
		
		try {
			FileOutputStream MfileOut =new FileOutputStream(materialesPath);
			ObjectOutputStream Mobjout =new ObjectOutputStream(MfileOut);
			Mobjout.writeObject(listaMateriales);
			MfileOut.close();
			Mobjout.close();
			
		}catch (Exception e) {
			System.out.println("Error"+ e.getMessage());
		}
		
		
	}
	
public void PlantillaFicheros(){         //Escribir en el fichero de las platillas
		
		try {
			
			FileOutputStream PfileOut =new FileOutputStream(materialesPath);
			ObjectOutputStream Pobjout =new ObjectOutputStream(PfileOut);
			Pobjout.writeObject(listaMateriales);
			PfileOut.close();
			Pobjout.close();
			
		}catch (Exception e) {
			System.out.println("Error"+ e.getMessage());
		}
		
		
	}
	
	
	public void loadMAteriales() {             //Lee Los materiales del fichero y los mete en el ArrayList De materiales 
		
		
		try {
			FileInputStream MfileIn = new FileInputStream(materialesPath);
			ObjectInputStream MObjectIn = new ObjectInputStream(MfileIn);
			setMateriales((ArrayList<Material>)MObjectIn.readObject());
			MfileIn.close();
			MObjectIn.close();
			
		
		}catch (Exception e) {
			System.out.println("Error"+e.getMessage());
		}
		
		
		
	}
	
	
	
public void loadPlantillas() {             //Lee las plantillas  del fichero y los mete en el ArrayList De plantillas
		
		
		try {
			FileInputStream PfileIn = new FileInputStream(plantillaPath);
			ObjectInputStream PObjectIn = new ObjectInputStream(PfileIn);
			SetPlantillas((ArrayList<Plantilla>)PObjectIn.readObject());
			PfileIn.close();
			PObjectIn.close();
			
		
		}catch (Exception e) {
			System.out.println("Error"+e.getMessage());
		}
		
		
		
	}
	
//**************************************************************************************************************************************************
	//****************************************************** FIN  AlMACENAMIENTO FICHEROS   *******************************************************
	//**************************************************************************************************************************************************
	
	
	
	
	
	
	
	
}




