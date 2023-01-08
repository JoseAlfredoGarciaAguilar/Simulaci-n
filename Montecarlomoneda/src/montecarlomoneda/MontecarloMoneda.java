/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlomoneda;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

 
public class MontecarloMoneda {

   
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double generado = 0;
        int sello = 0, aguila = 0;
        System.out.print("¿Cuántas veces deseas lanzar la moneda?: ");
        int veces = entrada.nextInt();
        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Resultados    |\t"+"Prob  |\t"+"Prob.Acum  |\t"+"Interválos |"  );
        System.out.println("Sello         |\t"+"0.5   |\t"+"0.5        |\t"+0+"-"+0.5);
        System.out.println("Águila        |\t"+"0.5   |\t"+"1.0        |\t>"+0.5+"-"+1.0);
        System.out.println("Total         |\t"+"1.0");
        System.out.println("-------------------------------------------------------------");
        System.out.println("");
        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.println("N°    # Aleatorio Gen   ¿Qué cayó?");
        for (int i = 1; i <= veces; i++) {
            generado = Math.random() * 1;
            if (generado <= 0.5) {
                System.out.println(i + " -       " + df.format(generado) + "        Sello");
                sello++;
            } else {
                System.out.println(i + " -       " + df.format(generado) + "        Águila");
                aguila++;
            }
        }
        System.out.println();
        System.out.println("Sellos: " + sello);
        System.out.print("Águila: " + aguila);

        DefaultPieDataset valor = new DefaultPieDataset();
        valor.setValue("SELLO", sello);
        valor.setValue("AGUILA", aguila);

        JFreeChart chart = ChartFactory.createPieChart(
                "Monte carlo Moneda",
                valor,
                true,
                true,
                false);

        ChartFrame frame = new ChartFrame("JFreeChart", chart);
        frame.pack();
        frame.setVisible(true);

    }

}
