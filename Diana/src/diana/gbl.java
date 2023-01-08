/*package diana;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JFrame;
import java.lang.Thread;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class GBL extends JFrame{
public double x, y,k;
public double d;
public int h,j;
    public GBL() {
     setLayout(new BorderLayout());  
     setBackground(Color.PINK);
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
    
        for(int i=1;i<=d;i++){
            x = ThreadLocalRandom.current().nextInt(0, 1370);
            y = ThreadLocalRandom.current().nextInt(25, 735);
          h=(int) x;
          j=(int) y;
            g.fillOval(h,j,9,9 );
             
            try {
            Thread.sleep(1000);
            } catch(InterruptedException ex) {
                
            }
            if ((Math.sqrt(Math.pow(x, 2)))>=450 && (Math.sqrt(Math.pow(x, 2)))<=945 && (Math.sqrt(Math.pow(y, 2)))>=100&& (Math.sqrt(Math.pow(y, 2)))<=595) {   
                k=k+1;
            } 
            else { 
                    }
            System.out.println(x+" y "+y);
            System.out.println(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)));

        }
       System.out.println(k);
        System.out.println("po:"+((k/d)*4));

    } 
    
}

*/