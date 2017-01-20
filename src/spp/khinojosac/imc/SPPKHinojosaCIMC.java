/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.khinojosac.imc;
import java.util.Scanner;
/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        //Paso 1. Declaración de variables (Identificadores)
        double w, l, imc;
        String eIMC;
        Scanner teclado = new Scanner (System.in);
        //Paso 2. ASsignar valores a las variables.
        System.out.println("Introduce el peso");
        w= teclado.nextDouble();
        System.out.println("Introduce la estatura");
        l=teclado.nextDouble();
        //Paso 3. Resolver el problema.
        imc=w/Math.pow(l, 2);
        //Paso 3.1 Evaluamos IM.
        if (imc>25){eIMC="Sobrepeso";
        } else if(imc<19){
            eIMC="Desnutrición";
        }   else {
            eIMC ="Normal";
        }     
        //Paso 4. Mostrar el resultado.
        System.out.println("Peso= " + w);
        System.out.println("Estatura= " + l);
        System.out.println(imc);
        System.out.println("eIMC");
        
        
        
        
        
    }
    
}
