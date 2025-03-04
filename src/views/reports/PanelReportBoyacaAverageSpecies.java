package views.reports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JPanel;

import org.json.simple.DeserializationException;

import models.TypeSpecie;
import views.Constants;

public class PanelReportBoyacaAverageSpecies extends JPanel{
	private static final long serialVersionUID = 1L;
	private HashMap<String, Double> averageSpeciesPriceInBoyaca;

    public PanelReportBoyacaAverageSpecies(HashMap<String, Double> averageSpeciesPriceInBoyaca) throws IOException, DeserializationException {
    	this.averageSpeciesPriceInBoyaca=averageSpeciesPriceInBoyaca;
    	setPreferredSize(new Dimension(1000,530));
        initComponents();
        setBackground(new Color(15, 15, 15));
    }
    
                    
    private void initComponents() {
        repaint();  
    }
                
    public void datas() {
    	
    }
    public int maxValue(int value_red, int value_green, int value_blue, int value_orange, int value_yellow, int value_pink, int value_gray, int value_cian, int value_magenta, int value_black, int value_lightGrey){
        if(value_red > value_green && value_red > value_blue && value_red > value_orange && value_red > value_yellow && value_red > value_pink && value_red > value_gray && value_red > value_cian && value_red > value_magenta && value_red > value_black && value_red > value_lightGrey){    
            return value_red;
        } else if(value_green > value_blue && value_green > value_orange && value_green > value_yellow && value_green > value_pink && value_green > value_gray && value_green > value_cian && value_green > value_magenta && value_green > value_black && value_green > value_lightGrey){
            return value_green;
        } else if(value_blue > value_orange && value_blue > value_yellow && value_blue > value_pink && value_blue > value_gray && value_blue > value_cian && value_blue > value_magenta && value_blue > value_black && value_blue > value_lightGrey){
            return value_blue;
        } else if(value_orange > value_yellow && value_orange > value_pink && value_orange > value_gray && value_orange > value_cian && value_orange > value_magenta && value_orange > value_black && value_orange > value_lightGrey){
            return value_orange;
        } else if(value_yellow > value_pink && value_yellow > value_gray && value_yellow > value_cian && value_yellow > value_magenta && value_yellow > value_black && value_yellow > value_lightGrey){
            return value_yellow;
        } else if(value_pink > value_gray && value_pink > value_cian && value_pink > value_magenta && value_pink > value_black && value_pink > value_lightGrey){
            return value_pink;
        } else if(value_gray > value_cian && value_gray > value_magenta && value_gray > value_black && value_gray > value_lightGrey){
            return value_gray;
        } else if(value_cian > value_magenta && value_cian > value_black && value_cian > value_lightGrey){
            return value_cian;
        } else if(value_magenta > value_black && value_magenta > value_lightGrey){
            return value_magenta;
        } else if(value_black > value_lightGrey){
            return value_black;
        }else {
        	return value_lightGrey;
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
  
            int long_red = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.BOCACHICO.getName())+500)/50;
            int long_green = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.CACHAMA.getName())+500)/50;
            int long_blue = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.CARPA.getName())+500)/50;
            int long_orange = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.RTRUCHA.getName())+500)/50;
            int long_yellow = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_NEGRA.getName())+500)/50;
            int long_pink = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA.getName())+500)/50;
            int long_gray = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA_ROJA.getName())+500)/50;
            int long_cian = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TRUCHA.getName())+500)/50;
            int long_magenta = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.UCACHAMA.getName())+500)/50;
            int long_black = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_NEGRA.getName())+500)/50;
            int long_lightGray = (int)((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_O_MOJARRA.getName())+500)/50;
            
            g.setColor(Color.RED);
            g.fillRect(300, 40, long_red, 30);
            g.drawString(Constants.BOCACHICO + " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.BOCACHICO.getName())), 6, 60);
        
            g.setColor(Color.GREEN);
            g.fillRect(300, 80, long_green, 30);
            g.drawString(Constants.CACHAMA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.CACHAMA.getName())), 6, 100);
            
            g.setColor(Color.BLUE);
            g.fillRect(300, 120, long_blue, 30);
            g.drawString(Constants.CARPA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.CARPA.getName())), 6, 140);
            
            g.setColor(Color.ORANGE);
            g.fillRect(300, 160, long_orange, 30);
            g.drawString(Constants.RTRUCHA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.RTRUCHA.getName())), 6, 180);
            
            g.setColor(Color.YELLOW);
            g.fillRect(300, 200, long_yellow, 30);
            g.drawString(Constants.TILAPIA_NEGRA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_NEGRA.getName())), 6, 220);
            
            g.setColor(Color.PINK);
            g.fillRect(300, 240, long_pink, 30);
            g.drawString(Constants.TILAPIA_O_MOJARRA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA.getName())), 6, 260);
            
            g.setColor(Color.GRAY);
            g.fillRect(300, 280, long_gray, 30);
            g.drawString(Constants.TILAPIA_O_MOJARRA_ROJA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA_ROJA.getName())), 6, 300);
            
            g.setColor(Color.CYAN);
            g.fillRect(300, 320, long_cian, 30);
            g.drawString(Constants.TRUCHA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.TRUCHA.getName())), 6, 340);
            
            g.setColor(Color.MAGENTA);
            g.fillRect(300, 360, long_magenta, 30);
            g.drawString(Constants.UCACHAMA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.UCACHAMA.getName())), 6, 380);
            
            g.setColor(Color.WHITE);
            g.fillRect(300, 400, long_black, 30);
            g.drawString(Constants.UTILAPIA_NEGRA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_NEGRA.getName())), 6, 420);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(300, 440, long_lightGray, 30);
            g.drawString(Constants.UTILAPIA_O_MOJARRA+ " : " +String.valueOf((double)averageSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_O_MOJARRA.getName())), 6, 460);
            
    }
    
    @Override  
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int w2 = getWidth() / 2;
        int h2 = getHeight() / 2;
        g2d.rotate(-Math.PI / 5, w2, h2);
        super.paintComponent(g);
    }
}
