/**
 * Descripción de la aplicación
 * 
 * @author Billy Samayoa
 * @versión 1.0.0
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Alumnos
{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[ ] nombres= new String[10];
        try{
            nombres[0]="Dylan Steven Samayoa Higueros";
            nombres[4]="Leslie Mariza Mazariegos Higueros";
            nombres[9]="Andrea Sucel Mazariegos Higeros";
            for (int i=0;i<10;i++){ 
                println(nombres[i]); 
            }
        }catch(Exception e){
        
        
        }
    
    }
    public static void println(String s){
        System.out.println(s);
    }
}