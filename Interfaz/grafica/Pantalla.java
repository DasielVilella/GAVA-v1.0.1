package grafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;

import utiles.AccionTabla;
import utiles.Utiles;
import utiles.ValorPorDefecto;

import com.toedter.calendar.JDateChooser;

import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import cu.edu.cujae.ceis.tree.iterators.binary.SymmetricIterator;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

import logica.AfectPared;
import logica.AfectTecho;
import logica.Afectacion;
import logica.ConsejoAdmin;
import logica.Dictamen;
import logica.ElementoAfectado;
import logica.Ficha;
import logica.Material;
import logica.NucleoFamiliar;
import logica.Plantilla;
import logica.Reporte;
import logica.Reporte.DatosMaterialSelec;
import logica.Reporte.IDIndicePrioridad;
import logica.Reporte.MaterialMasFondos;
import logica.Reporte.PlantillaIndice;
import logica.Reporte.ViviendaMayorHab;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JRadioButton;

import java.awt.SystemColor;

import javax.swing.JScrollPane;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;




public class Pantalla extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel Fondo;
	private JPanel Menu;
	private JTabbedPane Pantallas;
	private JPanel BarraColor;
	private JPanel Inicio;
	private JPanel InicioBtn;
	private JPanel NuevaFichaBtn;
	private JLabel lblInicio;
	private JLabel lblNuevaFicha;
	private JPanel ListaFichasBtn;
	private JLabel lblListaDeFichas;
	private JPanel ReportesBtn;
	private JLabel lblReportes;
	private JPanel AjustesBtn;
	private JLabel lblAjustes;
	private JPanel BarraHorario;
	private JLabel lblFecha;
	private JLabel lblHora;
	private JLabel lblG;
	private JLabel lblA;
	private JLabel lblV;
	private JLabel label;
	private JPanel NF1;
	private JPanel NF2;
	private JPanel NF3;
	private JPanel NF4;
	private JPanel ListaFichas;
	private JPanel Reportes;
	private JPanel Ajustes;
	private String condicion = "Inicio";
	private JLabel lblDireccion;
	private JLabel lblDatosVivienda;
	private JTextField textDireccion;
	private JLabel lblFechaDeLevantamiento;
	private JDateChooser dcFechaLev;
	private JSeparator separator;
	private JLabel lblDocLegal;
	private JLabel lblTipologaHabitacional;
	private JLabel lblTipologaConstructiva;
	private JComboBox<String> cbDocLegal;
	private JComboBox<String> cbTipoHab;
	private JComboBox<String> cbTipoCons;
	private JSeparator separator_1;
	private JLabel lblDimensiones;
	private JLabel lblLargo;
	private JLabel lblAncho;
	private JTextField textLargoV;
	private JTextField textAnchoV;
	private JLabel lblArea;
	private JTextField textAreaV;
	private JSeparator separator_2;
	private JCheckBox ckbFacilidad;
	private JLabel lblContFacilidad;
	private JLabel lblDictamen;
	private float largo;
	private float ancho;
	private JPanel Reiniciar1_Btn;
	private JLabel lblReiniciar;
	private JPanel Anterior1_Btn;
	private JLabel lblAnterior;
	private JPanel Siguiente1_Btn;
	private JLabel lblSiguiente;
	private Ficha ficha;
	private ConsejoAdmin admin;
	private boolean primero = true;
	private JLabel lblCarnDeIdentidad;
	private JTextField textCIJefe;
	private JLabel lblJefeDeNcleo;
	private JSeparator separator_3;
	private JLabel lblNoHabitantes;
	private JLabel lblTotalDeHabitantes;
	private JLabel lblAncianos;
	private JLabel lblNios;
	private JLabel lblEmbarazadas;
	private JSpinner spiTotalHab;
	private JSpinner spiEmbarazadas;
	private JSpinner spiNinnos;
	private JSpinner spiAncianos;
	private JPanel Reiniciar2_Btn;
	private JLabel lblReiniciar2;
	private JPanel Anterior2_Btn;
	private JLabel lblAnterior2;
	private JPanel Siguiente2_Btn;
	private JLabel lblSiguiente2;
	private JLabel lblHabitantes;
	private JLabel lblPersonas;
	private JLabel lblVulnerables;
	private JTextField textVulnerables;
	private JPanel AyudaDireccion;
	private JLabel lblAyudaDireccion;
	private JPanel AyudaFechaLev;
	private JLabel lblAyudaFechaLev;
	private JPanel AyudaDocLegal;
	private JLabel lblAyudaDocLegal;
	private JPanel AyudaTipoHab;
	private JLabel lblAyudaTipoHab;
	private JPanel AyudaTipoCons;
	private JLabel lblAyudaTipoCons;
	private JPanel AyudaDimV;
	private JLabel lblAyudaDimV;
	private JPanel panelVerde1;
	private JLabel lblNucleoFamiliar;
	private JPanel RellenarBtn;
	private JLabel label_1;
	private JPanel panelVerde2;
	private JLabel lblAfectaciones;
	private JPanel PanelVerde3;
	private JLabel lblElementosAfectados;
	private JPanel PanelVerde4;
	private JPanel Reiniciar3Btn;
	private JLabel lblReiniciar3;
	private JPanel Anterior3Btn;
	private JLabel lblAnterior3;
	private JPanel Siguiente3Btn;
	private JLabel lblSiguiente3;
	private JPanel Rellenar2Btn;
	private JLabel label_2;
	private JLabel lblAfectacionesDePared;
	private JLabel lblAfectacinDeTecho;
	private JSeparator separator_4;
	private JTable tablaAfectPared;
	private JSeparator separator_5;
	private JRadioButton rbTotalPared;
	private JRadioButton rbParcialPared;
	private JLabel lblMaterialPared;
	private JComboBox<String> cbMaterialPared;
	private JLabel lblLargoPared;
	private JLabel lblAnchoPared;
	private JTextField textLargoPared;
	private JTextField textAnchoPared;
	private JCheckBox ckbParedCarga;
	private JRadioButton rbTotalTecho;
	private JRadioButton rbParcialTecho;
	private JLabel lblMaterialTecho;
	private JComboBox<String> cbMaterialTecho;
	private JLabel lblLargoTecho;
	private JTextField textLargoTecho;
	private JLabel lblAnchoTecho;
	private JTextField textAnchoTecho;
	private JLabel lblV_1;
	private JScrollPane spTablaAfectPared;
	private JPanel AgregarParedBtn;
	private JLabel lblAgregarPared;
	private JCheckBox ckbAfectPared;
	private JCheckBox ckbAfectTecho;
	private ArrayList<AfectPared> afectacionesPared;
	private DefaultTableModel modeloAfectPared;
	private DefaultTableModel modeloElementos;
	private DefaultTableModel modeloFichas;
	private DefaultTableModel modeloIDMayHab;
	private DefaultTableModel modeloMateriales;
	private Object[] filaFichas = new Object[6];
	private Object[] filaElemento = new Object[2];
	private Object[] filaAfectPared = new Object[4];
	private Object[] filaIDMayHab = new Object[1];
	private Object[] filaMateriales = new Object[4];
	private JLabel lblElementosAfectados_1;
	private JLabel lblElemento;
	private JTextField textNombreElemento;
	private JLabel lblCantidad;
	private JSpinner spiCantidadElemento;
	private JPanel AgregarElementoBtn;
	private JLabel lblAgregarElemento;
	private JTable tablaElementos;
	private JScrollPane spTablaElementos;
	private ArrayList<ElementoAfectado> listaElementos;
	private JCheckBox ckbElementos;
	private JPanel Reiniciar4Btn;
	private JLabel label_3;
	private JPanel Anterior4Btn;
	private JLabel label_4;
	private JPanel RegistrarBtn;
	private JLabel label_5;
	private JLabel lblFicha;
	private JTable tablaFichas;
	private JScrollPane spTablaFichas;
	private int nf = 1;
	private JPanel AyudaCI;
	private JLabel lblAyudaCI;
	private JPanel AyudaTotalHab;
	private JLabel lblAyudaTotalHab;
	private JPanel AyudaTotalVul;
	private JLabel lblAyudaTotalVul;
	private JPanel AyudaEmbarazadas;
	private JLabel lblAyudaEmbarazadas;
	private JPanel AyudaAncianos;
	private JLabel lblAyudaAncianos;
	private JPanel AyudaNinnos;
	private JLabel lblAyudaNinnos;
	private JTextField textBuscarID;
	private JLabel lblNewLabel_1;
	private JLabel lblGestinY;
	private JLabel lblAlmacenamiento;
	private JLabel lblDeViviendasAfectadas;
	private JLabel lblLaFichaTcnica;
	private JTextField textMostrarID;
	private JLabel lblFondosRequeridos;
	private JLabel lblMateriales;
	private JLabel lblVivienda;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JLabel lblTotal;
	private JLabel lblPromedioPorAfectacin;
	private JLabel textTotalFondos;
	private JLabel textPromedioFondos;
	private JComboBox<String> cbMaterialSelec;
	private JLabel lblFondosR;
	private JLabel lblCantidadR;
	private JLabel textCantidadMaterial;
	private JLabel textFondosMaterial;
	private JSeparator separator_8;
	private JLabel lblSeleccioneUnMaterial;
	private JLabel lblElMayor;
	private JLabel lblDedicadoAUn;
	private JLabel lblMaterialEsDe;
	private JLabel textMayorFondo;
	private JLabel lblDedicadoPara;
	private JLabel lblPara;
	private JLabel lblMatMasFondos;
	private JSeparator separator_9;
	private JLabel lblViviendaPrioritaria;
	private JLabel textIDPrioridad;
	private JLabel lblIndice;
	private JLabel textIndice;
	private JLabel lblId;
	private JLabel lblMayorNmero;
	private JLabel lblDeHabitantes;
	private JLabel textMayHab;
	private JLabel lblEnLasViviendas;
	private JTable tablaIDMayorHab;
	private JScrollPane spTablaMayHab;
	private JComboBox<String> cbOrdenar;
	private JLabel lblOrdenar;
	private JRadioButton rbMenorMayor;
	private JRadioButton rbMayorMenor;
	private JLabel textParteTodo;
	private JSeparator separator_10;
	private JLabel lblLmites;
	private JLabel lblCategoras;
	private JLabel lblMateriales_1;
	private JSeparator separator_11;
	private JSeparator separator_12;
	private JSeparator separator_13;
	private JSeparator separator_14;
	private JSeparator separator_15;
	private JSeparator separator_16;
	private JSeparator separator_17;
	private JSeparator separator_18;
	private JSeparator separator_19;
	private JSeparator separator_20;
	private JSeparator separator_21;
	private JSeparator separator_22;
	private JLabel lblCaracteres;
	private JLabel lblDimensiones_1;
	private JLabel lblValores;
	private JLabel lblDocumentoLegal;
	private JLabel lblTipologaHabitacional_1;
	private JLabel lblTipologaConstructiva_1;
	private JLabel lblDireccin;
	private JLabel lblNombreDe;
	private JLabel lblElemento_1;
	private JLabel lblAfectado;
	private JTextField textAjustesDireccion;
	private JTextField textAjustesElemento;
	private JLabel lblMnVivienda;
	private JTextField textAjustesMinViv;
	private JTextField textAjustesMaxViv;
	private JTextField textAjustesMinAfect;
	private JLabel label_6;
	private JTextField textAjustesMaxAfect;
	private JSeparator separator_23;
	private JSeparator separator_24;
	private JLabel lblMxParedesAfectadas;
	private JTextField textAjustesCantParedes;
	private JLabel lblMximoDe;
	private JTextField textAjustesCantHab;
	private JLabel lblHabitantes_1;
	private JTextField txtAgregar;
	private JTextField txtAgregar_1;
	private JTextField txtAgregar_2;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JTable tablaMateriales;
	private JScrollPane spTablaMateriales;
	private JLabel lblId_1;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNombre;
	private JLabel lblPrecio;
	private JTextField textField_2;
	private JLabel lblUm;
	private JTextField textField_3;
	private JLabel label_7;
	private JTextField textField_4;
	private JButton btnNewButton;
	

	/**
	 * Crear el frame.
	 */
	public Pantalla(ConsejoAdmin admin) {
		
		this.admin = admin;
		setResizable(false);
		setIconImage(new ImageIcon("Recursos/Iconos/GAVA icono.png").getImage());
		setTitle("GAVA - Gesti\u00F3n y Almacenamiento de Viviendas Afectadas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 462);
		setLocationRelativeTo(null);
		UIManager.put("ToolTip.background", Color.white);
		UIManager.put("ToolTip.foreground", new Color(33, 86, 78));
		UIManager.put("ToolTip.font", new Font("Dialog",Font.PLAIN,14));
		Fondo = new JPanel();
		Fondo.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(Fondo);
		Fondo.setLayout(null);
		Fondo.add(getMenu());
		Fondo.add(getBarraColor());
		Fondo.add(getPantallas());
		gruposBotones();
	}
	
	private void gruposBotones() {
		ButtonGroup deterioroPared = new ButtonGroup();
		deterioroPared.add(rbParcialPared);
		deterioroPared.add(rbTotalPared);
		
		ButtonGroup deterioroTecho = new ButtonGroup();
		deterioroTecho.add(rbParcialTecho);
		deterioroTecho.add(rbTotalTecho);
		
		ButtonGroup ordenMM = new ButtonGroup();
		ordenMM.add(rbMayorMenor);
		ordenMM.add(rbMenorMayor);
		
	}

	private JPanel getMenu() {
		if (Menu == null) {
			Menu = new JPanel();
			Menu.setBackground(new Color(93, 146, 138));
			Menu.setBounds(0, 0, 214, 462);
			Menu.setLayout(null);
			Menu.add(getInicioBtn());
			Menu.add(getNuevaFichaBtn());
			Menu.add(getListaFichasBtn());
			Menu.add(getReportesBtn());
			Menu.add(getAjustesBtn());
			Menu.add(getLblG());
			Menu.add(getLblA());
			Menu.add(getLblV());
			Menu.add(getLabel());
			Menu.add(getLblV_1());
		}
		return Menu;
	}
	private JTabbedPane getPantallas() {
		if (Pantallas == null) {
			Pantallas = new JTabbedPane(JTabbedPane.BOTTOM);
			Pantallas.setBounds(207, 25, 575, 469);
			Pantallas.addTab("0", null, getInicio(), null);
			Pantallas.addTab("1", null, getNF1(), null);
			Pantallas.addTab("2", null, getNF2(), null);
			Pantallas.addTab("3", null, getNF3(), null);
			Pantallas.addTab("4", null, getNF4(), null);
			Pantallas.addTab("6", null, getListaFichas(), null);
			Pantallas.addTab("7", null, getReportes(), null);
			Pantallas.addTab("8", null, getAjustes(), null);
		}
		return Pantallas;
	}
	private JPanel getBarraColor() {
		if (BarraColor == null) {
			BarraColor = new JPanel();
			BarraColor.setBackground(Color.WHITE);
			BarraColor.setBounds(207, 0, 575, 29);
			BarraColor.setLayout(null);
			BarraColor.add(getLblDictamen());
			BarraColor.add(getPanelVerde1());
			BarraColor.add(getLblNucleoFamiliar());
			BarraColor.add(getPanelVerde2());
			BarraColor.add(getLblAfectaciones());
			BarraColor.add(getPanelVerde3());
			BarraColor.add(getLblElementosAfectados());
			BarraColor.add(getPanel_1_2());
				
		}
		return BarraColor;
	}
	private JPanel getInicio() {
		if (Inicio == null) {
			Inicio = new JPanel();
			Inicio.setBackground(Color.WHITE);
			Inicio.setLayout(null);
			Inicio.add(getBarraHorario());
			Inicio.add(getLblNewLabel_1());
		}
		return Inicio;
	}
	
	private JPanel getInicioBtn() {
		if (InicioBtn == null) {
			InicioBtn = new JPanel();
			InicioBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						InicioBtn.setBackground(new Color(214, 244, 236));
						lblInicio.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {
						if(condicion!="Inicio"){
							InicioBtn.setBackground(new Color(123, 176, 168));
							lblInicio.setForeground(Color.white);
						}				
					}
					@Override
					public void mouseClicked(MouseEvent e) {
		
						if(condicion == "NF")
							guardarProgresoNF();
						
						Pantallas.setSelectedIndex(0);
											
						condicion = "Inicio";
						lblInicio.setForeground(Color.black);	
						lblNuevaFicha.setForeground(Color.white);
						lblListaDeFichas.setForeground(Color.white);
						lblReportes.setForeground(Color.white);
						lblAjustes.setForeground(Color.white);
						
						InicioBtn.setBackground(new Color(214, 244, 236));
						NuevaFichaBtn.setBackground(new Color(123, 176, 168));
						ListaFichasBtn.setBackground(new Color(123, 176, 168));
						ReportesBtn.setBackground(new Color(123, 176, 168));				
						AjustesBtn.setBackground(new Color(123, 176, 168));
						
						
					}
				});
			InicioBtn.setBounds(0, 140, 214, 45);
			InicioBtn.setBackground(new Color(214, 244, 236));
			InicioBtn.setLayout(null);
			InicioBtn.add(getLblInicio());
		}
		return InicioBtn;
	}
	private JPanel getNuevaFichaBtn() {
		if (NuevaFichaBtn == null) {
			NuevaFichaBtn = new JPanel();
			NuevaFichaBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					NuevaFichaBtn.setBackground(new Color(214, 244, 236));
					lblNuevaFicha.setForeground(Color.black);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(condicion!="NF"){
						NuevaFichaBtn.setBackground(new Color(123, 176, 168));
						lblNuevaFicha.setForeground(Color.white);
					}			
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(primero){
						ficha = admin.nuevaFicha();
					}				
					primero = false;	
					if(nf == 1){
						Pantallas.setSelectedIndex(1);
						lblDictamen.setVisible(true);			
					}
					if(nf == 2){
						Pantallas.setSelectedIndex(2);
						lblNucleoFamiliar.setVisible(true);
						panelVerde1.setVisible(true);
					}
					if(nf == 3){
						Pantallas.setSelectedIndex(3);
						panelVerde1.setVisible(true);
						panelVerde2.setVisible(true);
						lblAfectaciones.setVisible(true);
						
					}
					if(nf == 4){
						Pantallas.setSelectedIndex(4);
						panelVerde1.setVisible(true);
						panelVerde2.setVisible(true);
						PanelVerde3.setVisible(true);
						lblElementosAfectados.setVisible(true);
					}
					
					condicion = "NF";
					
					lblInicio.setForeground(Color.white);	
					lblNuevaFicha.setForeground(Color.black);
					lblListaDeFichas.setForeground(Color.white);
					lblReportes.setForeground(Color.white);
					lblAjustes.setForeground(Color.white);
					
					InicioBtn.setBackground(new Color(123, 176, 168));
					NuevaFichaBtn.setBackground(new Color(214, 244, 236));
					ListaFichasBtn.setBackground(new Color(123, 176, 168));
					ReportesBtn.setBackground(new Color(123, 176, 168));
					AjustesBtn.setBackground(new Color(123, 176, 168));
									
				}
			});
			NuevaFichaBtn.setBackground(new Color(123, 176, 168));
			NuevaFichaBtn.setBounds(0, 185, 214, 45);
			NuevaFichaBtn.setLayout(null);
			NuevaFichaBtn.add(getLblNuevaFicha());
		}
		return NuevaFichaBtn;
	}
	private JLabel getLblInicio() {
		if (lblInicio == null) {
			lblInicio = new JLabel("Inicio");
			lblInicio.setFont(new Font("Dialog", Font.BOLD, 16));
			lblInicio.setBounds(75, 12, 100, 20);
		}
		return lblInicio;
	}
	private JLabel getLblNuevaFicha() {
		if (lblNuevaFicha == null) {
			lblNuevaFicha = new JLabel("Nueva Ficha");
			lblNuevaFicha.setForeground(Color.WHITE);
			lblNuevaFicha.setFont(new Font("Dialog", Font.BOLD, 16));
			lblNuevaFicha.setBounds(75, 12, 124, 20);
		}
		return lblNuevaFicha;
	}
	private JPanel getListaFichasBtn() {
		if (ListaFichasBtn == null) {
			ListaFichasBtn = new JPanel();
			ListaFichasBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ListaFichasBtn.setBackground(new Color(214, 244, 236));
					lblListaDeFichas.setForeground(Color.black);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(condicion!="Lista"){
						ListaFichasBtn.setBackground(new Color(123, 176, 168));
						lblListaDeFichas.setForeground(Color.white);
					}				
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					
					Pantallas.setSelectedIndex(5);
					
					if(condicion == "NF")
						guardarProgresoNF();
					
					lblInicio.setForeground(Color.white);	
					lblNuevaFicha.setForeground(Color.white);
					lblListaDeFichas.setForeground(Color.black);
					lblReportes.setForeground(Color.white);
					lblAjustes.setForeground(Color.white);
					
					InicioBtn.setBackground(new Color(123, 176, 168));
					NuevaFichaBtn.setBackground(new Color(123, 176, 168));
					ListaFichasBtn.setBackground(new Color(214, 244, 236));
					ReportesBtn.setBackground(new Color(123, 176, 168));				
					AjustesBtn.setBackground(new Color(123, 176, 168));
					
					lblDictamen.setVisible(false);
					panelVerde1.setVisible(false);
					lblNucleoFamiliar.setVisible(false);
					panelVerde2.setVisible(false);
					lblAfectaciones.setVisible(false);
				    PanelVerde3.setVisible(false);
				    lblElementosAfectados.setVisible(false);
				    PanelVerde4.setVisible(false);
				    
				   
				    textBuscarID.setFocusable(false);
				    if(condicion != "Lista"){
				    	cbOrdenar.setSelectedIndex(0);
				    	rbMenorMayor.setSelected(true);
				    	mostrarTablaLista(admin.getListaPlantillas());
				    }
				    textParteTodo.setText(tablaFichas.getRowCount() + " de " + admin.getListaPlantillas().size());
				    condicion = "Lista";
				    
				}
			});
			ListaFichasBtn.setLayout(null);
			ListaFichasBtn.setBackground(new Color(123, 176, 168));
			ListaFichasBtn.setBounds(0, 230, 214, 45);
			ListaFichasBtn.add(getLblListaDeFichas());
		}
		return ListaFichasBtn;
	}
	private JLabel getLblListaDeFichas() {
		if (lblListaDeFichas == null) {
			lblListaDeFichas = new JLabel("Lista de Fichas");
			lblListaDeFichas.setForeground(Color.WHITE);
			lblListaDeFichas.setFont(new Font("Dialog", Font.BOLD, 16));
			lblListaDeFichas.setBounds(75, 12, 124, 20);
		}
		return lblListaDeFichas;
	}
	private JPanel getReportesBtn() {
		if (ReportesBtn == null) {
			ReportesBtn = new JPanel();
			ReportesBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ReportesBtn.setBackground(new Color(214, 244, 236));
					lblReportes.setForeground(Color.black);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(condicion!="Reportes"){
						ReportesBtn.setBackground(new Color(123, 176, 168));
						lblReportes.setForeground(Color.white);
					}				
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if(condicion == "NF")
						guardarProgresoNF();
					
					Pantallas.setSelectedIndex(6);
					
					textTotalFondos.setText("$" + Double.toString(admin.buscarTotalFondos()) + "0");
					textPromedioFondos.setText("$" + Double.toString(admin.buscarPromedioFondos()) + "0");
					
					
					MaterialMasFondos mat = admin.buscarMaterialMasFondos();
					textMayorFondo.setText("$" + Double.toString(mat.getFondos()) + "0");
					lblMatMasFondos.setText(mat.getNombre());
					    
					IDIndicePrioridad prioridad = admin.buscarViviendaPrioridad();
					textIDPrioridad.setText(prioridad.getID());
					textIndice.setText(Double.toString(Utiles.formatoDinero(prioridad.getIndice())));
					
					ViviendaMayorHab vivienda = admin.buscarViviendaMayorHab();
					textMayHab.setText(Integer.toString(vivienda.getCantHab()));
					
					for(String id: vivienda.getIds()){
						boolean posible = true;
				    	if(tablaIDMayorHab.getRowCount() != 0){		
					    	for(int i = 0; i < tablaIDMayorHab.getRowCount(); i++){
						    	if(tablaIDMayorHab.getValueAt(i, 0).equals(id)){
						    		posible = false;
						    	}
						    }
				    	}
				    	if(posible){
							filaIDMayHab[0] = id;
							modeloIDMayHab.addRow(filaIDMayHab);
				    	}
					}	
					tablaIDMayorHab.setModel(modeloIDMayHab);
					
                    
					condicion = "Reportes";
					lblInicio.setForeground(Color.white);	
					lblNuevaFicha.setForeground(Color.white);
					lblListaDeFichas.setForeground(Color.white);
					lblReportes.setForeground(Color.black);
					lblAjustes.setForeground(Color.white);
					
					InicioBtn.setBackground(new Color(123, 176, 168));
					NuevaFichaBtn.setBackground(new Color(123, 176, 168));
					ListaFichasBtn.setBackground(new Color(123, 176, 168));
					ReportesBtn.setBackground(new Color(214, 244, 236));				
					AjustesBtn.setBackground(new Color(123, 176, 168));	
					
					lblDictamen.setVisible(false);
					panelVerde1.setVisible(false);
					lblNucleoFamiliar.setVisible(false);
					panelVerde2.setVisible(false);
					lblAfectaciones.setVisible(false);
				    PanelVerde3.setVisible(false);
				    lblElementosAfectados.setVisible(false);
				    PanelVerde4.setVisible(false);
				}
			});
			ReportesBtn.setLayout(null);
			ReportesBtn.setBackground(new Color(123, 176, 168));
			ReportesBtn.setBounds(0, 275, 214, 45);
			ReportesBtn.add(getLblReportes());
		}
		return ReportesBtn;
	}
	private JLabel getLblReportes() {
		if (lblReportes == null) {
			lblReportes = new JLabel("Reportes");
			lblReportes.setForeground(Color.WHITE);
			lblReportes.setFont(new Font("Dialog", Font.BOLD, 16));
			lblReportes.setBounds(75, 12, 124, 20);
		}
		return lblReportes;
	}
	private JPanel getAjustesBtn() {
		if (AjustesBtn == null) {
			AjustesBtn = new JPanel();

			AjustesBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					AjustesBtn.setBackground(new Color(214, 244, 236));
					lblAjustes.setForeground(Color.black);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(condicion!="Ajustes"){
						AjustesBtn.setBackground(new Color(123, 176, 168));
						lblAjustes.setForeground(Color.white);
					}				
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					
					Pantallas.setSelectedIndex(7);
					//quitar
					admin.crearGrafo();
					condicion = "Ajustes";
					lblInicio.setForeground(Color.white);	
					lblNuevaFicha.setForeground(Color.white);
					lblListaDeFichas.setForeground(Color.white);
					lblReportes.setForeground(Color.white);
					lblAjustes.setForeground(Color.black);
					
					BarraColor.setBackground(Color.white);
					
					InicioBtn.setBackground(new Color(123, 176, 168));
					NuevaFichaBtn.setBackground(new Color(123, 176, 168));
					ListaFichasBtn.setBackground(new Color(123, 176, 168));
					ReportesBtn.setBackground(new Color(123, 176, 168));				
					AjustesBtn.setBackground(new Color(214, 244, 236));	
					
					lblDictamen.setVisible(false);
					panelVerde1.setVisible(false);
					lblNucleoFamiliar.setVisible(false);
					panelVerde2.setVisible(false);
					lblAfectaciones.setVisible(false);
				    PanelVerde3.setVisible(false);
				    lblElementosAfectados.setVisible(false);
				    PanelVerde4.setVisible(false);
				    
				    textAjustesDireccion.setText(Integer.toString(ValorPorDefecto.limiteDireccion));
				    textAjustesElemento.setText(Integer.toString(ValorPorDefecto.limiteNombreElemento));
				    textAjustesMinViv.setText(Float.toString(ValorPorDefecto.limiteMinDimCasa));
				    textAjustesMaxViv.setText(Float.toString(ValorPorDefecto.limiteMaxDimCasa));
				    textAjustesMinAfect.setText(Float.toString(ValorPorDefecto.limiteMinAfectacion));
				    textAjustesMaxAfect.setText(Float.toString(ValorPorDefecto.limiteMaxAfectacion));
				    textAjustesCantParedes.setText(Integer.toString(ValorPorDefecto.limiteCantParedes));
				    textAjustesCantHab.setText(Integer.toString(ValorPorDefecto.limiteTotalHabitantes));
				    
				    for(Material m: admin.getListaMateriales()){
				    	filaMateriales[0] = m.getID();
				    	filaMateriales[1] = m.getNombre();
				    	filaMateriales[2] = "$" + m.getPrecioU() + "0";
				    	filaMateriales[3] = m.getCantMetCuad() + m.getUnidadMedida();
				    	modeloMateriales.addRow(filaMateriales);
				    }
				    tablaMateriales.setModel(modeloMateriales);
				    
				}
			});
			AjustesBtn.setLayout(null);
			AjustesBtn.setBackground(new Color(123, 176, 168));
			AjustesBtn.setBounds(0, 320, 214, 45);
			AjustesBtn.add(getLblAjustes());
		}
		return AjustesBtn;
	}
	private JLabel getLblAjustes() {
		if (lblAjustes == null) {
			lblAjustes = new JLabel("Ajustes");
			lblAjustes.setForeground(Color.WHITE);
			lblAjustes.setFont(new Font("Dialog", Font.BOLD, 16));
			lblAjustes.setBounds(75, 12, 124, 20);
		}
		return lblAjustes;
	}
	private JPanel getBarraHorario() {
		if (BarraHorario == null) {
			BarraHorario = new JPanel();
			BarraHorario.setBounds(0, 0, 570, 112);
			BarraHorario.setBackground(new Color(214, 244, 236));
			BarraHorario.setLayout(null);
			BarraHorario.add(getLblFecha());
			BarraHorario.add(getLblHora());
			BarraHorario.add(getLblGestinY());
			BarraHorario.add(getLblAlmacenamiento());
			BarraHorario.add(getLblDeViviendasAfectadas());
		}
		return BarraHorario;
	}
	private JLabel getLblFecha() {
		if (lblFecha == null) {
			lblFecha = new JLabel();
			lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
			lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblFecha.setBounds(295, 17, 260, 37);
			BarraHorario.add(lblFecha);
			
			Timer t = new Timer();
			t.schedule(new TimerTask(){
				@Override
				public void run() {
					
					lblFecha.setText("Hoy es " + LocalDate.now().getDayOfMonth() +" / "+ LocalDate.now().getMonthValue() +" / "+ LocalDate.now().getYear());
					repaint();		
				}		
			}, 0L, 1000L);
		}
		return lblFecha;
	}
	
	private JLabel getLblHora(){
		if(lblHora == null){
			lblHora = new JLabel("");
			lblHora.setHorizontalAlignment(SwingConstants.CENTER);
			lblHora.setFont(new Font("Tahoma", Font.PLAIN, 40));
			lblHora.setBounds(295, 61, 260, 35);
			BarraHorario.add(lblHora);
			
			Timer t = new Timer();
			t.schedule(new TimerTask(){
	
				@Override
				public void run() {
					String valor1="";
					String valor2="";
					String valor3="";
					if(LocalTime.now().getHour() - 9 > 0)
						valor1="";
					else valor1="0";
					if(LocalTime.now().getMinute() - 9 > 0)
						valor2="";
					else valor2="0";
					if(LocalTime.now().getSecond() - 9 > 0)
						valor3="";
					else valor3="0";
					
					
					lblHora.setText(valor1+ LocalTime.now().getHour() +":"+ valor2 + LocalTime.now().getMinute() 
							+":" + valor3 + LocalTime.now().getSecond());
					
					repaint();		
				}
				
			}, 0L, 1000L);
		}
		return lblHora;
	}
	private JLabel getLblG() {
		if (lblG == null) {
			lblG = new JLabel("G");
			lblG.setHorizontalAlignment(SwingConstants.TRAILING);
			lblG.setFont(new Font("Verdana", Font.BOLD, 64));
			lblG.setForeground(new Color(214, 244, 236));
			lblG.setBackground(Color.WHITE);
			lblG.setBounds(7, 30, 78, 74);
		}
		return lblG;
	}
	private JLabel getLblA() {
		if (lblA == null) {
			lblA = new JLabel("A");
			lblA.setHorizontalAlignment(SwingConstants.TRAILING);
			lblA.setForeground(new Color(214, 244, 236));
			lblA.setFont(new Font("Verdana", Font.BOLD, 64));
			lblA.setBackground(Color.WHITE);
			lblA.setBounds(45, 30, 78, 74);
		}
		return lblA;
	}
	private JLabel getLblV() {
		if (lblV == null) {
			lblV = new JLabel("V");
			lblV.setHorizontalAlignment(SwingConstants.TRAILING);
			lblV.setForeground(new Color(214, 244, 236));
			lblV.setFont(new Font("Verdana", Font.BOLD, 64));
			lblV.setBackground(Color.WHITE);
			lblV.setBounds(63, 30, 78, 74);
		}
		return lblV;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("A");
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setForeground(new Color(214, 244, 236));
			label.setFont(new Font("Verdana", Font.BOLD, 64));
			label.setBackground(Color.WHITE);
			label.setBounds(100, 30, 78, 74);
		}
		return label;
	}
	private JPanel getNF1() {
		if (NF1 == null) {
			NF1 = new JPanel();
			NF1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					if(textLargoV.getText().isEmpty() || textAnchoV.getText().isEmpty())
						textAreaV.setText("No resultados");
					else
						textAreaV.setText(String.valueOf(largo * ancho));
				}
			});
			NF1.setBackground(new Color(214, 234, 230));
			NF1.setLayout(null);
			NF1.add(getLblDireccion());
			NF1.add(getLblDatosVivienda());
			NF1.add(getTextDireccion());
			NF1.add(getLblFechaDeLevantamiento());
			NF1.add(getDcFechaLev());
			NF1.add(getSeparator());
			NF1.add(getLblDocLegal());
			NF1.add(getLblTipologaHabitacional());
			NF1.add(getLblTipologaConstructiva());
			NF1.add(getCbDocLegal());
			NF1.add(getCbTipoHab());
			NF1.add(getCbTipoCons());
			NF1.add(getSeparator_1());
			NF1.add(getLblDimensiones());
			NF1.add(getLblLargo());
			NF1.add(getLblAncho());
			NF1.add(getTextLargoV());
			NF1.add(getTextAnchoV());
			NF1.add(getLblArea());
			NF1.add(getTextAreaV());
			NF1.add(getSeparator_2());
			NF1.add(getCkbFacilidad());
			NF1.add(getLblContFacilidad());
			NF1.add(getReiniciar1_Btn());
			NF1.add(getAnterior1_Btn());
			NF1.add(getSiguiente1_Btn());
			NF1.add(getAyudaDireccion());
			NF1.add(getAyudaFechaLev());
			NF1.add(getPanel_1());
			NF1.add(getPanel_1_1());
			NF1.add(getAyudaTipoCons());
			NF1.add(getAyudaDimV());
			NF1.add(getRellenarBtn());
		}
		return NF1;
	}
	private JPanel getNF2() {
		if (NF2 == null) {
			NF2 = new JPanel();
			NF2.setBackground(new Color(214, 234, 230));
			NF2.setLayout(null);
			NF2.add(getLblCarnDeIdentidad());
			NF2.add(getTextCIJefe());
			NF2.add(getLblJefeDeNcleo());
			NF2.add(getSeparator_3());
			NF2.add(getLblNoHabitantes());
			NF2.add(getLblTotalDeHabitantes());
			NF2.add(getLblAncianos());
			NF2.add(getLblNios());
			NF2.add(getLblEmbarazadas());
			NF2.add(getSpiTotalHab());
			NF2.add(getSpiEmbarazadas());
			NF2.add(getSpiNinnos());
			NF2.add(getSpiAncianos());
			NF2.add(getReiniciar2_Btn());
			NF2.add(getAnterior2_Btn());
			NF2.add(getSiguiente2_Btn());
			NF2.add(getLabel_1_1());
			NF2.add(getLabel_1_2());
			NF2.add(getLabel_1_3());
			NF2.add(getTextVulnerables());
			NF2.add(getRellenar2Btn());
			NF2.add(getAyudaCI());
			NF2.add(getAyudaTotalHab());
			NF2.add(getAyudaTotalVul());
			NF2.add(getAyudaEmbarazadas());
			NF2.add(getAyudaAncianos());
			NF2.add(getAyudaNinnos());
		}
		return NF2;
	}
	private JPanel getNF3() {
		if (NF3 == null) {
			NF3 = new JPanel();
			NF3.setBackground(new Color(214, 234, 230));
			NF3.setLayout(null);
			NF3.add(getReiniciar3Btn());
			NF3.add(getPanel_1_3());
			NF3.add(getSiguiente3Btn());
			NF3.add(getLblAfectacionesDePared());
			NF3.add(getLblAfectacinDeTecho());
			NF3.add(getSeparator_4());
			NF3.add(getSpTablaAfectPared());
			NF3.add(getSeparator_5());
			NF3.add(getRbTotalPared());
			NF3.add(getRbParcialPared());
			NF3.add(getLblMaterialPared());
			NF3.add(getCbMaterialPared());
			NF3.add(getLblLargoPared());
			NF3.add(getLblAnchoPared());
			NF3.add(getTextLargoPared());
			NF3.add(getTextAnchoPared());
			NF3.add(getCkbParedCarga());
			NF3.add(getRbTotalTecho());
			NF3.add(getRbParcialTecho());
			NF3.add(getLblMaterialTecho());
			NF3.add(getCbMaterialTecho());
			NF3.add(getLblLargoTecho());
			NF3.add(getTextLargoTecho());
			NF3.add(getLabel_3_1());
			NF3.add(getTextAnchoTecho());
			NF3.add(getAgregarParedBtn());
			NF3.add(getCkbAfectPared());
			NF3.add(getCkbAfectTecho());
		}
		return NF3;
	}
	private JPanel getNF4() {
		if (NF4 == null) {
			NF4 = new JPanel();
			NF4.setBackground(new Color(214, 234, 230));
			NF4.setLayout(null);
			NF4.add(getLblElementosAfectados_1());
			NF4.add(getLblElemento());
			NF4.add(getTextNombreElemento());
			NF4.add(getLblCantidad());
			NF4.add(getSpiCantidadElemento());
			NF4.add(getAgregarElementoBtn());
			NF4.add(getSpTablaElementos());
			NF4.add(getCkbElementos());
			NF4.add(getReiniciar4Btn());
			NF4.add(getPanel_1_4());
			NF4.add(getPanel_2_1());
			NF4.add(getLblLaFichaTcnica());
			NF4.add(getTextMostrarID());
		}
		return NF4;
	}
	private JPanel getListaFichas() {
		if (ListaFichas == null) {
			ListaFichas = new JPanel();
			ListaFichas.setBackground(new Color(214, 234, 230));
			ListaFichas.setLayout(null);
			ListaFichas.add(getSpTablaFichas());
			ListaFichas.add(getTextBuscarID());
			ListaFichas.add(getCbOrdenar());
			ListaFichas.add(getLblOrdenar());
			ListaFichas.add(getRbMenorMayor());
			ListaFichas.add(getRbMayorMenor());
			ListaFichas.add(getTextParteTodo());
			ListaFichas.add(getSeparator_10());
		}
		return ListaFichas;
	}
	private JPanel getReportes() {
		if (Reportes == null) {
			Reportes = new JPanel();
			Reportes.setBackground(new Color(214, 234, 230));
			Reportes.setLayout(null);
			Reportes.add(getLblFondosRequeridos());
			Reportes.add(getLblMateriales());
			Reportes.add(getLblVivienda());
			Reportes.add(getSeparator_6());
			Reportes.add(getSeparator_7());
			Reportes.add(getLblTotal());
			Reportes.add(getLblPromedioPorAfectacin());
			Reportes.add(getTextTotalFondos());
			Reportes.add(getTextPromedioFondos());
			Reportes.add(getCbMaterialSelec());
			Reportes.add(getLblFondosR());
			Reportes.add(getLblCantidadR());
			Reportes.add(getTextCantidadMaterial());
			Reportes.add(getTextFondosMaterial());
			Reportes.add(getSeparator_8());
			Reportes.add(getLblSeleccioneUnMaterial());
			Reportes.add(getLblElMayor());
			Reportes.add(getLblDedicadoAUn());
			Reportes.add(getLblMaterialEsDe());
			Reportes.add(getTextMayorFondo());
			Reportes.add(getLblDedicadoPara());
			Reportes.add(getLblPara());
			Reportes.add(getLblMatMasFondos());
			Reportes.add(getSeparator_9());
			Reportes.add(getLblViviendaPrioritaria());
			Reportes.add(getTextIDPrioridad());
			Reportes.add(getLblIndice());
			Reportes.add(getTextIndice());
			Reportes.add(getLblId());
			Reportes.add(getLblMayorNmero());
			Reportes.add(getLblDeHabitantes());
			Reportes.add(getTextMayHab());
			Reportes.add(getLblEnLasViviendas());
			Reportes.add(getSpTablaMayHab());
		}
		return Reportes;
	}
	private JPanel getAjustes() {
		if (Ajustes == null) {
			Ajustes = new JPanel();
			Ajustes.setBackground(new Color(214, 234, 230));
			Ajustes.setLayout(null);
			Ajustes.add(getLblLmites());
			Ajustes.add(getLblCategoras());
			Ajustes.add(getLblMateriales_1());
			Ajustes.add(getSeparator_11());
			Ajustes.add(getSeparator_12());
			Ajustes.add(getSeparator_13());
			Ajustes.add(getSeparator_14());
			Ajustes.add(getSeparator_15());
			Ajustes.add(getSeparator_16());
			Ajustes.add(getSeparator_17());
			Ajustes.add(getSeparator_18());
			Ajustes.add(getSeparator_19());
			Ajustes.add(getSeparator_20());
			Ajustes.add(getSeparator_21());
			Ajustes.add(getSeparator_22());
			Ajustes.add(getLblCaracteres());
			Ajustes.add(getLblDimensiones_1());
			Ajustes.add(getLblValores());
			Ajustes.add(getLblDocumentoLegal());
			Ajustes.add(getLblTipologaHabitacional_1());
			Ajustes.add(getLblTipologaConstructiva_1());
			Ajustes.add(getLblDireccin());
			Ajustes.add(getLblNombreDe());
			Ajustes.add(getLblElemento_1());
			Ajustes.add(getLblAfectado());
			Ajustes.add(getTextAjustesDireccion());
			Ajustes.add(getTextAjustesElemento());
			Ajustes.add(getLblMnVivienda());
			Ajustes.add(getTextAjustesMinViv());
			Ajustes.add(getTextAjustesMaxViv());
			Ajustes.add(getTextAjustesMinAfect());
			Ajustes.add(getLabel_6());
			Ajustes.add(getTextAjustesMaxAfect());
			Ajustes.add(getSeparator_23());
			Ajustes.add(getSeparator_24());
			Ajustes.add(getLblMxParedesAfectadas());
			Ajustes.add(getTextAjustesCantParedes());
			Ajustes.add(getLblMximoDe());
			Ajustes.add(getTextAjustesCantHab());
			Ajustes.add(getLblHabitantes_1());
			Ajustes.add(getTxtAgregar());
			Ajustes.add(getTxtAgregar_1());
			Ajustes.add(getTxtAgregar_2());
			Ajustes.add(getComboBox());
			Ajustes.add(getComboBox_1());
			Ajustes.add(getComboBox_2());
			Ajustes.add(getSpTablaMateriales());
			Ajustes.add(getLblId_1());
			Ajustes.add(getTextField());
			Ajustes.add(getTextField_1());
			Ajustes.add(getLblNombre());
			Ajustes.add(getLblPrecio());
			Ajustes.add(getTextField_2());
			Ajustes.add(getLblUm());
			Ajustes.add(getTextField_3());
			Ajustes.add(getLabel_7());
			Ajustes.add(getTextField_4());
			Ajustes.add(getBtnNewButton());
		}
		return Ajustes;
	}
	private JLabel getLblDireccion() {
		if (lblDireccion == null) {
			lblDireccion = new JLabel("Direcci\u00F3n:");
			lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDireccion.setBounds(44, 36, 120, 20);
		}
		return lblDireccion;
	}
	private JLabel getLblDatosVivienda() {
		if (lblDatosVivienda == null) {
			lblDatosVivienda = new JLabel("DATOS DE LA VIVIENDA");
			lblDatosVivienda.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblDatosVivienda.setHorizontalAlignment(SwingConstants.CENTER);
			lblDatosVivienda.setBounds(120, 6, 304, 20);
			NF1.add(lblDatosVivienda);
		}
		return lblDatosVivienda;
	}
	private JTextField getTextDireccion() {
		if (textDireccion == null) {
			textDireccion = new JTextField();
			textDireccion.setFont(new Font("Dialog", Font.PLAIN, 16));
			textDireccion.setBorder(null);
			textDireccion.setToolTipText("");
			textDireccion.setBounds(130, 34, 355, 26);
			textDireccion.setColumns(10);
			textDireccion.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					textDireccion.setBorder(BorderFactory.createEmptyBorder());
					int contador = textDireccion.getText().length();
					if(contador == ValorPorDefecto.limiteDireccion)
						e.consume();
				}
			});
		}
		return textDireccion;
	}
	private JLabel getLblFechaDeLevantamiento() {
		if (lblFechaDeLevantamiento == null) {
			lblFechaDeLevantamiento = new JLabel("Fecha de levantamiento:");
			lblFechaDeLevantamiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblFechaDeLevantamiento.setBounds(44, 70, 197, 20);
		}
		return lblFechaDeLevantamiento;
	}
	private JDateChooser getDcFechaLev() {
		if (dcFechaLev == null) {
			dcFechaLev = new JDateChooser();
			dcFechaLev.getCalendarButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dcFechaLev.setBorder(null);
				}
			});
			dcFechaLev.setBorder(null);
			dcFechaLev.setDateFormatString("  dd  /  MM  /  yyyy  ");
			dcFechaLev.setToolTipText("");
			dcFechaLev.setBounds(256, 68, 229, 26);
			((JTextField)dcFechaLev.getDateEditor()).setEditable(false);
			DateFormat formato = new SimpleDateFormat("dd / mm / yyyy");
			Date fechaMin = new Date();
			String annoMin = String.valueOf(LocalDate.now().getYear() - 10);
			try {
				fechaMin = formato.parse("01 / 01 / " + annoMin);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Date fechaMax = new Date();
			dcFechaLev.setMinSelectableDate(fechaMin);
			dcFechaLev.setMaxSelectableDate(fechaMax);
			((JTextField)dcFechaLev.getDateEditor()).setFont(new Font("Dialog", Font.PLAIN, 16));
		}
		return dcFechaLev;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(Color.DARK_GRAY);
			separator.setBounds(15, 102, 526, 9);
		}
		return separator;
	}
	private JLabel getLblDocLegal() {
		if (lblDocLegal == null) {
			lblDocLegal = new JLabel("Documentaci\u00F3n Legal:");
			lblDocLegal.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDocLegal.setBounds(44, 116, 197, 20);
		}
		return lblDocLegal;
	}
	private JLabel getLblTipologaHabitacional() {
		if (lblTipologaHabitacional == null) {
			lblTipologaHabitacional = new JLabel("Tipolog\u00EDa Habitacional:");
			lblTipologaHabitacional.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblTipologaHabitacional.setBounds(44, 150, 197, 20);
		}
		return lblTipologaHabitacional;
	}
	private JLabel getLblTipologaConstructiva() {
		if (lblTipologaConstructiva == null) {
			lblTipologaConstructiva = new JLabel("Tipolog\u00EDa Constructiva:");
			lblTipologaConstructiva.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblTipologaConstructiva.setBounds(44, 186, 197, 20);
		}
		return lblTipologaConstructiva;
	}
	private JComboBox<String> getCbDocLegal() {
		if (cbDocLegal == null) {
			cbDocLegal = new JComboBox<String>();
			cbDocLegal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbDocLegal.setBorder(null);
				}
			});
			cbDocLegal.setModel(new DefaultComboBoxModel<String>(Utiles.getListaconBlanco(ValorPorDefecto.getListaDocLegal())));
			cbDocLegal.setBounds(236, 114, 249, 26);
			cbDocLegal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return cbDocLegal;
	}
	private JComboBox<String> getCbTipoHab() {
		if (cbTipoHab == null) {
			cbTipoHab = new JComboBox<String>();
			cbTipoHab.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbTipoHab.setBorder(null);
				}
			});
			cbTipoHab.setModel(new DefaultComboBoxModel<String>(Utiles.getListaconBlanco(ValorPorDefecto.getListaTipoHab())));
			cbTipoHab.setBounds(236, 148, 249, 26);
			cbTipoHab.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return cbTipoHab;
	}
	private JComboBox<String> getCbTipoCons() {
		if (cbTipoCons == null) {
			cbTipoCons = new JComboBox<String>();
			cbTipoCons.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbTipoCons.setBorder(null);
				}
			});
			cbTipoCons.setModel(new DefaultComboBoxModel<String>(Utiles.getListaconBlanco(ValorPorDefecto.getListaTipoCons())));
			cbTipoCons.setBounds(236, 184, 249, 26);
			cbTipoCons.setFont(new Font("Tahoma", Font.PLAIN, 12));
		}
		return cbTipoCons;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(Color.DARK_GRAY);
			separator_1.setBounds(15, 220, 526, 9);
		}
		return separator_1;
	}
	private JLabel getLblDimensiones() {
		if (lblDimensiones == null) {
			lblDimensiones = new JLabel("DIMENSIONES(m)");
			lblDimensiones.setHorizontalAlignment(SwingConstants.CENTER);
			lblDimensiones.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblDimensiones.setBounds(120, 224, 304, 20);
		}
		return lblDimensiones;
	}
	private JLabel getLblLargo() {
		if (lblLargo == null) {
			lblLargo = new JLabel("Largo:");
			lblLargo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblLargo.setBounds(44, 256, 61, 20);
		}
		return lblLargo;
	}
	private JLabel getLblAncho() {
		if (lblAncho == null) {
			lblAncho = new JLabel("Ancho:");
			lblAncho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblAncho.setBounds(196, 256, 69, 20);
		}
		return lblAncho;
	}
	private JTextField getTextLargoV() {
		if (textLargoV == null) {
			textLargoV = new JTextField();
			textLargoV.setFont(new Font("Dialog", Font.PLAIN, 16));
			textLargoV.setHorizontalAlignment(SwingConstants.CENTER);
			textLargoV.setBorder(null);
			textLargoV.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					boolean esNumero = tecla >= 48 && tecla <= 57 || tecla == 46;
					if(!esNumero || textLargoV.getText().length() > 2)
						e.consume();
				}
				@Override
				public void keyReleased(KeyEvent e) {
					textLargoV.setBorder(BorderFactory.createEmptyBorder());
					if(!textLargoV.getText().isEmpty()){
						largo = Float.parseFloat(textLargoV.getText());
						if(!textAnchoV.getText().isEmpty())
							if(String.valueOf(largo * ancho).length() < 7)
								textAreaV.setText(String.valueOf(largo * ancho));
							else
								textAreaV.setText(String.valueOf(largo * ancho).substring(0, 6));				
					}
					if(textAnchoV.getText().isEmpty() || textLargoV.getText().isEmpty())
						textAreaV.setText("");
				}
			});
			textLargoV.setBounds(106, 254, 48, 26);
			textLargoV.setColumns(10);
		}
		return textLargoV;
	}
	private JTextField getTextAnchoV() {
		if (textAnchoV == null) {
			textAnchoV = new JTextField();
			textAnchoV.setFont(new Font("Dialog", Font.PLAIN, 16));
			textAnchoV.setHorizontalAlignment(SwingConstants.CENTER);
			textAnchoV.setBorder(null);
			textAnchoV.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					boolean esNumero = tecla >= 48 && tecla <= 57 || tecla == 46;
					if(!esNumero || textAnchoV.getText().length() > 2)
						e.consume();
				}
				public void keyReleased(KeyEvent e) {
					textAnchoV.setBorder(BorderFactory.createEmptyBorder());
					if(!textAnchoV.getText().isEmpty()){
						ancho = Float.parseFloat(textAnchoV.getText());
						if(!textLargoV.getText().isEmpty())
							if(String.valueOf(largo * ancho).length() < 7)
								textAreaV.setText(String.valueOf(largo * ancho));
							else
								textAreaV.setText(String.valueOf(largo * ancho).substring(0, 6));
					}
					if(textAnchoV.getText().isEmpty() || textLargoV.getText().isEmpty())
						textAreaV.setText("");
					
				}
			});
			textAnchoV.setColumns(10);
			textAnchoV.setBounds(260, 254, 48, 26);
		}
		return textAnchoV;
	}
	private JLabel getLblArea() {
		if (lblArea == null) {
			lblArea = new JLabel("\u00C1rea:");
			lblArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblArea.setBounds(373, 256, 55, 20);
		}
		return lblArea;
	}
	private JTextField getTextAreaV() {
		if (textAreaV == null) {
			textAreaV = new JTextField();
			textAreaV.setHorizontalAlignment(SwingConstants.LEFT);
			textAreaV.setFont(new Font("Dialog", Font.PLAIN, 16));
			textAreaV.setBorder(null);
			textAreaV.setEditable(false);
			textAreaV.setColumns(10);
			textAreaV.setBounds(424, 254, 61, 26);
			textAreaV.setBackground(new Color(234, 254, 250));
		}
			
		return textAreaV;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setForeground(Color.DARK_GRAY);
			separator_2.setBounds(15, 290, 526, 9);
		}
		return separator_2;
	}
	private JCheckBox getCkbFacilidad() {
		if (ckbFacilidad == null) {
			ckbFacilidad = new JCheckBox(" Facilidad temporal");
			ckbFacilidad.setBorder(BorderFactory.createEmptyBorder());
			ckbFacilidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ckbFacilidad.setBounds(44, 300, 181, 29);
			ckbFacilidad.setBackground(new Color(214, 234, 230));
		}
		return ckbFacilidad;
	}
	private JLabel getLblContFacilidad() {
		if (lblContFacilidad == null) {
			lblContFacilidad = new JLabel(" (damnificado por un evento previo)");
			lblContFacilidad.setForeground(Color.DARK_GRAY);
			lblContFacilidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblContFacilidad.setBounds(225, 304, 260, 20);
		}
		return lblContFacilidad;
	}
	private JLabel getLblDictamen() {
		if (lblDictamen == null) {
			lblDictamen = new JLabel("Dictamen");
			lblDictamen.setFont(new Font("Dialog",Font.PLAIN,16));
			lblDictamen.setBounds(15, 5, 69, 20);
		}
		lblDictamen.setVisible(false);
		return lblDictamen;
	}
	private JPanel getReiniciar1_Btn() {
		if (Reiniciar1_Btn == null) {
			Reiniciar1_Btn = new JPanel();
			Reiniciar1_Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Reiniciar1_Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Reiniciar1_Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
					reiniciarDatos();
				}
			});
			Reiniciar1_Btn.setBackground(new Color(123, 176, 168));
			Reiniciar1_Btn.setBounds(80, 348, 111, 35);
			Reiniciar1_Btn.setLayout(null);
			Reiniciar1_Btn.add(getLblReiniciar());
		}
		return Reiniciar1_Btn;
	}
	private JLabel getLblReiniciar() {
		if (lblReiniciar == null) {
			lblReiniciar = new JLabel("REINICIAR");
			lblReiniciar.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblReiniciar.setForeground(Color.white);
			lblReiniciar.setHorizontalAlignment(SwingConstants.CENTER);
			lblReiniciar.setBounds(9, 9, 95, 20);
		}
		return lblReiniciar;
	}
	private JPanel getAnterior1_Btn() {
		if (Anterior1_Btn == null) {
			Anterior1_Btn = new JPanel();
			Anterior1_Btn.setBorder(null);
			Anterior1_Btn.setLayout(null);
			Anterior1_Btn.setBackground(Color.LIGHT_GRAY);
			Anterior1_Btn.setBounds(224, 348, 111, 35);
			Anterior1_Btn.add(getLblAnterior());
		}
		return Anterior1_Btn;
	}
	private JLabel getLblAnterior() {
		if (lblAnterior == null) {
			lblAnterior = new JLabel("ANTERIOR");
			lblAnterior.setHorizontalAlignment(SwingConstants.CENTER);
			lblAnterior.setForeground(Color.white);
			lblAnterior.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblAnterior.setBounds(9, 9, 95, 20);
		}
		return lblAnterior;
	}
	private JPanel getSiguiente1_Btn() {
		if (Siguiente1_Btn == null) {
			Siguiente1_Btn = new JPanel();
			Siguiente1_Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Siguiente1_Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Siguiente1_Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
					Dictamen planilla = ficha.getDictamen();
					boolean posible = true;
					String direccion = textDireccion.getText();
					Date fechaLev = dcFechaLev.getDate();
					String docLegal = (String) cbDocLegal.getSelectedItem();
					String tipoHab = (String) cbTipoHab.getSelectedItem();
					String tipoCons = (String)cbTipoCons.getSelectedItem();
					String largo = textLargoV.getText();
					String ancho = textAnchoV.getText();
					
					if(direccion.isEmpty() || fechaLev == null || docLegal.equals("") ||
							tipoHab.equals("") || tipoCons.equals("") || largo.isEmpty() ||
							ancho.isEmpty()){
						
						posible = false;
						
						if(direccion.isEmpty()){ 
							textDireccion.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						}
						if(fechaLev == null){
							dcFechaLev.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						}
						if(docLegal.equals("")){
							cbDocLegal.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						}
						if(tipoHab.equals("")){
							cbTipoHab.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						}
						if(tipoCons.equals("")){
							cbTipoCons.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						}					
						if(largo.isEmpty()){
							textLargoV.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						}					
						if(ancho.isEmpty()){
							textAnchoV.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						}
						
						JOptionPane.showMessageDialog(null, "Quedan casillas sin completar", "ERROR", 0);
					}
					else{
						try{	
							planilla.setDireccion(textDireccion.getText());
							planilla.setFechaLev(dcFechaLev.getDate());
						    planilla.setDocLegal((String) cbDocLegal.getSelectedItem());
							planilla.setTipoHabitacional((String) cbTipoHab.getSelectedItem());
							planilla.setTipoConstructiva((String)cbTipoCons.getSelectedItem());
							planilla.setDim1(Float.parseFloat(textLargoV.getText()));
							planilla.setDim2(Float.parseFloat(textAnchoV.getText()));
							posible = true;
								
						}catch (IllegalArgumentException e){
							JOptionPane.showMessageDialog(null, e.getMessage(), "ADVERTENCIA", 2);;	
							posible = false;
						};
					}
					
					if(posible){
						Pantallas.setSelectedIndex(2);
						panelVerde1.setVisible(true);
						lblDictamen.setVisible(false);
						if(!panelVerde2.isVisible())
							lblNucleoFamiliar.setVisible(true);
						if(textVulnerables.getText().isEmpty())
							textVulnerables.setText("0");
					}
				}
			});
			
			Siguiente1_Btn.setBackground(new Color(123, 176, 168));
			Siguiente1_Btn.setLayout(null);
			Siguiente1_Btn.setBounds(368, 348, 111, 35);
			Siguiente1_Btn.add(getLblSiguiente());
		}
		return Siguiente1_Btn;
	}
	private JLabel getLblSiguiente() {
		if (lblSiguiente == null) {
			lblSiguiente = new JLabel("SIGUIENTE");
			lblSiguiente.setForeground(Color.white);
			lblSiguiente.setHorizontalAlignment(SwingConstants.CENTER);
			lblSiguiente.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblSiguiente.setBounds(9, 9, 95, 20);
		}
		return lblSiguiente;
	}
	private JLabel getLblCarnDeIdentidad() {
		if (lblCarnDeIdentidad == null) {
			lblCarnDeIdentidad = new JLabel("Carn\u00E9 de Identidad:");
			lblCarnDeIdentidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblCarnDeIdentidad.setBounds(44, 60, 167, 20);
		}
		return lblCarnDeIdentidad;
	}
	private JTextField getTextCIJefe() {
		if (textCIJefe == null) {
			textCIJefe = new JTextField();
			textCIJefe.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					int cantCaracteres = textCIJefe.getText().length();
					boolean esNumero = tecla >= 48 && tecla <= 57;
					if(!esNumero || cantCaracteres >= 11)
						e.consume();
				}
				@Override
				public void keyReleased(KeyEvent e) {
					textCIJefe.setBorder(BorderFactory.createEmptyBorder());
				}
			});
			textCIJefe.setToolTipText("");
			textCIJefe.setFont(new Font("Dialog", Font.PLAIN, 16));
			textCIJefe.setColumns(10);
			textCIJefe.setBorder(null);
			textCIJefe.setBounds(216, 58, 262, 26);
		}
		return textCIJefe;
	}
	private JLabel getLblJefeDeNcleo() {
		if (lblJefeDeNcleo == null) {
			lblJefeDeNcleo = new JLabel("JEFE DE N\u00DACLEO");
			lblJefeDeNcleo.setHorizontalAlignment(SwingConstants.CENTER);
			lblJefeDeNcleo.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblJefeDeNcleo.setBounds(120, 20, 304, 20);
		}
		return lblJefeDeNcleo;
	}
	private JSeparator getSeparator_3() {
		if (separator_3 == null) {
			separator_3 = new JSeparator();
			separator_3.setForeground(Color.DARK_GRAY);
			separator_3.setBounds(15, 100, 526, 9);
		}
		return separator_3;
	}
	private JLabel getLblNoHabitantes() {
		if (lblNoHabitantes == null) {
			lblNoHabitantes = new JLabel("N\u00DAMERO DE HABITANTES");
			lblNoHabitantes.setHorizontalAlignment(SwingConstants.CENTER);
			lblNoHabitantes.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNoHabitantes.setBounds(120, 120, 304, 20);
		}
		return lblNoHabitantes;
	}
	private JLabel getLblTotalDeHabitantes() {
		if (lblTotalDeHabitantes == null) {
			lblTotalDeHabitantes = new JLabel("Total de ");
			lblTotalDeHabitantes.setHorizontalAlignment(SwingConstants.CENTER);
			lblTotalDeHabitantes.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblTotalDeHabitantes.setBounds(50, 168, 71, 20);
		}
		return lblTotalDeHabitantes;
	}
	private JLabel getLblAncianos() {
		if (lblAncianos == null) {
			lblAncianos = new JLabel("Ancianos:");
			lblAncianos.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblAncianos.setBounds(330, 218, 92, 20);
		}
		return lblAncianos;
	}
	private JLabel getLblNios() {
		if (lblNios == null) {
			lblNios = new JLabel("Ni\u00F1os:");
			lblNios.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNios.setBounds(330, 270, 61, 20);
		}
		return lblNios;
	}
	private JLabel getLblEmbarazadas() {
		if (lblEmbarazadas == null) {
			lblEmbarazadas = new JLabel("Gestantes:");
			lblEmbarazadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblEmbarazadas.setBounds(330, 168, 92, 20);
		}
		return lblEmbarazadas;
	}
	private JSpinner getSpiTotalHab() {
		if (spiTotalHab == null) {
			spiTotalHab = new JSpinner();
			spiTotalHab.setBackground(Color.WHITE);
			spiTotalHab.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					int totalVulnerables = (Integer)spiEmbarazadas.getValue() + (Integer)spiNinnos.getValue() + (Integer)spiAncianos.getValue();
					if((Integer)spiTotalHab.getValue() < totalVulnerables)
						spiTotalHab.setValue((Integer)spiTotalHab.getValue() + 1);
					if((Integer)spiTotalHab.getValue() == (Integer)spiNinnos.getValue())
						spiTotalHab.setValue((Integer)spiTotalHab.getValue() + 1);
				}
			});
			spiTotalHab.setFont(new Font("Dialog", Font.PLAIN, 16));
			spiTotalHab.setBorder(null);
			spiTotalHab.setCursor(null);
			spiTotalHab.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), new Integer(ValorPorDefecto.limiteTotalHabitantes), new Integer(1)));
			spiTotalHab.setBounds(150, 175, 47, 26);
		}
		return spiTotalHab;
	}
	private JSpinner getSpiEmbarazadas() {
		if (spiEmbarazadas == null) {
			spiEmbarazadas = new JSpinner();
			
			spiEmbarazadas.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					int totalVulnerables = (Integer)spiEmbarazadas.getValue() + (Integer)spiAncianos.getValue() + (Integer)spiNinnos.getValue();
					if((Integer)spiTotalHab.getValue() == 15 && totalVulnerables == 15){
						int cont = (Integer)spiEmbarazadas.getValue();
						spiEmbarazadas.setModel(new SpinnerNumberModel(cont, 0, cont, 1));
					}
					if(totalVulnerables > (Integer)spiTotalHab.getValue() && totalVulnerables <= 15)
						spiTotalHab.setValue(totalVulnerables);
					if(totalVulnerables > ValorPorDefecto.limiteTotalHabitantes){
						spiEmbarazadas.setValue((Integer)spiEmbarazadas.getValue() - 1);
						totalVulnerables = (Integer)spiEmbarazadas.getValue() + (Integer)spiAncianos.getValue() + (Integer)spiNinnos.getValue();
					}
					textVulnerables.setText(String.valueOf(totalVulnerables));
				}
			});
			spiEmbarazadas.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(ValorPorDefecto.limiteTotalHabitantes), new Integer(1)));		
			spiEmbarazadas.setFont(new Font("Dialog", Font.PLAIN, 16));
			spiEmbarazadas.setForeground(Color.BLACK);
			spiEmbarazadas.setBorder(null);
			spiEmbarazadas.setBackground(Color.WHITE);
			spiEmbarazadas.setBounds(428, 166, 47, 26);
		}
		return spiEmbarazadas;
	}
	private JSpinner getSpiNinnos() {
		if (spiNinnos == null) {
			spiNinnos = new JSpinner();
			spiNinnos.setBorder(null);
			spiNinnos.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					int totalVulnerables = (Integer)spiEmbarazadas.getValue() + (Integer)spiAncianos.getValue() + (Integer)spiNinnos.getValue();
					if(totalVulnerables >= (Integer)spiTotalHab.getValue() && totalVulnerables <= 15)
						spiTotalHab.setValue(totalVulnerables);
	                if((Integer)spiNinnos.getValue() >= (Integer)spiTotalHab.getValue())
	                	spiTotalHab.setValue(totalVulnerables + 1);
					if((Integer)spiTotalHab.getValue() == 15 && totalVulnerables == 15){
						int cont = (Integer)spiNinnos.getValue();
						spiNinnos.setModel(new SpinnerNumberModel(cont, 0, cont, 1));;				
					}

					if(totalVulnerables > ValorPorDefecto.limiteTotalHabitantes){
						spiNinnos.setValue((Integer)spiNinnos.getValue() - 1);
						totalVulnerables = (Integer)spiEmbarazadas.getValue() + (Integer)spiAncianos.getValue() + (Integer)spiNinnos.getValue();
					}
					textVulnerables.setText(String.valueOf(totalVulnerables));
				}
			});
			spiNinnos.setModel(new SpinnerNumberModel(0, 0, ValorPorDefecto.limiteTotalHabitantes - 1, 1));
			spiNinnos.setFont(new Font("Dialog", Font.PLAIN, 16));
			spiNinnos.setBounds(428, 268, 47, 26);
		}
		return spiNinnos;
	}
	private JSpinner getSpiAncianos() {
		if (spiAncianos == null) {
			spiAncianos = new JSpinner();
			spiAncianos.setBorder(null);
			spiAncianos.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					int cont = 0;
					int totalVulnerables = (Integer)spiEmbarazadas.getValue() + (Integer)spiAncianos.getValue() + (Integer)spiNinnos.getValue();
					textVulnerables.setText(String.valueOf(totalVulnerables));
					if(totalVulnerables > (Integer)spiTotalHab.getValue() && totalVulnerables <= 15)
						spiTotalHab.setValue(totalVulnerables);
					if((Integer)spiTotalHab.getValue() == 15 && totalVulnerables >= 15){
						cont = (Integer)spiAncianos.getValue();
						spiAncianos.setModel(new SpinnerNumberModel(cont, 0, cont, 1));				
					}

					if(totalVulnerables > ValorPorDefecto.limiteTotalHabitantes){
						spiAncianos.setValue((Integer)spiNinnos.getValue() - 1);
						totalVulnerables = (Integer)spiEmbarazadas.getValue() + (Integer)spiAncianos.getValue() + (Integer)spiNinnos.getValue();
					}
					textVulnerables.setText(String.valueOf(totalVulnerables));
				}
			});
			spiAncianos.setModel(new SpinnerNumberModel(0, 0, ValorPorDefecto.limiteTotalHabitantes, 1));
			spiAncianos.setFont(new Font("Dialog", Font.PLAIN, 16));
			spiAncianos.setBounds(428, 216, 47, 26);
		}
		return spiAncianos;
	}
	private JPanel getReiniciar2_Btn() {
		if (Reiniciar2_Btn == null) {
			Reiniciar2_Btn = new JPanel();
			Reiniciar2_Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Reiniciar2_Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Reiniciar2_Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
                    reiniciarDatos();		
				}
			});
			Reiniciar2_Btn.setLayout(null);
			Reiniciar2_Btn.setBackground(new Color(123, 176, 168));
			Reiniciar2_Btn.setBounds(80, 348, 111, 35);
			Reiniciar2_Btn.add(getLblReiniciar2());
		}
		return Reiniciar2_Btn;
	}
	private JLabel getLblReiniciar2() {
		if (lblReiniciar2 == null) {
			lblReiniciar2 = new JLabel("REINICIAR");
			lblReiniciar2.setHorizontalAlignment(SwingConstants.CENTER);
			lblReiniciar2.setForeground(Color.WHITE);
			lblReiniciar2.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblReiniciar2.setBounds(9, 9, 95, 20);
		}
		return lblReiniciar2;
	}
	private JPanel getAnterior2_Btn() {
		if (Anterior2_Btn == null) {
			Anterior2_Btn = new JPanel();
			Anterior2_Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Anterior2_Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Anterior2_Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {			
	                Pantallas.setSelectedIndex(1);		
				}
			});
			Anterior2_Btn.setLayout(null);
			Anterior2_Btn.setBorder(null);
			Anterior2_Btn.setBackground(new Color(123, 176, 168));
			Anterior2_Btn.setBounds(224, 348, 111, 35);
			Anterior2_Btn.add(getLblAnterior2());
		}
		return Anterior2_Btn;
	}
	private JLabel getLblAnterior2() {
		if (lblAnterior2 == null) {
			lblAnterior2 = new JLabel("ANTERIOR");
			lblAnterior2.setHorizontalAlignment(SwingConstants.CENTER);
			lblAnterior2.setForeground(Color.WHITE);
			lblAnterior2.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblAnterior2.setBounds(9, 9, 95, 20);
		}
		return lblAnterior2;
	}
	private JPanel getSiguiente2_Btn() {
		if (Siguiente2_Btn == null) {
			Siguiente2_Btn = new JPanel();
			Siguiente2_Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Siguiente2_Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Siguiente2_Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
					NucleoFamiliar nucleo = ficha.getNucleo();
					boolean posible = true;
					String ciJefe = textCIJefe.getText();
					int totalHab = (Integer)spiTotalHab.getValue();
					int ancianos = (Integer)spiAncianos.getValue();
					int embarazadas = (Integer)spiEmbarazadas.getValue();
					int ninnos = (Integer)spiNinnos.getValue();
					
					if(ciJefe.isEmpty()){
						posible = false;
						textCIJefe.setBorder(BorderFactory.createLineBorder(Color.red, 1));
						JOptionPane.showMessageDialog(null, "<html>Inserte el número del carné de <br>identidad del jefe de núcleo", "ERROR", 0);
					}
					else{
						try{	
							nucleo.setCIJefe(ciJefe);
							nucleo.setTotalPersonas(totalHab);
							nucleo.setNucleoFam(ancianos, ninnos, embarazadas);
							posible = true;
								
						}catch (IllegalArgumentException e){
							JOptionPane.showMessageDialog(null, e.getMessage(), "ADVERTENCIA", 2);;	
							posible = false;
						};
					}
					
					if(posible){
						Pantallas.setSelectedIndex(3);
						lblNucleoFamiliar.setVisible(false);
						panelVerde2.setVisible(true);
						lblAfectaciones.setVisible(true);			
					}
				}
			});
			
			Siguiente2_Btn.setLayout(null);
			Siguiente2_Btn.setBackground(new Color(123, 176, 168));
			Siguiente2_Btn.setBounds(368, 348, 111, 35);
			Siguiente2_Btn.add(getLblSiguiente2());
		}
		return Siguiente2_Btn;
	}
	private JLabel getLblSiguiente2() {
		if (lblSiguiente2 == null) {
			lblSiguiente2 = new JLabel("SIGUIENTE");
			lblSiguiente2.setHorizontalAlignment(SwingConstants.CENTER);
			lblSiguiente2.setForeground(Color.WHITE);
			lblSiguiente2.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblSiguiente2.setBounds(9, 9, 95, 20);
		}
		return lblSiguiente2;
	}
	private JLabel getLabel_1_1() {
		if (lblHabitantes == null) {
			lblHabitantes = new JLabel("habitantes:\r\n");
			lblHabitantes.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblHabitantes.setBounds(44, 192, 92, 20);
		}
		return lblHabitantes;
	}
	private JLabel getLabel_1_2() {
		if (lblPersonas == null) {
			lblPersonas = new JLabel("Personas");
			lblPersonas.setHorizontalAlignment(SwingConstants.CENTER);
			lblPersonas.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblPersonas.setBounds(47, 249, 82, 20);
		}
		return lblPersonas;
	}
	private JLabel getLabel_1_3() {
		if (lblVulnerables == null) {
			lblVulnerables = new JLabel("vulnerables:");
			lblVulnerables.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblVulnerables.setBounds(44, 271, 101, 20);
		}
		return lblVulnerables;
	}
	private JTextField getTextVulnerables() {
		if (textVulnerables == null) {
			textVulnerables = new JTextField();
			textVulnerables.setFont(new Font("Dialog", Font.PLAIN, 16));
			textVulnerables.setBorder(null);
			textVulnerables.setHorizontalAlignment(SwingConstants.CENTER);
			textVulnerables.setEditable(false);
			textVulnerables.setBounds(150, 256, 47, 26);
			textVulnerables.setBackground(new Color(234, 254, 250));
			textVulnerables.setColumns(10);
		}
		return textVulnerables;
	}
	private JPanel getAyudaDireccion() {
		if (AyudaDireccion == null) {
			AyudaDireccion = new JPanel();
			AyudaDireccion.setToolTipText("<html>La direcci\u00F3n de la vivienda debe "
					+ "<br>tener menos de " + ValorPorDefecto.limiteDireccion + " caracteres. "
					+ "<br><br>(Configurable en Ajustes/ L\u00EDmites/ "
					+ "<br>L\u00EDmite de caracteres/ Direcci\u00F3n)");
			AyudaDireccion.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaDireccion.setBackground(new Color(123, 176, 168));
			AyudaDireccion.setBounds(494, 34, 26, 26);
			AyudaDireccion.setLayout(null);
			AyudaDireccion.add(getLblAyudaDireccion());
		}
		return AyudaDireccion;
	}
	private JLabel getLblAyudaDireccion() {
		if (lblAyudaDireccion == null) {
			lblAyudaDireccion = new JLabel("?");
			lblAyudaDireccion.setForeground(new Color(255, 255, 255));
			lblAyudaDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaDireccion.setBackground(new Color(255, 255, 255));
			lblAyudaDireccion.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaDireccion.setBounds(0, 3, 26, 20);
		}
		return lblAyudaDireccion;
	}
	private JPanel getAyudaFechaLev() {
		if (AyudaFechaLev == null) {
			AyudaFechaLev = new JPanel();
			AyudaFechaLev.setToolTipText(
					"<html>Fecha en que se tomaron los da- "
					+ "<br>tos del dictamen de la vivienda. No "
					+ "<br>puede introducirse un levantamien- "
					+ "<br>to de hace m\u00E1s de 10 a\u00F1os.");
			AyudaFechaLev.setLayout(null);
			AyudaFechaLev.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaFechaLev.setBackground(new Color(123, 176, 168));
			AyudaFechaLev.setBounds(494, 68, 26, 26);
			AyudaFechaLev.add(getLblAyudaFechaLev());
		}
		return AyudaFechaLev;
	}
	private JLabel getLblAyudaFechaLev() {
		if (lblAyudaFechaLev == null) {
			lblAyudaFechaLev = new JLabel("?");
			lblAyudaFechaLev.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaFechaLev.setForeground(Color.WHITE);
			lblAyudaFechaLev.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaFechaLev.setBackground(Color.WHITE);
			lblAyudaFechaLev.setBounds(0, 3, 26, 20);
		}
		return lblAyudaFechaLev;
	}
	private JPanel getPanel_1() {
		if (AyudaDocLegal == null) {
			AyudaDocLegal = new JPanel();
			AyudaDocLegal.setLayout(null);
			AyudaDocLegal.setToolTipText(
					"<html>Constituye el documento que evidencia la "
					+ "<br>titularidad del derecho que presenta el ha-"
					+ "<br>bitante capital de la vivienda sobre esta.");
			AyudaDocLegal.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaDocLegal.setBackground(new Color(123, 176, 168));
			AyudaDocLegal.setBounds(494, 114, 26, 26);
			AyudaDocLegal.add(getLabel_1_4());
		}
		return AyudaDocLegal;
	}
	private JLabel getLabel_1_4() {
		if (lblAyudaDocLegal == null) {
			lblAyudaDocLegal = new JLabel("?");
			lblAyudaDocLegal.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaDocLegal.setForeground(Color.WHITE);
			lblAyudaDocLegal.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaDocLegal.setBackground(Color.WHITE);
			lblAyudaDocLegal.setBounds(0, 3, 26, 20);
		}
		return lblAyudaDocLegal;
	}
	private JPanel getPanel_1_1() {
		if (AyudaTipoHab == null) {
			AyudaTipoHab = new JPanel();
			AyudaTipoHab.setLayout(null);
			AyudaTipoHab.setToolTipText("<html>Se refiere al tipo de vivienda de <br>acuerdo a estructura y funcionalidad.");
			AyudaTipoHab.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaTipoHab.setBackground(new Color(123, 176, 168));
			AyudaTipoHab.setBounds(494, 148, 26, 26);
			AyudaTipoHab.add(getLblAyudaTipoHab());
		}
		return AyudaTipoHab;
	}
	private JLabel getLblAyudaTipoHab() {
		if (lblAyudaTipoHab == null) {
			lblAyudaTipoHab = new JLabel("?");
			lblAyudaTipoHab.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaTipoHab.setForeground(Color.WHITE);
			lblAyudaTipoHab.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaTipoHab.setBackground(Color.WHITE);
			lblAyudaTipoHab.setBounds(0, 3, 26, 20);
		}
		return lblAyudaTipoHab;
	}
	private JPanel getAyudaTipoCons() {
		if (AyudaTipoCons == null) {
			AyudaTipoCons = new JPanel();
			AyudaTipoCons.setLayout(null);
			AyudaTipoCons.setToolTipText("<html>Se refiere al tipo de construcci\u00F3n de <br>acuerdo a su material predominante\r\n");
			AyudaTipoCons.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaTipoCons.setBackground(new Color(123, 176, 168));
			AyudaTipoCons.setBounds(494, 184, 26, 26);
			AyudaTipoCons.add(getLblAyudaTipoCons());
		}
		return AyudaTipoCons;
	}
	private JLabel getLblAyudaTipoCons() {
		if (lblAyudaTipoCons == null) {
			lblAyudaTipoCons = new JLabel("?");
			lblAyudaTipoCons.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaTipoCons.setForeground(Color.WHITE);
			lblAyudaTipoCons.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaTipoCons.setBackground(Color.WHITE);
			lblAyudaTipoCons.setBounds(0, 3, 26, 20);
		}
		return lblAyudaTipoCons;
	}
	private JPanel getAyudaDimV() {
		if (AyudaDimV == null) {
			AyudaDimV = new JPanel();
			AyudaDimV.setLayout(null);
			AyudaDimV.setToolTipText(
					"<html>Las dimensiones deben hallarse "
					+ "<br>en el rango de " + ValorPorDefecto.limiteMinDimCasa+ "m a " 
					+ ValorPorDefecto.limiteMaxDimCasa+ "m.<br>"
							+ "<br>(Configurable en Ajustes/ Límites / <br>Valores / Dimensiones)");
			AyudaDimV.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaDimV.setBackground(new Color(123, 176, 168));
			AyudaDimV.setBounds(494, 254, 26, 26);
			AyudaDimV.add(getLblAyudaDimV());
		}
		return AyudaDimV;
	}
	private JLabel getLblAyudaDimV() {
		if (lblAyudaDimV == null) {
			lblAyudaDimV = new JLabel("?");
			lblAyudaDimV.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaDimV.setForeground(Color.WHITE);
			lblAyudaDimV.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaDimV.setBackground(Color.WHITE);
			lblAyudaDimV.setBounds(0, 3, 26, 20);
		}
		return lblAyudaDimV;
	}
	private JPanel getPanelVerde1() {
		if (panelVerde1 == null) {
			panelVerde1 = new JPanel();
			panelVerde1.setBackground(new Color(0, 250, 154));
			panelVerde1.setBounds(7, 0, 125, 29);
		}
		panelVerde1.setVisible(false);
		return panelVerde1;
	}
	private JLabel getLblNucleoFamiliar() {
		if (lblNucleoFamiliar == null) {
			lblNucleoFamiliar = new JLabel("N\u00FAcleo Familiar");
			lblNucleoFamiliar.setBounds(140, 5, 109, 20);
			lblNucleoFamiliar.setFont(new Font("Dialog",Font.PLAIN,16));
		}
		lblNucleoFamiliar.setVisible(false);
		return lblNucleoFamiliar;
	}
	private JPanel getRellenarBtn() {
		if (RellenarBtn == null) {
			RellenarBtn = new JPanel();
			RellenarBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					textDireccion.setText("Calle G #23 altos e/ 3ra y 4ta Reparto Naranjo, Guanabacoa");
					textLargoV.setText(String.valueOf(10));
					textAnchoV.setText(String.valueOf(10));
					textAreaV.setText(String.valueOf(100));
					cbDocLegal.setSelectedIndex(1);
					cbTipoCons.setSelectedIndex(1);
					cbTipoHab.setSelectedIndex(1);
					SimpleDateFormat formatoFecha = new SimpleDateFormat("  dd  /  MM  /  yyyy  ");
	                ((JTextField)dcFechaLev.getDateEditor()).setText(formatoFecha.format(new Date()));
	                ckbFacilidad.setSelected(false);
	                
	                textDireccion.setBorder(null);
	                textLargoV.setBorder(null);
					textAnchoV.setBorder(null);
					textAreaV.setBorder(null);
					dcFechaLev.setBorder(null);
	                
				}
			});
			RellenarBtn.setLayout(null);
			RellenarBtn.setToolTipText("<html>Autorrellenar las casillas del <br>Formulario del Dictamen <br>(para poder hacer pruebas <br>r\u00E1pidas)");
			RellenarBtn.setBorder(null);
			RellenarBtn.setBackground(new Color(214, 234, 230));
			RellenarBtn.setBounds(500, 348, 35, 35);
			RellenarBtn.add(getLabel_1());
		}
		return RellenarBtn;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("+");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setForeground(Color.WHITE);
			label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
			label_1.setBackground(Color.WHITE);
			label_1.setBounds(4, 6, 26, 20);
		}
		return label_1;
	}
	private JPanel getPanelVerde2() {
		if (panelVerde2 == null) {
			panelVerde2 = new JPanel();
			panelVerde2.setBackground(new Color(0, 250, 154));
			panelVerde2.setBounds(137, 0, 125, 29);
		}
		panelVerde2.setVisible(false);
		return panelVerde2;
	}
	private JLabel getLblAfectaciones() {
		if (lblAfectaciones == null) {
			lblAfectaciones = new JLabel("Afectaciones");
			lblAfectaciones.setFont(new Font("Dialog", Font.PLAIN, 16));
			lblAfectaciones.setBounds(270, 5, 109, 20);
		}
		lblAfectaciones.setVisible(false);
		return lblAfectaciones;
	}
	private JPanel getPanelVerde3() {
		if (PanelVerde3 == null) {
			PanelVerde3 = new JPanel();
			PanelVerde3.setBackground(new Color(0, 250, 154));
			PanelVerde3.setBounds(267, 0, 125, 29);
		}
		PanelVerde3.setVisible(false);
		return PanelVerde3;
	}
	private JLabel getLblElementosAfectados() {
		if (lblElementosAfectados == null) {
			lblElementosAfectados = new JLabel("Elementos afectados");
			lblElementosAfectados.setFont(new Font("Dialog", Font.PLAIN, 16));
			lblElementosAfectados.setBounds(400, 5, 147, 20);
		}
		lblElementosAfectados.setVisible(false);
		return lblElementosAfectados;
	}
	private JPanel getPanel_1_2() {
		if (PanelVerde4 == null) {
			PanelVerde4 = new JPanel();
			PanelVerde4.setBackground(new Color(0, 250, 154));
			PanelVerde4.setBounds(397, 0, 178, 29);
		}
		PanelVerde4.setVisible(false);
		
		return PanelVerde4;
	}
	private JPanel getReiniciar3Btn() {
		if (Reiniciar3Btn == null) {
			Reiniciar3Btn = new JPanel();
			Reiniciar3Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Reiniciar3Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Reiniciar3Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
                    reiniciarDatos();		
				}
			});
			Reiniciar3Btn.setLayout(null);
			Reiniciar3Btn.setBackground(new Color(123, 176, 168));
			Reiniciar3Btn.setBounds(80, 348, 111, 35);
			Reiniciar3Btn.add(getLblReiniciar3());
		}
		return Reiniciar3Btn;
	}
	private JLabel getLblReiniciar3() {
		if (lblReiniciar3 == null) {
			lblReiniciar3 = new JLabel("REINICIAR");
			lblReiniciar3.setHorizontalAlignment(SwingConstants.CENTER);
			lblReiniciar3.setForeground(Color.WHITE);
			lblReiniciar3.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblReiniciar3.setBounds(9, 9, 95, 20);
		}
		return lblReiniciar3;
	}
	private JPanel getPanel_1_3() {
		if (Anterior3Btn == null) {
			Anterior3Btn = new JPanel();
			Anterior3Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Anterior3Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Anterior3Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {			
	                Pantallas.setSelectedIndex(2);		
				}
			});
			Anterior3Btn.setLayout(null);
			Anterior3Btn.setBorder(null);
			Anterior3Btn.setBackground(new Color(123, 176, 168));
			Anterior3Btn.setBounds(224, 348, 111, 35);
			Anterior3Btn.add(getLblAnterior3());
		}
		return Anterior3Btn;
	}
	private JLabel getLblAnterior3() {
		if (lblAnterior3 == null) {
			lblAnterior3 = new JLabel("ANTERIOR");
			lblAnterior3.setHorizontalAlignment(SwingConstants.CENTER);
			lblAnterior3.setForeground(Color.WHITE);
			lblAnterior3.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblAnterior3.setBounds(9, 9, 95, 20);
		}
		return lblAnterior3;
	}
	private JPanel getSiguiente3Btn() {
		if (Siguiente3Btn == null) {
			Siguiente3Btn = new JPanel();
			Siguiente3Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Siguiente3Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Siguiente3Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
					ArrayList<Afectacion> listaAfectViv = ficha.getAfectacionesVivienda();
					boolean posible = true;
					
					if(!ckbAfectPared.isSelected() && !ckbAfectTecho.isSelected()){
						posible = false;
						JOptionPane.showMessageDialog(null, "Debe existir al menos una afectación", "ERROR", 0);
					}
					else{
						if(ckbAfectPared.isSelected()){
							if(!afectacionesPared.isEmpty()){
								for(AfectPared a: afectacionesPared){
									listaAfectViv.add(a);
								}
							}
							else{
								posible = false;
								JOptionPane.showMessageDialog(null, "<html>De existir una afectación de pared"
										+ "<br>esta debería aparecer en la lista", 
										"ERROR", 0);
							}
						}
						if(ckbAfectTecho.isSelected()){
							if(cbMaterialTecho.getSelectedItem().equals("") || textLargoTecho.getText().isEmpty() ||
									textAnchoTecho.getText().isEmpty()){
								posible = false;	
								if(cbMaterialTecho.getSelectedItem().equals(""))
									cbMaterialTecho.setBorder(BorderFactory.createLineBorder(Color.red, 1));
								if(textLargoTecho.getText().isEmpty())
									textLargoTecho.setBorder(BorderFactory.createLineBorder(Color.red, 1));
								if(textAnchoTecho.getText().isEmpty())
									textAnchoTecho.setBorder(BorderFactory.createLineBorder(Color.red, 1));	
								
								JOptionPane.showMessageDialog(null, "Quedan casillas sin completar","ERROR", 0);
							}
							else{
								try{	
									boolean afectTotal = rbTotalTecho.isSelected();
									float largo = Float.parseFloat(textLargoTecho.getText());
									float ancho = Float.parseFloat(textAnchoTecho.getText());
									Material material = admin.definirMaterialNec((String) cbMaterialTecho.getSelectedItem());
								    AfectTecho afectTecho = new AfectTecho(afectTotal, largo, ancho, material);
								    listaAfectViv.add(afectTecho);
									posible = true;
									
								}catch (IllegalArgumentException e){
									JOptionPane.showMessageDialog(null, e.getMessage(), "ADVERTENCIA", 2);;	
									posible = false;
								};
							}
						}
					}
					
					if(posible){
						textMostrarID.setText(ficha.getDictamen().getID());
						Pantallas.setSelectedIndex(4);
						lblAfectaciones.setVisible(false);
						PanelVerde3.setVisible(true);
						lblElementosAfectados.setVisible(true);			
					}
				}
			});
			Siguiente3Btn.setLayout(null);
			Siguiente3Btn.setBackground(new Color(123, 176, 168));
			Siguiente3Btn.setBounds(368, 348, 111, 35);
			Siguiente3Btn.add(getLblSiguiente3());
		}
		return Siguiente3Btn;
	}
	private JLabel getLblSiguiente3() {
		if (lblSiguiente3 == null) {
			lblSiguiente3 = new JLabel("SIGUIENTE");
			lblSiguiente3.setHorizontalAlignment(SwingConstants.CENTER);
			lblSiguiente3.setForeground(Color.WHITE);
			lblSiguiente3.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblSiguiente3.setBounds(9, 9, 95, 20);
		}
		return lblSiguiente3;
	}
	private JPanel getRellenar2Btn() {
		if (Rellenar2Btn == null) {
			Rellenar2Btn = new JPanel();
			Rellenar2Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					textCIJefe.setText("02090767527");
					spiTotalHab.setValue(2);
					spiAncianos.setValue(0);
					spiNinnos.setValue(0);
					spiEmbarazadas.setValue(0);
					textVulnerables.setText("0");                
				}
			});
			Rellenar2Btn.setLayout(null);
			Rellenar2Btn.setToolTipText("<html>Autorrellenar las casillas del <br>Formulario del Dictamen <br>(para poder hacer pruebas <br>r\u00E1pidas)");
			Rellenar2Btn.setBorder(null);
			Rellenar2Btn.setBackground(new Color(214, 234, 230));
			Rellenar2Btn.setBounds(500, 348, 35, 35);
			Rellenar2Btn.add(getLabel_2());
		}
		return Rellenar2Btn;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("+");
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Tahoma", Font.BOLD, 25));
			label_2.setBackground(Color.WHITE);
			label_2.setBounds(4, 6, 26, 20);
		}
		return label_2;
	}
	private JLabel getLblAfectacionesDePared() {
		if (lblAfectacionesDePared == null) {
			lblAfectacionesDePared = new JLabel("Afectaciones de Pared");
			lblAfectacionesDePared.setHorizontalAlignment(SwingConstants.CENTER);
			lblAfectacionesDePared.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblAfectacionesDePared.setBounds(165, 8, 217, 20);
		}
		return lblAfectacionesDePared;
	}
	private JLabel getLblAfectacinDeTecho() {
		if (lblAfectacinDeTecho == null) {
			lblAfectacinDeTecho = new JLabel("Afectaci\u00F3n de Techo");
			lblAfectacinDeTecho.setHorizontalAlignment(SwingConstants.CENTER);
			lblAfectacinDeTecho.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblAfectacinDeTecho.setBounds(163, 225, 219, 20);
		}
		return lblAfectacinDeTecho;
	}
	private JSeparator getSeparator_4() {
		if (separator_4 == null) {
			separator_4 = new JSeparator();
			separator_4.setForeground(Color.DARK_GRAY);
			separator_4.setBounds(15, 216, 526, 9);
		}
		return separator_4;
	}
	private JTable getTablaAfectPared() {
		if (tablaAfectPared == null) {
			tablaAfectPared = new JTable(){
				private static final long serialVersionUID = 1L;
				public boolean isCellEditable(int rowIndex, int colIndex){
					return false;
				}
		};
			modeloAfectPared = new DefaultTableModel();
			Object[] columna = {"Deterioro","Material","Área","Carga"};
			modeloAfectPared.setColumnIdentifiers(columna);
			tablaAfectPared.setModel(modeloAfectPared);
		}
		return tablaAfectPared;
	}
	private JSeparator getSeparator_5() {
		if (separator_5 == null) {
			separator_5 = new JSeparator();
			separator_5.setOrientation(SwingConstants.VERTICAL);
			separator_5.setForeground(Color.DARK_GRAY);
			separator_5.setBounds(232, 41, 9, 153);
		}
		return separator_5;
	}
	private JRadioButton getRbTotalPared() {
		if (rbTotalPared == null) {
			rbTotalPared = new JRadioButton("Total");
			rbTotalPared.setEnabled(false);
			rbTotalPared.setFont(new Font("Tahoma", Font.PLAIN, 18));
			rbTotalPared.setBackground(new Color(214, 234, 230));
			rbTotalPared.setBounds(44, 38, 81, 29);
		}
		return rbTotalPared;
	}
	private JRadioButton getRbParcialPared() {
		if (rbParcialPared == null) {
			rbParcialPared = new JRadioButton("Parcial");
			rbParcialPared.setEnabled(false);
			rbParcialPared.setFont(new Font("Tahoma", Font.PLAIN, 18));
			rbParcialPared.setBackground(new Color(214, 234, 230));
			rbParcialPared.setBounds(132, 38, 96, 29);
		}
		return rbParcialPared;
	}
	private JLabel getLblMaterialPared() {
		if (lblMaterialPared == null) {
			lblMaterialPared = new JLabel("Material:");
			lblMaterialPared.setForeground(Color.GRAY);
			lblMaterialPared.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblMaterialPared.setBounds(44, 75, 71, 20);
		}
		return lblMaterialPared;
	}
	private JComboBox<String> getCbMaterialPared() {
		if (cbMaterialPared == null) {
			cbMaterialPared = new JComboBox<String>();
			cbMaterialPared.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbMaterialPared.setBorder(null);
				}
			});
			cbMaterialPared.setEnabled(false);
			cbMaterialPared.setFont(new Font("Dialog", Font.PLAIN, 16));
			cbMaterialPared.setModel(new DefaultComboBoxModel<String>(Utiles.getListaconBlanco(ValorPorDefecto.getListaMaterialPared())));
			cbMaterialPared.setBounds(120, 73, 96, 26);
		}
		return cbMaterialPared;
	}
	private JLabel getLblLargoPared() {
		if (lblLargoPared == null) {
			lblLargoPared = new JLabel("Largo(m):");
			lblLargoPared.setForeground(Color.GRAY);
			lblLargoPared.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblLargoPared.setBounds(44, 111, 86, 20);
		}
		return lblLargoPared;
	}
	private JLabel getLblAnchoPared() {
		if (lblAnchoPared == null) {
			lblAnchoPared = new JLabel("Ancho(m):");
			lblAnchoPared.setForeground(Color.GRAY);
			lblAnchoPared.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblAnchoPared.setBounds(44, 148, 86, 20);
		}
		return lblAnchoPared;
	}
	private JTextField getTextLargoPared() {
		if (textLargoPared == null) {
			textLargoPared = new JTextField();
			textLargoPared.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					boolean esNumero = tecla >= 48 && tecla <= 57 || tecla == 46;
					if(!esNumero || textLargoPared.getText().length() > 2)
						e.consume();
					else
						textLargoPared.setBorder(BorderFactory.createEmptyBorder());
				}
			});
			textLargoPared.setFont(new Font("Dialog", Font.PLAIN, 16));
			textLargoPared.setEnabled(false);
			textLargoPared.setBounds(134, 109, 83, 26);
			textLargoPared.setColumns(10);
		}
		return textLargoPared;
	}
	private JTextField getTextAnchoPared() {
		if (textAnchoPared == null) {
			textAnchoPared = new JTextField();
			textAnchoPared.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					boolean esNumero = tecla >= 48 && tecla <= 57 || tecla == 46;
					if(!esNumero || textAnchoPared.getText().length() > 2)
						e.consume();
					else
						textAnchoPared.setBorder(BorderFactory.createEmptyBorder());
				}
			});
			textAnchoPared.setFont(new Font("Dialog", Font.PLAIN, 16));
			textAnchoPared.setEnabled(false);
			textAnchoPared.setColumns(10);
			textAnchoPared.setBounds(134, 146, 83, 26);
		}
		return textAnchoPared;
	}
	private JCheckBox getCkbParedCarga() {
		if (ckbParedCarga == null) {
			ckbParedCarga = new JCheckBox(" Pared de carga");
			ckbParedCarga.setEnabled(false);
			ckbParedCarga.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ckbParedCarga.setBorder(BorderFactory.createEmptyBorder());
			ckbParedCarga.setBackground(new Color(214, 234, 230));
			ckbParedCarga.setBounds(56, 180, 155, 29);
		}
		return ckbParedCarga;
	}
	private JRadioButton getRbTotalTecho() {
		if (rbTotalTecho == null) {
			rbTotalTecho = new JRadioButton("Total");
			rbTotalTecho.setEnabled(false);
			rbTotalTecho.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbTotalTecho.isSelected()){
						textLargoTecho.setEditable(false);
						textAnchoTecho.setEditable(false);
						textLargoTecho.setText(String.valueOf(ficha.getDictamen().getDim1()));
						textAnchoTecho.setText(String.valueOf(ficha.getDictamen().getDim2()));
						textLargoTecho.setBorder(null);
						textAnchoTecho.setBorder(null);
					}
				}
			});
			rbTotalTecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			rbTotalTecho.setBackground(new Color(214, 234, 230));
			rbTotalTecho.setBounds(44, 294, 81, 29);
		}
		return rbTotalTecho;
	}
	private JRadioButton getRbParcialTecho() {
		if (rbParcialTecho == null) {
			rbParcialTecho = new JRadioButton("Parcial");
			rbParcialTecho.setEnabled(false);
			rbParcialTecho.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbParcialTecho.isSelected()){
						textLargoTecho.setEditable(true);
						textAnchoTecho.setEditable(true);
						textLargoTecho.setText("");
						textAnchoTecho.setText("");
					}
				}
			});
			rbParcialTecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			rbParcialTecho.setBackground(new Color(214, 234, 230));
			rbParcialTecho.setBounds(44, 257, 96, 29);
		}
		return rbParcialTecho;
	}
	private JLabel getLblMaterialTecho() {
		if (lblMaterialTecho == null) {
			lblMaterialTecho = new JLabel("Material predominante:");
			lblMaterialTecho.setForeground(Color.GRAY);
			lblMaterialTecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblMaterialTecho.setBounds(180, 298, 188, 20);
		}
		return lblMaterialTecho;
	}
	private JComboBox<String> getCbMaterialTecho() {
		if (cbMaterialTecho == null) {
			cbMaterialTecho = new JComboBox<String>();
			cbMaterialTecho.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbMaterialTecho.setBorder(null);
				}
			});
			cbMaterialTecho.setEnabled(false);
			cbMaterialTecho.setModel(new DefaultComboBoxModel<String>(Utiles.getListaconBlanco(ValorPorDefecto.getListaMaterialTecho())));
			cbMaterialTecho.setFont(new Font("Dialog", Font.PLAIN, 16));
			cbMaterialTecho.setBounds(373, 295, 117, 26);
		}
		return cbMaterialTecho;
	}
	private JLabel getLblLargoTecho() {
		if (lblLargoTecho == null) {
			lblLargoTecho = new JLabel("Largo(m):");
			lblLargoTecho.setForeground(Color.GRAY);
			lblLargoTecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblLargoTecho.setBounds(179, 262, 86, 20);
		}
		return lblLargoTecho;
	}
	private JTextField getTextLargoTecho() {
		if (textLargoTecho == null) {
			textLargoTecho = new JTextField();
			textLargoTecho.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					boolean esNumero = tecla >= 48 && tecla <= 57 || tecla == 46;
					if(!esNumero || textAnchoV.getText().length() > 2)
						e.consume();
					else
						textLargoTecho.setBorder(null);
				}
			});
			textLargoTecho.setFont(new Font("Dialog", Font.PLAIN, 16));
			textLargoTecho.setEnabled(false);
			textLargoTecho.setColumns(10);
			textLargoTecho.setBounds(270, 260, 42, 26);
		}
		return textLargoTecho;
	}
	private JLabel getLabel_3_1() {
		if (lblAnchoTecho == null) {
			lblAnchoTecho = new JLabel("Ancho(m):");
			lblAnchoTecho.setForeground(Color.GRAY);
			lblAnchoTecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblAnchoTecho.setBounds(352, 262, 86, 20);
		}
		return lblAnchoTecho;
	}
	private JTextField getTextAnchoTecho() {
		if (textAnchoTecho == null) {
			textAnchoTecho = new JTextField();
			textAnchoTecho.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					boolean esNumero = tecla >= 48 && tecla <= 57 || tecla == 46;
					if(!esNumero || textAnchoV.getText().length() > 2)
						e.consume();
					else
						textAnchoTecho.setBorder(null);
				}
			});
			textAnchoTecho.setFont(new Font("Dialog", Font.PLAIN, 16));
			textAnchoTecho.setEnabled(false);
			textAnchoTecho.setColumns(10);
			textAnchoTecho.setBounds(448, 260, 42, 26);
		}
		return textAnchoTecho;
	}
	private JLabel getLblV_1() {
		if (lblV_1 == null) {
			lblV_1 = new JLabel("v1.0.0.20230124");
			lblV_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblV_1.setFont(new Font("Dialog", Font.PLAIN, 16));
			lblV_1.setForeground(SystemColor.scrollbar);
			lblV_1.setBackground(Color.LIGHT_GRAY);
			lblV_1.setBounds(10, 400, 141, 20);
		}
		return lblV_1;
	}
	private JScrollPane getSpTablaAfectPared() {
		if (spTablaAfectPared == null) {
			spTablaAfectPared = new JScrollPane();
			spTablaAfectPared.setViewportBorder(null);
			spTablaAfectPared.setEnabled(false);
			spTablaAfectPared.setBounds(297, 40, 229, 160);
			spTablaAfectPared.setViewportView(getTablaAfectPared());
		}
		return spTablaAfectPared;
	}
	private JPanel getAgregarParedBtn() {
		if (AgregarParedBtn == null) {
			AgregarParedBtn = new JPanel();
			AgregarParedBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					boolean posible = false;
					
					if(ckbAfectPared.isSelected()){
						if(tablaAfectPared.getRowCount() <= ValorPorDefecto.limiteCantParedes){
							if(cbMaterialPared.getSelectedItem().equals("") || textLargoPared.getText().isEmpty() ||
									textAnchoPared.getText().isEmpty()){
								posible = false;
								if(cbMaterialPared.getSelectedItem().equals(""))
									cbMaterialPared.setBorder(BorderFactory.createLineBorder(Color.red, 1));
								if(textLargoPared.getText().isEmpty())
									textLargoPared.setBorder(BorderFactory.createLineBorder(Color.red, 1));
								if(textAnchoPared.getText().isEmpty())
									textAnchoPared.setBorder(BorderFactory.createLineBorder(Color.red, 1));		
								
								JOptionPane.showMessageDialog(null, "Quedan casillas sin completar","ERROR", 0);
							}
							else{
								AfectPared afectPared = null;
								try{
									boolean afectTotal = rbTotalPared.isSelected();
									float largo = Float.parseFloat(textLargoPared.getText());
									float ancho = Float.parseFloat(textAnchoPared.getText());
									boolean carga = ckbParedCarga.isSelected();
									Material material = admin.definirMaterialNec((String) cbMaterialPared.getSelectedItem());
								    afectPared = new AfectPared(afectTotal, largo, ancho, material, carga);
								    afectacionesPared.add(afectPared);
									posible = true;
									
								}catch (IllegalArgumentException a){
									JOptionPane.showMessageDialog(null, a.getMessage(), "ADVERTENCIA", 2);;	
									posible = false;
								};
								if(posible){
									cbMaterialPared.setSelectedIndex(0);
									textLargoPared.setText(null);
									textAnchoPared.setText(null);
									ckbParedCarga.setSelected(false);
									rbTotalPared.setSelected(true);
									
									String deterioroSigla = "  Parcial";
									String cargaSigla = "";
									if(afectPared.getAfectTotal())
										deterioroSigla = "  Total";
									if(afectPared.getCarga())
										cargaSigla = "       S";
									
									
									filaAfectPared[0] = deterioroSigla;
									filaAfectPared[1] = afectPared.getMaterial().getNombre();
									filaAfectPared[2] = afectPared.Area();
									filaAfectPared[3] = cargaSigla;
									
									modeloAfectPared.addRow(filaAfectPared);
								}
							}
						}
						else
							throw new IllegalArgumentException("<html>No pueden haber más de " + ValorPorDefecto.limiteCantParedes + "<br>afectaciones de pared.");
				    }	
				}
			});
			AgregarParedBtn.setLayout(null);
			AgregarParedBtn.setToolTipText("<html>Agregar los datos <br>de una afectación de <br>pared a la ficha");
			AgregarParedBtn.setBorder(new LineBorder(new Color(255, 255, 255)));
			AgregarParedBtn.setBackground(Color.LIGHT_GRAY);
			AgregarParedBtn.setBounds(247, 74, 35, 81);
			AgregarParedBtn.add(getLblAgregarPared());
		}
		return AgregarParedBtn;
	}
	private JLabel getLblAgregarPared() {
		if (lblAgregarPared == null) {
			lblAgregarPared = new JLabel("+");
			lblAgregarPared.setHorizontalAlignment(SwingConstants.CENTER);
			lblAgregarPared.setForeground(Color.WHITE);
			lblAgregarPared.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblAgregarPared.setBackground(Color.WHITE);
			lblAgregarPared.setBounds(4, 6, 26, 65);
		}
		return lblAgregarPared;
	}
	private JCheckBox getCkbAfectPared() {
		if (ckbAfectPared == null) {
			ckbAfectPared = new JCheckBox("");
			ckbAfectPared.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean seleccion = ckbAfectPared.isSelected();
					if(seleccion){
						rbParcialPared.setEnabled(true);
						rbTotalPared.setEnabled(true);
						rbTotalPared.setSelected(true);
						cbMaterialPared.setEnabled(true);
						textAnchoPared.setEnabled(true);
						textLargoPared.setEnabled(true);
						tablaAfectPared.setEnabled(true);
						AgregarParedBtn.setEnabled(true);
						ckbParedCarga.setEnabled(true);
						
						lblMaterialPared.setForeground(Color.black);
						lblLargoPared.setForeground(Color.black);
						lblAnchoPared.setForeground(Color.black);
						AgregarParedBtn.setBackground(new Color(123, 176, 168));
						
						afectacionesPared = new ArrayList<AfectPared>();
					}
					else{
						vaciarTablaAfectPared(afectacionesPared);
						
						afectacionesPared = null;
						tablaAfectPared.setEnabled(false);

						rbParcialPared.setSelected(false);
						rbTotalPared.setSelected(false);
						cbMaterialPared.setSelectedIndex(0);
						textLargoPared.setText(null);
						textAnchoPared.setText(null);
						ckbParedCarga.setSelected(false);
						
						cbMaterialPared.setBorder(null);
						textLargoPared.setBorder(null);
						textAnchoPared.setBorder(null);
						
						rbParcialPared.setEnabled(false);
						rbTotalPared.setEnabled(false);
						rbParcialPared.setSelected(false);
						rbTotalPared.setSelected(false);
						cbMaterialPared.setEnabled(false);
						textAnchoPared.setEnabled(false);
						textLargoPared.setEnabled(false);
						
						AgregarParedBtn.setEnabled(false);
						ckbParedCarga.setEnabled(false);
						
						lblMaterialPared.setForeground(Color.LIGHT_GRAY);
						lblLargoPared.setForeground(Color.LIGHT_GRAY);
						lblAnchoPared.setForeground(Color.LIGHT_GRAY);
						AgregarParedBtn.setBackground(Color.LIGHT_GRAY);
						
						afectacionesPared = null;
					}
						
				}
			});
			ckbAfectPared.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ckbAfectPared.setBorder(BorderFactory.createEmptyBorder());
			ckbAfectPared.setBackground(new Color(214, 234, 230));
			ckbAfectPared.setBounds(146, 4, 21, 29);
		}
		return ckbAfectPared;
	}
	private JCheckBox getCkbAfectTecho() {
		if (ckbAfectTecho == null) {
			ckbAfectTecho = new JCheckBox("");
			ckbAfectTecho.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean seleccion = ckbAfectTecho.isSelected();
					if(seleccion){
						rbParcialTecho.setEnabled(true);
						rbTotalTecho.setEnabled(true);
						rbParcialTecho.setSelected(true);
						textLargoTecho.setEnabled(true);
						textAnchoTecho.setEnabled(true);
						cbMaterialTecho.setEnabled(true);
						
						lblMaterialTecho.setForeground(Color.black);
						lblLargoTecho.setForeground(Color.black);
						lblAnchoTecho.setForeground(Color.black);
						
					}
					else{
						rbParcialTecho.setSelected(false);
						rbTotalTecho.setSelected(false);
						textAnchoTecho.setText(null);
						textLargoTecho.setText(null);
						cbMaterialTecho.setSelectedIndex(0);
						
						textAnchoTecho.setBorder(null);
						textLargoTecho.setBorder(null);
						cbMaterialTecho.setBorder(null);
						
						rbParcialTecho.setEnabled(false);
						rbTotalTecho.setEnabled(false);
						textLargoTecho.setEnabled(false);
						textAnchoTecho.setEnabled(false);
						cbMaterialTecho.setEnabled(false);
						
						lblMaterialTecho.setForeground(Color.lightGray);
						lblLargoTecho.setForeground(Color.lightGray);
						lblAnchoTecho.setForeground(Color.lightGray);
					}
					
				}
			});
			ckbAfectTecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ckbAfectTecho.setBorder(BorderFactory.createEmptyBorder());
			ckbAfectTecho.setBackground(new Color(214, 234, 230));
			ckbAfectTecho.setBounds(154, 221, 27, 29);
		}
		return ckbAfectTecho;
	}
	private JLabel getLblElementosAfectados_1() {
		if (lblElementosAfectados_1 == null) {
			lblElementosAfectados_1 = new JLabel("Elementos Afectados");
			lblElementosAfectados_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblElementosAfectados_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblElementosAfectados_1.setBounds(165, 14, 217, 20);
		}
		return lblElementosAfectados_1;
	}
	private JLabel getLblElemento() {
		if (lblElemento == null) {
			lblElemento = new JLabel("Elemento:");
			lblElemento.setForeground(Color.GRAY);
			lblElemento.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblElemento.setBounds(46, 70, 86, 20);
		}
		return lblElemento;
	}
	private JTextField getTextNombreElemento() {
		if (textNombreElemento == null) {
			textNombreElemento = new JTextField();
			textNombreElemento.setEnabled(false);
			textNombreElemento.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if(textNombreElemento.getText().isEmpty()){
						spiCantidadElemento.setValue(1);
						spiCantidadElemento.setEnabled(false);
					}
					else{
						spiCantidadElemento.setEnabled(true);
						textNombreElemento.setBorder(null);
					}
				}
			});
			textNombreElemento.setFont(new Font("Dialog", Font.PLAIN, 16));
			textNombreElemento.setColumns(10);
			textNombreElemento.setBounds(136, 68, 105, 26);
		}
		return textNombreElemento;
	}
	private JLabel getLblCantidad() {
		if (lblCantidad == null) {
			lblCantidad = new JLabel("Cantidad:");
			lblCantidad.setForeground(Color.GRAY);
			lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblCantidad.setBounds(46, 111, 86, 20);
		}
		return lblCantidad;
	}
	private JSpinner getSpiCantidadElemento() {
		if (spiCantidadElemento == null) {
			spiCantidadElemento = new JSpinner();
			spiCantidadElemento.setModel(new SpinnerNumberModel(1, 1, ValorPorDefecto.limiteCantElementos, 1));
			spiCantidadElemento.setEnabled(false);
			spiCantidadElemento.setFont(new Font("Dialog", Font.PLAIN, 16));
			spiCantidadElemento.setBounds(136, 109, 105, 26);
		}
		return spiCantidadElemento;
	}
	private JPanel getAgregarElementoBtn() {
		if (AgregarElementoBtn == null) {
			AgregarElementoBtn = new JPanel();
			AgregarElementoBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					boolean posible = false;
					if(ckbElementos.isSelected()){
						if(tablaElementos.getRowCount() <= ValorPorDefecto.limiteCantElementos){
							if(textNombreElemento.getText().isEmpty()){
								posible = false;						
								textNombreElemento.setBorder(BorderFactory.createLineBorder(Color.red, 1));	
								JOptionPane.showMessageDialog(null, "Escriba el nombre del elemento afectado","ERROR", 0);
							}
							else{
								ElementoAfectado elemento = null;
								try{
									String nombre = textNombreElemento.getText();
									int cantidad = (Integer) spiCantidadElemento.getValue();
									elemento = new ElementoAfectado(nombre, cantidad);
									listaElementos.add(elemento);
									posible = true;
									
								}catch (IllegalArgumentException a){
									JOptionPane.showMessageDialog(null, a.getMessage(), "ADVERTENCIA", 2);;	
									posible = false;
								};
								if(posible){		
									textNombreElemento.setText(null);
									spiCantidadElemento.setValue(1);
									spiCantidadElemento.setEnabled(false);
									
									filaElemento[0] = elemento.getNombre();
									filaElemento[1] = elemento.getCantidad();
									
									modeloElementos.addRow(filaElemento);
								}
							}
						}
						else
							throw new IllegalArgumentException("<html>No pueden haber más de<br>" + ValorPorDefecto.limiteCantElementos + "elementos afectados");
					}
				}
			});
			AgregarElementoBtn.setLayout(null);
			AgregarElementoBtn.setToolTipText("<html>Autorrellenar las casillas del <br>Formulario del Dictamen <br>(para poder hacer pruebas <br>r\u00E1pidas)");
			AgregarElementoBtn.setBorder(new LineBorder(new Color(255, 255, 255)));
			AgregarElementoBtn.setBackground(Color.LIGHT_GRAY);
			AgregarElementoBtn.setBounds(105, 155, 94, 35);
			AgregarElementoBtn.add(getLblAgregarElemento());
		}
		return AgregarElementoBtn;
	}
	private JLabel getLblAgregarElemento() {
		if (lblAgregarElemento == null) {
			lblAgregarElemento = new JLabel("+");
			lblAgregarElemento.setHorizontalAlignment(SwingConstants.CENTER);
			lblAgregarElemento.setForeground(Color.WHITE);
			lblAgregarElemento.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblAgregarElemento.setBackground(Color.WHITE);
			lblAgregarElemento.setBounds(35, 0, 26, 35);
		}
		return lblAgregarElemento;
	}
	private JTable getTablaElementos() {
		if (tablaElementos == null) {
			tablaElementos = new JTable(){
				private static final long serialVersionUID = 1L;
				public boolean isCellEditable(int rowIndex, int colIndex){
					return false;
				}
		};
			modeloElementos = new DefaultTableModel();
			Object[] columna = {"Elemento","Cantidad"};
			modeloElementos.setColumnIdentifiers(columna);
			tablaElementos.setModel(modeloElementos);
			
		}
		return tablaElementos;
	}
	private JScrollPane getSpTablaElementos() {
		if (spTablaElementos == null) {
			spTablaElementos = new JScrollPane();
			spTablaElementos.setBounds(327, 50, 192, 144);
			spTablaElementos.setViewportView(getTablaElementos());
		}
		return spTablaElementos;
	}
	private JCheckBox getCkbElementos() {
		if (ckbElementos == null) {
			ckbElementos = new JCheckBox("");
			ckbElementos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(ckbElementos.isSelected()){
						listaElementos = new ArrayList<ElementoAfectado>();
						
						lblElemento.setForeground(Color.black);
						lblCantidad.setForeground(Color.black);
						AgregarElementoBtn.setBackground(new Color(123, 176, 168));
						
						textNombreElemento.setEnabled(true);		
						spTablaElementos.setEnabled(true);
					}
					else{
						vaciarTablaElementos(listaElementos);
						tablaElementos.setEnabled(false);
						listaElementos = null;
						AgregarElementoBtn.setBackground(Color.LIGHT_GRAY);
						
						lblElemento.setForeground(Color.LIGHT_GRAY);
						lblCantidad.setForeground(Color.LIGHT_GRAY);
						
						textNombreElemento.setText(null);
						spiCantidadElemento.setValue(1);
						
						textNombreElemento.setEnabled(false);
						spiCantidadElemento.setEnabled(false);
						spTablaElementos.setEnabled(false);		
					}
				}
			});
			ckbElementos.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ckbElementos.setBorder(BorderFactory.createEmptyBorder());
			ckbElementos.setBackground(new Color(214, 234, 230));
			ckbElementos.setBounds(154, 11, 21, 29);
		}
		return ckbElementos;
	}
	private JPanel getReiniciar4Btn() {
		if (Reiniciar4Btn == null) {
			Reiniciar4Btn = new JPanel();
			Reiniciar4Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Reiniciar4Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Reiniciar4Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {
                    reiniciarDatos();		
				}
			});
			Reiniciar4Btn.setLayout(null);
			Reiniciar4Btn.setBackground(new Color(123, 176, 168));
			Reiniciar4Btn.setBounds(80, 329, 111, 35);
			Reiniciar4Btn.add(getLabel_3());
		}
		return Reiniciar4Btn;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("REINICIAR");
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setForeground(Color.WHITE);
			label_3.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			label_3.setBounds(9, 9, 95, 20);
		}
		return label_3;
	}
	private JPanel getPanel_1_4() {
		if (Anterior4Btn == null) {
			Anterior4Btn = new JPanel();
			Anterior4Btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Anterior4Btn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Anterior4Btn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent arg0) {			
	                Pantallas.setSelectedIndex(3);		
				}
			});
			Anterior4Btn.setLayout(null);
			Anterior4Btn.setBorder(null);
			Anterior4Btn.setBackground(new Color(123, 176, 168));
			Anterior4Btn.setBounds(223, 329, 111, 35);
			Anterior4Btn.add(getLabel_4());
		}
		return Anterior4Btn;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("ANTERIOR");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setForeground(Color.WHITE);
			label_4.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			label_4.setBounds(9, 9, 95, 20);
		}
		return label_4;
	}
	private JPanel getPanel_2_1() {
		if (RegistrarBtn == null) {
			RegistrarBtn = new JPanel();
			RegistrarBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					RegistrarBtn.setBackground(new Color(93, 146, 138));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					RegistrarBtn.setBackground(new Color(123, 176, 168));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					if(!(listaElementos == null)){
						ficha.nuevaListaElementos();
						ficha.setListaElementos(listaElementos);
					}
					//arreglar
					Plantilla plantilla = ficha.crearPlantilla("municipio");
					admin.agregarPlantilla(plantilla);
					reiniciarDatos();
					JOptionPane.showMessageDialog(null, "Ficha Registrada con Éxito", null, 3);
				}
			});
			RegistrarBtn.setLayout(null);
			RegistrarBtn.setBorder(null);
			RegistrarBtn.setBackground(new Color(123, 176, 168));
			RegistrarBtn.setBounds(365, 322, 120, 50);
			RegistrarBtn.add(getLabel_5());
			RegistrarBtn.add(getLblFicha());
		}
		return RegistrarBtn;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("REGISTRAR");
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setForeground(Color.WHITE);
			label_5.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			label_5.setBounds(0, 3, 120, 30);
		}
		return label_5;
	}
	private JLabel getLblFicha() {
		if (lblFicha == null) {
			lblFicha = new JLabel("FICHA");
			lblFicha.setHorizontalAlignment(SwingConstants.CENTER);
			lblFicha.setForeground(Color.WHITE);
			lblFicha.setFont(new Font("Sitka Text", Font.PLAIN, 17));
			lblFicha.setBounds(0, 22, 120, 30);
		}
		return lblFicha;
	}
	
	
	private void reiniciarDatos(){
		textDireccion.setText(null);
		textLargoV.setText(null);
		textAnchoV.setText(null);
		textAreaV.setText(null);
		cbDocLegal.setSelectedIndex(0);
		cbTipoCons.setSelectedIndex(0);
		cbTipoHab.setSelectedIndex(0);
        ((JTextField)dcFechaLev.getDateEditor()).setText("");
        ckbFacilidad.setSelected(false);
        
        textDireccion.setBorder(null);
        textLargoV.setBorder(null);
		textAnchoV.setBorder(null);
		textAreaV.setBorder(null);
		dcFechaLev.setBorder(null);
		
        textCIJefe.setText(null);
        spiTotalHab.setValue(1);
        spiAncianos.setValue(0);
        spiNinnos.setValue(0);
        spiEmbarazadas.setValue(0);
        
        textCIJefe.setBorder(null);
        
        rbTotalPared.setSelected(true);
        rbParcialTecho.setSelected(true);
        cbMaterialPared.setSelectedIndex(0);
        cbMaterialTecho.setSelectedIndex(0);
        textLargoPared.setText(null);
        textLargoTecho.setText(null);
        textAnchoPared.setText(null);
        textAnchoTecho.setText(null);
        ckbParedCarga.setSelected(false);
        ckbAfectPared.setSelected(false);
        ckbAfectTecho.setSelected(false);
        
        rbTotalPared.setEnabled(false);
        rbParcialPared.setEnabled(false);
        rbParcialTecho.setEnabled(false);
        rbTotalTecho.setEnabled(false);
        cbMaterialPared.setEnabled(false);
        cbMaterialTecho.setEnabled(false);
        textLargoPared.setEnabled(false);
        textLargoTecho.setEnabled(false);
        textAnchoPared.setEnabled(false);
        textAnchoTecho.setEnabled(false);
        ckbParedCarga.setEnabled(false);
        
        lblLargoPared.setForeground(Color.GRAY);
        lblLargoTecho.setForeground(Color.GRAY);
        lblAnchoPared.setForeground(Color.GRAY);
        lblAnchoTecho.setForeground(Color.GRAY);
        lblMaterialPared.setForeground(Color.GRAY);
        lblMaterialTecho.setForeground(Color.GRAY);
        
        ckbElementos.setSelected(false);
        textNombreElemento.setText(null);
        spiCantidadElemento.setValue(1);
        
        lblElemento.setForeground(Color.GRAY);
        lblCantidad.setForeground(Color.GRAY);
        
        modeloAfectPared.setNumRows(0);
        modeloElementos.setNumRows(0);
        
        lblDictamen.setVisible(true);
        lblNucleoFamiliar.setVisible(false);
        lblAfectaciones.setVisible(false);
        lblElementosAfectados.setVisible(false);
        panelVerde1.setVisible(false);
        panelVerde2.setVisible(false);
        PanelVerde3.setVisible(false);
        PanelVerde4.setVisible(false);
       
        Pantallas.setSelectedIndex(1);
        ficha = admin.nuevaFicha();
		
	}
	private JTable getTablaFichas() {
		if (tablaFichas == null) {
			tablaFichas = new JTable(){
				private static final long serialVersionUID = 1L;
					public boolean isCellEditable(int rowIndex, int colIndex){
						return false;
					}
			};
			tablaFichas.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
			tablaFichas.setSelectionForeground(new Color(0, 0, 0));
			tablaFichas.setSelectionBackground(new Color(245, 245, 245));
			tablaFichas.setBorder(null);
			tablaFichas.setFont(new Font("Dialog", Font.PLAIN, 12));
			modeloFichas = new DefaultTableModel();
			Object[] columna = {"ID","Fecha","CI de Jefe","Habitantes","Área afectada","Cubicación"};
			modeloFichas.setColumnIdentifiers(columna);
			tablaFichas.setModel(modeloFichas);
		}
		return tablaFichas;
	}
	private JScrollPane getSpTablaFichas() {
		if (spTablaFichas == null) {
			spTablaFichas = new JScrollPane();
			spTablaFichas.setViewportBorder(null);
			spTablaFichas.setBounds(25, 81, 511, 289);
			spTablaFichas.setViewportView(getTablaFichas());
		}
		return spTablaFichas;
	}
	
	private void guardarProgresoNF(){
		
		for(int i = 1; i <= 4;  i++){
			if(Pantallas.getSelectedIndex() == i){
				nf = i;
			}
		}
		
		lblDictamen.setVisible(false);
		panelVerde1.setVisible(false);
		lblNucleoFamiliar.setVisible(false);
		panelVerde2.setVisible(false);
		lblAfectaciones.setVisible(false);
	    PanelVerde3.setVisible(false);
	    lblElementosAfectados.setVisible(false);
	    PanelVerde4.setVisible(false);
	}
	private JPanel getAyudaCI() {
		if (AyudaCI == null) {
			AyudaCI = new JPanel();
			AyudaCI.setLayout(null);
			AyudaCI.setToolTipText("<html>N\u00FAmero de la tarjeta de identificaci\u00F3n legal. <br>Debe contener 11 caracteres num\u00E9ricos.<br>El jefe de n\u00FAcleo debe superar los 18 a\u00F1os <br>de edad.");
			AyudaCI.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaCI.setBackground(new Color(123, 176, 168));
			AyudaCI.setBounds(494, 58, 26, 26);
			AyudaCI.add(getLblAyudaCI());
		}
		return AyudaCI;
	}
	private JLabel getLblAyudaCI() {
		if (lblAyudaCI == null) {
			lblAyudaCI = new JLabel("?");
			lblAyudaCI.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaCI.setForeground(Color.WHITE);
			lblAyudaCI.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaCI.setBackground(Color.WHITE);
			lblAyudaCI.setBounds(0, 3, 26, 20);
		}
		return lblAyudaCI;
	}
	private JPanel getAyudaTotalHab() {
		if (AyudaTotalHab == null) {
			AyudaTotalHab = new JPanel();
			AyudaTotalHab.setLayout(null);
			AyudaTotalHab.setToolTipText("<html>El total de habitantes de la vivienda<br> no debe superar las 0 personas.<br><br>(Configurable en Ajustes/ L\u00EDmites / <br>Valores / Total de habitantes)");
			AyudaTotalHab.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaTotalHab.setBackground(new Color(123, 176, 168));
			AyudaTotalHab.setBounds(212, 175, 26, 26);
			AyudaTotalHab.add(getLblAyudaTotalHab());
		}
		return AyudaTotalHab;
	}
	private JLabel getLblAyudaTotalHab() {
		if (lblAyudaTotalHab == null) {
			lblAyudaTotalHab = new JLabel("?");
			lblAyudaTotalHab.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaTotalHab.setForeground(Color.WHITE);
			lblAyudaTotalHab.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaTotalHab.setBackground(Color.WHITE);
			lblAyudaTotalHab.setBounds(0, 3, 26, 20);
		}
		return lblAyudaTotalHab;
	}
	private JPanel getAyudaTotalVul() {
		if (AyudaTotalVul == null) {
			AyudaTotalVul = new JPanel();
			AyudaTotalVul.setLayout(null);
			AyudaTotalVul.setToolTipText("<html>Las personas vulnerables est\u00E1n <br>compuestas por las embarazadas,<br>ancianos y ni\u00F1os.");
			AyudaTotalVul.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaTotalVul.setBackground(new Color(123, 176, 168));
			AyudaTotalVul.setBounds(212, 256, 26, 26);
			AyudaTotalVul.add(getLblAyudaTotalVul());
		}
		return AyudaTotalVul;
	}
	private JLabel getLblAyudaTotalVul() {
		if (lblAyudaTotalVul == null) {
			lblAyudaTotalVul = new JLabel("?");
			lblAyudaTotalVul.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaTotalVul.setForeground(Color.WHITE);
			lblAyudaTotalVul.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaTotalVul.setBackground(Color.WHITE);
			lblAyudaTotalVul.setBounds(0, 3, 26, 20);
		}
		return lblAyudaTotalVul;
	}
	private JPanel getAyudaEmbarazadas() {
		if (AyudaEmbarazadas == null) {
			AyudaEmbarazadas = new JPanel();
			AyudaEmbarazadas.setLayout(null);
			AyudaEmbarazadas.setToolTipText("<html>Ser\u00E1 considerada una persona gestante<br>si se encuentra en el proceso de embarazo.");
			AyudaEmbarazadas.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaEmbarazadas.setBackground(new Color(123, 176, 168));
			AyudaEmbarazadas.setBounds(494, 166, 26, 26);
			AyudaEmbarazadas.add(getLblAyudaEmbarazadas());
		}
		return AyudaEmbarazadas;
	}
	private JLabel getLblAyudaEmbarazadas() {
		if (lblAyudaEmbarazadas == null) {
			lblAyudaEmbarazadas = new JLabel("?");
			lblAyudaEmbarazadas.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaEmbarazadas.setForeground(Color.WHITE);
			lblAyudaEmbarazadas.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaEmbarazadas.setBackground(Color.WHITE);
			lblAyudaEmbarazadas.setBounds(0, 3, 26, 20);
		}
		return lblAyudaEmbarazadas;
	}
	private JPanel getAyudaAncianos() {
		if (AyudaAncianos == null) {
			AyudaAncianos = new JPanel();
			AyudaAncianos.setLayout(null);
			AyudaAncianos.setToolTipText("<html>Ser\u00E1 considerado un anciano<br>si es mayor de 60 a\u00F1os.");
			AyudaAncianos.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaAncianos.setBackground(new Color(123, 176, 168));
			AyudaAncianos.setBounds(494, 215, 26, 26);
			AyudaAncianos.add(getLblAyudaAncianos());
		}
		return AyudaAncianos;
	}
	private JLabel getLblAyudaAncianos() {
		if (lblAyudaAncianos == null) {
			lblAyudaAncianos = new JLabel("?");
			lblAyudaAncianos.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaAncianos.setForeground(Color.WHITE);
			lblAyudaAncianos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaAncianos.setBackground(Color.WHITE);
			lblAyudaAncianos.setBounds(0, 3, 26, 20);
		}
		return lblAyudaAncianos;
	}
	private JPanel getAyudaNinnos() {
		if (AyudaNinnos == null) {
			AyudaNinnos = new JPanel();
			AyudaNinnos.setLayout(null);
			AyudaNinnos.setToolTipText("<html>Ser\u00E1 considerado un ni\u00F1o <br>si es menor de 18 a\u00F1os.");
			AyudaNinnos.setBorder(new LineBorder(new Color(255, 255, 255)));
			AyudaNinnos.setBackground(new Color(123, 176, 168));
			AyudaNinnos.setBounds(494, 267, 26, 26);
			AyudaNinnos.add(getLblAyudaNinnos());
		}
		return AyudaNinnos;
	}
	private JLabel getLblAyudaNinnos() {
		if (lblAyudaNinnos == null) {
			lblAyudaNinnos = new JLabel("?");
			lblAyudaNinnos.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyudaNinnos.setForeground(Color.WHITE);
			lblAyudaNinnos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAyudaNinnos.setBackground(Color.WHITE);
			lblAyudaNinnos.setBounds(0, 3, 26, 20);
		}
		return lblAyudaNinnos;
	}
	private JTextField getTextBuscarID() {
		if (textBuscarID == null) {
			textBuscarID = new JTextField();
			textBuscarID.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					textBuscarID.setFocusable(true);
				}
			});
			textBuscarID.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int tecla = e.getKeyChar();
					int cantCaracteres = textBuscarID.getText().length();
					if(textBuscarID.getText().isEmpty())
						mostrarTablaLista(admin.getListaPlantillas());
					boolean esNumero = tecla >= 48 && tecla <= 57;
					if(!esNumero || cantCaracteres >= 4)
						e.consume();
				}
				@Override
				public void keyReleased(KeyEvent e) {
					if(!textBuscarID.getText().isEmpty()){
						mostrarTablaLista(AccionTabla.buscarPlantillaID(textBuscarID.getText()));
					}
					textParteTodo.setText(tablaFichas.getRowCount() + " de " + admin.getListaPlantillas().size());
				}
			});
			textBuscarID.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					textBuscarID.setText("");
					textBuscarID.setForeground(Color.BLACK);
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(textBuscarID.getText().isEmpty()){
						textBuscarID.setText("Buscar ID");
						textBuscarID.setForeground(Color.LIGHT_GRAY);
					}
				}
			});
			textBuscarID.setForeground(Color.LIGHT_GRAY);
			textBuscarID.setBackground(Color.WHITE);
			textBuscarID.setFont(new Font("Tahoma", Font.BOLD, 16));
			textBuscarID.setText("Buscar ID");
			textBuscarID.setHorizontalAlignment(SwingConstants.CENTER);
			textBuscarID.setBounds(25, 16, 162, 26);
			textBuscarID.setColumns(10);
		}
		return textBuscarID;
	}
	
	
	private void mostrarTablaLista(ArrayList<Plantilla> lista){
		SimpleDateFormat formato = new SimpleDateFormat("dd / MM / yyyy");
		
    	if(tablaFichas.getRowCount() > 0){
    		vaciarTablaFichas();
    	}
	    for(Plantilla p: lista){
	    	Ficha f = p.getFicha();
	    	Dictamen d = f.getDictamen();
	    	NucleoFamiliar n = f.getNucleo();
	    
	    	filaFichas[0] = d.getID();
	    	filaFichas[1] = formato.format(d.getFechaLev());
	    	filaFichas[2] = n.getCIJefe();
	    	filaFichas[3] = n.getTotalPersonas();			    	
	    	filaFichas[4] = f.areaAfectaciones() + " m^2";
	    	filaFichas[5] = "$" + p.totalCubicacion();
	    	
	    	modeloFichas.addRow(filaFichas);
	    	tablaFichas.setModel(modeloFichas);
	    }
	}
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("Recursos/Imagenes/micons logo.png"));
			lblNewLabel_1.setBounds(58, 140, 460, 224);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblGestinY() {
		if (lblGestinY == null) {
			lblGestinY = new JLabel("Gesti\u00F3n y");
			lblGestinY.setHorizontalAlignment(SwingConstants.CENTER);
			lblGestinY.setForeground(Color.GRAY);
			lblGestinY.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
			lblGestinY.setBounds(65, 10, 181, 38);
		}
		return lblGestinY;
	}
	private JLabel getLblAlmacenamiento() {
		if (lblAlmacenamiento == null) {
			lblAlmacenamiento = new JLabel("Almacenamiento de");
			lblAlmacenamiento.setForeground(Color.GRAY);
			lblAlmacenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
			lblAlmacenamiento.setBounds(65, 35, 222, 38);
		}
		return lblAlmacenamiento;
	}
	private JLabel getLblDeViviendasAfectadas() {
		if (lblDeViviendasAfectadas == null) {
			lblDeViviendasAfectadas = new JLabel("Viviendas Afectadas");
			lblDeViviendasAfectadas.setForeground(Color.GRAY);
			lblDeViviendasAfectadas.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
			lblDeViviendasAfectadas.setBounds(65, 60, 260, 38);
		}
		return lblDeViviendasAfectadas;
	}
	private JLabel getLblLaFichaTcnica() {
		if (lblLaFichaTcnica == null) {
			lblLaFichaTcnica = new JLabel("La ficha ser\u00E1 registrada con el ID:");
			lblLaFichaTcnica.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblLaFichaTcnica.setBounds(46, 240, 349, 43);
		}
		return lblLaFichaTcnica;
	}
	private JTextField getTextMostrarID() {
		if (textMostrarID == null) {
			textMostrarID = new JTextField();
			textMostrarID.setHorizontalAlignment(SwingConstants.CENTER);
			textMostrarID.setFont(new Font("Dialog", Font.PLAIN, 16));
			textMostrarID.setEditable(false);
			textMostrarID.setBackground(Color.WHITE);
			textMostrarID.setBounds(359, 248, 67, 26);
			textMostrarID.setColumns(10);
			textMostrarID.setBackground(new Color(234, 254, 250));
		}
		return textMostrarID;
	}
	private JLabel getLblFondosRequeridos() {
		if (lblFondosRequeridos == null) {
			lblFondosRequeridos = new JLabel("Fondos requeridos");
			lblFondosRequeridos.setHorizontalAlignment(SwingConstants.CENTER);
			lblFondosRequeridos.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblFondosRequeridos.setBounds(162, 5, 217, 20);
		}
		return lblFondosRequeridos;
	}
	private JLabel getLblMateriales() {
		if (lblMateriales == null) {
			lblMateriales = new JLabel("Materiales");
			lblMateriales.setHorizontalAlignment(SwingConstants.CENTER);
			lblMateriales.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblMateriales.setBounds(160, 102, 217, 20);
		}
		return lblMateriales;
	}
	private JLabel getLblVivienda() {
		if (lblVivienda == null) {
			lblVivienda = new JLabel("Viviendas");
			lblVivienda.setHorizontalAlignment(SwingConstants.CENTER);
			lblVivienda.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblVivienda.setBounds(162, 255, 217, 20);
		}
		return lblVivienda;
	}
	private JSeparator getSeparator_6() {
		if (separator_6 == null) {
			separator_6 = new JSeparator();
			separator_6.setForeground(Color.DARK_GRAY);
			separator_6.setBounds(15, 98, 526, 9);
		}
		return separator_6;
	}
	private JSeparator getSeparator_7() {
		if (separator_7 == null) {
			separator_7 = new JSeparator();
			separator_7.setForeground(Color.DARK_GRAY);
			separator_7.setBounds(15, 250, 526, 9);
		}
		return separator_7;
	}
	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total de fondos:");
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblTotal.setBounds(43, 38, 139, 20);
		}
		return lblTotal;
	}
	private JLabel getLblPromedioPorAfectacin() {
		if (lblPromedioPorAfectacin == null) {
			lblPromedioPorAfectacin = new JLabel("Promedio por afectaci\u00F3n:");
			lblPromedioPorAfectacin.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblPromedioPorAfectacin.setBounds(275, 38, 197, 20);
		}
		return lblPromedioPorAfectacin;
	}
	private JLabel getTextTotalFondos() {
		if (textTotalFondos == null) {
			textTotalFondos = new JLabel("$0.00");
			textTotalFondos.setForeground(new Color(47, 79, 79));
			textTotalFondos.setFont(new Font("Dialog", Font.PLAIN, 16));
			textTotalFondos.setBounds(43, 62, 130, 20);
		}
		return textTotalFondos;
	}
	private JLabel getTextPromedioFondos() {
		if (textPromedioFondos == null) {
			textPromedioFondos = new JLabel("$0.00");
			textPromedioFondos.setForeground(new Color(47, 79, 79));
			textPromedioFondos.setFont(new Font("Dialog", Font.PLAIN, 16));
			textPromedioFondos.setBounds(275, 62, 197, 20);
		}
		return textPromedioFondos;
	}
	private JComboBox<String> getCbMaterialSelec() {
		if (cbMaterialSelec == null) {
			cbMaterialSelec = new JComboBox<String>();
			cbMaterialSelec.setFont(new Font("Dialog", Font.PLAIN, 16));
			cbMaterialSelec.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(cbMaterialSelec.getSelectedItem().toString().isEmpty()){
						textFondosMaterial.setText("$0.00");
						textCantidadMaterial.setText("0");
					}
					else{
						DatosMaterialSelec datos = admin.buscarDatosMaterialSelec((String) cbMaterialSelec.getSelectedItem());
						textFondosMaterial.setText("$" + datos.getFondo() + "0");
						textCantidadMaterial.setText(datos.getCantidad() + " " + datos.getMedida());
					}
				}
			});
			cbMaterialSelec.setModel(new DefaultComboBoxModel<String>
								(Utiles.getListaconBlanco(Utiles.concatenarListas
										(ValorPorDefecto.getListaMaterialPared(), 
												ValorPorDefecto.getListaMaterialTecho()))));
			cbMaterialSelec.setBounds(43, 153, 162, 26);
		}
		return cbMaterialSelec;
	}
	private JLabel getLblFondosR() {
		if (lblFondosR == null) {
			lblFondosR = new JLabel("Fondos:");
			lblFondosR.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblFondosR.setBounds(43, 189, 75, 20);
		}
		return lblFondosR;
	}
	private JLabel getLblCantidadR() {
		if (lblCantidadR == null) {
			lblCantidadR = new JLabel("Cantidad:");
			lblCantidadR.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblCantidadR.setBounds(43, 216, 75, 20);
		}
		return lblCantidadR;
	}
	private JLabel getTextCantidadMaterial() {
		if (textCantidadMaterial == null) {
			textCantidadMaterial = new JLabel("0");
			textCantidadMaterial.setForeground(new Color(47, 79, 79));
			textCantidadMaterial.setFont(new Font("Dialog", Font.PLAIN, 16));
			textCantidadMaterial.setBounds(125, 217, 96, 20);
		}
		return textCantidadMaterial;
	}
	private JLabel getTextFondosMaterial() {
		if (textFondosMaterial == null) {
			textFondosMaterial = new JLabel("$0.00");
			textFondosMaterial.setForeground(new Color(47, 79, 79));
			textFondosMaterial.setFont(new Font("Dialog", Font.PLAIN, 16));
			textFondosMaterial.setBounds(125, 190, 105, 20);
		}
		return textFondosMaterial;
	}
	private JSeparator getSeparator_8() {
		if (separator_8 == null) {
			separator_8 = new JSeparator();
			separator_8.setOrientation(SwingConstants.VERTICAL);
			separator_8.setForeground(Color.DARK_GRAY);
			separator_8.setBounds(234, 131, 9, 113);
		}
		return separator_8;
	}
	private JLabel getLblSeleccioneUnMaterial() {
		if (lblSeleccioneUnMaterial == null) {
			lblSeleccioneUnMaterial = new JLabel("Seleccione un material:");
			lblSeleccioneUnMaterial.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSeleccioneUnMaterial.setBounds(43, 132, 175, 20);
		}
		return lblSeleccioneUnMaterial;
	}
	private JLabel getLblElMayor() {
		if (lblElMayor == null) {
			lblElMayor = new JLabel("El mayor fondo");
			lblElMayor.setHorizontalAlignment(SwingConstants.CENTER);
			lblElMayor.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblElMayor.setBounds(258, 138, 121, 20);
		}
		return lblElMayor;
	}
	private JLabel getLblDedicadoAUn() {
		if (lblDedicadoAUn == null) {
			lblDedicadoAUn = new JLabel("dedicado a un");
			lblDedicadoAUn.setHorizontalAlignment(SwingConstants.CENTER);
			lblDedicadoAUn.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDedicadoAUn.setBounds(258, 157, 121, 20);
		}
		return lblDedicadoAUn;
	}
	private JLabel getLblMaterialEsDe() {
		if (lblMaterialEsDe == null) {
			lblMaterialEsDe = new JLabel("material es de:");
			lblMaterialEsDe.setHorizontalAlignment(SwingConstants.CENTER);
			lblMaterialEsDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblMaterialEsDe.setBounds(258, 175, 121, 20);
		}
		return lblMaterialEsDe;
	}
	private JLabel getTextMayorFondo() {
		if (textMayorFondo == null) {
			textMayorFondo = new JLabel("$0.00");
			textMayorFondo.setHorizontalAlignment(SwingConstants.CENTER);
			textMayorFondo.setForeground(new Color(47, 79, 79));
			textMayorFondo.setFont(new Font("Dialog", Font.PLAIN, 16));
			textMayorFondo.setBounds(258, 205, 121, 20);
		}
		return textMayorFondo;
	}
	private JLabel getLblDedicadoPara() {
		if (lblDedicadoPara == null) {
			lblDedicadoPara = new JLabel("Dedicado");
			lblDedicadoPara.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDedicadoPara.setBounds(421, 138, 75, 20);
		}
		return lblDedicadoPara;
	}
	private JLabel getLblPara() {
		if (lblPara == null) {
			lblPara = new JLabel("para:");
			lblPara.setHorizontalAlignment(SwingConstants.CENTER);
			lblPara.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblPara.setBounds(421, 157, 75, 20);
		}
		return lblPara;
	}
	private JLabel getLblMatMasFondos() {
		if (lblMatMasFondos == null) {
			lblMatMasFondos = new JLabel("");
			lblMatMasFondos.setHorizontalAlignment(SwingConstants.CENTER);
			lblMatMasFondos.setForeground(new Color(47, 79, 79));
			lblMatMasFondos.setFont(new Font("Dialog", Font.PLAIN, 16));
			lblMatMasFondos.setBounds(394, 180, 121, 20);
		}
		return lblMatMasFondos;
	}
	private JSeparator getSeparator_9() {
		if (separator_9 == null) {
			separator_9 = new JSeparator();
			separator_9.setOrientation(SwingConstants.VERTICAL);
			separator_9.setForeground(Color.DARK_GRAY);
			separator_9.setBounds(234, 286, 9, 96);
		}
		return separator_9;
	}
	private JLabel getLblViviendaPrioritaria() {
		if (lblViviendaPrioritaria == null) {
			lblViviendaPrioritaria = new JLabel("Vivienda prioritaria:");
			lblViviendaPrioritaria.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblViviendaPrioritaria.setBounds(43, 280, 162, 20);
		}
		return lblViviendaPrioritaria;
	}
	private JLabel getTextIDPrioridad() {
		if (textIDPrioridad == null) {
			textIDPrioridad = new JLabel("");
			textIDPrioridad.setForeground(new Color(47, 79, 79));
			textIDPrioridad.setFont(new Font("Dialog", Font.PLAIN, 17));
			textIDPrioridad.setBounds(99, 315, 96, 20);
		}
		return textIDPrioridad;
	}
	private JLabel getLblIndice() {
		if (lblIndice == null) {
			lblIndice = new JLabel("\u00CDndice:");
			lblIndice.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblIndice.setBounds(60, 350, 58, 20);
		}
		return lblIndice;
	}
	private JLabel getTextIndice() {
		if (textIndice == null) {
			textIndice = new JLabel("");
			textIndice.setForeground(new Color(47, 79, 79));
			textIndice.setFont(new Font("Dialog", Font.PLAIN, 16));
			textIndice.setBounds(125, 350, 70, 20);
		}
		return textIndice;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID:");
			lblId.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblId.setBounds(60, 315, 31, 20);
		}
		return lblId;
	}
	private JLabel getLblMayorNmero() {
		if (lblMayorNmero == null) {
			lblMayorNmero = new JLabel("Mayor cantidad");
			lblMayorNmero.setHorizontalAlignment(SwingConstants.CENTER);
			lblMayorNmero.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblMayorNmero.setBounds(258, 291, 139, 20);
		}
		return lblMayorNmero;
	}
	private JLabel getLblDeHabitantes() {
		if (lblDeHabitantes == null) {
			lblDeHabitantes = new JLabel("de habitantes:");
			lblDeHabitantes.setHorizontalAlignment(SwingConstants.CENTER);
			lblDeHabitantes.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDeHabitantes.setBounds(258, 315, 139, 20);
		}
		return lblDeHabitantes;
	}
	private JLabel getTextMayHab() {
		if (textMayHab == null) {
			textMayHab = new JLabel("");
			textMayHab.setForeground(new Color(47, 79, 79));
			textMayHab.setFont(new Font("Dialog", Font.PLAIN, 16));
			textMayHab.setBounds(291, 339, 70, 20);
		}
		return textMayHab;
	}
	private JLabel getLblEnLasViviendas() {
		if (lblEnLasViviendas == null) {
			lblEnLasViviendas = new JLabel("En las viviendas:");
			lblEnLasViviendas.setHorizontalAlignment(SwingConstants.CENTER);
			lblEnLasViviendas.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEnLasViviendas.setBounds(402, 286, 139, 20);
		}
		return lblEnLasViviendas;
	}
	private JTable getTablaIDMayorHab() {
		if (tablaIDMayorHab == null) {
			tablaIDMayorHab = new JTable();
			tablaIDMayorHab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tablaIDMayorHab.setRowSelectionAllowed(false);
			tablaIDMayorHab.setFont(new Font("Dialog", Font.PLAIN, 15));
			modeloIDMayHab = new DefaultTableModel();
			tablaIDMayorHab.setModel(modeloIDMayHab);
		}
		return tablaIDMayorHab;
	}
	private JScrollPane getSpTablaMayHab() {
		if (spTablaMayHab == null) {
			spTablaMayHab = new JScrollPane();
			spTablaMayHab.setBounds(421, 310, 96, 60);
			spTablaMayHab.setViewportView(getTablaIDMayorHab());
			Object[] columna = {""};
			modeloIDMayHab.setColumnIdentifiers(columna);
		}
		return spTablaMayHab;
	}
	
	private void vaciarTablaAfectPared(ArrayList<AfectPared> lista){
		for(int i = 0; i < lista.size(); i++){
			modeloAfectPared.removeRow(0);
			tablaAfectPared.setModel(modeloAfectPared);
		}
	}
	private void vaciarTablaElementos(ArrayList<ElementoAfectado> lista){
		for(int i = 0; i < lista.size(); i++){
			modeloElementos.removeRow(0);
			tablaElementos.setModel(modeloElementos);
		}
	}
	private void vaciarTablaFichas(){
		int tamanno = modeloFichas.getRowCount();
		for(int i = 0; i < tamanno; i++){
			modeloFichas.removeRow(0);
			tablaFichas.setModel(modeloFichas);
		}
	}
	private JComboBox<String> getCbOrdenar() {
		if (cbOrdenar == null) {
			cbOrdenar = new JComboBox<String>();
			cbOrdenar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarTablaLista(AccionTabla.organizarListaID(AccionTabla.buscarPlantillaID(textBuscarID.getText()), cbOrdenar.getSelectedIndex(), rbMayorMenor.isSelected()));
				}
			});
			cbOrdenar.setFont(new Font("Dialog", Font.PLAIN, 14));
			cbOrdenar.setModel(new DefaultComboBoxModel<String>(new String[] {"Fecha de entrada", "Fecha de levantamiento", "Cantidad de habitantes", "\u00C1rea afectada", "Cubicaci\u00F3n", "Identificador"}));
			cbOrdenar.setBounds(358, 16, 178, 26);
		}
		return cbOrdenar;
	}
	private JLabel getLblOrdenar() {
		if (lblOrdenar == null) {
			lblOrdenar = new JLabel("Ordenar por:");
			lblOrdenar.setBounds(262, 19, 93, 20);
		}
		return lblOrdenar;
	}
	private JRadioButton getRbMenorMayor() {
		if (rbMenorMayor == null) {
			rbMenorMayor = new JRadioButton("Menor a mayor");
			rbMenorMayor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbMenorMayor.isSelected()){
						mostrarTablaLista(AccionTabla.organizarListaID(admin.getListaPlantillas(), cbOrdenar.getSelectedIndex(), false));
					}
				}
			});
			rbMenorMayor.setFont(new Font("Dialog", Font.PLAIN, 15));
			rbMenorMayor.setBackground(new Color(214, 234, 230));
			rbMenorMayor.setBounds(258, 46, 137, 29);
		}
		return rbMenorMayor;
	}
	private JRadioButton getRbMayorMenor() {
		if (rbMayorMenor == null) {
			rbMayorMenor = new JRadioButton("Mayor a menor");
			rbMayorMenor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbMayorMenor.isSelected()){
						mostrarTablaLista(AccionTabla.organizarListaID(admin.getListaPlantillas(), cbOrdenar.getSelectedIndex(), true));
					}
				}
			});
			rbMayorMenor.setFont(new Font("Dialog", Font.PLAIN, 15));
			rbMayorMenor.setBackground(new Color(214, 234, 230));
			rbMayorMenor.setBounds(407, 47, 129, 29);
		}
		return rbMayorMenor;
	}
	private JLabel getTextParteTodo() {
		if (textParteTodo == null) {
			textParteTodo = new JLabel("");
			textParteTodo.setFont(new Font("Dialog", Font.PLAIN, 14));
			textParteTodo.setBounds(25, 58, 146, 20);
		}
		return textParteTodo;
	}
	private JSeparator getSeparator_10() {
		if (separator_10 == null) {
			separator_10 = new JSeparator();
			separator_10.setOrientation(SwingConstants.VERTICAL);
			separator_10.setForeground(Color.DARK_GRAY);
			separator_10.setBounds(217, 12, 9, 60);
		}
		return separator_10;
	}
	private JLabel getLblLmites() {
		if (lblLmites == null) {
			lblLmites = new JLabel("L\u00CDMITES");
			lblLmites.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblLmites.setBounds(32, 10, 84, 20);
		}
		return lblLmites;
	}
	private JLabel getLblCategoras() {
		if (lblCategoras == null) {
			lblCategoras = new JLabel("CATEGOR\u00CDAS");
			lblCategoras.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblCategoras.setBounds(32, 135, 131, 20);
		}
		return lblCategoras;
	}
	private JLabel getLblMateriales_1() {
		if (lblMateriales_1 == null) {
			lblMateriales_1 = new JLabel("MATERIALES");
			lblMateriales_1.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblMateriales_1.setBounds(32, 258, 131, 20);
		}
		return lblMateriales_1;
	}
	private JSeparator getSeparator_11() {
		if (separator_11 == null) {
			separator_11 = new JSeparator();
			separator_11.setOrientation(SwingConstants.VERTICAL);
			separator_11.setForeground(Color.DARK_GRAY);
			separator_11.setBounds(42, 36, 9, 95);
		}
		return separator_11;
	}
	private JSeparator getSeparator_12() {
		if (separator_12 == null) {
			separator_12 = new JSeparator();
			separator_12.setOrientation(SwingConstants.VERTICAL);
			separator_12.setForeground(Color.DARK_GRAY);
			separator_12.setBounds(42, 160, 9, 95);
		}
		return separator_12;
	}
	private JSeparator getSeparator_13() {
		if (separator_13 == null) {
			separator_13 = new JSeparator();
			separator_13.setOrientation(SwingConstants.VERTICAL);
			separator_13.setForeground(Color.DARK_GRAY);
			separator_13.setBounds(42, 285, 9, 104);
		}
		return separator_13;
	}
	private JSeparator getSeparator_14() {
		if (separator_14 == null) {
			separator_14 = new JSeparator();
			separator_14.setForeground(Color.DARK_GRAY);
			separator_14.setBounds(44, 130, 490, 9);
		}
		return separator_14;
	}
	private JSeparator getSeparator_15() {
		if (separator_15 == null) {
			separator_15 = new JSeparator();
			separator_15.setForeground(Color.DARK_GRAY);
			separator_15.setBounds(44, 255, 490, 9);
		}
		return separator_15;
	}
	private JSeparator getSeparator_16() {
		if (separator_16 == null) {
			separator_16 = new JSeparator();
			separator_16.setForeground(Color.DARK_GRAY);
			separator_16.setBounds(44, 388, 490, 9);
		}
		return separator_16;
	}
	private JSeparator getSeparator_17() {
		if (separator_17 == null) {
			separator_17 = new JSeparator();
			separator_17.setForeground(Color.DARK_GRAY);
			separator_17.setBounds(111, 21, 423, 9);
		}
		return separator_17;
	}
	private JSeparator getSeparator_18() {
		if (separator_18 == null) {
			separator_18 = new JSeparator();
			separator_18.setForeground(Color.DARK_GRAY);
			separator_18.setBounds(148, 146, 386, 9);
		}
		return separator_18;
	}
	private JSeparator getSeparator_19() {
		if (separator_19 == null) {
			separator_19 = new JSeparator();
			separator_19.setForeground(Color.DARK_GRAY);
			separator_19.setBounds(146, 269, 388, 9);
		}
		return separator_19;
	}
	private JSeparator getSeparator_20() {
		if (separator_20 == null) {
			separator_20 = new JSeparator();
			separator_20.setOrientation(SwingConstants.VERTICAL);
			separator_20.setForeground(Color.DARK_GRAY);
			separator_20.setBounds(534, 270, 9, 119);
		}
		return separator_20;
	}
	private JSeparator getSeparator_21() {
		if (separator_21 == null) {
			separator_21 = new JSeparator();
			separator_21.setOrientation(SwingConstants.VERTICAL);
			separator_21.setForeground(Color.DARK_GRAY);
			separator_21.setBounds(534, 146, 9, 109);
		}
		return separator_21;
	}
	private JSeparator getSeparator_22() {
		if (separator_22 == null) {
			separator_22 = new JSeparator();
			separator_22.setOrientation(SwingConstants.VERTICAL);
			separator_22.setForeground(Color.DARK_GRAY);
			separator_22.setBounds(534, 22, 9, 109);
		}
		return separator_22;
	}
	private JLabel getLblCaracteres() {
		if (lblCaracteres == null) {
			lblCaracteres = new JLabel("Caracteres");
			lblCaracteres.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblCaracteres.setBounds(65, 32, 92, 20);
		}
		return lblCaracteres;
	}
	private JLabel getLblDimensiones_1() {
		if (lblDimensiones_1 == null) {
			lblDimensiones_1 = new JLabel("Dimensiones(m)");
			lblDimensiones_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblDimensiones_1.setBounds(212, 32, 127, 20);
		}
		return lblDimensiones_1;
	}
	private JLabel getLblValores() {
		if (lblValores == null) {
			lblValores = new JLabel("Cantidades");
			lblValores.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblValores.setBounds(408, 32, 92, 20);
		}
		return lblValores;
	}
	private JLabel getLblDocumentoLegal() {
		if (lblDocumentoLegal == null) {
			lblDocumentoLegal = new JLabel("Documento Legal");
			lblDocumentoLegal.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblDocumentoLegal.setBounds(54, 157, 131, 20);
		}
		return lblDocumentoLegal;
	}
	private JLabel getLblTipologaHabitacional_1() {
		if (lblTipologaHabitacional_1 == null) {
			lblTipologaHabitacional_1 = new JLabel("Tipolog\u00EDa habitacional");
			lblTipologaHabitacional_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblTipologaHabitacional_1.setBounds(200, 157, 165, 20);
		}
		return lblTipologaHabitacional_1;
	}
	private JLabel getLblTipologaConstructiva_1() {
		if (lblTipologaConstructiva_1 == null) {
			lblTipologaConstructiva_1 = new JLabel("Tipolog\u00EDa constructiva");
			lblTipologaConstructiva_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblTipologaConstructiva_1.setBounds(370, 157, 159, 20);
		}
		return lblTipologaConstructiva_1;
	}
	private JLabel getLblDireccin() {
		if (lblDireccin == null) {
			lblDireccin = new JLabel("Direcci\u00F3n:");
			lblDireccin.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblDireccin.setBounds(55, 58, 71, 20);
		}
		return lblDireccin;
	}
	private JLabel getLblNombreDe() {
		if (lblNombreDe == null) {
			lblNombreDe = new JLabel("Nombre de");
			lblNombreDe.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblNombreDe.setBounds(55, 82, 71, 20);
		}
		return lblNombreDe;
	}
	private JLabel getLblElemento_1() {
		if (lblElemento_1 == null) {
			lblElemento_1 = new JLabel("elemento");
			lblElemento_1.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblElemento_1.setBounds(55, 94, 71, 20);
		}
		return lblElemento_1;
	}
	private JLabel getLblAfectado() {
		if (lblAfectado == null) {
			lblAfectado = new JLabel("afectado:");
			lblAfectado.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblAfectado.setBounds(55, 105, 71, 20);
		}
		return lblAfectado;
	}
	private JTextField getTextAjustesDireccion() {
		if (textAjustesDireccion == null) {
			textAjustesDireccion = new JTextField();
			textAjustesDireccion.setEditable(false);
			
			textAjustesDireccion.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesDireccion.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesDireccion.setBounds(126, 58, 30, 22);
			textAjustesDireccion.setColumns(10);
		}
		return textAjustesDireccion;
	}
	private JTextField getTextAjustesElemento() {
		if (textAjustesElemento == null) {
			textAjustesElemento = new JTextField();
			textAjustesElemento.setEditable(false);
			textAjustesElemento.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesElemento.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesElemento.setColumns(10);
			textAjustesElemento.setBounds(126, 93, 30, 22);
		}
		return textAjustesElemento;
	}
	private JLabel getLblMnVivienda() {
		if (lblMnVivienda == null) {
			lblMnVivienda = new JLabel("=< Vivienda >=");
			lblMnVivienda.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblMnVivienda.setBounds(224, 58, 99, 20);
		}
		return lblMnVivienda;
	}
	private JTextField getTextAjustesMinViv() {
		if (textAjustesMinViv == null) {
			textAjustesMinViv = new JTextField();
			textAjustesMinViv.setEditable(false);
			textAjustesMinViv.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesMinViv.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesMinViv.setColumns(10);
			textAjustesMinViv.setBounds(185, 58, 37, 22);
		}
		return textAjustesMinViv;
	}
	private JTextField getTextAjustesMaxViv() {
		if (textAjustesMaxViv == null) {
			textAjustesMaxViv = new JTextField();
			textAjustesMaxViv.setEditable(false);
			textAjustesMaxViv.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesMaxViv.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesMaxViv.setColumns(10);
			textAjustesMaxViv.setBounds(320, 58, 37, 22);
		}
		return textAjustesMaxViv;
	}
	private JTextField getTextAjustesMinAfect() {
		if (textAjustesMinAfect == null) {
			textAjustesMinAfect = new JTextField();
			textAjustesMinAfect.setEditable(false);
			textAjustesMinAfect.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesMinAfect.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesMinAfect.setColumns(10);
			textAjustesMinAfect.setBounds(185, 92, 37, 22);
		}
		return textAjustesMinAfect;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("=<   Afect.   >=");
			label_6.setFont(new Font("Dialog", Font.PLAIN, 14));
			label_6.setBounds(225, 92, 99, 20);
		}
		return label_6;
	}
	private JTextField getTextAjustesMaxAfect() {
		if (textAjustesMaxAfect == null) {
			textAjustesMaxAfect = new JTextField();
			textAjustesMaxAfect.setEditable(false);
			textAjustesMaxAfect.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesMaxAfect.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesMaxAfect.setColumns(10);
			textAjustesMaxAfect.setBounds(320, 92, 37, 22);
		}
		return textAjustesMaxAfect;
	}
	private JSeparator getSeparator_23() {
		if (separator_23 == null) {
			separator_23 = new JSeparator();
			separator_23.setOrientation(SwingConstants.VERTICAL);
			separator_23.setForeground(Color.DARK_GRAY);
			separator_23.setBounds(170, 28, 9, 95);
		}
		return separator_23;
	}
	private JSeparator getSeparator_24() {
		if (separator_24 == null) {
			separator_24 = new JSeparator();
			separator_24.setOrientation(SwingConstants.VERTICAL);
			separator_24.setForeground(Color.DARK_GRAY);
			separator_24.setBounds(370, 28, 9, 95);
		}
		return separator_24;
	}
	private JLabel getLblMxParedesAfectadas() {
		if (lblMxParedesAfectadas == null) {
			lblMxParedesAfectadas = new JLabel("Paredes afect:");
			lblMxParedesAfectadas.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblMxParedesAfectadas.setBounds(385, 56, 92, 20);
		}
		return lblMxParedesAfectadas;
	}
	private JTextField getTextAjustesCantParedes() {
		if (textAjustesCantParedes == null) {
			textAjustesCantParedes = new JTextField();
			textAjustesCantParedes.setEditable(false);
			textAjustesCantParedes.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesCantParedes.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesCantParedes.setColumns(10);
			textAjustesCantParedes.setBounds(484, 56, 30, 22);
		}
		return textAjustesCantParedes;
	}
	private JLabel getLblMximoDe() {
		if (lblMximoDe == null) {
			lblMximoDe = new JLabel("M\u00E1ximo de");
			lblMximoDe.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblMximoDe.setBounds(385, 86, 92, 20);
		}
		return lblMximoDe;
	}
	private JTextField getTextAjustesCantHab() {
		if (textAjustesCantHab == null) {
			textAjustesCantHab = new JTextField();
			textAjustesCantHab.setEditable(false);
			textAjustesCantHab.setHorizontalAlignment(SwingConstants.CENTER);
			textAjustesCantHab.setFont(new Font("Dialog", Font.PLAIN, 13));
			textAjustesCantHab.setColumns(10);
			textAjustesCantHab.setBounds(484, 92, 30, 22);
		}
		return textAjustesCantHab;
	}
	private JLabel getLblHabitantes_1() {
		if (lblHabitantes_1 == null) {
			lblHabitantes_1 = new JLabel("habitantes:");
			lblHabitantes_1.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblHabitantes_1.setBounds(385, 100, 92, 20);
		}
		return lblHabitantes_1;
	}
	private JTextField getTxtAgregar() {
		if (txtAgregar == null) {
			txtAgregar = new JTextField();
			txtAgregar.setEnabled(false);
			txtAgregar.setHorizontalAlignment(SwingConstants.CENTER);
			txtAgregar.setFont(new Font("Dialog", Font.PLAIN, 15));
			txtAgregar.setText("Agregar nuevo");
			txtAgregar.setBounds(52, 184, 120, 26);
			txtAgregar.setColumns(10);
		}
		return txtAgregar;
	}
	private JTextField getTxtAgregar_1() {
		if (txtAgregar_1 == null) {
			txtAgregar_1 = new JTextField();
			txtAgregar_1.setEnabled(false);
			txtAgregar_1.setHorizontalAlignment(SwingConstants.CENTER);
			txtAgregar_1.setFont(new Font("Dialog", Font.PLAIN, 15));
			txtAgregar_1.setText("Agregar nuevo");
			txtAgregar_1.setColumns(10);
			txtAgregar_1.setBounds(215, 184, 120, 26);
		}
		return txtAgregar_1;
	}
	private JTextField getTxtAgregar_2() {
		if (txtAgregar_2 == null) {
			txtAgregar_2 = new JTextField();
			txtAgregar_2.setEnabled(false);
			txtAgregar_2.setHorizontalAlignment(SwingConstants.CENTER);
			txtAgregar_2.setFont(new Font("Dialog", Font.PLAIN, 15));
			txtAgregar_2.setText("Agregar nuevo");
			txtAgregar_2.setColumns(10);
			txtAgregar_2.setBounds(390, 184, 120, 26);
		}
		return txtAgregar_2;
	}
	private JComboBox<String> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox<String>();
			comboBox.setFont(new Font("Dialog", Font.PLAIN, 15));
			comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Eliminar uno"}));
			comboBox.setEnabled(false);
			comboBox.setBounds(52, 216, 120, 26);
		}
		return comboBox;
	}
	private JComboBox<String> getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox<String>();
			comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 15));
			comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Eliminar uno"}));
			comboBox_1.setEnabled(false);
			comboBox_1.setBounds(215, 216, 120, 26);
		}
		return comboBox_1;
	}
	private JComboBox<String> getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox<String>();
			comboBox_2.setFont(new Font("Dialog", Font.PLAIN, 15));
			comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"Eliminar uno"}));
			comboBox_2.setEnabled(false);
			comboBox_2.setBounds(390, 216, 120, 26);
		}
		return comboBox_2;
	}
	private JTable getTablaMateriales() {
		if (tablaMateriales == null) {
			tablaMateriales = new JTable(){
				private static final long serialVersionUID = 1L;
				public boolean isCellEditable(int rowIndex, int colIndex){
					return false;
				}
			};
			modeloMateriales = new DefaultTableModel();
			Object[] columna = {"ID","Nombre","Precio","Cant/m^2"};
			modeloMateriales.setColumnIdentifiers(columna);
			tablaMateriales.setModel(modeloMateriales);
			tablaMateriales.setEnabled(false);
		}
		return tablaMateriales;
	}
	private JScrollPane getSpTablaMateriales() {
		if (spTablaMateriales == null) {
			spTablaMateriales = new JScrollPane();
			spTablaMateriales.setBounds(58, 285, 265, 95);
			spTablaMateriales.setViewportView(getTablaMateriales());
		}
		return spTablaMateriales;
	}
	private JLabel getLblId_1() {
		if (lblId_1 == null) {
			lblId_1 = new JLabel("ID:");
			lblId_1.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblId_1.setBounds(335, 275, 30, 20);
		}
		return lblId_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Dialog", Font.PLAIN, 13));
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(334, 294, 84, 22);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Dialog", Font.PLAIN, 13));
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(433, 294, 84, 22);
		}
		return textField_1;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblNombre.setBounds(434, 275, 66, 20);
		}
		return lblNombre;
	}
	private JLabel getLblPrecio() {
		if (lblPrecio == null) {
			lblPrecio = new JLabel("Precio:");
			lblPrecio.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblPrecio.setBounds(338, 322, 52, 20);
		}
		return lblPrecio;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setFont(new Font("Dialog", Font.PLAIN, 13));
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(388, 323, 30, 22);
		}
		return textField_2;
	}
	private JLabel getLblUm() {
		if (lblUm == null) {
			lblUm = new JLabel("Unidad:");
			lblUm.setFont(new Font("Dialog", Font.PLAIN, 14));
			lblUm.setBounds(338, 349, 52, 20);
		}
		return lblUm;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setFont(new Font("Dialog", Font.PLAIN, 13));
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(388, 350, 30, 22);
		}
		return textField_3;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("Precio:");
			label_7.setFont(new Font("Dialog", Font.PLAIN, 14));
			label_7.setBounds(433, 322, 52, 20);
		}
		return label_7;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			textField_4.setFont(new Font("Dialog", Font.PLAIN, 13));
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBounds(483, 323, 36, 22);
		}
		return textField_4;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("AGREGAR");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 11));
			btnNewButton.setBounds(433, 351, 86, 29);
			btnNewButton.setBackground(new Color(93, 146, 138));
		}
		return btnNewButton;
	}
}