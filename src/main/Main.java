
package main;

import java.util.Random;
import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    
    //atividade 1
    
        int num1,num2,num3;
        
        for (int x = 0; x < 3; x++) {
        System.out.println("insira o primeiro valor");
        num1 = grava.nextInt();
        System.out.println("insira o segundo valor");
        num2 = grava.nextInt();
        System.out.println("insira o terceiro valor");
        num3 = grava.nextInt();
        
        if(num1 == num2 && num2 == num3){
        System.out.println("é um triangulo equilatero");
        }
        else if (num1 != num2 && num2 == num3){
        System.out.println("é um triangulo isóseles");
        }
        else if (num2 != num3 && num1 == num2){
        System.out.println("é um triangulo isóseles");
        }
        else if (num1 != num2 && num1 == num3){
        System.out.println("é um triangulo isóseles");
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3){
        System.out.println("é um triangulo escaleno");
        }
        }
        
       
               
    
    
    //ativiade 2
    
      int val,soma = 0;
        for (int x = 0; x < 4; x++) {
            System.out.println("insira um valor");
         val = grava.nextInt();  
         if (val % 2 == 0){ 
             soma = val + soma;
         }
        }
        System.out.println("a soma dos numeros pares digitados é " + soma);
  
    //atividade 3
        
       int valor;
        
        valor = grava.nextInt();
        
        for (int x = 0; x < 1; x++) {
           if (valor % 4 == 0){
               System.out.println("é um ano bissexto");
           }else{ 
            System.out.println("é um ano normal");
           }
        }
    
    
    //ativiade 4
    
    double valo,add = 0;
        for (int x = 0; x < 10; x++) {
    System.out.println("insira um valor");
    valo = grava.nextDouble();
    if (valo >= 10 && valo <= 50){
        add++;
    System.out.println("tem " + add + " numeros no intervalo de 10 a 50");
    }else {
    System.out.println("tem " + add + " numeros no intervalo de 10 a 50");
    }
    }
    
    
    //atividade 5
    
    
       for (int x = 0; x < 20; x++) {
            
          Random gera = new Random();
          int num = gera.nextInt(1999)+1000;  
          if (num % 11 == 5){
          System.out.println(num);
          }
        }
     }
    }


