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
		this.setSize(1020,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);	
	}
	
	//SUPER MARIO WORLD
	@Override
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g.create();
		
		//FONDO
		g2d.setColor(Color.decode("#0665c0"));
		g2d.fillRect(0, 0, 1020, 800);
		
		g2d.setColor(Color.decode("#f0f5ff"));
		g2d.fillRoundRect(155, 520, 240, 60, 100, 100); //NUBE
		
		//MONTAÑA AZUL CLARO 1
		g2d.setColor(Color.decode("#347397")); //SOMBRA
		g2d.setStroke(new BasicStroke(10));
		g2d.drawOval(30, 200, 220, 150);
		g2d.drawRect(30, 270, 220, 660);
		g2d.setStroke(new BasicStroke(0));
		
		g2d.setColor(Color.decode("#c6e3e7")); //RELLENO
		g2d.fillOval(30, 200, 220, 150);
		g2d.fillRect(30, 270, 220, 600);
		
		g2d.setColor(Color.decode("#f0f5ff"));
		g2d.fillOval(155, 235, 30, 45);
		g2d.fillOval(155, 350, 30, 45);
		g2d.fillOval(55 , 370, 30, 45);
		g2d.fillRoundRect(-100, 285, 300, 60, 100, 100); //NUBE
		
		//MONTAÑA AZUL FUERTE 1
		g2d.setColor(Color.decode("#347397")); //SOMBRA
		g2d.setStroke(new BasicStroke(10));
		g2d.drawOval(0, 430, 200, 150);
		g2d.drawRect(0, 500, 200, 200);
		g2d.setStroke(new BasicStroke(0));
		
		g2d.setColor(Color.decode("#76b2d7")); //RELLENO
		g2d.fillOval(0, 430, 200, 150);
		g2d.fillRect(0, 500, 200, 200);
		
		g2d.setColor(Color.decode("#f0f5ff"));
		g2d.fillRoundRect(300, 460, 240, 60, 100, 100); //NUBE
		
		g2d.setColor(Color.WHITE);
		g2d.fillOval(280, 565, 400, 200);
		
		//MONTAÑA AZUL CLARO 2
		g2d.setColor(Color.decode("#347397")); //SOMBRA
		g2d.setStroke(new BasicStroke(10));
		g2d.drawOval(400, 200, 220, 150);
		g2d.drawRect(400, 270, 220, 660);
		g2d.setStroke(new BasicStroke(0));
		
		g2d.setColor(Color.decode("#c6e3e7")); //RELLENO
		g2d.fillOval(400, 200, 220, 150);
		g2d.fillRect(400, 270, 220, 600);
		
		g2d.setColor(Color.decode("#f0f5ff"));
		g2d.fillOval(425 , 290, 30, 45);
		g2d.fillOval(525 , 250, 30, 45);
		g2d.fillOval(425 , 410, 30, 45);
		g2d.fillRoundRect(250, 340, 240, 60, 100, 100); //NUBE
		g2d.fillRoundRect(750, 240, 240, 60, 100, 100); //NUBE
		g2d.fillRoundRect(855, 175, 160, 60, 100, 100); //NUBE
		g2d.fillRoundRect(855, 450, 160, 60, 100, 100); //NUBE
		
		//MONTAÑA AZUL CLARO 3
		g2d.setColor(Color.decode("#347397")); //SOMBRA
		g2d.setStroke(new BasicStroke(10));
		g2d.drawOval(625, 80, 225, 150);
		g2d.drawRect(625, 150, 225, 700);
		g2d.setStroke(new BasicStroke(0));
		
		g2d.setColor(Color.decode("#c6e3e7")); //RELLENO
		g2d.fillOval(625, 80, 225, 150);
		g2d.fillRect(625, 150, 225, 700);
		
		g2d.setColor(Color.decode("#f0f5ff"));
		g2d.fillRoundRect(500, 380, 240, 60, 100, 100); //NUBE
		
		//MONTAÑA AZUL FUERTE 2
		g2d.setColor(Color.decode("#347397")); //SOMBRA
		g2d.setStroke(new BasicStroke(10));
		g2d.drawOval(400, 450, 230, 200);
		g2d.drawRect(400, 550, 230, 200);
		g2d.setStroke(new BasicStroke(0));
		
		g2d.setColor(Color.decode("#76b2d7")); //RELLENO
		g2d.fillOval(400, 450, 230, 200);
		g2d.fillRect(400, 550, 230, 200);
		
		
		//MONTAÑA AZUL FUERTE 3
		g2d.setColor(Color.decode("#347397")); //SOMBRA
		g2d.setStroke(new BasicStroke(10));
		g2d.drawOval(635, 300, 300, 200);
		g2d.drawRect(635, 400, 300, 500);
		g2d.setStroke(new BasicStroke(0));
		
		g2d.setColor(Color.decode("#76b2d7")); //RELLENO
		g2d.fillOval(635, 300, 300, 200);
		g2d.fillRect(635, 400, 300, 500);
		
		g2d.setColor(Color.decode("#c8e4df"));
		g2d.fillOval(695, 365, 40, 55);
		g2d.fillOval(795, 515, 40, 55);
		
		g2d.setColor(Color.decode("#f0f5ff"));
		g2d.fillOval(655 , 250, 30, 45);
		g2d.fillOval(750 , 120, 30, 45);

		
		g2d.setColor(Color.WHITE);
		g2d.fillOval(720, 565, 400, 200);
		
		//MONTAÑA AZUL FUERTE 4
		g2d.setColor(Color.decode("#347397")); //SOMBRA
		g2d.setStroke(new BasicStroke(10));
		g2d.drawOval(975, 350, 300, 200);
		g2d.drawRect(975, 450, 300, 200);
		g2d.setStroke(new BasicStroke(0));
		
		g2d.setColor(Color.decode("#76b2d7")); //RELLENO
		g2d.fillOval(975, 350, 300, 200);
		g2d.fillRect(975, 450, 300, 200);
		
		//BLOQUE GRIS 1
		g2d.setColor(Color.BLACK); //SOMBRA
		g2d.fillRoundRect(865, 580, 60, 60, 5, 5);
		
		g2d.setColor(Color.decode("#c5c2c8")); //RELLENO
		g2d.fillRoundRect(870, 585, 50, 50, 5, 5);
		
		//BLOQUE GRIS 2
		g2d.setColor(Color.BLACK); //SOMBRA
		g2d.fillRoundRect(865, 525, 60, 60, 5, 5);
		
		g2d.setColor(Color.decode("#c5c2c8")); //RELLENO
		g2d.fillRoundRect(870, 530, 50, 50, 5, 5);
		
		//BLOQUE GRIS 3
		g2d.setColor(Color.BLACK); //SOMBRA
		g2d.fillRoundRect(865, 470, 60, 60, 5, 5);
		
		g2d.setColor(Color.decode("#c5c2c8")); //RELLENO
		g2d.fillRoundRect(870, 475, 50, 50, 5, 5);
		
		//BLOQUE GRIS 4
		g2d.setColor(Color.BLACK); //SOMBRA
		g2d.fillRoundRect(865, 415, 60, 60, 5, 5);
		
		g2d.setColor(Color.decode("#c5c2c8")); //RELLENO
		g2d.fillRoundRect(870, 420, 50, 50, 5, 5);
		
		//BLOQUE DORADO 1
		g2d.setColor(Color.BLACK); //SOMBRA
		g2d.fillRoundRect(920, 415, 60, 60, 5, 5);
		
		g2d.setColor(Color.decode("#f0cc30")); //RELLENO
		g2d.fillRoundRect(925, 420, 50, 50, 5, 5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillOval(935, 435, 7, 15);
		g2d.fillOval(955, 435, 7, 15);
		
		//BLOQUE DORADO 2
		g2d.setColor(Color.BLACK); //SOMBRA
		g2d.fillRoundRect(975, 415, 60, 60, 5, 5);
		
		g2d.setColor(Color.decode("#f0cc30")); //RELLENO
		g2d.fillRoundRect(980, 420, 50, 50, 5, 5);
		
		//TUBO PARTE DE ABAJO GRANDE
		g2d.setColor(Color.BLACK);
		g2d.fillRect(480, 510, 120, 160);
		g2d.setColor(Color.decode("#4f4a89")); //MORADO
		g2d.fillRect(484, 512, 5, 160);
		g2d.setColor(Color.decode("#746fc5")); //MORADO CLARO
		g2d.fillRect(488, 512, 12, 160);
		g2d.setColor(Color.decode("#8985c9")); //MORADO MAS CLARO
		g2d.fillRect(499, 512, 12, 160);
		g2d.setColor(Color.decode("#eaf5f8")); //BLANCO
		g2d.fillRect(511, 512, 16, 160);
		g2d.setColor(Color.decode("#8782d6")); //MORADO
		g2d.fillRect(527, 512, 25, 160);
		g2d.setColor(Color.decode("#4d4e8f")); //MORADO OSCURO
		g2d.fillRect(550, 512, 20, 160);
		g2d.setColor(Color.decode("#222142")); //MORADO MAS OSCURO
		g2d.fillRect(570, 512, 6, 160);
		g2d.setColor(Color.decode("#4d4e8f")); //MORADO OSCURO
		g2d.fillRect(576, 512, 6, 160);
		g2d.setColor(Color.decode("#222142")); //MORADO MAS OSCURO
		g2d.fillRect(582, 512, 8, 160);
		
		//TUBO PARTE DE ARRIBA GRANDE
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(460, 450, 160, 60, 6, 6);
		g2d.setColor(Color.decode("#4f4a89")); //MORADO
		g2d.fillRect(464, 452, 5, 58);
		g2d.setColor(Color.decode("#746fc5")); //MORADO CLARO
		g2d.fillRect(469, 452, 12, 58);
		g2d.setColor(Color.decode("#8985c9")); //MORADO MAS CLARO
		g2d.fillRect(480, 452, 14, 58);
		g2d.setColor(Color.decode("#eaf5f8")); //BLANCO
		g2d.fillRect(488, 452, 16, 58);
		g2d.setColor(Color.decode("#8782d6")); //MORADO
		g2d.fillRect(504, 452, 60, 58);
		g2d.setColor(Color.decode("#4d4e8f")); //MORADO OSCURO
		g2d.fillRect(560, 452, 20, 58);
		g2d.setColor(Color.decode("#222142")); //MORADO MAS OSCURO
		g2d.fillRect(580, 452, 6, 58);
		g2d.setColor(Color.decode("#4d4e8f")); //MORADO OSCURO
		g2d.fillRect(586, 452, 6, 58);
		g2d.setColor(Color.decode("#222142")); //MORADO MAS OSCURO
		g2d.fillRect(592, 452, 20, 58);
		
		//TUBO PARTE DE ABAJO CHICO
		g2d.setColor(Color.BLACK);
		g2d.fillRect(935, 580, 120, 160);
		g2d.setColor(Color.decode("#4f4a89")); //MORADO
		g2d.fillRect(938, 582, 5, 160);
		g2d.setColor(Color.decode("#746fc5")); //MORADO CLARO
		g2d.fillRect(943, 582, 12, 160);
		g2d.setColor(Color.decode("#8985c9")); //MORADO MAS CLARO
		g2d.fillRect(952, 582, 12, 160);
		g2d.setColor(Color.decode("#eaf5f8")); //BLANCO
		g2d.fillRect(964, 582, 16, 160);
		g2d.setColor(Color.decode("#8782d6")); //MORADO
		g2d.fillRect(980, 582, 25, 160);
		g2d.setColor(Color.decode("#4d4e8f")); //MORADO OSCURO
		g2d.fillRect(1000, 582, 20, 160);
		
		//TUBO PARTE DE ARRIBA CHICO
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(925, 520, 160, 60, 6, 6);
		g2d.setColor(Color.decode("#4f4a89")); //MORADO
		g2d.fillRect(928, 522, 5, 57);
		g2d.setColor(Color.decode("#746fc5")); //MORADO CLARO
		g2d.fillRect(933, 522, 12, 57);
		g2d.setColor(Color.decode("#8985c9")); //MORADO MAS CLARO
		g2d.fillRect(945, 522, 14, 57);
		g2d.setColor(Color.decode("#eaf5f8")); //BLANCO
		g2d.fillRect(959, 522, 16, 57);
		g2d.setColor(Color.decode("#8782d6")); //MORADO
		g2d.fillRect(975, 522, 60, 57);
		
		//MARIO
		try {
			BufferedImage planta = ImageIO.read(new File("mario_world.png"));
			g2d.drawImage(planta, 410, 560, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//PIRAÑA
		try {
			BufferedImage planta = ImageIO.read(new File("piraña.png"));
			g2d.drawImage(planta, 515, 350, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ARBUSTO
		try {
			BufferedImage planta = ImageIO.read(new File("arbusto_world.png"));
			g2d.drawImage(planta, 200, 575, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//SUELO
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 637, 1020, 3);
		g2d.setColor(Color.decode("#ca9e5e"));
		g2d.fillRect(0, 640, 1020, 155);
		
		//TRIANGULOS GRANDES
		g2d.setColor(Color.decode("#12cb04"));
		for (int i = 0; i < 26;i++) {
			int baseX = 20 + (i * 40);
			int [] xs = {baseX, baseX - 20, baseX + 20};
			int [] ys = {680, 640, 640};
			g2d.fillPolygon(xs, ys, 3);
		}
		//TRIANGULOS PEQUEÑOS
		g2d.setColor(Color.decode("#176c2f"));
		for (int i = 0; i < 25; i++) {
			int baseX = 40 + (i * 40);
			int [] xs = {baseX, baseX - 10, baseX + 10};
			int [] ys = {670, 640, 640};
			g2d.fillPolygon(xs, ys, 3);
		}
		
		//CIRCULOS DEL SUELO
		g2d.setColor(Color.decode("#e7b96b"));
		g2d.fillOval(30, 676, 15, 30);
		g2d.fillOval(55, 690, 10, 20);
		g2d.fillOval(85, 676, 15, 30);
		g2d.fillOval(120, 690, 10, 20);
		g2d.fillOval(160, 676, 15, 30);
		g2d.fillOval(190, 690, 10, 20);
		g2d.fillOval(230, 676, 15, 30);
		g2d.fillOval(270, 690, 10, 20);
		g2d.fillOval(300, 676, 15, 30);
		g2d.fillOval(350, 690, 10, 20);
		g2d.fillOval(380, 676, 15, 30);
		g2d.fillOval(415, 679, 15, 10);
		g2d.fillOval(440, 690, 10, 20);
		g2d.fillOval(480, 690, 10, 20);
		g2d.fillOval(520, 676, 15, 30);
		g2d.fillOval(560, 676, 15, 30);
		g2d.fillOval(610, 690, 10, 20);
		g2d.fillOval(640, 676, 15, 30);
		g2d.fillOval(680, 690, 10, 20);
		g2d.fillOval(710, 676, 15, 30);
		g2d.fillOval(750, 690, 10, 20);
		g2d.fillOval(30, 750, 50, 30);
		g2d.fillOval(85, 730, 30, 15);
		g2d.fillOval(130, 770, 50, 15);
		g2d.fillOval(190, 750, 50, 30);
		g2d.fillOval(250, 730, 30, 15);
		g2d.fillOval(270, 770, 50, 15);
		g2d.fillOval(320, 750, 80, 30);
		g2d.fillOval(380, 730, 30, 15);
		g2d.fillOval(430, 770, 50, 15);
		g2d.fillOval(540, 750, 80, 30);
		g2d.fillOval(590, 730, 50, 15);
		g2d.fillOval(630, 770, 20, 15);
		g2d.fillOval(680, 750, 30, 30);
		g2d.fillOval(740, 730, 90, 15);
		g2d.fillOval(780, 770, 40, 15);
		g2d.fillOval(790, 676, 15, 30);
		g2d.fillOval(815, 690, 10, 20);
		g2d.fillOval(830, 676, 15, 30);
		g2d.fillOval(865, 690, 10, 20);
		g2d.fillOval(885, 686, 15, 30);
		g2d.fillOval(915, 690, 10, 20);
		g2d.fillOval(935, 686, 15, 30);
		g2d.fillOval(955, 686, 10, 20);
		g2d.fillOval(985, 686, 40, 20);
		g2d.fillOval(875, 770, 50, 15);
		g2d.fillOval(968, 750, 80, 30);
		g2d.fillOval(898, 730, 30, 15);
		
	} 
	
	/*//SUPER MARIO BROS 3
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
		
	} /*
	
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
