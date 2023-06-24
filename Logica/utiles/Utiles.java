package utiles;

import java.util.ArrayList;

import logica.ConsejoAdmin;
import logica.Plantilla;

public class Utiles{
	
	/*
	 * Retornar como String un valor entero aleatorio de 4 dígitos (Identificador)
	 */
	public static String autoID(){
		String IDnuevo = String.valueOf((int)(Math.random()*(9999 - 1000 + 1) + 1000));
		if(comprobarIDSistema(IDnuevo))
			IDnuevo = autoID();
		return IDnuevo;
	}
	
	private static boolean comprobarIDSistema(String IDnuevo) {
		boolean existe = false;
		ArrayList<Plantilla> lista = ConsejoAdmin.getInstance().getListaPlantillas();
		if(!lista.isEmpty()){
			for(Plantilla p: lista){
				String ID = p.getFicha().getDictamen().getID();
				if(ID.equals(IDnuevo)){
					existe = true;
				}
			}
		}
		return existe;
	}
	
	public static double formatoDinero(double a){
		a = Math.round(a * 100) / 100;
		return a;
	}

	public static String[] getListaconBlanco(ArrayList<String> lista){	
		return (String[]) Utiles.agregarBlancoArreglo(lista.toArray());
	}

	public static Object[] agregarBlancoArreglo(Object[] arreglo){
		String[] arr  = new String[arreglo.length + 1];
		System.arraycopy(arreglo, 0, arr, 1, arreglo.length);
		arr[0] = "";
		return arr;	
	}	
	
	public static ArrayList<String> concatenarListas(ArrayList<String> l1,ArrayList<String> l2){
		ArrayList<String> nueva = new ArrayList<String>();
		boolean repetido = false;
		nueva.addAll(l1);
		for(String s: l2){
			repetido = false;
			for(String n: nueva){
				if(s.equalsIgnoreCase(n))
					repetido = true;
			}
			if(!repetido)
				nueva.add(s);
		}
		return nueva;
	}
}
