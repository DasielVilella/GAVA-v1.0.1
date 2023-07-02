package main;

import grafica.Pantalla;

import java.awt.EventQueue;

import logica.ConsejoAdmin;


public class Main {

	public static void main(String[] args) throws Exception {
		
		final ConsejoAdmin admin = ConsejoAdmin.getInstance();	
		admin.inicializarMateriales();                              
		admin.inicializarValoresPorDefecto();
		
		//quitar
		admin.crearGrafo();
		
		/*
		 * Programa por consola prototipo:
		 * 
		 * InterfazV consola = new InterfazV(admin);
		 * consola.Presentacion();
		 */
		
		
		/*
		 * Correr pantalla.
		 */
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Pantalla frame = new Pantalla(admin);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}



