package CelularesMontecarlo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class CelularesMontecarlo extends JFrame {
      JPanel panel;
        public void Frame(){
            setTitle("Consultas por día ");
            setSize(800,600);
            setLocationRelativeTo(null);
            add(panel);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            
        }
        
        
          public void Grafica(int veces,int c100,int c150,int c200,int c250,int c300){
        panel=new JPanel();
        getContentPane().add(panel);
        DefaultPieDataset Data=new DefaultPieDataset();
        Data.setValue("100 celulares("+((c100*100)/veces)+")%", c100);
        Data.setValue("150 celulares("+((c150*100)/veces)+")%", c150);
        Data.setValue("200 celulares("+((c200*100)/veces)+")%", c200);
        Data.setValue("250 celulares("+((c250*100)/veces)+")%", c250);
        Data.setValue("300 celulares("+((c300*100)/veces)+")%", c300);
      
        JFreeChart chart = ChartFactory.createPieChart(
         "Grafica Celulares", 
         Data, 
         true, 
         true, 
         false);
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    public static void main(String[] args) {
        ArrayList <Double> CEL=new ArrayList<Double>();
        CelularesMontecarlo c= new CelularesMontecarlo();
        Scanner Lector= new Scanner(System.in);
        double numero,suma=0,media,sumatoria,varianza = 0,desviacion;
        int vendidos = 0;
        int devueltos=0;
        int costo=0;
        double utilidad=0;
        double IngXvta=0;
        double IngXdev=0;
        int c100 = 0,c150=0,c200=0,c250=0,c300=0;
        int celulares;
        System.out.println("¿Cuantas veces quieres realizar la Simulacion?");
        int veces= Lector.nextInt();
        while(true){
        System.out.println("¿Celulares a Comprar?");
        System.out.println("El numero ingresado debe ser 100,150,200,250 o 300");
        celulares= Lector.nextInt();
            if(celulares==100 || celulares==150||celulares==200||celulares==250||celulares==300)break;
            System.out.println("Teclee un numero valido");
        }
        System.out.println("  Cel.vendidos           probabilidad          probabilidad  acumulada      ");  
        System.out.println("____________________________________________________________________________");
        System.out.println("|      100         |          .30        |           0.30               |   ");
        System.out.println("|      150         |          .20        |           0.50               |   ");
        System.out.println("|      200         |          .30        |           0.80               |   ");
        System.out.println("|      250         |          .15        |           0.95               |   ");
        System.out.println("|      300         |          .05        |           0.100              |   ");
        System.out.println("____________________________________________________________________________");
        System.out.println("|    Total         |          1.0        |");
        System.out.println("");
        System.out.println("NO.              |"+"               #Aleatorio              |"+"               Celulares Vendidos              |"+"               Celulares devueltos              |"+"               Costo             |"+"               IngXvta             |"+"               IngXdev             |"+"               Utilidad             |");
        for(int i=1;i<=veces;i++){
        IngXvta=0;
        IngXdev=0;
        utilidad=0;
        numero=Math.random()*1;
        if(numero>=0 && numero<=0.3){
        vendidos=100;
        }

        if(numero>0.3 && numero<=0.5){
           vendidos=150;
        }
        if(numero>0.5 && numero<=0.8){
        vendidos=200;
        }
        if(numero>0.8 && numero<=0.95){
        vendidos=250;
        }
        if(numero>0.95 && numero<=1){
        vendidos=300;
        }
        
      if(celulares<vendidos){
       vendidos=celulares;
        }
      if(celulares>vendidos){
          devueltos=celulares-vendidos;
      }
      if(vendidos==100)
           c100++;
       else if(vendidos==150)
           c150++;
       else if(vendidos==200)
           c200++;
       else if(vendidos==250)
           c250++;
       else if(vendidos==300)
           c300++;
      numero=Math.round(numero*100000)/100000d;
       costo=75*(celulares);
       IngXvta=100*(vendidos);
       IngXdev=25*(devueltos);
       utilidad=(IngXvta+IngXdev)-costo;
       CEL.add(utilidad);
            System.out.println(""+i+"                                "+numero+"                                      "+vendidos+"                                               "+devueltos+"                                      $"+costo+"                           $"+IngXvta+"                              $"+IngXdev+"                             $"+utilidad);   
    }
        for(int i=0;i<CEL.size();i++){
            suma=suma+CEL.get(i);
        }
        media=suma/veces;
        for(int i=0;i<CEL.size();i++){
            sumatoria=(Math.pow(CEL.get(i)-media, 2));
            varianza=varianza+sumatoria;            
        }
        varianza=varianza/veces;
        desviacion=Math.sqrt(varianza);
        desviacion=Math.rint(desviacion*100)/100;
        System.out.println("La media es: "+media);
        System.out.println("La varianza es: "+varianza);
        System.out.println("La desviacion estandar es "+desviacion);
        c.Grafica(veces,c100, c150, c200, c250, c300);
        c.Frame();
    }
}
