package diana;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Diana extends JFrame{
public double d;
public int h,j,i,c,a;
    public Diana() {
     setLayout(new BorderLayout());  
     setExtendedState(MAXIMIZED_BOTH);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     Scanner p=new Scanner(System.in);
     System.out.println("dardos:");
     d=p.nextDouble();
      
     }

    public void paint(Graphics g) { 
     g.setColor(Color.red);
     g.drawOval(450,100,500,500);
     g.setColor(Color.blue);
     g.drawRect(450,100,500,500);
     g.setColor(Color.MAGENTA);
     g.drawLine(1050,350,350,350);
     g.drawLine(700,700,700,-700);
        for( int i=1;i<=d;i++){
            double x =ThreadLocalRandom.current().nextDouble(-1, 1);
            double y = ThreadLocalRandom.current().nextDouble(-1, 1);
            if((Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)))<=1  ){
              c=c+1;
         }else{
                a=a+1;
            }
            
        }for(int q=1;q<=c;q++){
                h=ThreadLocalRandom.current().nextInt(550,800);            
                j= (ThreadLocalRandom.current().nextInt(150,400));
            g.fillOval(h,j,9,9 );
        } for(int q=1;q<=a;q++){
            double x =ThreadLocalRandom.current().nextDouble(-1, 1);
            if(x>=0){
                h=ThreadLocalRandom.current().nextInt(0,449);
            }else{
              h=ThreadLocalRandom.current().nextInt(900,1300);  
            }
                j= ThreadLocalRandom.current().nextInt(50,550);
            g.fillOval(h,j,9,9 );   
        }
       
        System.out.println("Aciertos:"+c);
      System.out.println("pi:"+((c/d)*4));
    }
    
        public static void main(String[] args) {
       
       Diana f=new Diana(); 
      f.setVisible(true);
  
    }    
    
}
