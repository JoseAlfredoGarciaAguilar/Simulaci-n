
package cartasmontecarlo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;



public class CartasMontecarlo extends javax.swing.JFrame implements ActionListener{
Grafica g = new Grafica();
public float probabilidadp= 0.25f,probabilidadn=0.1f,pacumuladop= 0.25f,pinicialp=0,pacumuladan,pinicialn;
public double numero,palo;
public static int n=40,p=1,c=0,num,numjuego=1,conta=0,contador=1,carta=1,j1=0,j2=0,j3=0,j4=0,ganador=0,rconta=0,repe=0,juegos;
public int cm1=0,cm2=0,cm3=0,cm4=0,m1=0,m2=0,m3=0,m4=0;
int posicion;
int tipopalo;
int []Jugador1= new int [10]; 
int []Jugador2= new int [10]; 
int []Jugador3= new int [10]; 
int []Jugador4= new int [10];

int []J1numero= new int [10]; 
int []J2numero= new int [10]; 
int []J3numero= new int [10]; 
int []J4numero= new int [10];


int []J1palos= new int [10]; 
int []J2palos= new int [10]; 
int []J3palos= new int [10]; 
int []J4palos= new int [10];

int[]repetidas=new int[40];





private JButton boton;

   public CartasMontecarlo(){
      
       setLayout(new BorderLayout());
       InitComponents();
       setLocationRelativeTo(null);
       setResizable(false);
            setTitle("Juego");
            setSize(1000,700);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);    
          
       
            
   }
   private void InitComponents() {
       //agregando imagen
      
       boton();
    
   }
   public void boton(){
       boton = new JButton("Comenzar");
        boton.addActionListener(this);
        add(boton,BorderLayout.NORTH);
   }
   
   
   
    
public void vaciararreglos(int arreglo[]){
    for(int i=0;i<10;i++){
    arreglo[i]=0;
}
}
public void llenararrepetidos(int arreglo[]){
    for(int i=0;i<40;i++){
        arreglo[i]=41;
    }
}
public void metodo(){
    Graphics grafico = getGraphics();
        Dimension height = getSize();
        ImageIcon [] cartasiconos= new ImageIcon[40];
cartasiconos[0]= new ImageIcon(getClass().getResource("/imagenes/1oro.jpg"));
cartasiconos[1]= new ImageIcon(getClass().getResource("/imagenes/2oro.jpg"));
cartasiconos[2]= new ImageIcon(getClass().getResource("/imagenes/3oro.jpg"));
cartasiconos[3]= new ImageIcon(getClass().getResource("/imagenes/4oro.jpg"));
cartasiconos[4]= new ImageIcon(getClass().getResource("/imagenes/5oro.jpg"));
cartasiconos[5]= new ImageIcon(getClass().getResource("/imagenes/6oro.jpg"));
cartasiconos[6]= new ImageIcon(getClass().getResource("/imagenes/7oro.jpg"));
cartasiconos[7]= new ImageIcon(getClass().getResource("/imagenes/10oro.jpg"));
cartasiconos[8]= new ImageIcon(getClass().getResource("/imagenes/11oro.jpg"));
cartasiconos[9]= new ImageIcon(getClass().getResource("/imagenes/12oro.jpg"));
cartasiconos[10]= new ImageIcon(getClass().getResource("/imagenes/1c.jpg"));
cartasiconos[11]= new ImageIcon(getClass().getResource("/imagenes/2c.jpg"));
cartasiconos[12]= new ImageIcon(getClass().getResource("/imagenes/3c.jpg"));
cartasiconos[13]= new ImageIcon(getClass().getResource("/imagenes/4c.jpg"));
cartasiconos[14]= new ImageIcon(getClass().getResource("/imagenes/5c.jpg"));
cartasiconos[15]= new ImageIcon(getClass().getResource("/imagenes/6c.jpg"));
cartasiconos[16]= new ImageIcon(getClass().getResource("/imagenes/7c.jpg"));
cartasiconos[17]= new ImageIcon(getClass().getResource("/imagenes/10c.jpg"));
cartasiconos[18]= new ImageIcon(getClass().getResource("/imagenes/11c.jpg"));
cartasiconos[19]= new ImageIcon(getClass().getResource("/imagenes/12c.jpg"));
cartasiconos[20]= new ImageIcon(getClass().getResource("/imagenes/1e.jpg"));
cartasiconos[21]= new ImageIcon(getClass().getResource("/imagenes/2e.png"));
cartasiconos[22]= new ImageIcon(getClass().getResource("/imagenes/3e.jpg"));
cartasiconos[23]= new ImageIcon(getClass().getResource("/imagenes/4e.jpg"));
cartasiconos[24]= new ImageIcon(getClass().getResource("/imagenes/5e.jpg"));
cartasiconos[25]= new ImageIcon(getClass().getResource("/imagenes/6e.jpg"));
cartasiconos[26]= new ImageIcon(getClass().getResource("/imagenes/7e.jpg"));
cartasiconos[27]= new ImageIcon(getClass().getResource("/imagenes/10e.jpg"));
cartasiconos[28]= new ImageIcon(getClass().getResource("/imagenes/11e.jpg"));
cartasiconos[29]= new ImageIcon(getClass().getResource("/imagenes/12e.jpg"));
cartasiconos[30]= new ImageIcon(getClass().getResource("/imagenes/1b.jpg"));
cartasiconos[31]= new ImageIcon(getClass().getResource("/imagenes/2b.jpg"));
cartasiconos[32]= new ImageIcon(getClass().getResource("/imagenes/3b.jpg"));
cartasiconos[33]= new ImageIcon(getClass().getResource("/imagenes/4b.jpg"));
cartasiconos[34]= new ImageIcon(getClass().getResource("/imagenes/5b.jpg"));
cartasiconos[35]= new ImageIcon(getClass().getResource("/imagenes/6b.jpg"));
cartasiconos[36]= new ImageIcon(getClass().getResource("/imagenes/7b.jpg"));
cartasiconos[37]= new ImageIcon(getClass().getResource("/imagenes/10b.jpg"));
cartasiconos[38]= new ImageIcon(getClass().getResource("/imagenes/11b.jpg"));
cartasiconos[39]= new ImageIcon(getClass().getResource("/imagenes/12b.jpg"));
ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/tablero.png")); 
ImageIcon Logo= new ImageIcon(getClass().getResource("/imagenes/logo.png"));
ImageIcon J1 = new ImageIcon(getClass().getResource("/imagenes/jugador1.png")); 
ImageIcon J2= new ImageIcon(getClass().getResource("/imagenes/jugador2.png"));
ImageIcon J3= new ImageIcon(getClass().getResource("/imagenes/jugador3.png"));
ImageIcon J4= new ImageIcon(getClass().getResource("/imagenes/jugador4.png"));
ImageIcon ParteTrasera= new ImageIcon(getClass().getResource("/imagenes/partetrasera.png"));
ImageIcon ParteTraserab= new ImageIcon(getClass().getResource("/imagenes/partetraserab.png"));
ImageIcon basto= new ImageIcon(getClass().getResource("/imagenes/basto.png"));
ImageIcon oro= new ImageIcon(getClass().getResource("/imagenes/moneda.png"));
ImageIcon espada= new ImageIcon(getClass().getResource("/imagenes/espada.png"));
ImageIcon copa= new ImageIcon(getClass().getResource("/imagenes/copa.png"));
ImageIcon moneda2= new ImageIcon(getClass().getResource("/imagenes/monedas2.png"));
ImageIcon moneda= new ImageIcon(getClass().getResource("/imagenes/monedas1.png"));
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);


//partes traseras de arriba
grafico.drawImage(moneda2.getImage(), 650, 300, 150, 150, null);
grafico.drawImage(moneda.getImage(), 250, 300, 150, 150, null);
grafico.drawImage(Logo.getImage(),340,300,350, 150, null);
grafico.drawImage(J1.getImage(),400,170,70, 70, null);
grafico.drawImage(J2.getImage(),400,500,70, 70, null);
grafico.drawImage(J3.getImage(),160,450, 70, 70, null);
grafico.drawImage(J4.getImage(),780,450,70, 70, null);
vacio(contador,Img,ParteTrasera,ParteTraserab,oro,copa,espada,basto);

 juegos=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos Juegos se van a jugar?"));
for(int i=1;i<=juegos;i++){
cm1=0;
cm2=0;
cm3=0;
cm4=0;
    llenararrepetidos(repetidas);
    vaciararreglos(Jugador1);
    vaciararreglos(Jugador2);
vaciararreglos(Jugador3);
vaciararreglos(Jugador4);
vaciararreglos(J1numero);
vaciararreglos(J2numero);
vaciararreglos(J3numero);
vaciararreglos(J4numero);
vaciararreglos(J1palos);
vaciararreglos(J2palos);
vaciararreglos(J3palos);
vaciararreglos(J4palos);
        conta=0;
        contador=1;
        rconta=0;
while(contador!=11){
vacio(contador,Img,ParteTrasera,ParteTraserab,oro,copa,espada,basto);

grafico.drawImage(ParteTrasera.getImage(), 500,170, 70, 90, null);
grafico.drawImage(ParteTrasera.getImage(), 500,500, 70, 90, null);
grafico.drawImage(ParteTrasera.getImage(), 160,350, 70, 90, null);
grafico.drawImage(ParteTrasera.getImage(), 780,350, 70, 90, null);

operacion(Jugador1,J1palos,J1numero);
    System.out.println("jugador 1 Su carta es ="+repetidas[rconta]);
rconta++;
operacion(Jugador2,J2palos,J2numero);
    System.out.println("Jugador 2 Su carta es ="+repetidas[rconta]);

rconta++;
operacion(Jugador3,J3palos,J3numero);
    System.out.println("Jugador 3 Su carta es ="+repetidas[rconta]);
rconta++;
operacion(Jugador4,J4palos,J4numero);
    System.out.println("Jugador 4 Su carta es ="+repetidas[rconta]);
rconta++;
    System.out.println("");
//JOptionPane.showMessageDialog(this, "Comienza el Juego "+contador, "Mensaje",JOptionPane.INFORMATION_MESSAGE);

grafico.drawImage(cartasiconos[Jugador1[conta]].getImage(), 500,170, 70, 90, null);
grafico.drawImage(cartasiconos[Jugador2[conta]].getImage(), 500,500, 70, 90, null);
grafico.drawImage(cartasiconos[Jugador3[conta]].getImage(), 160,350, 70, 90, null);
grafico.drawImage(cartasiconos[Jugador4[conta]].getImage(), 780,350, 70,90, null);
ganador(J1palos, J2palos, J3palos, J4palos, J1numero, J2numero, J3numero,J4numero, conta);
JOptionPane.showMessageDialog(this, "Juego: "+i+", Mano: "+contador+", El ganador de la mano es el jugador "+ganador, "Mensaje",JOptionPane.INFORMATION_MESSAGE);
if(ganador==1){
    m1++;
    cm1++;
}if(ganador==2){
    m2++;
    cm2++;
}
if(ganador==3){
    m3++;
    cm3++;
}
if(ganador==4){
    m4++;
    cm4++;
}
contador++;
conta++;
}
    System.out.println("******Juego "+i+"********");
    System.out.println("jugador 1 manos ganadas:"+cm1);
    System.out.println("jugador 2 manos ganadas:"+cm2);
    System.out.println("jugador 3 manos ganadas:"+cm3);
    System.out.println("jugador 4 manos ganadas:"+cm4);
    System.out.println("");
if(cm1>cm2 && cm1>cm3 && cm1>cm4){
    j1++;
}else
if(cm2>cm1 && cm2>cm3 && cm2>cm4){
    j2++;
}else
if(cm3>cm2 && cm3>cm1 && cm3>cm4){
    j3++;
}else
if(cm4>cm2 && cm4>cm3 && cm4>cm1){
    j4++;
}else if(cm1==cm2 ){
    if(cm1!=cm3){
    if(cm1>cm3){
        if(cm1!=cm4){
        if(cm1>cm4){
            j1++;
            j2++;
        }else{
            j4++;
        }
    }else{
            j1++;
            j2++;
            j4++;
        }
}else if(cm3==cm4){
    j3++;
    j4++;
}else if(cm3>cm4){
    j3++;
}else{
    j4++;
}
    }else if(cm1>cm4){
    j1++;
    j2++;
    j3++;
}else{
        j4++;
    }

}else if(cm2==cm3){
    if(cm2>cm1){
        if(cm2!=cm4){
        if(cm2>cm4){
            j2++;
            j3++;
        }else{
            j4++;
        }
    }else{
            j2++;
            j3++;
            j4++;
        }
}else if(cm1==cm4){
    j1++;
    j4++;
}else if(cm1>cm4){
    j1++;
}else{
    j4++;
}
}
else if(cm3==cm4){
    if(cm3>cm2){
        if(cm3!=cm1){
        if(cm2>cm1){
            j2++;
            j4++;
        }else{
            j1++;
        }
    }else{
            j1++;
            j3++;
            j4++;
        }
}else if(cm2==cm1){
    j1++;
    j2++;
}else if(cm2>cm1){
    j2++;
}else{
    j1++;
}
}else if(cm4==cm1){
    if(cm4>cm2){
        if(cm4>cm3){
        j4++;
        j1++;
    }else{
            j3++;
        }
}else if(cm2>cm3){
    j2++;
}else{
    j3++;
}
}else if(cm2==cm4){
    if(cm4>cm3){
        if(cm4>cm1){
        j4++;
        j2++;
    }else{
            j1++;
        }
}else if(cm3>cm1){
    j3++;
}else{
    j1++;
}

   
}else if(cm1==cm3){
    if(cm1>cm4){
        if(cm1>cm2){
        j1++;
        j3++;
    }else{
            j2++;
        }
}else if(cm4>cm2){
    j4++;
}else{
    j2++;
}
}
}
    System.out.println("ganados 1="+j1+" y sus manos ganadas="+m1);
    System.out.println("ganados 2="+j2+" y sus manos ganadas="+m2);
    System.out.println("ganados 3="+j3+" Y sus manos ganadas="+m3);
    System.out.println("ganados 4="+j4+" Y sus manos ganadas="+m4);
if(j1>j2 && j1>j3 && j1>j4){
    System.out.println("El ganador es el jugador= 1");
}else
if(j2>j1 && j2>j3 && j2>j4){
    System.out.println("El ganador es el jugador= 2");
}else
if(j3>j2 && j3>j1 && j3>j4){
    System.out.println("El ganador es el jugador= 3");
}else
if(j4>j2 && j4>j3 && j4>j1){
    System.out.println("El ganador es el jugador= 4");
}else{
    System.out.println("Ha habido un empate");
}
    
    }
public void operacion(int arreglo[],int jpalo[],int jnum[]){
while(true){
    palo = Math.random()*1;
numero=Math.random()*1;
pinicialp=0;
pacumuladop=0.25f;
pinicialn=0f;
pacumuladan=0.1f;
c=0;
carta=1;
p=1;
boolean bandera2=false;
    boolean bandera=false;
   // System.out.println("palo"+palo);
while(true){
    if(palo>pinicialp && palo<=pacumuladop){
        tipopalo=p;
        bandera=true;
        jpalo[conta]=p;
    }
    pinicialp=pacumuladop;
    pacumuladop=pacumuladop+probabilidadp;
    //System.out.println("pinicial"+pinicialp);
    //System.out.println("pacumulada"+pacumuladop);
    if(bandera==true)break;
    p++;
}
bandera=false;
      while(true){
     if(numero>pinicialn &&numero<=pacumuladan){
       jnum[conta]=carta;
        bandera=true;
        if(p==1){
            
            posicion=c;
          arreglo[conta]=posicion;
        }
        else if(p==2){
            posicion=10+c;
             arreglo[conta]=posicion;
        }
         else if(p==3){
          posicion=20+c;
           arreglo[conta]=posicion;
        }
         else if(p==4){
          posicion=30+c;
           arreglo[conta]=posicion;
         }
        
    }
    pinicialn=pacumuladan;
    pacumuladan=pacumuladan+probabilidadn;
    if(bandera==true)break;
    carta++;
    c++;  
} 
      for(int i=0;i<repetidas.length;i++){
          if(posicion==repetidas[i]){
          bandera2=true;
      }
      }
      if(bandera2==false){
          repetidas[rconta]=posicion;
          break;
      }
}
     // System.out.println("c vale= "+c);
     // System.out.println("palo="+jpalo[conta]+",numero"+jnum[conta]);
}
public void vacio(int numero,ImageIcon Img,ImageIcon p,ImageIcon pb,ImageIcon oro, ImageIcon copa,ImageIcon espada,ImageIcon basto){
    Graphics grafico=getGraphics();
 
    if(numero==1){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
        grafico.drawImage(copa.getImage(), 40,590, 125, 125, null);
        grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
        grafico.drawImage(basto.getImage(), 870, 600,100, 100, null);
//partes traseras arriba
grafico.drawImage(p.getImage(), 290,71, 40, 60, null);
grafico.drawImage(p.getImage(), 340,71, 40, 60, null);
grafico.drawImage(p.getImage(), 390,71, 40, 60, null);
grafico.drawImage(p.getImage(), 440,71, 40, 60, null);
grafico.drawImage(p.getImage(), 490,71, 40, 60, null);
grafico.drawImage(p.getImage(), 540,71, 40, 60, null);
grafico.drawImage(p.getImage(), 590,71, 40, 60, null);
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 290,600, 40, 60, null);
grafico.drawImage(p.getImage(), 340,600, 40, 60, null);
grafico.drawImage(p.getImage(), 390,600, 40, 60, null);
grafico.drawImage(p.getImage(), 440,600, 40, 60, null);
grafico.drawImage(p.getImage(), 490,600, 40, 60, null);
grafico.drawImage(p.getImage(), 540,600, 40, 60, null);
grafico.drawImage(p.getImage(), 590,600, 40, 60, null);
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,150, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,200, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,250, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,150, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,200, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,250, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

    }
      if(numero==2){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100,60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150,60, 40, null);
      grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
        
     //partes traseras arriba
grafico.drawImage(p.getImage(), 340,71, 40, 60, null);
grafico.drawImage(p.getImage(), 390,71, 40, 60, null);
grafico.drawImage(p.getImage(), 440,71, 40, 60, null);
grafico.drawImage(p.getImage(), 490,71, 40, 60, null);
grafico.drawImage(p.getImage(), 540,71, 40, 60, null);
grafico.drawImage(p.getImage(), 590,71, 40, 60, null);
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 340,600, 40, 60, null);
grafico.drawImage(p.getImage(), 390,600, 40, 60, null);
grafico.drawImage(p.getImage(), 440,600, 40, 60, null);
grafico.drawImage(p.getImage(), 490,600, 40, 60, null);
grafico.drawImage(p.getImage(), 540,600, 40, 60, null);
grafico.drawImage(p.getImage(), 590,600, 40, 60, null);
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,200, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,250, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,200, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,250, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

    }
      if(numero==3){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
       grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
      //partes traseras arriba
grafico.drawImage(p.getImage(), 390,71, 40, 60, null);
grafico.drawImage(p.getImage(), 440,71, 40, 60, null);
grafico.drawImage(p.getImage(), 490,71, 40, 60, null);
grafico.drawImage(p.getImage(), 540,71, 40, 60, null);
grafico.drawImage(p.getImage(), 590,71, 40, 60, null);
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 390,600, 40, 60, null);
grafico.drawImage(p.getImage(), 440,600, 40, 60, null);
grafico.drawImage(p.getImage(), 490,600, 40, 60, null);
grafico.drawImage(p.getImage(), 540,600, 40, 60, null);
grafico.drawImage(p.getImage(), 590,600, 40, 60, null);
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,250, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,250, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

      }
      if(numero==4){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 390,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 390,600, 60, 40, null);
        grafico.drawImage(Img.getImage(), 70,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,250, 60, 40, null);
  grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
          //partes traseras arriba
grafico.drawImage(p.getImage(), 440,71, 40, 60, null);
grafico.drawImage(p.getImage(), 490,71, 40, 60, null);
grafico.drawImage(p.getImage(), 540,71, 40, 60, null);
grafico.drawImage(p.getImage(), 590,71, 40, 60, null);
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 440,600, 40, 60, null);
grafico.drawImage(p.getImage(), 490,600, 40, 60, null);
grafico.drawImage(p.getImage(), 540,600, 40, 60, null);
grafico.drawImage(p.getImage(), 590,600, 40, 60, null);
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,300, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

      }
      if(numero==5){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 390,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 390,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 440,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 440,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,300, 60, 60, null);
       grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
                   //partes traseras arriba
grafico.drawImage(p.getImage(), 490,71, 40, 60, null);
grafico.drawImage(p.getImage(), 540,71, 40, 60, null);
grafico.drawImage(p.getImage(), 590,71, 40, 60, null);
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 490,600, 40, 60, null);
grafico.drawImage(p.getImage(), 540,600, 40, 60, null);
grafico.drawImage(p.getImage(), 590,600, 40, 60, null);
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,350, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

      }
      if(numero==6){
           grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 390,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 390,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 440,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 440,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 490,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 490,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,350, 60, 40, null);
     grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
//partes traseras arriba
grafico.drawImage(p.getImage(), 540,71, 40, 60, null);
grafico.drawImage(p.getImage(), 590,71, 40, 60, null);
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo

grafico.drawImage(p.getImage(), 540,600, 40, 60, null);
grafico.drawImage(p.getImage(), 590,600, 40, 60, null);
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,400, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

      }
      if(numero==7){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 390,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 390,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 440,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 440,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 280,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 490,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 490,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 540,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 540,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,400, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,400, 60, 40, null);
     grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
                    //partes traseras arriba
grafico.drawImage(p.getImage(), 590,71, 40, 60, null);
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 590,600, 40, 60, null);
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo

grafico.drawImage(pb.getImage(), 70,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,450, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

      }
      if(numero==8){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 390,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 390,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 440,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 440,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 490,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 490,600,40, 60, null);
        grafico.drawImage(Img.getImage(), 70,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 540,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 540,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,400, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,400, 60, 40, null);
        grafico.drawImage(Img.getImage(), 590,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 590,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,450, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,450, 60, 40, null);
        grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
                   //partes traseras arriba
grafico.drawImage(p.getImage(), 640,71, 40, 60, null);
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 640,600, 40, 60, null);
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,500, 60, 40, null);
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);

      }
      if(numero==9){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 390,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 390,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 440,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 440,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 490,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 490,600,40, 60, null);
        grafico.drawImage(Img.getImage(), 70,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 540,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 540,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,400, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,400, 60, 40, null);
        grafico.drawImage(Img.getImage(), 590,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 590,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,450, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,450, 60, 40, null);
        grafico.drawImage(Img.getImage(), 640,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 640,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,500, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,500, 60, 40, null);
          grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
//partes traseras arriba
grafico.drawImage(p.getImage(), 690,71, 40, 60, null);
//partes traseras de abajo
grafico.drawImage(p.getImage(), 690,600, 40, 60, null);
//parte lado izquierdo
grafico.drawImage(pb.getImage(), 70,550, 60, 40, null);
//parte lazo derecho
grafico.drawImage(pb.getImage(), 880,550, 60, 40, null);
      }
      if(numero==10){
        grafico.drawImage(Img.getImage(), 240,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 240,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,100, 60, 40, null);
        grafico.drawImage(Img.getImage(), 290,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 290,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,150, 60, 40, null);
        grafico.drawImage(Img.getImage(), 340,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 340,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,200, 60, 40, null);
        grafico.drawImage(Img.getImage(), 390,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 390,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,250, 60, 40, null);
        grafico.drawImage(Img.getImage(), 440,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 440,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,300, 60, 40, null);
        grafico.drawImage(Img.getImage(), 490,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 490,600,40, 60, null);
        grafico.drawImage(Img.getImage(), 70,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,350, 60, 40, null);
        grafico.drawImage(Img.getImage(), 540,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 540,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,400, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,400, 60, 40, null);
        grafico.drawImage(Img.getImage(), 590,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 590,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,450, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,450, 60, 40, null);
        grafico.drawImage(Img.getImage(), 640,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 640,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,500, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,500, 60, 40, null);
        grafico.drawImage(Img.getImage(), 690,71, 40, 60, null);
        grafico.drawImage(Img.getImage(), 690,600, 40, 60, null);
        grafico.drawImage(Img.getImage(), 70,550, 60, 40, null);
        grafico.drawImage(Img.getImage(), 880,550, 60, 40, null);  
       grafico.drawImage(oro.getImage(), 37, 40, 125, 125, null);
  grafico.drawImage(espada.getImage(), 860, 55, 100,100, null);
          boton.setEnabled(false);
      }
      
      
       
    
}
public void ganador(int j1palo[],int j2palo[],int j3palo[],int j4palo[],int j1num[],int j2num[],int j3num[],int j4num[],int pos){
    if(j1num[pos]>j2num[pos] && j1num[pos]>j3num[pos] && j1num[pos]>j4num[pos] ){
       if(j2num[pos]==1){
           if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                        if(j2palo[pos]<j4palo[pos]){
                            ganador=2;
                        }else{
                           ganador=4;
                        }
                    }else{
                       ganador=2;
                   }
               }else if(j3num[pos]==j4num[pos]){
                        if(j3palo[pos]<j4palo[pos]){
                            ganador=3;
                        }else{
                            ganador=4;
                        }
               }else{
                   ganador=3;
               }
           }else if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
                            ganador=2;
                        }else{
                           ganador=4;
                        }
           }else{
               ganador=2;
           }
       }else if(j3num[pos]==1){
           if(j3num[pos]==j4num[pos]){
                        if(j3palo[pos]<j4palo[pos]){
                            ganador=3;
                        }else{
                            ganador=4;
                        }
       }else{
               ganador=3;
           }
       }else if(j4num[pos]==1){
           ganador=4;
       }else{
           ganador=1;
       }
    }
    else if(j2num[pos]>j1num[pos] && j2num[pos]>j3num[pos] && j2num[pos]>j4num[pos] ){
       if(j1num[pos]==1){
           if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                        if(j1palo[pos]<j4palo[pos]){
                            ganador=1;
                        }else{
                           ganador=4;
                        }
                    }else{
                       ganador=1;
                   }
               }else if(j3num[pos]==j4num[pos]){
                        if(j3palo[pos]<j4palo[pos]){
                            ganador=3;
                        }else{
                            ganador=4;
                        }
               }else{
                   ganador=3;
               }
           }else if(j1num[pos]==j4num[pos]){
               if(j1palo[pos]<j4palo[pos]){
                            ganador=1;
                        }else{
                           ganador=4;
                        }
           }else{
               ganador=1;
           }
       }else if(j3num[pos]==1){
           if(j3num[pos]==j4num[pos]){
                        if(j3palo[pos]<j4palo[pos]){
                            ganador=3;
                        }else{
                            ganador=4;
                        }
       }else{
               ganador=3;
           }
       }else if(j4num[pos]==1){
           ganador=4;
       }else{
           ganador=2;
       }
    }else if(j3num[pos]>j1num[pos] && j3num[pos]>j2num[pos] && j3num[pos]>j4num[pos] ){
          if(j1num[pos]==1){
           if(j1num[pos]==j2num[pos]){
               if(j1palo[pos]<j2palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                        if(j1palo[pos]<j4palo[pos]){
                            ganador=1;
                        }else{
                           ganador=4;
                        }
                    }else{
                       ganador=1;
                   }
               }else if(j2num[pos]==j4num[pos]){
                        if(j2palo[pos]<j4palo[pos]){
                            ganador=2;
                        }else{
                            ganador=4;
                        }
               }else{
                   ganador=2;
               }
           }else if(j1num[pos]==j4num[pos]){
               if(j1palo[pos]<j4palo[pos]){
                            ganador=1;
                        }else{
                           ganador=4;
                        }
           }else{
               ganador=1;
           }
       }else if(j2num[pos]==1){
           if(j2num[pos]==j4num[pos]){
                        if(j2palo[pos]<j4palo[pos]){
                            ganador=2;
                        }else{
                            ganador=4;
                        }
       }else{
               ganador=2;
           }
       }else if(j4num[pos]==1){
           ganador=4;
       }else{
           ganador=3;
       }
    }else if(j4num[pos]>j1num[pos] && j4num[pos]>j2num[pos] && j4num[pos]>j3num[pos] ){
          if(j1num[pos]==1){
           if(j1num[pos]==j2num[pos]){
               if(j1palo[pos]<j2palo[pos]){
                   if(j1num[pos]==j3num[pos]){
                        if(j1palo[pos]<j3palo[pos]){
                            ganador=1;
                        }else{
                           ganador=3;
                        }
                    }else{
                       ganador=1;
                   }
               }else if(j2num[pos]==j3num[pos]){
                        if(j2palo[pos]<j3palo[pos]){
                            ganador=2;
                        }else{
                            ganador=3;
                        }
               }else{
                   ganador=2;
               }
           }else if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                            ganador=1;
                        }else{
                           ganador=3;
                        }
           }else{
               ganador=1;
           }
       }else if(j2num[pos]==1){
           if(j2num[pos]==j3num[pos]){
                        if(j2palo[pos]<j3palo[pos]){
                            ganador=2;
                        }else{
                            ganador=3;
                        }
       }else{
               ganador=2;
           }
       }else if(j3num[pos]==1){
           ganador=3;
       }
          else{
           ganador=4;
       }
    }else
//numeros iguales
if(j1num[pos]==j2num[pos]){
    if(j3num[pos]!=1){
        if(j4num[pos]!=1){
    if(j1num[pos]>j3num[pos]){
        if(j1palo[pos]<j2palo[pos]){
        if(j1num[pos]==j3num[pos]){
        if(j1palo[pos]<j3palo[pos]){
        if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else {
            ganador=4;
        }
    }else{
            ganador=1;
        }
        }else if(j3num[pos]==j4num[pos]){
        if(j3palo[pos]<j4palo[pos]){
            ganador=3;
        }else{
            ganador=4;
        }
        }else{
                 ganador=3;
             }
        }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
        }else{
                 ganador=1;
             }
        }else if(j2num[pos]==j3num[pos]){
        if(j2palo[pos]<j3palo[pos]){
            ganador=2;
        }else{
            ganador=3;
        }
        }else if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
            ganador=2;
        }else{
            ganador=4;
        }
        }else{
                 ganador=2;
             }
   
}else if(j3num[pos]==j4num[pos]){
    if(j3palo[pos]<j4palo[pos]){
        ganador=3;
    }else{
        ganador=4;
    }
}else {
            ganador=4;
}}else if(j4num[pos]==j2num[pos]){
            if(j4palo[pos]<j2palo[pos]){
                if(j4num[pos]==j1num[pos]){
                    if(j4palo[pos]<j1palo[pos]){
                        if(j4num[pos]==j3num[pos]){
                            if(j4palo[pos]<j3palo[pos]){
                           ganador=4;
                        }else{
                                ganador=3;
                            }
                }else{
                            ganador=4;
                        }
            }else if(j1num[pos]==j3num[pos]){
                if(j1palo[pos]<j3palo[pos]){
                    ganador=1;
                }else{
                    ganador=3;
                }
            }else{
                ganador=1;
            }
        }else  if(j4num[pos]==j3num[pos]){
               if(j4palo[pos]<j3palo[pos]){
               ganador=3;
               }else{
                ganador=4;
               }

    }else{
            ganador=4;
        }
    }else  if(j2num[pos]==j1num[pos]){
               if(j2palo[pos]<j1palo[pos]){
                   if(j2num[pos]==j3num[pos]){
                       if(j2palo[pos]<j3palo[pos]){
                       ganador=2;
               }else{
                ganador=3;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   ganador=1;
               }else{
                   ganador=3;
               }
               }else{
                           ganador=1;
                       }

    }else if(j2num[pos]==j3num[pos]){
        if(j2palo[pos]<j3palo[pos]){
            ganador=2;
        }else{
            ganador=3;
        }
    }else{
        ganador=2;
    }
    }else  if(j4num[pos]==j1num[pos]){
               if(j4palo[pos]<j1palo[pos]){
                   if(j4num[pos]==j3num[pos]){
                       if(j4palo[pos]<j3palo[pos]){
                       ganador=4;
               }else{
                ganador=3;
               }
                   }else{
                       ganador=4;
                   }
                   }
                       else if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   ganador=1;
               }else{
                   ganador=3;
               }
               }else{
                           ganador=1;
                       }

    }else if(j4num[pos]==j3num[pos]){
        if(j4palo[pos]<j3palo[pos]){
            ganador=4;
        }else{
            ganador=3;
        }
    }    else{
        ganador=4;
    }
    }else if(j3num[pos]==j2num[pos]){
            if(j3palo[pos]<j2palo[pos]){
                if(j3num[pos]==j1num[pos]){
                    if(j3palo[pos]<j1palo[pos]){
                        if(j3num[pos]==j4num[pos]){
                            if(j3palo[pos]<j4palo[pos]){
                           ganador=3;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=3;
                        }
            }else if(j1num[pos]==j4num[pos]){
                if(j1palo[pos]<j4palo[pos]){
                    ganador=1;
                }else{
                    ganador=4;
                }
            }else{
                ganador=1;
            }
        }else  if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
               ganador=3;
               }else{
                ganador=4;
               }

    }else{
            ganador=3;
        }
    }else  if(j2num[pos]==j1num[pos]){
               if(j2palo[pos]<j1palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                       if(j2palo[pos]<j4palo[pos]){
                       ganador=2;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j1num[pos]==j4num[pos]){
               if(j1palo[pos]<j4palo[pos]){
                   ganador=1;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=1;
                       }

    }else if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
            ganador=2;
        }else{
            ganador=4;
        }
    }else{
        ganador=2;
    }
    }else  if(j3num[pos]==j1num[pos]){
               if(j3palo[pos]<j1palo[pos]){
                   if(j3num[pos]==j4num[pos]){
                       if(j3palo[pos]<j4palo[pos]){
                       ganador=3;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=3;
                   }
                   }
                       else if(j1num[pos]==j4num[pos]){
               if(j1palo[pos]<j4palo[pos]){
                   ganador=1;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=1;
                       }

    }else if(j3num[pos]==j4num[pos]){
        if(j3palo[pos]<j4palo[pos]){
            ganador=3;
        }else{
            ganador=4;
        }
    } else{
        ganador=3;
    }   
}
//segunda parte
else if(j2num[pos]==j3num[pos]){
    if(j4num[pos]!=1){
        if(j1num[pos]!=1){
    if(j2num[pos]>j1num[pos]){
        if(j2palo[pos]<j3palo[pos]){
        if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
        ganador=2;
        }else {
        ganador=4;
        }
        }else{
            ganador=2;
        }
        }else{
        if(j3num[pos]==j4num[pos]){
        if(j3palo[pos]<j4palo[pos]){
        ganador=3;
        }else {
        ganador=4;
        }
        }else{
            ganador=3;
        }
        }
}else if(j1num[pos]==j4num[pos]){
    if(j1palo[pos]<j4palo[pos]){
        ganador=1;
}else{
        ganador=4;
    }
}else{
    ganador=1;
}
    }else if(j1num[pos]==j2num[pos]){
            if(j1palo[pos]<j2palo[pos]){
                if(j1num[pos]==j3num[pos]){
                    if(j1palo[pos]<j3palo[pos]){
                        if(j1num[pos]==j4num[pos]){
                            if(j1palo[pos]<j4palo[pos]){
                           ganador=1;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=1;
                        }
            }else if(j3num[pos]==j4num[pos]){
                if(j3palo[pos]<j4palo[pos]){
                    ganador=3;
                }else{
                    ganador=4;
                }
            }else{
                ganador=3;
            }
        }else  if(j1num[pos]==j4num[pos]){
               if(j1palo[pos]<j4palo[pos]){
               ganador=1;
               }else{
                ganador=4;
               }

    }else{
            ganador=1;
        }
    }else  if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                       if(j2palo[pos]<j4palo[pos]){
                       ganador=2;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
            ganador=2;
        }else{
            ganador=4;
        }
    }else{
        ganador=2;
    }
    }else  if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
    } else{
        ganador=1;
    }
    }else if(j4num[pos]==j1num[pos]){
            if(j4palo[pos]<j1palo[pos]){
                if(j4num[pos]==j2num[pos]){
                    if(j4palo[pos]<j2palo[pos]){
                        if(j4num[pos]==j3num[pos]){
                            if(j4palo[pos]<j3palo[pos]){
                           ganador=4;
                        }else{
                                ganador=3;
                            }
                }else{
                            ganador=4;
                        }
            }else if(j2num[pos]==j3num[pos]){
                if(j2palo[pos]<j3palo[pos]){
                    ganador=3;
                }else{
                    ganador=2;
                }
            }else{
                ganador=2;
            }
        }else  if(j4num[pos]==j3num[pos]){
               if(j4palo[pos]<j3palo[pos]){
               ganador=4;
               }else{
                ganador=3;
               }

    }else{
            ganador=4;
        }
    }else  if(j1num[pos]==j2num[pos]){
               if(j1palo[pos]<j2palo[pos]){
                   if(j1num[pos]==j3num[pos]){
                       if(j1palo[pos]<j3palo[pos]){
                       ganador=1;
               }else{
                ganador=3;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   ganador=2;
               }else{
                   ganador=3;
               }
               }else{
                           ganador=2;
                       }

    }else if(j1num[pos]==j3num[pos]){
        if(j1palo[pos]<j3palo[pos]){
            ganador=1;
        }else{
            ganador=3;
        }
    }else{
        ganador=1;
    }
    }else  if(j4num[pos]==j2num[pos]){
               if(j4palo[pos]<j2palo[pos]){
                   if(j4num[pos]==j3num[pos]){
                       if(j4palo[pos]<j3palo[pos]){
                       ganador=4;
               }else{
                ganador=3;
               }
                   }else{
                       ganador=4;
                   }
                   }
                       else if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   ganador=2;
               }else{
                   ganador=3;
               }
               }else{
                           ganador=2;
                       }

    }else if(j4num[pos]==j3num[pos]){
        if(j4palo[pos]<j3palo[pos]){
            ganador=4;
        }else{
            ganador=3;
        }
    } else{
        ganador=4;
    }
        
 //tercera parte  
}else if(j3num[pos]==j4num[pos]){
    if(j1num[pos]!=1){
    if(j2num[pos]!=1){
    if(j3num[pos]>j2num[pos]){
        if(j3palo[pos]<j4palo[pos]){
        if(j3num[pos]==j1num[pos]){
        if(j3palo[pos]<j1palo[pos]){
        ganador=3;
        }else {
        ganador=1;
        }
        }else{
            ganador=3;
        }
        }else{
        if(j4num[pos]==j1num[pos]){
        if(j4palo[pos]<j1palo[pos]){
        ganador=4;
        }else {
        ganador=1;
        }
        }else{
            ganador=4;
        }
        }
}else if(j2num[pos]==j1num[pos]){
    if(j1palo[pos]<j2palo[pos]){
        ganador=1;
    }else{
        ganador=2;
    }
}else{
    ganador=2;
}
    }else if(j2num[pos]==j1num[pos]){
            if(j2palo[pos]<j1palo[pos]){
                if(j2num[pos]==j3num[pos]){
                    if(j2palo[pos]<j3palo[pos]){
                        if(j2num[pos]==j4num[pos]){
                            if(j2palo[pos]<j4palo[pos]){
                           ganador=2;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=2;
                        }
            }else if(j3num[pos]==j4num[pos]){
                if(j3palo[pos]<j4palo[pos]){
                    ganador=3;
                }else{
                    ganador=4;
                }
            }else{
                ganador=3;
            }
        }else  if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
               ganador=1;
               }else{
                ganador=4;
               }

    }else{
            ganador=2;
        }
    }else  if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
    }else{
        ganador=1;
    }
    }else  if(j1num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                       if(j2palo[pos]<j4palo[pos]){
                       ganador=2;
               }else{
                ganador=3;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                     ganador=3;      
                       }

    }else if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
            ganador=2;
        }else{
            ganador=4;
        }
    }else{
        ganador=2;
    }    
    }else if(j1num[pos]==j2num[pos]){
            if(j1palo[pos]<j2palo[pos]){
                if(j1num[pos]==j3num[pos]){
                    if(j1palo[pos]<j3palo[pos]){
                        if(j1num[pos]==j4num[pos]){
                            if(j1palo[pos]<j4palo[pos]){
                           ganador=1;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=1;
                        }
            }else if(j3num[pos]==j4num[pos]){
                if(j3palo[pos]<j4palo[pos]){
                    ganador=3;
                }else{
                    ganador=4;
                }
            }else{
                ganador=3;
            }
        }else  if(j1num[pos]==j4num[pos]){
               if(j1palo[pos]<j4palo[pos]){
               ganador=1;
               }else{
                ganador=4;
               }

    }else{
            ganador=1;
        }
    }else  if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                       if(j2palo[pos]<j4palo[pos]){
                       ganador=2;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
            ganador=2;
        }else{
            ganador=4;
        }
    }else{
        ganador=2;
    }
    }else  if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{     
                   ganador=3;
               
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
}else{
        ganador=1;
    }
}
//cuarta parte
else if(j1num[pos]==j3num[pos]){
    if(j4num[pos]!=1){
    if(j2num[pos]!=1){
    if(j1num[pos]>j4num[pos]){
        if(j1palo[pos]<j3palo[pos]){
        ganador=1;
        }else {
        ganador=3;
        }
}else if(j4num[pos]==j2num[pos]){
    if(j4palo[pos]<j2palo[pos]){
        ganador=4;
    }else{
        ganador=2;
    }
}else{
    ganador=4;
}}else if(j2num[pos]==j1num[pos]){
            if(j2palo[pos]<j1palo[pos]){
                if(j2num[pos]==j3num[pos]){
                    if(j2palo[pos]<j3palo[pos]){
                        if(j2num[pos]==j4num[pos]){
                            if(j2palo[pos]<j4palo[pos]){
                           ganador=2;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=2;
                        }
            }else if(j3num[pos]==j4num[pos]){
                if(j3palo[pos]<j4palo[pos]){
                    ganador=3;
                }else{
                    ganador=4;
                }
            }else{
                ganador=3;
            }
        }else  if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
               ganador=2;
               }else{
                ganador=4;
               }

    }else{
            ganador=2;
        }
    }else  if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
    }else{
        ganador=1;
    }
    }else  if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                       if(j2palo[pos]<j4palo[pos]){
                       ganador=2;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j3num[pos]==j4num[pos]){
        if(j3palo[pos]<j4palo[pos]){
            ganador=3;
        }else{
            ganador=4;
        }
    }else{
        ganador=3;
    }
    }else if(j4num[pos]==j1num[pos]){
            if(j4palo[pos]<j1palo[pos]){
                if(j4num[pos]==j2num[pos]){
                    if(j4palo[pos]<j2palo[pos]){
                        if(j4num[pos]==j3num[pos]){
                            if(j4palo[pos]<j3palo[pos]){
                           ganador=4;
                        }else{
                                ganador=3;
                            }
                }else{
                            ganador=4;
                        }
            }else if(j2num[pos]==j3num[pos]){
                if(j2palo[pos]<j3palo[pos]){
                    ganador=3;
                }else{
                    ganador=2;
                }
            }else{
                ganador=2;
            }
        }else  if(j4num[pos]==j3num[pos]){
               if(j4palo[pos]<j3palo[pos]){
               ganador=4;
               }else{
                ganador=3;
               }

    }else{
            ganador=4;
        }
    }else  if(j1num[pos]==j2num[pos]){
               if(j1palo[pos]<j2palo[pos]){
                   if(j1num[pos]==j3num[pos]){
                       if(j1palo[pos]<j3palo[pos]){
                       ganador=1;
               }else{
                ganador=3;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   ganador=2;
               }else{
                   ganador=3;
               }
               }else{
                           ganador=2;
                       }

    }else if(j1num[pos]==j3num[pos]){
        if(j1palo[pos]<j3palo[pos]){
            ganador=1;
        }else{
            ganador=3;
        }
    }else{
        ganador=1;
    }
    }else  if(j4num[pos]==j2num[pos]){
               if(j4palo[pos]<j2palo[pos]){
                   if(j4num[pos]==j3num[pos]){
                       if(j4palo[pos]<j3palo[pos]){
                       ganador=4;
               }else{
                ganador=3;
               }
                   }else{
                       ganador=4;
                   }
                   }
                       else if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   ganador=2;
               }else{
                   ganador=3;
               }
               }else{
                           ganador=2;
                       }

    }else if(j4num[pos]==j3num[pos]){
        if(j4palo[pos]<j3palo[pos]){
            ganador=4;
        }else{
            ganador=3;
        }
}else{
        ganador=4;
    }
}
//quinta parte
else if(j2num[pos]==j4num[pos]){
    if(j3num[pos]!=1){
    if(j1num[pos]!=1){
    if(j2num[pos]>j3num[pos]){
        if(j2palo[pos]<j4palo[pos]){
        ganador=2;
        }else {
        ganador=4;
        }
}else if(j1num[pos]==j3num[pos]){
    if(j1palo[pos]<j3palo[pos]){
        ganador=1;
    }else{
        ganador=3;
    }
}else{
    ganador=1;
}
    }else if(j1num[pos]==j2num[pos]){
            if(j1palo[pos]<j2palo[pos]){
                if(j1num[pos]==j3num[pos]){
                    if(j1palo[pos]<j3palo[pos]){
                        if(j1num[pos]==j4num[pos]){
                            if(j1palo[pos]<j4palo[pos]){
                           ganador=1;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=1;
                        }
            }else if(j3num[pos]==j4num[pos]){
                if(j3palo[pos]<j4palo[pos]){
                    ganador=3;
                }else{
                    ganador=4;
                }
            }else{
                ganador=3;
            }
        }else  if(j1num[pos]==j4num[pos]){
               if(j1palo[pos]<j4palo[pos]){
               ganador=1;
               }else{
                ganador=4;
               }

    }else{
            ganador=1;
        }
    }else  if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                       if(j2palo[pos]<j4palo[pos]){
                       ganador=2;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
            ganador=2;
        }else{
            ganador=4;
        }
    }else{
        ganador=2;
    }
    }else  if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
    }else{
        ganador=1;
    }    
    }else if(j3num[pos]==j1num[pos]){
            if(j3palo[pos]<j1palo[pos]){
                if(j3num[pos]==j2num[pos]){
                    if(j3palo[pos]<j2palo[pos]){
                        if(j3num[pos]==j4num[pos]){
                            if(j3palo[pos]<j4palo[pos]){
                           ganador=3;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=3;
                        }
            }else if(j2num[pos]==j4num[pos]){
                if(j2palo[pos]<j4palo[pos]){
                    ganador=2;
                }else{
                    ganador=4;
                }
            }else{
                ganador=2;
            }
        }else  if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
               ganador=3;
               }else{
                ganador=4;
               }

    }else{
            ganador=3;
        }
    }else  if(j1num[pos]==j2num[pos]){
               if(j1palo[pos]<j2palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
                   ganador=2;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=2;
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
    }else{
        ganador=1;
    }
    }else  if(j3num[pos]==j2num[pos]){
               if(j3palo[pos]<j2palo[pos]){
                   if(j3num[pos]==j4num[pos]){
                       if(j3palo[pos]<j4palo[pos]){
                       ganador=3;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=3;
                   }
                   }
                       else if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
                   ganador=2;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=2;
                       }

    }else if(j3num[pos]==j4num[pos]){
        if(j3palo[pos]<j4palo[pos]){
            ganador=3;
        }else{
            ganador=4;
        }
}else{
        ganador=3;
    }
}
//sexta parte
else if(j1num[pos]==j4num[pos]){
        if(j3num[pos]!=1){
        if(j2num[pos]!=1){
        if(j1palo[pos]<j4palo[pos]){
        ganador=1;
        }else {
        ganador=4;
        }
}else if(j2num[pos]==j1num[pos]){
            if(j2palo[pos]<j1palo[pos]){
                if(j2num[pos]==j3num[pos]){
                    if(j2palo[pos]<j3palo[pos]){
                        if(j2num[pos]==j4num[pos]){
                            if(j2palo[pos]<j4palo[pos]){
                           ganador=2;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=2;
                        }
            }else if(j3num[pos]==j4num[pos]){
                if(j3palo[pos]<j4palo[pos]){
                    ganador=3;
                }else{
                    ganador=4;
                }
            }else{
                ganador=3;
            }
        }else  if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
               ganador=2;
               }else{
                ganador=4;
               }

    }else{
            ganador=2;
        }
    }else  if(j1num[pos]==j3num[pos]){
               if(j1palo[pos]<j3palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
    }else{
        ganador=1;
    }
    }else  if(j2num[pos]==j3num[pos]){
               if(j2palo[pos]<j3palo[pos]){
                   if(j2num[pos]==j4num[pos]){
                       if(j2palo[pos]<j4palo[pos]){
                       ganador=2;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=2;
                   }
                   }
                       else if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
                   ganador=3;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=3;
                       }

    }else if(j2num[pos]==j4num[pos]){
        if(j2palo[pos]<j4palo[pos]){
            ganador=2;
        }else{
            ganador=4;
        }
    }else{
        ganador=2;
    }    
    }else if(j3num[pos]==j1num[pos]){
            if(j3palo[pos]<j1palo[pos]){
                if(j3num[pos]==j2num[pos]){
                    if(j3palo[pos]<j2palo[pos]){
                        if(j3num[pos]==j4num[pos]){
                            if(j3palo[pos]<j4palo[pos]){
                           ganador=3;
                        }else{
                                ganador=4;
                            }
                }else{
                            ganador=3;
                        }
            }else if(j2num[pos]==j4num[pos]){
                if(j2palo[pos]<j4palo[pos]){
                    ganador=2;
                }else{
                    ganador=4;
                }
            }else{
                ganador=2;
            }
        }else  if(j3num[pos]==j4num[pos]){
               if(j3palo[pos]<j4palo[pos]){
               ganador=3;
               }else{
                ganador=4;
               }

    }else{
            ganador=3;
        }
    }else  if(j1num[pos]==j2num[pos]){
               if(j1palo[pos]<j2palo[pos]){
                   if(j1num[pos]==j4num[pos]){
                       if(j1palo[pos]<j4palo[pos]){
                       ganador=1;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=1;
                   }
                   }
                       else if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
                   ganador=2;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=2;
                       }

    }else if(j1num[pos]==j4num[pos]){
        if(j1palo[pos]<j4palo[pos]){
            ganador=1;
        }else{
            ganador=4;
        }
    }else{
        ganador=1;
    }
    }else  if(j3num[pos]==j2num[pos]){
               if(j3palo[pos]<j2palo[pos]){
                   if(j3num[pos]==j4num[pos]){
                       if(j3palo[pos]<j4palo[pos]){
                       ganador=3;
               }else{
                ganador=4;
               }
                   }else{
                       ganador=3;
                   }
                   }
                       else if(j2num[pos]==j4num[pos]){
               if(j2palo[pos]<j4palo[pos]){
                   ganador=2;
               }else{
                   ganador=4;
               }
               }else{
                           ganador=2;
                       }

    }else if(j3num[pos]==j4num[pos]){
        if(j3palo[pos]<j4palo[pos]){
            ganador=3;
        }else{
            ganador=4;
        }
}else{
        ganador=3;
    }
}
}
  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton){
           metodo();
     g.Grafica(j1, j2, j3, j4, juegos);
          
        
    }
}
    public static void main(String[] args) {
      
       
        CartasMontecarlo c= new CartasMontecarlo();
        c.setVisible(true);   
    }    
}

