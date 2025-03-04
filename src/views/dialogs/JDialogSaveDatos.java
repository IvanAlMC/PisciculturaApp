package views.dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import controller.Commands;
import general.HandlerLanguage;
import views.AddJTextField2;
import views.Constants;
import views.JButtonsMenuAndDialogs;
import views.MyJFramePpal;

public class JDialogSaveDatos extends JDialog{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> typeArchivo;
    private AddJTextField2 direction;
    private JButtonsMenuAndDialogs buttonAcept, buttonCancel;
    private JRadioButton openFile;
    private JLabel label;
    private JButton button;
    
	 public JDialogSaveDatos(MyJFramePpal frame,ActionListener actionListenner) {
	    	setMinimumSize(new Dimension(455,300));
			setIconImage(new ImageIcon(Constants.ADD_PATH).getImage());
			setLocationRelativeTo(frame);
			setTitle(HandlerLanguage.languageProperties.getProperty(Constants.SAVE_TABLE));
			getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
			setModal(true);
			setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
			getContentPane().setBackground(new Color(40, 40, 40));
			setBackground(new Color(35, 35, 35));
			initComponents(actionListenner);
	    }
	   private void initComponents(ActionListener actionListenner) {
		   addTitle();
		   addJComboBox();
		   addTextField(actionListenner);
		   addJradio();
	       addButtonAceptAndCamcel(actionListenner);
	      
	    }
	   
	   public void changeLanguage() {
		   this.setTitle(HandlerLanguage.languageProperties.getProperty(Constants.SAVE_TABLE));
		   label.setText(HandlerLanguage.languageProperties.getProperty(Constants.SAVE_DATA_EXPORT));
		   direction.setText(HandlerLanguage.languageProperties.getProperty(Constants.ROUTE));
		   button.setText(HandlerLanguage.languageProperties.getProperty(Constants.CHOOSE_ROUTE));
	   }
	   
	   private void addTitle() {
		    Panel panel = new Panel();
		    panel.setPreferredSize(new Dimension(450,30));
		    panel.setBackground(new Color(40, 40, 40));
		    FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
			flowLayout.setHgap(5);
			setLayout(flowLayout);
			panel.setLayout(flowLayout); 
			label = new JLabel();
	    	label.setText(HandlerLanguage.languageProperties.getProperty(Constants.SAVE_DATA_EXPORT));
	    	label.setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 0));
	    	label.setForeground(Color.WHITE);
	    	label.setHorizontalTextPosition(SwingConstants.CENTER);
	    	label.setVerticalTextPosition(SwingConstants.CENTER);
	    	label.setFont(new Font(Constants.FONT_RUBIK, 1, 14));
	    	label.setBackground(new Color(50, 50, 50));
	    	label.setOpaque(true);
	    	panel.add(label);
	    	this.add(panel,BorderLayout.CENTER);
	   }
	   
	   public void addJComboBox() {
		   Panel panel = new Panel();
		   panel.setPreferredSize(new Dimension(450,60));
		    panel.setBackground(new Color(40, 40, 40));
		   FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		   flowLayout.setHgap(5);
		   panel.setLayout(flowLayout); 
		   typeArchivo = new JComboBox<String>();
		   typeArchivo.setBackground(Color.WHITE);
		   typeArchivo.setForeground(Color.WHITE);
		   typeArchivo.setBackground(new Color(90, 90, 90));
		   typeArchivo.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 16));
		   typeArchivo.addItem("PDF");
		   typeArchivo.addItem("JSON");
		   typeArchivo.addItem("XML");
		   typeArchivo.addItem("BINARIO");
		   typeArchivo.setPreferredSize(new Dimension(400,30));
		   panel.add(typeArchivo);
		   add(panel);
	   }
	   
	   public void 	addTextField(ActionListener actionListenner) {
		   Panel panel = new Panel();
		    panel.setBackground(new Color(40, 40, 40));
		   FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		   flowLayout.setHgap(5);
		   panel.setLayout(flowLayout); 
		   panel.setPreferredSize(new Dimension(460,60));
		   direction = new AddJTextField2(HandlerLanguage.languageProperties.getProperty(Constants.ROUTE));
		   direction.setText(HandlerLanguage.languageProperties.getProperty(Constants.ROUTE));
		   direction.setBackground(new Color(90, 90, 90));
		   direction.setForeground(Color.WHITE);
		   button = new JButton();
		   button.setText(HandlerLanguage.languageProperties.getProperty(Constants.CHOOSE_ROUTE));
			button.setPreferredSize(new Dimension(136,40));
			button.addActionListener(actionListenner);
			button.setActionCommand(Commands.OPEN_J_CHOOSER.toString());
			button.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 14));
			button.setBackground(new Color(90, 90, 90));
			button.setForeground(Color.WHITE);
		   panel.setLayout(flowLayout); 
		   panel.add(direction);
		   panel.add(button);
		   add(panel);
	   }
	public void openJFileChooser() {
		JFileChooser dlg =new JFileChooser();
		int opcion = dlg.showSaveDialog(this);
		if(opcion == JFileChooser.APPROVE_OPTION) {
			File f = dlg.getSelectedFile();
			direction.setText(f.toString());
		}
	}
	private void addButtonAceptAndCamcel(ActionListener actionListenner) {
		   Panel panel = new Panel();
		   panel.setBackground(new Color(40, 40, 40));
		   FlowLayout flowLayout=new FlowLayout(FlowLayout.RIGHT);
		   flowLayout.setHgap(16);
		   panel.setLayout(flowLayout); 
		   panel.setPreferredSize(new Dimension(420,40));
			buttonAcept = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.ACCEPT),120,35);
	    	buttonAcept.addActionListener(actionListenner);
	    	buttonAcept.setActionCommand(Commands.ACEPT_SAVE.toString());
	    	buttonAcept.setBackground(new Color(90, 90, 90));
	    	buttonAcept.setForeground(Color.WHITE);
	    	panel.add(buttonAcept);
			buttonCancel = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL),120,35);
			buttonCancel.addActionListener(actionListenner);
			buttonCancel.setActionCommand(Commands.CANCEL_SAVE.toString());
			buttonCancel.setBackground(new Color(90, 90, 90));
			buttonCancel.setForeground(Color.WHITE);
			panel.add(buttonCancel);
			add(panel,BorderLayout.CENTER);
	}
	public void addJradio() {
		 Panel panel = new Panel();
		 panel.setBackground(new Color(40, 40, 40));
		 FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		 flowLayout.setHgap(10);
		 panel.setLayout(flowLayout); 
		 panel.setPreferredSize(new Dimension(420,40));
		 openFile= new JRadioButton("Desea abrir el archivo guardado",false);
		 openFile.setFont(new Font("Calibri", Font.ITALIC, 16));
		 openFile.setBackground(new Color(40, 40, 40));
		 openFile.setForeground(Color.white);
		 panel.add(openFile);
		 add(panel);
	}
	
	public boolean estadoJRadioButton() {
		return openFile.isSelected();
	}
	
	public String estadoTypeArchivo() {
		return (String)typeArchivo.getSelectedItem();
	}
	
	public String getRuta() {
		return direction.getText();
	}
	
	public void clearComponents() {
		direction.setText(null);
	}
}
