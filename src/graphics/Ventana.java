package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("GRÁFICOS");
		this.setVisible(true);
		this.setSize(900,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);	
	}
	
	//SUPER MARIO BROS 3
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g.create();
		
		//FONDO
		g2d.setColor(Color.decode("#A2F0FF"));
		g2d.fillRect(0, 0, 900, 500);
		
		//BLOQUE 1
		g2d.setColor(Color.BLACK);
		//g2d.fillRect(35, 215, 55, 55);
		g2d.fillRoundRect(35, 215, 55, 55, 1, 1);
		g2d.setColor(Color.decode("#ff8852"));
		g2d.fillRect(40, 220, 50, 50);
		g2d.setColor(Color.BLACK);
		g2d.fillOval(42, 222, 5, 7); //PUNTO IZQUIERDA ARRIBA
		g2d.fillOval(42, 259, 5, 7); //PUNTO IZQUIERDA ABAJO
		g2d.fillOval(82, 222, 5, 7); //PUNTO DERECHA ARRIBA
		g2d.fillOval(82, 259, 5, 7); //PUNTO DERECHA ABAJO
		
		//BLOQUE 2
		g2d.setStroke(new BasicStroke(0)); //BLOQUE
		g2d.setColor(Color.decode("#ff8852"));
		g2d.fillRect(150, 80, 50, 50);
		//-----------------------------------------------
		//CIRCULOS DENTRO DEL BLOQUE
		g2d.setColor(Color.black); //SOMBRA
		g2d.fillOval(148, 90, 15, 14); 
		g2d.setColor(Color.decode("#facac5")); //RELLENO
		g2d.fillOval(146, 88, 14, 14); 
		
		g2d.setColor(Color.black); //SOMBRA
		g2d.fillOval(188, 90, 14, 9); 
		g2d.setColor(Color.decode("#facac5")); //RELLENO
		g2d.fillOval(188, 88, 14, 8); 
		//------------------------------------------------
		g2d.setColor(Color.BLACK); //MARCO
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(147, 79, 55, 53, 3, 3);
		
		g2d.setStroke(new BasicStroke(0));
		g2d.setColor(Color.BLACK);
		g2d.fillOval(152, 82, 5, 7); //PUNTO IZQUIERDA ARRIBA
		g2d.fillOval(152, 120, 5, 7); //PUNTO IZQUIERDA ABAJO
		g2d.fillOval(192, 82, 5, 7); //PUNTO DERECHA ARRIBA
		g2d.fillOval(192, 120, 5, 7); //PUNTO DERECHA ABAJO
		
		//BLOQUE 3
		g2d.setStroke(new BasicStroke(0)); //BLOQUE
		g2d.setColor(Color.decode("#ff8852"));
		g2d.fillRect(204, 80, 51, 50);

		g2d.setColor(Color.BLACK); //MARCO
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(202, 79, 55, 53, 3, 3);
		
		g2d.setStroke(new BasicStroke(0));
		g2d.setColor(Color.BLACK);
		g2d.fillOval(206, 82, 5, 7); //PUNTO IZQUIERDA ARRIBA
		g2d.fillOval(206, 120, 5, 7); //PUNTO IZQUIERDA ABAJO
		g2d.fillOval(247, 82, 5, 7); //PUNTO DERECHA ARRIBA
		g2d.fillOval(247, 120, 5, 7); //PUNTO DERECHA ABAJO
		
		//BLOQUE 4
		g2d.setStroke(new BasicStroke(0)); //BLOQUE
		g2d.setColor(Color.decode("#ff8852"));
		g2d.fillRect(800, 120, 52, 50);
		//-----------------------------------------------
		//CIRCULOS DENTRO DEL BLOQUE
		g2d.setColor(Color.black); //SOMBRA
		g2d.fillOval(798, 131, 15, 14); 
		g2d.setColor(Color.decode("#facac5")); //RELLENO
		g2d.fillOval(796, 129, 14, 14); 
		
		g2d.setColor(Color.black); //SOMBRA
		g2d.fillOval(840, 130, 14, 9); 
		g2d.setColor(Color.decode("#facac5")); //RELLENO
		g2d.fillOval(840, 128, 14, 8); 
		//------------------------------------------------
		g2d.setColor(Color.BLACK); //MARCO
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(798, 120, 55, 52, 3, 3);
		
		g2d.setStroke(new BasicStroke(0));
		g2d.setColor(Color.BLACK);
		g2d.fillOval(802, 123, 5, 7); //PUNTO IZQUIERDA ARRIBA
		g2d.fillOval(802, 160, 5, 7); //PUNTO IZQUIERDA ABAJO
		g2d.fillOval(843, 123, 5, 7); //PUNTO DERECHA ARRIBA
		g2d.fillOval(843, 160, 5, 7); //PUNTO DERECHA ABAJO
		
		//SOMBRA DEL CUADRO COLOR AZUL
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(345, 175, 180, 247, 20, 20);
		
		//CUADRO COLOR AZUL
		g2d.setColor(Color.decode("#71c2ff")); //RELLENO
		g2d.fillRoundRect(310, 150, 180, 270, 20, 20);
		
		g2d.setStroke(new BasicStroke(3)); //CONTORNO
		g2d.setColor(Color.BLACK);
		g2d.drawRoundRect(310, 150, 180, 270, 20, 20);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO IZQUIERDA ARRIBA
		g2d.setColor(Color.BLACK);
		g2d.drawOval(315, 155, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO IZQUIERDA ARRIBA
		g2d.fillOval(315, 155, 15, 15);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO DERECHA ARRIBA
		g2d.setColor(Color.BLACK);
		g2d.drawOval(468, 155, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO DERECHA ARRIBA
		g2d.fillOval(468, 155, 15, 15);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO DERECHA ABAJO
		g2d.setColor(Color.BLACK);
		g2d.drawOval(468, 400, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO DERECHA ABAJO
		g2d.fillOval(468, 400, 15, 15);
		
		//SOMBRA DEL CUADRO COLOR CREMITA
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(265, 280, 150, 143, 20, 20);
		
		//CUADRO COLOR CREMITA
		g2d.setColor(Color.decode("#ffc0b5")); //RELLENO
		g2d.fillRoundRect(204, 260, 180, 160, 20, 20);
		
		g2d.setStroke(new BasicStroke(3)); //CONTORNO
		g2d.setColor(Color.BLACK);
		g2d.drawRoundRect(204, 260, 180, 160, 20, 20);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO IZQUIERDA ARRIBA
		g2d.setColor(Color.BLACK);
		g2d.drawOval(210, 264, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO IZQUIERDA ARRIBA
		g2d.fillOval(210, 264, 15, 15);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO IZQUIERDA ABAJO
		g2d.setColor(Color.BLACK);
		g2d.drawOval(210, 400, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO IZQUIERDA ABAJO
		g2d.fillOval(210, 400, 15, 15);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO DERECHA ARRIBA
		g2d.setColor(Color.BLACK);
		g2d.drawOval(363, 264, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO DERECHA ARRIBA
		g2d.fillOval(363, 264, 15, 15);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO DERECHA ABAJO
		g2d.setColor(Color.BLACK);
		g2d.drawOval(363, 400, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO DERECHA ABAJO
		g2d.fillOval(363, 400, 15, 15);
		
		//CUADRO COLOR VERDE
		g2d.setColor(Color.decode("#00dd5b")); //RELLENO
		g2d.fillRoundRect(750, 260, 180, 160, 20, 20);
	
		g2d.setStroke(new BasicStroke(3)); //CONTORNO
		g2d.setColor(Color.BLACK);
		g2d.drawRoundRect(750, 260, 180, 160, 20, 20);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO IZQUIERDA ARRIBA
		g2d.setColor(Color.BLACK);
		g2d.drawOval(755, 264, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO IZQUIERDA ARRIBA
		g2d.fillOval(755, 264, 15, 15);
		
		g2d.setStroke(new BasicStroke(3)); //MARCO / CIRCULO IZQUIERDA ABAJO
		g2d.setColor(Color.BLACK);
		g2d.drawOval(755, 400, 15, 15);
		g2d.setStroke(new BasicStroke(0)); 
		g2d.setColor(Color.decode("#bdcbcd")); //RELLENO / CIRCULO IZQUIERDA ABAJO
		g2d.fillOval(755, 400, 15, 15);
		
		//TUBO PARTE DE ABAJO
		g2d.setColor(Color.BLACK);
		g2d.fillRect(610, 260, 90, 160);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(613, 315, 3, 155);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(616, 315, 3, 155);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(619, 315, 3, 155);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(622, 315, 8, 155);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(630, 315, 7, 155);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(637, 315, 3, 155);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(640, 315, 32, 155);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(672, 315, 4, 155);
		g2d.setColor(Color.decode("#285334")); //VERDE OSCURO
		g2d.fillRect(679, 315, 4, 155);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(684, 315, 2, 155);
		g2d.setColor(Color.decode("#001d00")); //VERDE MAS OSCURO
		g2d.fillRect(687, 315, 10, 155);
		
		//PLANTA
		try {
			BufferedImage planta = ImageIO.read(new File("planta.png"));
			g2d.drawImage(planta, 625, 165, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TUBO PARTE DE ARRIBA
		g2d.setColor(Color.BLACK);
		g2d.fillRect(600, 260, 110, 50);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(605, 265, 5, 40);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(610, 265, 3, 40);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(613, 265, 3, 40);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(616, 265, 8, 40);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(624, 265, 7, 40);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(631, 265, 2, 40);
		g2d.setColor(Color.decode("#008b00")); //VERDE FUERTE
		g2d.fillRect(633, 265, 32, 40);
		g2d.setColor(Color.decode("#00e555")); //VERDE CLARITO
		g2d.fillRect(665, 265, 4, 40);
		g2d.setColor(Color.decode("#285334")); //VERDE OSCURO
		g2d.fillRect(672, 265, 4, 40);
		g2d.setColor(Color.decode("#285334")); //VERDE OSCURO
		g2d.fillRect(678, 265, 4, 40);
		g2d.setColor(Color.decode("#006900")); //VERDE CLARO FUERTE
		g2d.fillRect(686, 265, 5, 40);
		g2d.setColor(Color.decode("#001d00")); //VERDE MAS OSCURO
		g2d.fillRect(690, 265, 12, 40);
		g2d.setColor(Color.decode("#285334")); //VERDE CLARO
		g2d.fillRect(698, 265, 3, 40);
		
		//MARIO
		try {
			BufferedImage mario = ImageIO.read(new File("mario.png"));
			g2d.drawImage(mario, 460, 338, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ARBUSTO
		try {
			BufferedImage arbusto = ImageIO.read(new File("arbusto.png"));
			g2d.drawImage(arbusto, 35, 370, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//SUELO CAPA 1
		g2d.setColor(Color.decode("#ffc9bd"));
		g2d.fillRect(0, 420, 900, 30);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 420, 900, 5);
		g2d.setColor(Color.decode("#5f2818"));
		g2d.fillRect(0, 450, 900, 5);
		
		//SUELO CAPA 2
		g2d.setColor(Color.decode("#ff9766"));
		g2d.fillRect(0, 455, 900, 340);
		
	}
	
	//CASA CON GRAPHICS 
	/*@Override
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

	} */

}
