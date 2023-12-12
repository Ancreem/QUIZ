package com.mycompany.quiz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto4 { 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadenaOriginal;
        char cadena = 0;
        
        System.out.println("Ingrese una cadena de texto: ");
        cadenaOriginal = br.readLine();
        
        
        for (int i = 0; i < cadenaOriginal.length(); i++){
            cadena = cadenaOriginal.charAt(i);
        }
        
        System.out.println(cadena);
    }  
}
