package congruencia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Congruencia {
	ArrayList<Double> Semillas= new ArrayList <Double>() ;
    public static void main(String[] args) {
         ArrayList<Double> Semillas= new ArrayList <Double>() ;
        Scanner e =new Scanner(System.in); 
        double n=0,val;
        double x=0;
        double a = 0,c,m,operacion1;
        int op=0;
        boolean primo;
        double operacion2;
        while(op!=1 && op!=2){
        System.out.println("1.X manual");
        System.out.println("2.X Aleatoria");
        System.out.println("Que operacion desea realizar");
        op=e.nextInt();
        if(op==1){
        System.out.print("Tecleé valor de x ");
        x=e.nextDouble();
        }else if(op==2){
           x=(int) (Math.random()*10000);
        }
        }
        while(true){
            System.out.print("Tecleé valor de a mayor a 2: ");
            a=e.nextDouble();
            if(a>2){
                a=(2*a)+1;
                if(((a%1)==0)&& ((a%2)!=0) && ((a%3)!=0) && ((a%5)!=0))break;
            }
        }
         while(true){
        System.out.print("Tecleé valor de c: ");
        c=e.nextDouble();
        if((c%1)==0 && ((c%2)!=0) && ((c%8)==5))break;
         }
        while(true){
             System.out.print("Tecleé valor de m");
             m=e.nextInt();
             val=(int) Math.pow(2, 15);
                primo=true;
                for(int i=2;i<m;i++){
                if (m % i == 0)
                primo = false;
                }
                if(primo==true && m<val)break;
        }
    
        System.out.println("");
         System.out.println("N" +  "\tXn" +  "\t\t(a*Xn+C)" +  "\t(a*Xn+C)/M" +  "\tXn+");
        System.out.println("____________________________________________________________"); //H
       
        while(true){         
        operacion1=(a*x)+c;
        operacion2=(operacion1%m);
            System.out.printf(" %1.00f\t"+""+ " %1.00f\t "+""+ " %1.00f\t "+" "+"%1.00f/%1.00f\t "+""+ " %1.00f\t ",n,x,operacion1,operacion1,m,operacion2);
            System.out.println("");
            if(Semillas.contains(operacion2))break; 
            Semillas.add(operacion2);
            x=operacion2;
            n++;
    }    
        }
     
}

