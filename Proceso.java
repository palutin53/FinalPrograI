/**
* Descripción de la aplicacióon
*
* @author 
* @version 1.0.0
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Console;

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
			print("\nError: " + e.getMessage());
		}
	}
	public static void subMenu()
	{
		try{
			print("\n\t\t\tAdministrar");
			print("\n\n\tIngresa el valor según la opción que selecciones.");
			print("\n\n\t\t1.- Agregar\n\t\t2.- Editar\n\t\t3.- Eliminar\n\t\t4.- VOLVER");
		}catch(Exception e){
			print("\nError: " + e.getMessage());
		}
	}
	public static void linea()
	{
		try{
			print("\n\n-------------------------------------------------------------------------------\n\n");
		}catch(Exception e){
			print("\nError: " + e.getMessage());
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
	public static void addAlumno(ArrayList<String> alumnos, ArrayList<Integer> carne)
	{
		String nombre;
		int posicion = 0, numCarne = 160402001;
		boolean valSalir = true;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del alumno: ");
				print("El numero de carne de " +nombre+"es: " + numCarne);
				alumnos.add(nombre);
				carne.add(numCarne);
				posicion++;
				numCarne++;
				
				valSalir = salir();

			}while(posicion <= 9 && valSalir);

		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void addDocente(ArrayList<String> docentes, ArrayList<Integer> idDocentes)
	{
		String nombre;
		int posicion = 0, numDocente = 1001;
		boolean valSalir = true;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del alumno: ");
				docentes.add(nombre);
				print("El numero de carne de " +nombre+"es: " + numDocente);				
				idDocentes.add(numDocente);
				posicion++;
				numDocente++;
				
				valSalir = salir();

			}while(posicion <= 9 && valSalir);


		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void mostrarAlumnos(ArrayList<String> alumnos, ArrayList<Integer> carne)
	{
		try
		{
			print("\n\tNombre\t\t\tCarné");
			int pos = alumnos.size();
			int size = pos - 1;
			for(int i = 0; i <= size; i++)
			{
				int numCarne = carne.get(i);
				String alumno2 = alumnos.get(i);
				print("\n\t" + alumno2 + "\t\t\t" + numCarne);
			}
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void mostrarDocentes(ArrayList<String> docentes, ArrayList<Integer> idDocentes)
	{
		try
		{
			print("\n\tNombre\t\t\tID");
			int pos = docentes.size();
			int size = pos - 1;
			for(int i = 0; i <= size; i++)
			{
				int numID = idDocentes.get(i);
				String docente = docentes.get(i);
				print("\n\t" + docente + "\t\t\t" + numID);
			}
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void eliminarAlumnos(ArrayList<String> alumnos, ArrayList<Integer> carne)
    {
    	try
    	{
	    	int num, pos, numCarne;
	    	print("\n\nPor el momento el listado que tenemos está así: ");
	        mostrarAlumnos(alumnos, carne);
	        num = Integer.parseInt(getInput("\n\nIngresa el numero de carné del alumno que se dará de baja: "));
	        pos = carne.indexOf(num);
	        alumnos.remove(pos);
	        carne.remove(pos);
	        print("\n\nEl alumno con el carné " + num + " fué dado de baja.\nLa lista queda así: ");
	        mostrarAlumnos(alumnos, carne);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}	        
    }
	public static void eliminarDocentes(ArrayList<String> docentes, ArrayList<Integer> idDocentes)
	{
		try
		{
			int num, pos, numCarne;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarDocentes(docentes, idDocentes);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del docente que se dará de baja: "));
			pos = idDocentes.indexOf(num);
			docentes.remove(pos);
			idDocentes.remove(pos);

	        print("\n\tAlumno dado de baja.\n");
	        mostrarDocentes(docentes, idDocentes);
	    }catch(Exception e)
	    {
	    	print("\nError: " + e.getMessage());
	    }
	}
	public static void actualizarAlumnos(ArrayList<String> alumnos, ArrayList<Integer> carne)
	{
		try
		{
			int num, pos, numCarne;
			print("\n\n\tPor el momento el listado que tenemos está así: ");
			mostrarAlumnos(alumnos, carne);
			num = Integer.parseInt(getInput("\n\nIngresa el carné del alumno que quieres actualizar: "));
			pos = carne.indexOf(num);
			alumnos.remove(pos);
			String nuevoNombre = getInput("\n\nIngresa el nuevo nombre para el alumno: ");
			alumnos.add(pos, nuevoNombre);
			
			print("\n\t\tAlumno con el carné " + num + " se ha actualizado.");
			mostrarAlumnos(alumnos, carne);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void actualizarDocentes(ArrayList<String> docentes, ArrayList<Integer> idDocentes)
	{
		try
		{
			int num, pos, numCarne;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarDocentes(docentes, idDocentes);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del docente que quieres actualizar: "));
			pos = idDocentes.indexOf(num);
			docentes.remove(pos);
			String nuevoNombre = getInput("\n\nIngresa el nuevo nombre para el docente: ");
			docentes.add(pos, nuevoNombre);
			
			print("Docente con el ID " + num + " se ha actualizado.");
			mostrarDocentes(docentes, idDocentes);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	// Comit 19 Oct
}