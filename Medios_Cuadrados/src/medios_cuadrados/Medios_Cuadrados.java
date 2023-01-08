package medios_cuadrados;

import java.util.ArrayList;
import java.util.Scanner;

public class Medios_Cuadrados {

    ArrayList<Long> Semillas= new ArrayList <Long>() ;
    ArrayList<Long> Semillas2= new ArrayList <Long>() ;

    public static void main(String[] args) {
        ArrayList<Long> Semillas= new ArrayList <Long>() ;
         ArrayList<Long> Semillas2= new ArrayList <Long>() ;
        Medios_Cuadrados m= new Medios_Cuadrados();
        Scanner e=new Scanner(System.in);
       long Semilla =0,SemillaCuadrada,s4=0,s5;
      
   
       String cadena="",cadena2="",subcadena="",s3;
              int i,o,f,tam1,tam2,primerc,segundac,c=1;
        int Operacion=0;
        
        while(Operacion!=1 && Operacion !=2){
        System.out.println("Teclee operacion a realizar: ");
       
        System.out.println("1° Metodo de los medios cuadrados: ");
        System.out.println("2° Metodo de Newman: ");
         Operacion=e.nextInt();
        if(Operacion==1){
             System.out.println("1. Manual");
            System.out.println("2.Random");
             o=e.nextInt();
            if(o==1){
        System.out.println("Teclee valor de la semilla: ");
        Semilla=e.nextLong();
            }if(o==2){
               Semilla=(long) (Math.random()*9999+1);
            }
        if(Semilla>999 && Semilla<=9999){
            while(true){
            System.out.println("La semilla "+c+" es: "+Semilla);
            cadena=String.valueOf(Semilla);
            SemillaCuadrada=(long) Math.pow(Semilla, 2);
            cadena2=String.valueOf(SemillaCuadrada);
            System.out.println("Su cuadrado es: "+SemillaCuadrada);
            if(Semilla==0)break;
            tam1=cadena.length();
            tam2=cadena2.length();
            while(tam2!=8){
                cadena2="0"+cadena2;
                tam2=cadena2.length();
                System.out.println(""+cadena2);
                System.out.println(""+tam2);
            }
            s3=cadena2.substring(2,6);
            s4=Long.valueOf(s3);
            if(Semillas.contains(s4))break;
            Semillas.add(s4);
            Semilla=s4;
            c++;
           
            
            } 
           
}else{
           System.out.println("Numero no valido");
            Operacion=0;
       }
        }
        System.out.println("Areglo"+Semillas);
        
        if(Operacion==2){
            System.out.println("2° Metodo de Newman: ");
            System.out.println("");
            System.out.println("1. Semilla Manual");
            System.out.println("2. Semilla Random");
            o=e.nextInt();
            if(o==1){
        System.out.println("Teclee valor de la semilla: ");
        Semilla=e.nextLong();
            }if(o==2){
               Semilla=(long)(Math.random()*9999999999L+500);
            }
           //while(Semilla<999999999 || Semilla>9999999999L){
               if(Semilla>999999999 && Semilla<=9999999999L){
             while(true){
            System.out.println("La semilla "+c+" es: "+Semilla);
            cadena=String.valueOf(Semilla);
            SemillaCuadrada=(long) Math.pow(Semilla, 2);
            cadena2=String.valueOf(SemillaCuadrada);
            System.out.println("Su cuadrado es: "+SemillaCuadrada);
            if(Semilla==0)break;
            
            tam2=cadena2.length();
            if(tam2%2==0){
                cadena2="0"+cadena2;
                tam2=cadena2.length();
                System.out.println(""+cadena2);
                System.out.println(""+tam2);
            }
            tam2=cadena2.length();
            
            primerc=tam2/2;
            primerc=primerc-2;
            s3=cadena2.substring(primerc,primerc+5);
            
            s4=Long.valueOf(s3);
            if(Semillas2.contains(s4))break;
            Semillas2.add(s4);
            Semilla=s4;
            c++;
           
            
            } 
           
}else{
           System.out.println("Numero no valido");
            Operacion=0;
       }
                   
               }
        }
         
        
                
    System.out.println("Areglo"+Semillas2);     
}
}

   

    

