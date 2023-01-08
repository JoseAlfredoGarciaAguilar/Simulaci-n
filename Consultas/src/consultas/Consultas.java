/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

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
public class Consultas extends JFrame {
            JPanel panel;
        public void Frame(){
            setTitle("Consultas por día ");
            setSize(800,600);
            setLocationRelativeTo(null);
            add(panel);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            
        }
         public void Grafica(int c0,int c1,int c2,int c3,int c4,int c5,int dias){
        panel=new JPanel();
        getContentPane().add(panel);
        DefaultPieDataset Data=new DefaultPieDataset();
        Data.setValue("Consultas 0("+((c0*100)/dias)+")%", c0);
        Data.setValue("Consulta 1("+((c1*100)/dias)+")%", c1);
        Data.setValue("Consultas 2("+((c2*100)/dias)+")%", c2);
        Data.setValue("Consultas 3("+((c3*100)/dias)+")%", c3);
        Data.setValue("Consultas 4("+((c4*100)/dias)+")%", c4);
        Data.setValue("Consultas 5("+((c5*100)/dias)+")%", c5);
        JFreeChart chart = ChartFactory.createPieChart(
         "Grafica Consultas", 
         Data, 
         true, 
         true, 
         false);
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        Consultas c=new Consultas();
        int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,dias,consultadeldia=0;
        double numero;
        DefaultPieDataset Data=new DefaultPieDataset();
        
        System.out.println("  Consultas           Frec.Absoluta(días)          Frec.Relativa            Frec.Relativa Acumulada         Intervalos    ");  
        System.out.println("____________________________________________________________________________________________________________________________");
        System.out.println("|      0           |          10          |           0.5                |         0.05             |        0-0.05        |");
        System.out.println("|      1           |          20          |           0.10               |         0.15             |       0.05-0.15      |");
        System.out.println("|      2           |          40          |           0.20               |         0.35             |       0.15-0.35      |");
        System.out.println("|      3           |          60          |           0.30               |         0.65             |       0.35-0.65      |");
        System.out.println("|      4           |          40          |           0.20               |         0.85             |       0.65-0.85      |");
        System.out.println("|      5           |          30          |           0.15               |         1.00             |       0.85-1.00      |");
        System.out.println("|      Total       |         200          |            1                 |                          |                      |");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println("|    Total         |          1.0         |");
        System.out.println("");
       
        System.out.println("Teclee el numero de dias que desea simular");
        dias=e.nextInt();
        System.out.println("");
        System.out.println("No.           #Aleatorio       Consultas del dia         ");  
        System.out.println("____________________________________________");
        System.out.println("");
        for(int i=1;i<=dias;i++){
        numero=Math.random()*1+0;
        if(numero>=0 && numero<=0.05){
            consultadeldia=0;
            c0++;
        } else  
          if(numero>0.05 && numero<=0.15){
          consultadeldia=1;
          c1++;
        } else
          if(numero>0.15 && numero<=0.35){
          consultadeldia=2;
          c2++;
        } else
          if(numero>0.35 && numero<=0.65){
          consultadeldia=3;
          c3++;
        } else
          if(numero>0.65 && numero<=0.85){
          consultadeldia=4;
          c4++;
        } else{
         if(numero>0.85 && numero<=1){
         consultadeldia=5;
            c5++;
         }}           
        numero=Math.round(numero*1000)/1000d;
        System.out.println(""+i+"               "+numero+"                 "+consultadeldia);   
        }
        c.Grafica(c0, c1, c2, c3, c4, c5,dias);
        c.Frame();

       
    }
    
   
}


