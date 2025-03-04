package views.dialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Commands;
import general.HandlerLanguage;
import models.Pond;
import models.FishFarm;
import views.Constants;
import views.JButtonsMenuAndDialogs;
import views.JTextFieldDialog;
import views.MyJFramePpal;

public class JDialogTwo extends JDialog{

    private static final long serialVersionUID = 1L;
    private JTextFieldDialog year,seeded, harvested, weight, production, price;
    private JComboBox<String> species, municipality;
    private JButtonsMenuAndDialogs buttonAcept, buttonCancel;
    private JLabel specieslL, municipalityL;
	
    public JDialogTwo(MyJFramePpal frame,ActionListener actionListenner,String title, String routeImage,boolean editButtons) {
    	setMinimumSize(new Dimension(470,700));
    	setMaximumSize(new Dimension(470,700));
    	getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    	setIconImage(new ImageIcon(routeImage).getImage());
		setLocationRelativeTo(frame);
		setTitle(title);
		setModal(true);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		getContentPane().setBackground(new Color(40, 40, 40));
		setBackground(new Color(35, 35, 35));
		initComponents(actionListenner,editButtons);
    }
    
    public JDialogTwo() {}
      private void initComponents(ActionListener actionListenner,boolean editButtons) {
      	addJComboBoxSpecies();
      	addJComboBoxMunicipality();
    	addJDialogs();
    	if(editButtons == false)
            addButtons(actionListenner);
    }
	
    private void addJDialogs() {
    	Color colorPanel =new Color(40, 40, 40);
    	Panel yearPanel = new Panel();
    	yearPanel.setBackground(colorPanel);
    	year = new JTextFieldDialog(HandlerLanguage.languageProperties.getProperty(Constants.IN_YEAR));
    	yearPanel.add(year);
    	add(yearPanel);
       	Panel seededPanel = new Panel();
		seeded = new JTextFieldDialog(HandlerLanguage.languageProperties.getProperty(Constants.IN_SEEDED_ANIMALS));
		seededPanel.setBackground(colorPanel);
		seededPanel.add(seeded);
		add(seededPanel);
		Panel harvestedPanel = new Panel();
		harvested = new JTextFieldDialog(HandlerLanguage.languageProperties.getProperty(Constants.IN_HARVESTED_ANIMALS));
		harvestedPanel.setBackground(colorPanel);
		harvestedPanel.add(harvested);
		add(harvestedPanel);
		Panel weightPanel = new Panel();
		weight = new JTextFieldDialog(HandlerLanguage.languageProperties.getProperty(Constants.IN_WEIGHT_ANIMALS));
		weightPanel.setBackground(colorPanel);
		weightPanel.add(weight);
		add(weightPanel);
		Panel productionPanel = new Panel();
		production = new JTextFieldDialog(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRODUCTION_ANIMALS));
		productionPanel.setBackground(colorPanel);
		productionPanel.add(production);
		add(productionPanel);
		Panel pricePanel = new Panel();
		price = new JTextFieldDialog(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRICE_ANIMALS));
		pricePanel.setBackground(colorPanel);
		pricePanel.add(price);
		add(pricePanel);
    }
    
    private void addJComboBoxSpecies() {
    	Panel panel = new Panel();
    	panel.setPreferredSize(new Dimension(450,50));
	    panel.setBackground(new Color(40, 40, 40));
	    FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(2);
		panel.setLayout(flowLayout);
    	specieslL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_SPECIE));
    	specieslL.setForeground(Color.WHITE);
    	specieslL.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 14));
    	species = new JComboBox<String>();
       	species.setPreferredSize(new Dimension(380,30));
    	species.setBackground(Color.WHITE);
    	species.setForeground(Color.WHITE);
    	species.setBackground(new Color(90, 90, 90));
    	species.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 14));
    	species.addItem("BOCACHICO");
    	species.addItem("CACHAMA");
    	species.addItem("CARPA");
    	species.addItem("RTRUCHA");
    	species.addItem("TILAPIA NEGRA");
    	species.addItem("TILAPIA O MOJARRA");
    	species.addItem("TILAPIA O MOJARRA ROJA");
    	species.addItem("TRUCHA");
    	species.addItem("UCACHAMA");
    	species.addItem("UTILAPIA NEGRA");
    	species.addItem("UTILAPIA O MOJARRA");
    	species.setFocusable(false);
    	panel.add(specieslL);
    	panel.add(species);
    	add(panel);
    }
	
    private void addJComboBoxMunicipality() {
    	Panel panel = new Panel();
    	 panel.setPreferredSize(new Dimension(450,50));
    	municipalityL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_MUNICIPALITY));
    	municipalityL.setForeground(Color.WHITE);
    	municipalityL.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 16));
    	municipality = new JComboBox<String>();
    	municipality.setBackground(Color.WHITE);
    	municipality.setForeground(Color.WHITE);
    	municipality.setBackground(new Color(90, 90, 90));
    	municipality.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 16));
    	municipality.addItem("ALMEIDA");
		municipality.addItem("AQUITANA");
		municipality.addItem("ARCABUCO");
		municipality.addItem("BELEN");
		municipality.addItem("BERBEO");
		municipality.addItem("BETEITIVA");
		municipality.addItem("BOAVITA");
		municipality.addItem("BOYACA");
		municipality.addItem("BRICE�O");
		municipality.addItem("CAMPOHERMOSO");
		municipality.addItem("CHINAVITA");
		municipality.addItem("CHIQUINQUIRA");
		municipality.addItem("CHISCAS");
		municipality.addItem("CHIVOR");
		municipality.addItem("COPER");
		municipality.addItem("COVARACHIA");
		municipality.addItem("CUBARA");
		municipality.addItem("DUITAMA");
		municipality.addItem("EL COCUY");
		municipality.addItem("GAMEZA");
		municipality.addItem("GARAGOA");
		municipality.addItem("GUACAMAYAS");
		municipality.addItem("GUAYATAN");
		municipality.addItem("GUICAN");
		municipality.addItem("JENESANO");
		municipality.addItem("LABRANZAGRANDE");
		municipality.addItem("LA UVITA");
		municipality.addItem("LA VICTORIA");
		municipality.addItem("MARIPI");
		municipality.addItem("MIRAFLORES");
		municipality.addItem("MONGUI");
		municipality.addItem("MONIQUIRA");
		municipality.addItem("MUZO");
		municipality.addItem("OTANCHE");
		municipality.addItem("PACHAVITA");
		municipality.addItem("PAEZ");
		municipality.addItem("PAIPA");
		municipality.addItem("PAJARITO");
		municipality.addItem("PANQUEBA");
		municipality.addItem("PAUNA");
		municipality.addItem("PAYA");
		municipality.addItem("PAZ DEL RIO");
		municipality.addItem("PESCA");
		municipality.addItem("PISBA");
		municipality.addItem("PUERTO BOYACA");
		municipality.addItem("QUIPAMA");
		municipality.addItem("RAQUIRA");
		municipality.addItem("SABOYA");
		municipality.addItem("SAMACA");
		municipality.addItem("S. EDUARDO");
		municipality.addItem("S. JOSE DE PARE");
		municipality.addItem("S. LUIS DE GACENO");
		municipality.addItem("S. MATEO");
		municipality.addItem("S. PABLO DE BORB");
		municipality.addItem("S. PABLO DE BORBUR");
		municipality.addItem("ST. MARIA");
		municipality.addItem("SANTANA");
		municipality.addItem("ST. ROSA DE VITERBO");
		municipality.addItem("SATIVANORTE");
		municipality.addItem("SATIVASUR");
		municipality.addItem("SOATA");
		municipality.addItem("SOCOTA");
		municipality.addItem("SOGAMOSO");
		municipality.addItem("SOMONDONGO");
		municipality.addItem("SORACA");
		municipality.addItem("SOTAQUIRA");
		municipality.addItem("SUSACON");
		municipality.addItem("SUTAMARCHAN");
		municipality.addItem("TASCO");
		municipality.addItem("TIBANA");
		municipality.addItem("TINJACA");
		municipality.addItem("TOGUI");
		municipality.addItem("TUNUNGUA");
		municipality.addItem("TURMEQUE");
		municipality.addItem("TUTAZA");
		municipality.addItem("UMBITA");
		municipality.addItem("VENTAQUEMADA");
		municipality.addItem("VIRACACHA");
		municipality.addItem("ZETAQUIRA");
		municipality.setFocusable(false);
		municipality.setPreferredSize(new Dimension(380,30));
    	panel.add(municipalityL);
		panel.add(municipality);
		add(panel);
    }

	
    private void addButtons(ActionListener actionListenner) {
    	JPanel panelButtons = createPanel(10);
    	panelButtons.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
    	buttonAcept = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.ACCEPT),120,35);
    	buttonAcept.addActionListener(actionListenner);
    	buttonAcept.setActionCommand(Commands.CLOSE_ADD_DIALOG.toString());
    	buttonAcept.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 14));
    	buttonAcept.setBackground(new Color(90, 90, 90));
    	buttonAcept.setForeground(Color.WHITE);
    	panelButtons.add(buttonAcept);
		buttonCancel = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL),120,35);
		buttonCancel.addActionListener(actionListenner);
		buttonCancel.setActionCommand(Commands.CLOSE_DIALOG_ADD_CANCEL.toString());
		buttonCancel.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 14));
		buttonCancel.setBackground(new Color(90, 90, 90));
		buttonCancel.setForeground(Color.WHITE);
		panelButtons.add(buttonCancel);
		add(panelButtons);
    } 
    
    public void changeLanguage(){
    	year.setBordeText(HandlerLanguage.languageProperties.getProperty(Constants.IN_YEAR));
    	seeded.setBordeText(HandlerLanguage.languageProperties.getProperty(Constants.IN_SEEDED_ANIMALS));
    	weight.setBordeText(HandlerLanguage.languageProperties.getProperty(Constants.IN_HARVESTED_ANIMALS));
    	production.setBordeText(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRODUCTION_ANIMALS));
    	price.setBordeText(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRICE_ANIMALS));
    	specieslL.setText(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_SPECIE));
		municipalityL.setText(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_MUNICIPALITY));
		buttonAcept.setText(HandlerLanguage.languageProperties.getProperty(Constants.ACCEPT));
		buttonCancel.setText(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL));
		
	}
	
    private JPanel createPanel(int separation) {
    	JPanel panel = new JPanel();
    	FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
    	layout.setHgap(separation);
    	panel.setLayout(layout);
		panel.setOpaque(false);
		return panel;
    }
	
    private JLabel createLabel(String text) {
    	JLabel label = new JLabel("<html><b>" +text +"</b></html>");
    	label.setForeground(Color.BLACK);
    	label.setAlignmentX(RIGHT_ALIGNMENT);
    	label.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 14));
    	label.setOpaque(false);
    	return label;
    }
	
    public long getYear() {
    	long yearLong =0;
    	try {
    		yearLong=Long.parseLong(year.getText());
		} catch (NumberFormatException e) {
			yearLong=validaCadena(year.getText());
		}
    	return yearLong;
    }
	private long validaCadena(String text) {
		long newLong =0;
		String newtext="";
		for (int i = 0; i < text.length(); i++) {
			if((int)text.charAt(i)!=32) {
				newtext+=Character.toString(text.charAt(i)); 
			}
			
		}
		newLong=Long.parseLong(newtext);
		return newLong;
	}
    public long getSeeded() {
    	long longSeeded =0;
    	try {
    		longSeeded=Long.parseLong(seeded.getText());
		} catch (NumberFormatException e) {
			longSeeded=validaCadena(seeded.getText());
		}
    	return longSeeded;
    }
	
    public long getHarvested() {
    	long longHarvested =0;
    	try {
    		longHarvested=Long.parseLong(harvested.getText());
		} catch (NumberFormatException e) {
			longHarvested=validaCadena(harvested.getText());
		}
    	return longHarvested;
    }
    
    public long getWeight() {
    	long longWeight =0;
    	try {
    		longWeight=Long.parseLong(weight.getText());
		} catch (NumberFormatException e) {
			longWeight=validaCadena(weight.getText());
		}
    	return longWeight;
    }
    
    public long getProduction() {
    	long longProduction =0;
    	try {
    		longProduction=Long.parseLong(production.getText());
		} catch (NumberFormatException e) {
			longProduction=validaCadena(production.getText());
		}
    	return longProduction;
    }
    
    public long getPrice() {
    	long longPrice =0;
    	try {
    		longPrice=Long.parseLong(price.getText());
		} catch (NumberFormatException e) {
			longPrice=validaCadena(price.getText());
		}
    	return longPrice;
    }
	
    public String getSpecie() {
    	return (String) species.getSelectedItem();
    }
	
    public String getMunicipality() {
    	return (String) municipality.getSelectedItem();
    }
	
    public void clearComponents() {
    	year.setText(Constants.EMPTY);
    	seeded.setText(Constants.EMPTY);
    	harvested.setText(Constants.EMPTY);
    	weight.setText(Constants.EMPTY);
    	production.setText(Constants.EMPTY);
    	price.setText(Constants.EMPTY);
    }
	
	 
    public boolean verifyEmptyComponents() {
    	boolean isEmpty = true;
    	if(year.getText().isEmpty() || seeded.getText().isEmpty() || harvested.getText().isEmpty() || weight.getText().isEmpty() || production.getText().isEmpty() || price.getText().isEmpty()) {
    		isEmpty = false;
    	}
    	return isEmpty;
    }

    public void getInformationPond(Pond pond) {
    	year.setText(Long.toString(pond.getYear()));
    	seeded.setText(Long.toString(pond.getSeeded()));
    	harvested.setText(Long.toString(pond.getHaversted()));
    	weight.setText(Long.toString(pond.getWeight()));
    	production.setText(Long.toString(pond.getProduction()));
    	price.setText(Long.toString(pond.getPrice()));
    	species.setSelectedItem(pond.getSpecie());
    	municipality.setSelectedItem(pond.getMunicipality()); 
    }
	
    public Pond createPond() {
    	return FishFarm.createRunner( getYear(), getMunicipality(), getSpecie(), getSeeded(), getHarvested(), getWeight(), getProduction(), getPrice());
    }
    
    public Object[] createAPond2() {
    	Object[] object = new Object[8];
    	object[1]=Long.toString(getYear());
    	object[2]=getMunicipality();
    	object[3]=getSpecie();
    	object[4]=getSeeded();
    	object[5]=Long.toString(getHarvested());
    	object[6]=Long.toString(getWeight());
    	object[7]=Long.toString(getProduction());
    	object[8]=Long.toString(getPrice());
    	return object;
    }
}
