package paracaidista;
import java.util.Scanner;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class Paracaidista {
 
    public static void main(String[] args) {
        Scanner e =new Scanner(System.in); 
        double g=9.81,c,m,division,multiplicacion,v=0,v1=0,t=0,multi;
        System.out.println("                  Instituto Tecnológico de Culiacán");
        System.out.println("                          Simulacion");
        System.out.println("");
        System.out.print("Tecleé valor de masa ");
        m=e.nextDouble();
        System.out.print("Tecleé valor del constante");
        c=e.nextDouble();
        System.out.println("");
         System.out.println("t" +  "\tv");
        System.out.println("_______________________________________"); //H
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        while(true){
        v1=v;
        division=((g*m)/c);
        multi=(-c/m)*t;
        multiplicacion=(1-(Math.pow(Math.E,multi)));
        v=division*multiplicacion;
        v=Math.round(v*10000)/10000d;
            //System.out.printf("%1.0f\t  %1.15f\t ",t,v);
            System.out.printf(t+"\t"+v);
            System.out.println("");
                dataset.addValue(v, "Velociadad*Tiempo", t+"segundos");
             t++;
        if(v1==v && v1!=0 && v!=0)break;
        }
         JFreeChart lineChart = ChartFactory.createLineChart(
                                "Grafica Lineal",
                                "Velocidad",
                                "Tiempo",
                                dataset,
                                PlotOrientation.VERTICAL, true, true, false);
 
 
               
                ChartPanel panel = new ChartPanel(lineChart);
 
               
               
                // Creamos la ventana
                JFrame ventana = new JFrame("Grafica");
                ventana.setVisible(true);
                ventana.setSize(800, 600);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
                ventana.add(panel);
 
        }



    }    
    
    
        
    
