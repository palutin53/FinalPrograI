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
	public static String getInput(String prompt)
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
	public static void menuPrin()
	{
		try
		{
			print("\n\t\t\tBinenvenido a UDEO");
			print("\n\n\tIngresa el valor según la opcion que selecciones.");
			print("\n\n\t\t1.- Administrar Alumnos\n\t\t2.- Administrar Docentes\n\t\t3.- Administrar Cursos\n\t\t4.- Realizar Pago\n\t\t5.- Ingresar Notas\n\t\t6.- Ver Resultados Finales.\n\t\t7.- SALIR");
		}catch(Exception e){
			print(">>>> ERROR");
		}
	}
	public static void subMenu()
	{
		try{
			print("\n\t\t\tAdministrar");
			print("\n\n\tIngresa el valor según la opción que selecciones.");
			print("\n\n\t\t1.- Agregar\n\t\t2.- Editar\n\t\t3.- Eliminar\n\t\t4.- VOLVER");
		}catch(Exception e){
			print(">>> Error");
		}
	}
	public static void linea()
	{
		try{
			print("\n\n----------------------------------------------------------------------");
		}catch(Exception e){
			print(">>> ERROR.");
		}
	}
	static boolean salir()
	{
		boolean valSalir = true;
		int salida = Integer.parseInt(getInput("\n\n\t\t¿Quieres continuar?\n\t1.- Si\n\t2.- No\n\n\tSelección: "));
		switch(salida)
		{
			case 1:
				valSalir = true;
			break;
			case 2:
				print("\n\n\t\tRestornando a Menu.");
				valSalir = false;
			break;
			default:
				print("Valor invalido, intentalo de nuevo.");
				valSalir = false;
			break;
		}
		return valSalir;
	}
	public static void addAlumno(String[] alumnos, int[] carne)
	{
		String nombre;
		int posicion = 0, numCarne = 160402001;
		try
		{
			for(posicion = 0; posicion<=9; posicion++, numCarne++)
			{
				nombre = getInput("Ingresa el nombre del alumno: ");
				alumnos[posicion] = nombre;
				print("El numero de carné de " + nombre + " es: " + numCarne);
				carne[posicion] = numCarne;
				for(String s: alumnos)
				{
					print("\n" + s);
				}
				print("\n\n");
				for(int a: carne)
				{
					print("\n" + a);
				}
				print("\n\nEl cupo esta lleno, no habrá espacio hasta que algun alumno sea dado de baja.");
			}
		}catch(Exception e)
		{
			print("\n\n\t>>> Error 111");
		}
	}
	public static void addDocente(String[] docentes, int[] idDocentes)
	{
		String nombre;
		int posicion = 0, numDocente = 1001;
		try
		{
			for(posicion = 0; posicion<=9; posicion++, numDocente++)
			{
				nombre = getInput("Ingresa el nombre del alumno: ");
				docentes[posicion] = nombre;
				print("El numero de carné de " + nombre + " es: " + numDocente);
				idDocentes[posicion] = numDocente;
				for(String s: alumnos)
				{
					print("\n" + s);
				}
				print("\n\n");
				for(int a: carne)
				{
					print("\n" + a);
				}
				print("\n\nEl cupo esta lleno, no habrá espacio hasta que algun alumno sea dado de baja.");
			}
		}catch(Exception e)
		{
			print("\n\n\t>>> Error 111");
		}
	}
}
