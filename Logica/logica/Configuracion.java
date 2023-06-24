package logica;
import java.util.ArrayList;

import utiles.ValorPorDefecto;


public class Configuracion {
	
	private ConsejoAdmin admin;
	
	public Configuracion(ConsejoAdmin admin){
		this.admin = admin;
	}
	
	
	public void agregarUnidadMedida(String unidadNueva){
		ValorPorDefecto.getListaUnidadMedida().add(unidadNueva);
	}
	
	public void eliminarUnidadMedida(String unidadEliminar){	
		recorrerListaEliminar(ValorPorDefecto.getListaUnidadMedida(), unidadEliminar);
	}
	
	public void agregarDocLegal(String docLegal){
		ValorPorDefecto.getListaDocLegal().add(docLegal);
	}
	public void eliminarDocLegal(String docLegal){
		recorrerListaEliminar(ValorPorDefecto.getListaDocLegal(), docLegal);
	}
	public void agregarTipoHab(String tipoHab){
		ValorPorDefecto.getListaTipoHab().add(tipoHab);
	}
	public void eliminarTipoHab(String tipoHab){
		recorrerListaEliminar(ValorPorDefecto.getListaTipoHab(), tipoHab);
	}
	
	public void agregarTipoCons(String tipoCons){
		ValorPorDefecto.getListaTipoCons().add(tipoCons);
	}
	public void eliminarTipoCons(String tipoCons){
		recorrerListaEliminar(ValorPorDefecto.getListaTipoCons(),tipoCons);
	}
	
	
	public void agregarMaterialPared(String materialNuevo){
		ValorPorDefecto.getListaMaterialPared().add(materialNuevo);
	}
	
	public void agregarMaterialTecho(String materialNuevo){
		ValorPorDefecto.getListaMaterialTecho().add(materialNuevo);
	}
	
	public void nuevoMaterial(String nombre, String ID, double precioU, String unidadMedida, int cantMetCuad, int tipo){
		admin.getListaMateriales().add(new Material(ID, nombre, precioU, unidadMedida, cantMetCuad));
		if(tipo == 1 || tipo == 3)
			agregarMaterialPared(nombre);
		if(tipo == 2 || tipo == 3)
			agregarMaterialTecho(nombre);
	}
	
	public void eliminarMaterial(String materialEliminar){
		recorrerListaEliminar(ValorPorDefecto.getListaMaterialTecho(), materialEliminar);
		recorrerListaEliminar(ValorPorDefecto.getListaMaterialPared(), materialEliminar);
		for(Material m: admin.getListaMateriales()){
			if(m.getNombre().equalsIgnoreCase(materialEliminar))
				admin.getListaMateriales().remove(m);
		}
		
	}
	
	public void recorrerListaEliminar(ArrayList<String> lista, String objeto){
		for(int i = 0; i < lista.size(); i++){
			String actual = lista.get(i);
			if(objeto.equals(actual)){
				lista.remove(i);
			}
		}
	}
	public void configurarLimiteNombreElemento(int limiteNuevo){
		ValorPorDefecto.limiteNombreElemento = limiteNuevo;
	}
	public void configurarLimiteDireccion(int limiteNuevo){
		ValorPorDefecto.limiteDireccion = limiteNuevo;
	}
	public void configurarLimiteCantParedes(int limiteNuevo){
		ValorPorDefecto.limiteCantParedes = limiteNuevo;
	}
	public void configurarLimiteMinDimCasa(float limiteNuevo){
		ValorPorDefecto.limiteMinDimCasa = limiteNuevo;
	}
	public void configurarLimiteMaxDimCasa(float limiteNuevo){
		ValorPorDefecto.limiteMaxDimCasa = limiteNuevo;
	}
	public void configurarLimiteMaxTotalHabitantes(int limiteNuevo){
		ValorPorDefecto.limiteTotalHabitantes = limiteNuevo;
	}
	public void configurarLimiteCantElementos(int limiteNuevo){
		ValorPorDefecto.limiteCantElementos = limiteNuevo;
	}
	public void configurarLimiteMinAfectacion(float limiteNuevo){
		ValorPorDefecto.limiteMinAfectacion = limiteNuevo;
	}
	public void configurarLimiteMaxAfectacion(float limiteNuevo){
		ValorPorDefecto.limiteMaxAfectacion = limiteNuevo;
	}
	public void configurarLimiteCantMetCuad(int limiteNuevo){
		ValorPorDefecto.limiteCantMetCuad = limiteNuevo;
	}
}
