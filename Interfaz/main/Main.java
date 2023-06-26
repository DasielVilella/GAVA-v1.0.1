package main;

import grafica.Pantalla;

import java.awt.EventQueue;

import logica.ConsejoAdmin;
import logica.Reporte;


public class Main {

	public static void main(String[] args) throws Exception {
		
		final ConsejoAdmin admin = ConsejoAdmin.getInstance();	
		admin.inicializarMateriales();                              
		admin.inicializarValoresPorDefecto();
		
		Reporte r=new Reporte(admin);
		r.crearArbol();
		
		/*
		 * Programa por consola prototipo:
		 * 
		 * InterfazV consola = new InterfazV(admin);
		 * consola.Presentacion();
		 */
		
		
		/*
		 * Correr pantalla.
		 */
		/*	EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Pantalla frame = new Pantalla(admin);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});*/
		}
}



