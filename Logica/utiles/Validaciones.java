package utiles;

import java.util.ArrayList;

import logica.ConsejoAdmin;
import logica.Plantilla;

public class Validaciones {
	
	//Retornar si la dirección insertada es valida o no
	public static boolean validarDireccion(String direccion){
		boolean validez = true;
		//invalidar la dirección insertada si su tamaño supera el límite impuesto por el sistema
		if(direccion.length() > ValorPorDefecto.limiteDireccion || direccion.equals("")){
			validez = false;
		}	
		return validez;
	}
	
	
	private static boolean buscarListaValidar(String entrada, ArrayList<String> lista){
		boolean validez = false;
		//Buscar en la lista de referencia
		for(String e: lista){
			//comprobar que la entrada coincida con alguno de los elementos de la lista
			if(entrada.equals(e))
				validez =  true;
		}
		return validez;
	}
	
	//Retornar boolean según si el documento legal insertado es valido o no
    public static boolean validarDocLegal(String docLegal){	
    	return buscarListaValidar(docLegal, ValorPorDefecto.getListaDocLegal());
	}
    
    //Retornar si la tipología habitacional insertada es valida o no
    public static boolean validarTipoHab(String tipoHab){
    	return buscarListaValidar(tipoHab, ValorPorDefecto.getListaTipoHab());
	}
    
    //Retornar si la tipología constructiva insertada es valida o no
	public static boolean validarTipoCons(String tipoCons){
 		return buscarListaValidar(tipoCons, ValorPorDefecto.getListaTipoCons());	
	}
	
	//Retornar si la dimensión se encuentra dentro o fuera del rango de los valores mínimo y máximo
	public static boolean validarDim(float dim, float min, float max){
		boolean validez = true;
		if(dim < min || dim > max){
			validez = false;
		}
		return validez;
	}
	
	//Retornar si la cantidad se encuentra dentro o fuera del rango de los valores mínimos o máximos
	public static boolean validarCant(int cant, int min, int max){
		boolean validez = true;
		if(cant < min || cant > max){
			validez = false;
			throw new IllegalArgumentException("La cantidad debe estar entre  " + min + "  y  " + max);
		}
		return validez;
	}
	
	//Retornar si el carnet de identidad es válido
	public static boolean validarCIJefe(String CI){
		boolean validez = false;
		if(CI.length() == 11){
			if(comprobarCISistema(CI)){
				if(comprobarFechaCI(CI))
					validez = true;
				else
					throw new IllegalArgumentException("El carné de identidad es inválido");
			}
			else
				throw new IllegalArgumentException("El carné de identidad ya existe en el sistema");			
		}
		else{
			throw new IllegalArgumentException("El carné de identidad debe tener 11 dígitos");
		}	
		return validez;
	}
	
	private static boolean comprobarCISistema(String CIactual){
		boolean nuevo = true;
		ArrayList<Plantilla> lista = ConsejoAdmin.getInstance().getListaPlantillas();
		if(!lista.isEmpty()){
			for(Plantilla p: lista){
				String CI = p.getFicha().getNucleo().getCIJefe();
				if(CI.equals(CIactual)){
					nuevo = false;
				}
			}
		}
		return nuevo;
		
	}
	//Retornar si la fecha en el carne ingresado es válida
	private static boolean comprobarFechaCI(String CI){
		
		boolean correcto = true;		
		int dia;
		int mes;
		int anno;
		
		if (CI.charAt(0) == '0')
			anno = Integer.parseInt((String) CI.subSequence(1, 2));
		else
			anno = Integer.parseInt((String) CI.subSequence(0, 2)); 
	
		
		if (CI.charAt(2) == '0')
			mes = Integer.parseInt((String) CI.subSequence(3, 4));
		else
			mes = Integer.parseInt((String) CI.subSequence(2, 4)); 

		
		if (CI.charAt(4) == '0')
			dia = Integer.parseInt((String) CI.subSequence(5, 6));
		else
			dia = Integer.parseInt((String) CI.subSequence(4, 6)); 

		
		// Anno bisiesto
		if (anno % 4 == 0 && mes == 2 && dia > 29)
			correcto = false;
		else if (anno % 4 != 0 && mes == 2 && dia > 28)
			correcto = false;

		
		// Mes
		if (mes == 0 || mes > 12)
			correcto = false;

		if (mes < 8) {
			if ((mes % 2 != 0) && (dia == 0 || dia > 31))
				correcto = false;
			if ((mes % 2 == 0 && mes != 2) && (dia == 0 || dia > 30))
				correcto = false;
		} else if (mes >= 8 && mes < 13) {
			if ((mes % 2 != 0) && (dia == 0 || dia > 30))
				correcto = false;
			if ((mes % 2 == 0) && (dia == 0 || dia > 31))
				correcto = false;
		}

		// Menor de edad
		int siglo = Integer.parseInt((String) CI.subSequence(6, 7));
		if ((siglo >= 6 && siglo <= 8) && (2000 + anno >= 2005) || siglo == 9) {
			correcto = false;
			throw new IllegalArgumentException("El jefe de núcleo debe ser mayor de edad.");
		}
		return correcto;
		
	}
	
	
	public static boolean validarTotalPersonas(int totalPersonas){
		boolean validez = true;
		if(totalPersonas <= 0)
			validez = false;	
		return validez;		
	}
	
	

	public static boolean validarCantAncianos(int cantAncianos){
		boolean validez = true;
		
		return validez;
	}
	public static boolean validarCantNinnos(int cantNinnos){
		boolean validez = true;
		
		return validez;
	}
	public static boolean validarCantEmbarazadas(int cantEmbarazadas){
		boolean validez = true;
		
		return validez;
	}
	
	public static boolean validarRespuesta(String respuesta, String opc1,String opc2){
		boolean iniciar = false;
		
		if(respuesta.equals(opc1)){
			iniciar = true;
		}
		if(respuesta.equals(opc2)){
			iniciar = false;
			
		}
		if(!respuesta.equals(opc1) && !respuesta.equals(opc2)){
			throw new IllegalArgumentException("Debe escoger entre" + opc1 + "y" + opc2);
		}
		
		return iniciar;
	}
	
	public static boolean validarMaterialTecho(String nombreMaterialTecho){
		boolean validez = false;
		
		for(String m: ValorPorDefecto.getListaMaterialTecho()){
			if(nombreMaterialTecho.equals(m))
				validez = true;					
		}
		return validez;
	}
	public static boolean validarMaterialPared(String nombreMaterialPared){
		boolean validez = false;
		
		for(String m: ValorPorDefecto.getListaMaterialPared()){
			if(nombreMaterialPared.equals(m))
				validez = true;					
		}
		return validez;
	}
	
 	public static boolean validarUnidad(String unidadMedida) {
		boolean validez = false;
		
		for(String u: ValorPorDefecto.getListaUnidadMedida()){
			if(unidadMedida.equals(u))
				validez = true;
		}
		return validez;
		
	}

	public static boolean validarNombre(String nombre) {
		boolean validez = true;
		if(nombre.length() > ValorPorDefecto.limiteNombreElemento){
			validez = false;
		}	
		return validez;
	}
	
}
	

	
	
