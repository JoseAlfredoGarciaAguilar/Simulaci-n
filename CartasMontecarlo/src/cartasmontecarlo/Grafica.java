
package cartasmontecarlo;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class Grafica extends JFrame{
    JPanel panel;

    public void Grafica(int j1,int j2,int j3,int j4,int numjuegos){
        panel=new JPanel();
        getContentPane().add(panel);
        DefaultPieDataset Data=new DefaultPieDataset();
        Data.setValue("Jugador 1("+((j1*100)/numjuegos)+")%", j1);
        Data.setValue("Jugador 2("+((j2*100)/numjuegos)+")%", j2);
        Data.setValue("Jugador 3("+((j3*100)/numjuegos)+")%",j3);
        Data.setValue("Jugador 4("+((j4*100)/numjuegos)+")%", j4);
        
        JFreeChart chart = ChartFactory.createPieChart(
         "Grafica Ganadores", 
         Data, 
         true, 
         true, 
         false);
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
        setVisible(true);
        setSize(1000,700);
        
    }
}
