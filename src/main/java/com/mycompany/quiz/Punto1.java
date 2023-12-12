package com.mycompany.quiz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i, contiene=1;
        String cadena;

        System.out.println("Ingrese un texto");
        cadena=br.readLine();
        for(i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                contiene++;
            }
        }
        System.out.println("La oracion que mandaste contiene "+contiene+" palabras");       
    }
}
