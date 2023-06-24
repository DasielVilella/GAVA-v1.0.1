import java.util.ArrayList;



//import java.awt.EventQueue;



public class Main {

	public static void main(String[] args) throws Exception {		
		Consejo_Admin admin = Consejo_Admin.getInstance();
		
        //admin.setListaMateriales(new ArrayList<Material>());
		admin.inicializarMateriales();
		
		InterfazV consola = new InterfazV(admin);
		consola.Presentacion();
		
		
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

}

