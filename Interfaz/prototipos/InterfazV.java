package prototipos;
/*
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import logica.AfectPared;
import logica.AfectTecho;
import logica.Afectacion;
import logica.ConsejoAdmin;
import logica.Cubicacion;
import logica.ElementoAfectado;
import logica.Ficha;
import logica.Material;
import logica.NucleoFamiliar;
import logica.Dictamen;
import logica.Reporte;
import utiles.Validaciones;
*/

public class InterfazV {

	/*private Consejo_Admin admin;

	public InterfazV(Consejo_Admin admin) {
		this.admin = admin;
	}


	public void Presentacion() throws Exception{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		boolean centinela = true;
		int decision = 0;
		do{
			System.out.println("     MINISTERIO DE LA CONSTRUCCION");
			System.out.println("FICHA TECNICA DIGITAL DE DAÑOS OCASIONADOS\n");
			System.out.println("1-) Nueva Vivienda");
			System.out.println("2-) Lista de Viviendas");
			System.out.println("3-) Reportes");
			System.out.println("4-) Inicializar Materiales");
			System.out.println("5-) Salir\n");
			decision = entrada.nextInt();

			if(decision == 1)
				nuevaVivienda();				
			else if(decision == 2)
				listaViviendas();
			else if(decision == 3)
				reportes();
			else  if(decision == 4)
				materiales();
			else if(decision == 5)
				centinela = false;
			else System.out.println("ERROR: Seleccione una de las opciones de 1 a 5");
		}while(centinela);

		System.exit(0);
	}

	private void nuevaVivienda() throws Exception{
		System.out.println(" NUEVA VIVIENDA\n");

		Ficha ficha = admin.nuevaFicha();

		nuevaPlanilla(ficha);
		nuevoNucleo(ficha);
		nuevasAfectaciones(ficha);
		Consejo_Admin.getInstance().nuevasCubicaciones(ficha);
		nuevaListaElemAfect(ficha);

		admin.agregarPlantilla(plantilla);	
	}

	private int materiales() {

		admin.inicializarMateriales();

		for(Material m: admin.getListaMateriales()){
			System.out.println(m.getID() + " | " +	m.getNombre() + " | " +
					m.getPrecioU() + " | " + m.getUnidadMedida() + " | ");
		}
		int opcion = 0;
		return opcion;
	}

	private void nuevaPlanilla(Ficha ficha) throws Exception{
		
		boolean repetir = false;
		String direccionInsert = "";
		Date fechaLevInsert = null;
		String docLegalInsert = "";
		String tipHabInsert = "";
		String tipoConsInsert = "";
		float largoInsert = 0;
		float anchoInsert = 0;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("Dirección:  ");
			repetir = false;
			direccionInsert = entrada.nextLine();
			try{
				ficha.getDictamen().setDireccion(direccionInsert);
			}catch (Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}	
		}while(repetir);

		do{
			System.out.println("Fecha de Levantamiento ");
			repetir = false;
			//fechaLevInsert = Date.parse("12 / 12 /2002");
			try{
				ficha.getDictamen().setFecha_Lev(fechaLevInsert);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);


		do{
			System.out.println("Documento Legal:  ");
			repetir = false;
			docLegalInsert = entrada.nextLine();
			try{
				ficha.getDictamen().setDoc_Legal(docLegalInsert);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);


		do{
			System.out.println("Tipologia habitacional:  ");
			repetir = false;
			tipHabInsert = entrada.nextLine();
			try{
				ficha.getDictamen().setTipo_Habitacional(tipHabInsert);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}	
		}while(repetir);

		do{
			System.out.println("Tipologia constructiva:  ");
			repetir = false;
			tipoConsInsert = entrada.nextLine();	
			try {
				ficha.getDictamen().setTipo_Constructiva(tipoConsInsert);
			} catch (Exception e) {
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);

		do{
			System.out.println("Largo(m):  ");
			repetir = false;
			largoInsert = entrada.nextFloat();
			try{
				ficha.getDictamen().setDim1(largoInsert);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);


		do{
			System.out.println("Ancho(m):  ");
			repetir = false;
			anchoInsert = entrada.nextFloat();
            try{
            	ficha.getDictamen().setDim2(anchoInsert);
            }catch(Exception e){
            	repetir = true;
            	System.out.println(e.getMessage());
            }
		}while(repetir);
		
		admin.agregarPlanilla_Consejo(ficha.getDictamen());
	}	

	private void nuevoNucleo(Ficha ficha){ 
		System.out.println("\n\nNUCLEO FAMILIAR");
		@SuppressWarnings("resource")
		Scanner entrada2 = new Scanner(System.in);

		String CIInsert = "";
		boolean repetir = false;
		do{
			System.out.println("\nCI de Jefe del Núcleo Familiar: ");
			repetir = false;
			CIInsert = entrada2.nextLine();
			try{
				ficha.getJefe().setNumID(CIInsert);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);	

		int totalPersonas = 0;
		int cantAncianos = 0;
		int cantNinnos = 0;
		int cantEmbarazadas = 0;

		do{
			System.out.println("Total de personas: ");
			repetir = false;
			totalPersonas = entrada2.nextInt();
			try{
				ficha.getNucleo().setTotalPersonas(totalPersonas);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);

		do{
			System.out.println("Cantidad de Ancianos: ");	
			repetir = false;
			cantAncianos = entrada2.nextInt();
			try{
				ficha.getNucleo().setCantAncianos(cantAncianos);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);

		do{
			System.out.println("Cantidad de Niños: ");
			repetir = false;
			cantNinnos = entrada2.nextInt();
			try{
				ficha.getNucleo().setCantNinnos(cantNinnos);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);

		do{
			System.out.println("Cantidad de Embarazadas: ");
			repetir = false;
			cantEmbarazadas = entrada2.nextInt();
			try{
				ficha.getNucleo().setCantEmbarazadas(cantEmbarazadas);			
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);
	}

	public void nuevasAfectaciones(Ficha ficha){

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nAFECTACIONES");
		String respuesta = "";
		boolean decision = false;
		boolean repetir = false;
		do{
			System.out.println("¿El techo de la vivienda está deteriorado? (S/N)");
			respuesta = entrada.nextLine();
			repetir = false;
			try{
				decision = Validaciones.validar_Respuesta(respuesta, "S", "N");
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
			if(decision)
				datosTecho(ficha,ficha.getAfectacionesVivienda());
		}while(repetir);


		String respuesta5 = "";
		int cantParedes = 0;
		do{
			System.out.println("¿Alguna pared de la vivienda está deteriorada? (S/N)");
			respuesta5 = entrada.nextLine();
			repetir = false;
			try{
				decision = Validaciones.validar_Respuesta(respuesta5, "S", "N");		
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
			if(decision){
				cantParedes = cantParedes();
			    datoPared(cantParedes, ficha, ficha.getAfectacionesVivienda());
			}
		}while(repetir);

	}

	private static int cantParedes() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int respuesta1 = 0;
		int cantParedes = 0;
		boolean validez = false;
		do{
			System.out.println("¿Cuántas paredes están deterioradas?");
			respuesta1 = entrada.nextInt();
		    try{
		    	validez = Validaciones.validar_Cant(respuesta1, 1, 20);
		    	if(validez)
		    		cantParedes = respuesta1;
		    }catch (Exception e){
		    	System.out.println(e.getMessage());
		    }
		}while(!Validaciones.validar_Cant(respuesta1, 1, 20));
		return cantParedes;
	}

	private  ArrayList<Afectacion> datoPared(int cantParedes, Ficha ficha, ArrayList<Afectacion>listaAfect){

		boolean repetir = false;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String respuesta2 = "";
		for(int i= 0; i < cantParedes; i++){

			System.out.println("Datos de Pared  " + (i+1) + " de " + cantParedes);
			Afect_Pared afectacion = ficha.nuevaAfectacionPared();
		
			do{
				System.out.println("¿El deterioro es Parcial o Total? (P/T)");
				respuesta2 = entrada.nextLine();
				repetir = false;
				try{			
					afectacion.setAfectTotal(Validaciones.validar_Respuesta(respuesta2, "T", "P"));
				}catch(Exception e){
					repetir = true;
					System.out.println(e.getMessage());
				}

			}while(repetir);
			


			String nombreParedInsert = "";
			do{
				System.out.println("Material predominante:");
				nombreParedInsert = entrada.nextLine();
                repetir = false;
				try{
					afectacion.setMaterialPared(nombreParedInsert);
				}catch (Exception e){
					repetir = true;
					System.out.println(e.getMessage());;
				}
			}while(repetir);

			float largoInsert = 0;
			float altoInsert = 0;
			do{
				System.out.println("Largo(m):  ");
				largoInsert = entrada.nextFloat();
				repetir = false;
				try{
					afectacion.setDim1(largoInsert);
				}catch(Exception e){
					repetir = true;
					System.out.println(e.getMessage());
				}
			}while(repetir);

			do{
				System.out.println("Alto(m):  ");
				altoInsert = entrada.nextFloat();
				repetir = false;
				try{
					afectacion.setDim2(altoInsert);
				}catch(Exception e){
					repetir = true;
					System.out.println(e.getMessage());
				}
			}while(repetir);

			@SuppressWarnings("resource")
			Scanner entrada5 = new Scanner(System.in);
			String respuesta = "";
			do{
				System.out.println("¿Es una pared de carga? (S/N)");
				respuesta = entrada5.nextLine();
				repetir = false;
				try{
					afectacion.setCarga(Validaciones.validar_Respuesta(respuesta, "S", "N"));
				}catch(Exception e){
					repetir = true;
					System.out.println(e.getMessage());
				}
			}while(repetir);
            listaAfect.add(afectacion);
			admin.agregarAfectacion(afectacion);
		}
		return listaAfect;

	}


	private Afectacion datosTecho(Ficha ficha, ArrayList<Afectacion>listaAfect) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		boolean repetir = false;
		Afect_Techo afectacion = ficha.nuevaAfectacionTecho();

		do{
			System.out.println("¿El deterioro es Parcial o Total? (P/T)");
			String respuesta2 = entrada.nextLine();
			repetir = false;
			try{
				afectacion.setAfectTotal(Validaciones.validar_Respuesta(respuesta2, "T", "P"));
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);

		@SuppressWarnings("resource")
		Scanner entrada6 = new Scanner(System.in);
		float largo = 0;
		float ancho = 0;
		
		if(!afectacion.getAfectTotal()){
			
			do{
				System.out.println("Largo: ");
				largo = entrada6.nextFloat(); 
				repetir = false;
				try{
					afectacion.setDim1(largo);
				}catch(Exception e){
					repetir = true;
					System.out.println(e.getMessage());
				}		
			}while(repetir);

			 
			do{
				System.out.println("Ancho: ");
				ancho = entrada6.nextFloat();
				try{
					afectacion.setDim2(ancho);
				}catch(Exception e){
					repetir = true;
					System.out.println(e.getMessage());
				}
			}while(repetir);
		}

		else{	

			String nombreTechoInsert = "";
			afectacion.setDim1(ficha.getDictamen().getDim1());
			afectacion.setDim2(ficha.getDictamen().getDim2());
			
			do{
				System.out.println("Material predominante:");
				nombreTechoInsert = entrada.nextLine();
                repetir = false;
				try{
					afectacion.setMaterialPared(nombreTechoInsert);
				}catch (Exception e){
					repetir = true;
					System.out.println(e.getMessage());;
				}
			}while(repetir);
		}
		listaAfect.add(afectacion);
		admin.agregarAfectacion(afectacion);
		return afectacion;
	}


	

	private  void nuevaListaElemAfect(Ficha ficha) {
		@SuppressWarnings("resource")
		Scanner entrada3 = new Scanner(System.in);
		String respuesta = "";
		boolean repetir = false;
		boolean validez = false;
		do{
			System.out.println("¿Hay elementos afectados?");
			respuesta = entrada3.nextLine();
			repetir = false;
			try{
				validez = Validaciones.validar_Respuesta(respuesta, "S", "N");
			}catch (Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
			if(validez){
				System.out.println("Elementos Afectados");
				repetir = false;
				do{
					repetir = nuevoElemento(ficha);
				}while(repetir);	
			}
		}while(repetir);


	}


	private  boolean nuevoElemento(Ficha ficha) {

		@SuppressWarnings("resource")
		Scanner entrada2 = new Scanner(System.in);
		String respuesta = "";
		boolean repetir = false;
		ElementoAfectado elemento = ficha.nuevoElemento();

		do{		
			System.out.println("Nombre: ");
			respuesta = entrada2.nextLine();
			repetir = false;
			try{
				elemento.setNombre(respuesta);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}

		}while(repetir);

		int respuestaInt = 0;
		do{
			System.out.println("Cantidad: ");
			respuestaInt = entrada2.nextInt();
			repetir = false;
			try{
				elemento.setCantidad(respuestaInt);
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);

		ficha.listaElementos.add(elemento);

		@SuppressWarnings("resource")
		Scanner entrada3 = new Scanner(System.in);
		boolean insertar = false;
		String respuesta2 = "";
		do{
			System.out.println("¿Ingresar un nuevo elemento afectado?");
			respuesta2 = entrada3.nextLine();
			repetir = false;
			insertar = false;
			try{
				insertar = Validaciones.validar_Respuesta(respuesta2, "S", "N");
			}catch(Exception e){
				repetir = true;
				System.out.println(e.getMessage());
			}
		}while(repetir);

		return insertar;
	}

	private static void listaViviendas() {
    	System.out.println(" LISTA DE VIVIENDAS\n");
		if(Consejo_Admin.getInstance().getListaFichas().isEmpty())
			System.out.println("No existen viviendas registradas actualmente.");
		else{
			for(int i = 0; i < Consejo_Admin.getInstance().getListaFichas().size(); i++){
				Ficha f = Consejo_Admin.getInstance().getListaFichas().get(i);
				Dictamen p = f.getDictamen();
				NucleoFamiliar n = f.getNucleo();

				System.out.println("------ FICHA " + (i+1) + " ------");

				System.out.println("\nPLANILLA");
				System.out.println("ID: " + p.getID());
				System.out.println("Dirección: " + p.getDireccion());
				System.out.println("Fecha de Levantamiento: " + p.getFecha_Lev());
				System.out.println("Documento Legal: " + p.getDoc_Legal());
				System.out.println("Tipología Habitacional: " + p.getTipo_Habitacional());
				System.out.println("Tipología Constructiva: " + p.getTipo_Constructiva());
				System.out.println("Área: " + p.Area());

				System.out.println("NÚCLEO FAMILIAR");
				System.out.println("CI de Jefe de Núcleo: " + f.getJefe().getNumID());
				System.out.println("Total de personas: " + n.getTotalPersonas());
				System.out.println("Cantidad de ancianos: " + n.getCantAncianos());
				System.out.println("Cantidad de embarazadas: " + n.getCantEmbarazadas());
				System.out.println("Cantidad de niños: " + n.getCantNinnos());

				System.out.println("AFECTACIONES");
				if(f.getAfectacionesVivienda().isEmpty()){
					System.out.println("No presenta deterioro de la infraestructura");
				}
				else{
					for(Afectacion a: f.AfectacionesVivienda){
						if(a instanceof Afect_Techo){
							System.out.println("TECHO: ");
							System.out.println("ID: " + a.getID());
							if(a.getAfectTotal()){
								System.out.println("Deterioro: Total");
								System.out.println("Material predominante: " + a.getMaterial().getNombre());
							}
							else{
								System.out.println("Deterioro: Parcial");

							}				
							System.out.println("Área de deterioro: " + a.Area());
						}
						if(a instanceof Afect_Pared){
							int contPared = 1;
							System.out.println("PARED " + contPared + ": ");
							contPared ++;
							System.out.println("ID: " + a.getID());
							if(a.getAfectTotal()){
								System.out.println("Deterioro: Total");
							}
							else{
								System.out.println("Deterioro: Parcial");			
							}
							System.out.println("Material predominante: " + a.getMaterial().getNombre());
							System.out.println("Área de deterioro: " + a.Area());

						}
						for(Cubicacion c: a.CubicacionesAfect){
							System.out.println("Material: " + c.getMaterial().getNombre() + "   Precio: " + c.getPrecioMatP());

						}



					}
				}
				System.out.println("ELEMENTOS AFECTADOS");
				if(f.getListaElementos().isEmpty()){
					System.out.println("No presenta elementos afectados");
				}
				else{
					for(ElementoAfectado e: f.listaElementos){
						System.out.println(e.getNombre() +" | " + e.getCantidad());
					}
				}
			}

		}
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("unused")
		String respuesta = entrada.nextLine();

	}

	private void reportes() {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println(" REPORTES\n");

		if(Consejo_Admin.getInstance().getListaFichas().isEmpty())
			System.out.println("No existen viviendas registradas actualmente.");
		else{

			boolean centinela = true;
			int decision = 0;
			@SuppressWarnings("resource")
			Scanner entrada5 = new Scanner(System.in);

			do{
				System.out.println("1-) Total de fondos invertidos");
				System.out.println("2-) Fondos invertidos en un material");
				System.out.println("3-) Material con más fondos invertidos");
				System.out.println("4-) Vivienda con mayor número de habitantes");
				System.out.println("5-) Menú Principal");

				decision = entrada5.nextInt();

				if(decision == 1){
					System.out.println("TOTAL DE FONDOS INVERTIDOS");
					System.out.println(admin.buscarTotalFondos());
				}
				else if(decision == 2){
					System.out.println("DATOS DE CUBICACION DE UN MATERIAL");
					String nombreMat = "";
					boolean repetir = false;
					do{
						System.out.println("Inserte el material: ");
						nombreMat = entrada.nextLine();
						if(Validaciones.validar_MaterialPared(nombreMat) || Validaciones.validar_MaterialTecho(nombreMat)){
							repetir = false;
							Reporte.Datos_MaterialSelec datos = admin.buscarDatos_MaterialSelec(nombreMat);
							System.out.println("Fondos invertidos: " + datos.getFondo());
							System.out.println("Cantidad necesaria: " + datos.getCantidad() + datos.getMedida());
						}
						else repetir = true;


					}while(repetir);
				}
				else if(decision == 3){
					System.out.println("MATERIALES CON MAS FONDOS INVERTIDOS");
					Reporte.Material_MasFondos material = admin.buscarMaterial_MasFondos();
					System.out.println("Material: " + material.getNombre() +
							"Fondos invertidos: " + material.getFondos());
				}
				else if(decision == 4){
					System.out.println("VIVIENDAS CON MAYOR CANTIDAD DE HABITANTES");
					Reporte.Vivienda_MayorHab vivienda = admin.buscarVivienda_MayorHab();
					System.out.println("ID: " + vivienda.getIds() +
							"    Habitantes: " + vivienda.getCantHab());
				}
				else if(decision == 5)
					centinela = false;
				else 
					System.out.println("Seleccione una de las opciones de 1 a 5");
			}while(centinela);
		}
		@SuppressWarnings("unused")
		String respuesta = entrada.nextLine();
	}
      */
}	



