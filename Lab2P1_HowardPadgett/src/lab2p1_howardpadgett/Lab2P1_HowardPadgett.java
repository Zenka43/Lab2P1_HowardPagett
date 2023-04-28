/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_howardpadgett;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Lab2P1_HowardPadgett {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

    int respuesta = 3;

    while (respuesta != 5){
    System.out.println("1. Clasificando numeros");
            System.out.println("2. Aproximado");
            System.out.println("3. MCD");
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();
        int par=0;
        
        int impar=0;
    
        
        boolean seguir=true;
        while(seguir){
            System.out.println("Classificacion de numeros 1");
            System.out.println("Salir 2");
         
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese el numero que desea evaluar de x" );
                    int x=leer.nextInt();
                    double n=0;
                     
                   System.err.println("ingrese el numero 1");
                   int n1= leer.nextInt();
                   System.err.println("ingrese el numero 2");
                   int n2= leer.nextInt();
                   System.err.println("ingrese el numero 3");
                   int n3= leer.nextInt();
                   System.err.println("ingrese el numero 4");
                   int n4= leer.nextInt();
                   System.err.println("ingrese el numero 5");
                   int n5= leer.nextInt();
                   if(n1%2==0){
                       par+=1;
                   }else{
                       impar+=1;
                   }
                   if(n2%2==0){
                       par+=1;
                   }else{
                       impar+=1;
                   }
                   if(n3%2==0){
                       par+=1;
                   }else{
                       impar+=1;
                   }
                   if(n4%2==0){
                       par+=1;
                   }else{
                       impar+=1;
                   }
                   if(n5%2==0){
                       par+=1;
                   }else{
                       impar+=1;
                   }
                   System.out.println("la cantiad de pares fueron:"+par);
                   System.out.println("La cantida de impares fueron:"+impar);
                   
                   break;
                }
                   case 2:
                   System.out.println("Ingrese la precision del calculo");
                   double limite = leer.nextInt();
                   double contador=1;
                   double acumular=1;
                   while(contador<=limite){
                   
                   
                         double i = Math.pow(contador, 2);
                         double dividendo = ((4*i)/(4*i-1));
                         acumular *= dividendo;
                         
                         
                         } contador++;
                         System.out.println(acumular*2);
                        
                   break;
                   
                   case 3:
                   
                   System.out.println("Dame el primer numero de A");
                   
        int num1 = leer.nextInt();
        
        System.out.println("Dame el segundo numero");
        int num2 = leer.nextInt();
        
        while(num1!=num2){
            if(num1<num2){
            }
            if(num2<num1);
        }
       

        break;
    }
}
                }  
            }  
        }
    
