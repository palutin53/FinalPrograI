/**
* Descripción de la aplicacióon
*
* @author 
* @version 1.0.0
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Proceso
{
	public static void arreglos()
	{
		String[] alumnos = new String[10];
		String[] docentes = new String[5];
		String[] cursost1 = new String[4]; 
		String[] cursost2 = new String[4];
		String[] cursost3 = new String[4];
		String[] cursost4 = new String[4];
		float[] notas = new float[89];
		String[] pagos = new String[10];
	}
	private static String getInput(String prompt)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(prompt);
		System.out.flush();
		try{
			return br.readLine();
		}catch(Exception e){
			return "\nError: " + e.getMessage();
		}

	}
	public static void print(String s)
	{
		System.out.print(s);
	}
}