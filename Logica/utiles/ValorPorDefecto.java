package utiles;

import java.util.ArrayList;

/*
 * Opciones de documentos legales disponibles
 */
public class ValorPorDefecto{
	
	public static int limiteDireccion;
	public static int limiteNombreElemento;
	public static float limiteMinDimCasa;
	public static float limiteMaxDimCasa;
	public static float limiteMinAfectacion;
	public static float limiteMaxAfectacion;
	public static int limiteTotalHabitantes;
	public static int limiteCantParedes;
	public static int limiteCantElementos;
	public static int limiteCantMetCuad;
	
	
	
	private static ArrayList<String> listaDocLegal = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
	{
		add("Propiedad");
		add("Usufructo");
		add("Vivienda vinculada");
		add("Arrendamiento");
		add("Providencia");
		add("No posee");
	}};;
	
	
	public static ArrayList<String> getListaDocLegal() {
		return listaDocLegal;
	}
	
	
	
	private static ArrayList<String> listaTipoHab = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
	{
		add("Casa");
		add("Apartamento");
		add("Bohío");
		add("Otro");			
	}};;
	
	public static ArrayList<String> getListaTipoHab() {
		return listaTipoHab;
	}
	
	
	
	private static ArrayList<String> listaTipoCons = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
	{
		add("I- Hormigón y acero");
		add("II- Hormigón ligero, acero y mampostería");
		add("III- Ladrillo o mampostería, y madera");
		add("IV- Madera pesada y acero");
		add("V- Madera ligera");
	}};;

	public static ArrayList<String> getListaTipoCons() {
		return listaTipoCons;
	}
	
	
	
	private static ArrayList<String> listaMaterialPared = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
	{
		add("Madera");
		add("Bloque");
		add("Ladrillo");		
	}};;

	public static ArrayList<String> getListaMaterialPared(){
		return listaMaterialPared;
	}

	
	
	private static ArrayList<String> listaMaterialTecho = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
	{
		add("Madera");
		add("Teja");
		add("Plancha");
		add("Concreto");
	}};;

	public static ArrayList<String> getListaMaterialTecho() {
		return listaMaterialTecho;
	}
	
	
	
	private static ArrayList<String> listaUnidadMedida = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
	{
		add("U");
		add("kg");
		add("m^2");
		add("m^3");
		add("g");
		add("t"); 
	}};;
	
	public static ArrayList<String> getListaUnidadMedida() {
		return listaUnidadMedida;
	}
	
	
	
	
	
}
