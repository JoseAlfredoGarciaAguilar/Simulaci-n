package ruleta;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class Ruleta extends JFrame {
      JPanel panel,panel2;
        public void Frame(){
            setTitle("Ruleta ");
            setSize(800,600);
            setLocationRelativeTo(null);
            add(panel,BorderLayout.EAST);
            setDefaultCloseOperation(EXIT_ON_CLOSE);            
        }
        public void Frame2(){
            setTitle("Resultados ");
            setSize(800,600);
            setLocationRelativeTo(null);
            add(panel2,BorderLayout.WEST);
            setDefaultCloseOperation(EXIT_ON_CLOSE); 
        }
        
        
        public void Grafica(int n,float conteo){
        panel=new JPanel();
        getContentPane().add(panel);
        int contador=1;
        DefaultPieDataset Data=new DefaultPieDataset();
        for(int i=0;i<n;i++){
        Data.setValue("Numero "+contador+"("+conteo+")%", conteo);
        contador++;
        }
        JFreeChart chart = ChartFactory.createPieChart(
         "Ruleta", 
         Data, 
         true, 
         true, 
         false);
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
            public void Grafica2(int veces,int Arreglo[],int n){
        panel2 = new JPanel();
        getContentPane().add(panel2);
        int contador=1;
        DefaultPieDataset Data=new DefaultPieDataset();
        for(int i=0;i<n;i++){
        Arreglo[i]=Arreglo[i]*100;
        Data.setValue("Numero "+contador+"("+(Arreglo[i]/veces)+")%", Arreglo[i]);
        contador++;
        }
        JFreeChart chart = ChartFactory.createPieChart(
         "Resultados", 
         Data, 
         true, 
         true, 
         false);
        ChartPanel chartPanel = new ChartPanel(chart);
        panel2.add(chartPanel);
    }
    public static void main(String[] args) {
        Ruleta c= new Ruleta();
        Scanner Lector= new Scanner(System.in);
        float intervalo=0,intervalo2,numero,conteo=0;
        int ganador,partes,posicion=0,veces,n=1;
        float L,parts;
        boolean bandera=false;
        System.out.println("¿Cuantas veces quieres realizar la Simulacion?");
        veces= Lector.nextInt();
        System.out.println("¿Cuantos numeros tendra la ruleta?");
        partes=Lector.nextInt();
         int[] Arreglo=new int[partes];
        parts=partes;
        L=parts-1;
        while(true){
            System.out.println("¿Que numero deeas que caiga?");
            ganador=Lector.nextInt();
            if(ganador<partes && ganador>0)break;
            System.out.println("Teclee opcion valida");
        }
        System.out.println("NO.              |"+"               #Aleatorio              |"+"               NRuleta            |");
        for(int i=1;i<=veces;i++){
        numero=(float) (Math.random()*1);
        numero=(float) (Math.round(numero*100000)/100000d);
        intervalo=0;
        intervalo2=1/parts;
        conteo=1/parts;
        posicion=0;
        n=1;
        while(true){
            if(numero>intervalo && numero<=intervalo2){
                Arreglo[posicion]=Arreglo[posicion]+1;
                bandera=true;
            }
            intervalo=intervalo2;
            intervalo2=intervalo2+conteo;
            if(bandera==true)break;
            else{
            posicion++;
            n++;
            }
        }
        bandera=false;
            System.out.println("   "+i+"                              "+numero+"                                      "+n);

        
    }
        System.out.println("");
         for(int j=0;j<Arreglo.length;j++){
             int variable=ganador-1;
             if(j==variable){
                 float probabilidad= (Arreglo[j]*100)/veces;
                 System.out.println("La probabilidad de que caiga "+ganador+" es= "+probabilidad+"%"); 
             }
         }
         System.out.println("");
        System.out.println("Arreglo");
        for(int j=0;j<Arreglo.length;j++){
        System.out.println(Arreglo[j]);
        }
        
        c.Grafica(partes,conteo);
        c.Frame();
        c.setVisible(true);
        c.Grafica2(veces, Arreglo,partes);
        c.Frame2();
        c.setVisible(true);
        c.setSize(1800,1800);
         
    }
}


