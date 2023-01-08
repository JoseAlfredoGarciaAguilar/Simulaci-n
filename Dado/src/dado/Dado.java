/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author memos
 */
public class Dado extends JFrame {
            JPanel panel;
        public void Dado(){
            setTitle("Probabilidad de Caras de un Dado ");
            setSize(800,600);
            setLocationRelativeTo(null);
            add(panel);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            
        }
         public void Grafica(int c1,int c2,int c3,int c4,int c5,int c6,int lanzamiento){
        panel=new JPanel();
        getContentPane().add(panel);
        DefaultPieDataset Data=new DefaultPieDataset();
        Data.setValue("Cara 1 ("+((c1*100)/lanzamiento)+")%", c1);
        Data.setValue("Cara 2 ("+((c2*100)/lanzamiento)+")%", c2);
        Data.setValue("Cara 3 ("+((c3*100)/lanzamiento)+")%", c3);
        Data.setValue("Cara 4 ("+((c4*100)/lanzamiento)+")%", c4);
        Data.setValue("Cara 5 ("+((c5*100)/lanzamiento)+")%", c5);
        Data.setValue("Cara 6 ("+((c6*100)/lanzamiento)+")%", c6);
        JFreeChart chart = ChartFactory.createPieChart(
         "Grafico Dados", 
         Data, 
         true, 
         true, 
         false);
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        Dado d=new Dado();
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,lanzamientos,acierto=0;
        double sexto=0,sexto2=0,numero;
        DefaultPieDataset Data=new DefaultPieDataset();
        System.out.println("Teclee el numero de lanzamiento del dados");
            lanzamientos=e.nextInt();
        System.out.println("  Espacio Muestra         Probabilidad        Probabilidad Acumulativa         Intervalos");  
        System.out.println("______________________________________________________________________________________________");
        System.out.println("|      1           |          1/6          |           1/6               |      0.00-0.16      |");
        System.out.println("|      2           |          1/6          |           2/6               |      0.16-0.33      |");
        System.out.println("|      3           |          1/6          |           3/6               |      0.33-0.50      |");
        System.out.println("|      4           |          1/6          |           4/6               |      0.50-0.66      |");
        System.out.println("|      5           |          1/6          |           5/6               |      0.66-0.83      |");
        System.out.println("|      6           |          1/6          |           6/6               |      0.83-1.00      |");
        System.out.println("______________________________________________________________________________________________");
        System.out.println("|    Total         |          1.0          |");
        System.out.println("");
        System.out.println("  N         #Aleatorio        Lado         ");  
        System.out.println("____________________________________________");
        for(int i=0;i<lanzamientos;i++){
        numero=Math.random()*1+0;
        if(numero>=0 && numero<=0.16){
            acierto=1;
            c1++;
        } else  if(numero>0.16 && numero<=0.33){
            acierto=2;
            c2++;
        } else
             if(numero>0.33 && numero<=0.50){
            acierto=3;
            c3++;
        } else
                  if(numero>0.50 && numero<=0.66){
            acierto=4;
            c4++;
        } else
                       if(numero>0.66 && numero<=0.83){
            acierto=5;
            c5++;
        } else{
            acierto=6;
            c6++;
              }
        numero=Math.round(numero*1000)/1000d;
        System.out.println(""+i+"     "+numero+"     "+acierto+"");  
        }
        d.Grafica(c1, c2, c3, c4, c5, c6,lanzamientos);
        d.Dado();

       
    }
    
   
}


