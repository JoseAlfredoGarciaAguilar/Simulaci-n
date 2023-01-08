package borrachos;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Borrachos extends JFrame {

    double random,proba;
    public int exitos = 0, a = 0, b = 0, x, y;
    int cuantas;
    
    Scanner entrada = new Scanner(System.in);

    public Borrachos() {
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);

        System.out.println("Direccion | Probabilidad | Prob. Acumulada");
        System.out.println("Norte     |     0.25     |       0.25     ");
        System.out.println("Sur       |     0.25     |       0.50     ");
        System.out.println("Este      |     0.25     |       0.75     ");
        System.out.println("Oeste     |     0.25     |         1      ");

        System.out.println();

    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.red);
        for (int p = 0; p < 20; p++) {
            g.drawRect(0, (p * 25), 500, 0);
        }
        for (int p = 0; p < 20; p++) {
            g.drawRect((p * 25), 0, 0, 500);
        }
        g.setColor(Color.blue);
        g.drawRect(0, 250, 500, 0);
        g.drawRect(250, 0, 0, 500);
        String direccion = "";
        System.out.print("¿Cuántas veces deseas realizar la simulación?: ");
        cuantas = entrada.nextInt();

        DecimalFormat df = new DecimalFormat("0.000000");
        for (int p = 1; p <= cuantas; p++) {
            System.out.println();
            System.out.println("Tabla " + p);
            System.out.println("#Cuadras	|	#Ale. Gen 	|    Direccion	 |    Localizacion (X, Y)");
            x = 0;
            y = 0;
            for (int i = 1; i <= 10; i++) {
                random = Math.random() * 1;
                if (random <= 0.25) {
                    direccion = "N";
                    y++;
                }
                if (random > 0.25 && random <= 0.50) {
                    direccion = "S";
                    y--;
                }
                if (random > 0.50 && random <= 0.75) {
                    direccion = "E";
                    x++;
                }
                if (random > 0.75 && random <= 1) {
                    direccion = "O";
                    x--;
                }

                System.out.println(i + "			" + df.format(random) + "		" + direccion + "		" + "(" + x
                        + "," + y + ")");

            }
            if (x >= 1) {
                System.out.println("Sí fue Exito");
                exitos++;
            } else {
                System.out.println("No fue Exito");

            }

            if (x >= 0) {
                a = ((x + 10) * 25);
            } else {
                a = ((10 + x) * 25);
            }
            if (y >= 0) {
                b = ((10 - y) * 25);
            } else {
                b = ((y * (-1) + 10) * 25);
            }

            g.setColor(Color.red);
            g.fillOval(a, b, 10, 10);

        }
        proba=(exitos*100)/cuantas;
        System.out.println("");
        System.out.println("totales de exitos: "+exitos);
        System.out.println("Probabilidad de exito: "+proba+"%");

    }

    public static void main(String[] args) {
        Borrachos mb = new Borrachos();
        mb.setVisible(true);
    }
}
    
    

