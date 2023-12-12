package com.mycompany.quiz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Punto3 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int numero;
        String uno="uno", dos="dos", tres="tres", cuatro="cuatro", cinco="cinco", seis="seis", siete="siete", ocho="ocho", nueve="nueve";
        String quinientos="Quinientos", cien="ciento";
        String resultado = null;
        
        
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();
        
        if (numero <=999){
            if(numero <=199 & numero >= 100){
                resultado = cien;
            }
            if(numero <=299 & numero >= 200){
                resultado = dos+"cientos";
            }
            if(numero <=399 & numero >= 300){
                resultado = tres+"cientos";
            }
            if(numero <=499 & numero >= 400){
                resultado = cuatro+"cientos";
            }
            if(numero <=599 & numero >= 500){
                resultado = quinientos;
            }
            if(numero <=699 & numero >= 600){
                resultado = seis+"cientos";
            }
            if(numero <=799 & numero >= 700){
                resultado = siete+"cientos";
            }
            if(numero <=899 & numero >= 800){
                resultado = siete+"cientos";
            }
            if(numero <=999 & numero >= 900){
                resultado = nueve+"cientos";
            }
            System.out.println(resultado);
        }else {
            System.out.println("Ingresa un numero menor a 999");
        }
    }
    
    
    
}
