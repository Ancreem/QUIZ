package com.mycompany.quiz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nift;
        char resultado;
        int A=0, B=1, C=2, D=3, E=4, F=5, G=6, H=7, I=8, J=9, K=10, L=11, M=12, N=13, Ñ=14, O=15, P=16, Q=17, R=18, S=19, T=20, V=22, W=23, X=24, Y=25, Z=26;
        
        System.out.println("Ingrese una oracion");
        
        nift = br.readLine();
        
        for (int i = 0; i < nift.length(); i++){
            resultado = nift.charAt(i);
            
        }
    }
}
