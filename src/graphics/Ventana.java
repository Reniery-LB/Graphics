package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Casa con Gráficos");
		this.setVisible(true);
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);	
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		
		//FONDO
		g2d.setColor(Color.decode("#A1E3F9"));
		g2d.fillRect(0, 0, 800, 800);
		
		//CESPED CAPA 1
		g2d.setColor(Color.decode("#18230F"));
		g2d.fillRect(0, 680, 800, 200);
		//CESPED CAPA 2
		g2d.setColor(Color.decode("#1F7D53"));
		g2d.fillRect(0, 700, 800, 200);
		//TIERRA CAPA 1
		g2d.setColor(Color.decode("#F6F8D5"));
		g2d.fillRect(0, 740, 800, 200);
		//TIERRA CAPA 2
		g2d.setColor(Color.decode("#443627"));
		g2d.fillRect(0, 780, 800, 200);
		
		//BARRAS HORIZONTALES DE LAS REJAS
		g2d.setColor(Color.decode("#504B38"));
		g2d.fillRect(0, 520, 800, 25);
		g2d.fillRect(0, 580, 800, 25);
		
		//CUADRO DE LA CASA
		g2d.setColor(Color.decode("#D98324"));
		g2d.fillRect(200, 320, 400, 300);
		
		//BASE
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillRect(175, 620, 450, 60);
		
		//CHIMENEA
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillRect(500, 200, 60, 120);
		g2d.setColor(Color.GRAY);
		g2d.fillRect(490, 175, 80, 30);
		
		//TECHO
		g2d.setColor(Color.decode("#A31D1D"));
		int [] xs = {350, 150, 650};
		int [] ys = {150, 350, 350};
		g2d.fillPolygon(xs, ys, 3);
		
		//LINEAS DE LA CASA
		g2d.setColor(Color.decode("#EFDCAB"));
		g2d.fillRect(200, 380, 400, 3);
		g2d.fillRect(200, 420, 400, 3);
		g2d.fillRect(200, 460, 400, 3);
		g2d.fillRect(200, 500, 400, 3);
		g2d.fillRect(200, 540, 400, 3);
		g2d.fillRect(200, 580, 400, 3);
		
		//PUERTA
		g2d.setColor(Color.decode("#443627"));
		g2d.fillRect(240, 420, 100, 200);
		
		//MANILLA
		g2d.setColor(Color.WHITE);
		g2d.fillOval(315, 520, 20, 20);
		
		//VENTANA
		g2d.setColor(Color.decode("#A31D1D"));
		g2d.fillRect(460, 400, 100, 100); //MARCO
		g2d.setColor(Color.WHITE);
		g2d.fillRect(465, 405, 90, 90);
		g2d.setColor(Color.decode("#A31D1D"));
		g2d.fillRect(505, 405, 10, 90);
		g2d.setColor(Color.decode("#A31D1D"));
		g2d.fillRect(465, 450, 90, 5);
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillRect(455, 500, 110, 20);
		
		//REJAS
		g2d.setColor(Color.decode("#B9B28A"));
		g2d.fillRect(0, 480, 40, 200);
		g2d.fillRect(60, 480, 40, 200);
		g2d.fillRect(120, 480, 40, 200);
		g2d.fillRect(640, 480, 40, 200);
		g2d.fillRect(700, 480, 40, 200);
		g2d.fillRect(760, 480, 40, 200);
		
		//PUAS DE LAS BARRAS
		int[] xs_1 = {0, 20, 40};
		int[] ys_1 = {480, 450, 480};
		g2d.fillPolygon(xs_1, ys_1, 3);
		
		int[] xs_2 = {60, 80, 100};
		int[] ys_2 = {480, 450, 480};
		g2d.fillPolygon(xs_2, ys_2, 3);
		
		int[] xs_3 = {120, 140, 160};
		int[] ys_3 = {480, 450, 480};
		g2d.fillPolygon(xs_3, ys_3, 3);
		
		int[] xs_4 = {640, 660, 680};
		int[] ys_4 = {480, 450, 480};
		g2d.fillPolygon(xs_4, ys_4, 3);
		
		int[] xs_5 = {700, 720, 740};
		int[] ys_5 = {480, 450, 480};
		g2d.fillPolygon(xs_5, ys_5, 3);
		
		int[] xs_6 = {760, 780, 800};
		int[] ys_6 = {480, 450, 480};
		g2d.fillPolygon(xs_6, ys_6, 3);

	}

}
