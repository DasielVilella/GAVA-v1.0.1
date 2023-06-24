package utiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import logica.ConsejoAdmin;
import logica.Plantilla;

public class AccionTabla {
	
	
	public static ArrayList<Plantilla> buscarPlantillaID(String IDbuscado){
		ConsejoAdmin admin = ConsejoAdmin.getInstance();
		ArrayList<Plantilla> lista = admin.getListaPlantillas();
		ArrayList<Plantilla> nueva = new ArrayList<Plantilla>();
		if(!IDbuscado.isEmpty() && !IDbuscado.equalsIgnoreCase("Buscar ID")){
			for(Plantilla p: lista){
				String ID = p.getFicha().getDictamen().getID();
				if(comparar(IDbuscado, ID)){
					nueva.add(p);
				}			
			}	
		}
		else
			nueva = admin.getListaPlantillas();
		return nueva;
		
	}
	
	private static boolean comparar(String buscado,String actual){
		boolean igual = false;
		int tamanno = buscado.length();
		if(buscado.equalsIgnoreCase(actual.substring(0, tamanno))){
			igual = true;
		}
		return igual;		
	}
	
	
	
	public static ArrayList<Plantilla> organizarListaID(ArrayList<Plantilla> l, int tipo, boolean mayorAMenor){
		ArrayList<Plantilla> listaNueva = new ArrayList<Plantilla>();
		ArrayList<Plantilla> lista = l;
		
		if(tipo == 0)
			listaNueva = lista;
		if(tipo == 1)
			listaNueva = ordenarPorFecha(lista);
		if(tipo == 2)
			listaNueva = ordenarPorID(lista);
		if(tipo == 3)
			listaNueva = ordenarPorHabitantes(lista);
		if(tipo == 4)
			listaNueva = ordenarPorAreaAfect(lista);
		if(tipo == 5)
			listaNueva = ordenarPorCubicacion(lista);
		
		if(mayorAMenor)
			Collections.reverse(listaNueva);
		
		return listaNueva;	
	}
	
	private static ArrayList<Plantilla> ordenarPorFecha(ArrayList<Plantilla> lista){
		Collections.sort(lista, new Comparator<Plantilla>(){
			@Override
			public int compare(Plantilla p1,Plantilla p2){
				Date fecha1 = p1.getFicha().getDictamen().getFechaLev();
				Date fecha2 = p2.getFicha().getDictamen().getFechaLev();
				int comparacion = fecha1.compareTo(fecha2);
				return comparacion;
			};
		});
		return lista;
	}
	private static ArrayList<Plantilla> ordenarPorID(ArrayList<Plantilla> lista){
		Collections.sort(lista, new Comparator<Plantilla>(){
			@Override
			public int compare(Plantilla p1,Plantilla p2){
				int ID1 = Integer.parseInt(p1.getFicha().getDictamen().getID());
				int ID2 = Integer.parseInt(p2.getFicha().getDictamen().getID());
				int comparacion = new Integer(ID1).compareTo(ID2);
				return comparacion;
			};
		});
		return lista;
	}
	private static ArrayList<Plantilla> ordenarPorHabitantes(ArrayList<Plantilla> lista){
		Collections.sort(lista, new Comparator<Plantilla>(){
			@Override
			public int compare(Plantilla p1,Plantilla p2){
				int hab1 = p1.getFicha().getNucleo().getTotalPersonas();
				int hab2 = p2.getFicha().getNucleo().getTotalPersonas();
				int comparacion = new Integer(hab1).compareTo(hab2);
				return comparacion;
			};
		});
		return lista;
	}
	private static ArrayList<Plantilla> ordenarPorAreaAfect(ArrayList<Plantilla> lista){
		Collections.sort(lista, new Comparator<Plantilla>(){
			@Override
			public int compare(Plantilla p1,Plantilla p2){
				float area1 = p1.getFicha().areaAfectaciones();
				float area2 = p2.getFicha().areaAfectaciones();
				int comparacion = new Float(area1).compareTo(area2);
				return comparacion;
			};
		});
		return lista;
	}
	private static ArrayList<Plantilla> ordenarPorCubicacion(ArrayList<Plantilla> lista){
		Collections.sort(lista, new Comparator<Plantilla>(){
			@Override
			public int compare(Plantilla p1,Plantilla p2){
				double cub1 = p1.totalCubicacion();
				double cub2 = p2.totalCubicacion();
				int comparacion = new Double(cub1).compareTo(cub2);
				return comparacion;
			};
		});
		return lista;
	}

}
