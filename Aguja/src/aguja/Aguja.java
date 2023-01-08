/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aguja;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import static java.lang.Math.max;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author memos
 */
public class Aguja extends JFrame implements ActionListener{
private static final long serialVersionUID = 1L;
double operacion,Agujas,contador;
JButton boton,boton2;
int a,b,c,d;   
  
   public Aguja(){
       setLayout(new GridBagLayout());
       boton();
       boton2();
       setLocationRelativeTo(null);
       setResizable(false);
            setTitle("Juego");
            setSize(1000,700);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);    
            
       
            
   }
    public void boton(){
        boton = new JButton("Cuadro");
        boton.addActionListener(this);
        boton.setBounds(new Rectangle(200,50,100,100));
        add(boton);
   }
 public void boton2(){
        boton2 = new JButton("lineas");
        boton2.addActionListener(this);
        boton2.setBounds(new Rectangle(200,50,100,100));
        add(boton2);
   }

    
   public void DibujarTabla(){
       Graphics g = getGraphics();
       g.setColor(Color.black);
       g.drawRect(200,50,150, 250);
       g.drawRect(350,50,150, 250); 
       g.drawRect(500,50,150, 250);
       g.drawRect(650,50,150, 250);
   }
   public void lineas(){
       Graphics g=getGraphics();
       for(int i=0;i<Agujas;i++){
          a=ThreadLocalRandom.current().nextInt(200, 800);
          b=ThreadLocalRandom.current().nextInt(50, 250);
    	  c=ThreadLocalRandom.current().nextInt(0, 100);//x2
    	  d=ThreadLocalRandom.current().nextInt(0, 100);//y2
    	  c=a+c;
    	  d=b+d;         
         if((a>200 && c <350) || (a>350 && c<500)|| (a>500 && c<650) || (a>650 && c<800) || (a<200 && c<200) || (a>800 && c>800)){
              if((b>50 && d<300)){
               g.setColor(Color.BLUE);
                 g.drawLine(a,b,c,d);
              }else
                  if(b<50 && d<50){
                   g.setColor(Color.BLUE);
                 g.drawLine(a,b,c,d);
                  }
                     else if(b>300 && d>300){
                          g.setColor(Color.BLUE);
                 g.drawLine(a,b,c,d); 
                      }
          }else
          if(b<50 && d<50){
                   g.setColor(Color.BLUE);
                 g.drawLine(a,b,c,d);
                 
                  }
          else if(a<200 && c>200 && a>180){
              if(b>260 && d>300){
                   g.setColor(Color.BLUE);
                 g.drawLine(a,b,c,d);
                 System.out.println("las cordenadas son b<50 && d<50 verd="+a+","+b+","+c+","+d);
              }
              
          }else{
              g.setColor(Color.RED);
                 g.drawLine(a,b,c,d);
                 contador++;
          }

    	  
      }
       operacion=Agujas/contador;
       System.out.println("La solucion es "+Agujas+"/"+contador+"="+operacion);
       JLabel Resultado=new JLabel("La solucion es "+Agujas+"/"+contador+"="+operacion);
       Font auxFont=Resultado.getFont();
                Resultado.setFont(new Font(auxFont.getFontName(),auxFont.getStyle(),100));
                Resultado.setBounds(new Rectangle(200,200,200,200));
        add(Resultado);
   }
   

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==boton){
           DibujarTabla();
           boton.setEnabled(false);
    }
       if(e.getSource()==boton2){
           lineas();
           boton2.setEnabled(false);
    }
   
}
    public static void main(String[]args){
    Scanner e=new Scanner(System.in);
    Aguja a=new Aguja();
    System.out.println("Teclee numero de agujas");
    a.Agujas=e.nextInt();
    a.setVisible(true);
}
}
    




