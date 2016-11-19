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
		int posicion = 0, numCarne = 160402001, validacion = 0;
		boolean valSalir = true;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del alumno: ");
				alumnos[posicion] = nombre;
				print("El numero de carne de " +nombre+"es: " + numCarne);				
				carne[posicion] = numCarne;
				posicion++;
				numCarne++;
				
				valSalir = salir();

			}while(posicion <= 9 && valSalir);

		}catch(Exception e)
		{
			print("\n\n\t>>> Error 111");
		}
	}
	public static void addDocente(String[] docentes, int[] idDocentes)
	{
		String nombre;
		int posicion = 0, numDocente = 160402001;
		boolean valSalir = true;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del alumno: ");
				docentes[posicion] = nombre;
				print("El numero de carne de " +nombre+"es: " + numDocente);				
				idDocentes[posicion] = numDocente;
				posicion++;
				numDocente++;
				
				valSalir = salir();

			}while(posicion <= 9 && valSalir);


		}catch(Exception e)
		{
			print("\n\n\t>>> Error 111");
		}
	}
	public static void mostrarAlumnos(String[] alumnos, int[] carne)
	{
		for(int posicion = 0; posicion <= 9; posicion++)
		{
			print("\n\t" + alumnos[posicion] + "\t\t" + carne[posicion]);
		}
	}
	public static void mostrarDocentes(String[] docentes, int[] idDocentes)
	{
		for(int posicion = 0; posicion <= 9; posicion++)
		{
			print("\n\t" + docentes[posicion] + "\t\t" + idDocentes[posicion]);
		}
	}
	public static void eliminarAlumnos(String[] alumnos, int[] carne)
	{
		int numCarne = 0, posicion = 0;
		print("\n\tLa lista en este momento se encuentra así:\n\n");
		mostrarAlumnos(alumnos, carne);
		numCarne = Integer.parseInt(getInput("\n\n\tIngresa el número de carné del alumno que se dará de baja: "));
		print("\n\n\tEl alumno a dar de baja es: " + numCarne);

		for(posicion = 0; posicion <= 9; posicion++)
		{
			if(numCarne == carne[posicion])
			{
				alumnos[posicion] = null;
				carne[posicion] = 0;
			}
		}
		print("Alumno eliminado de la base de datos.");
		mostrarAlumnos(alumnos, carne);
	}
	public static void eliminarDocentes(String[] docentes, int[] idDocentes)
	{
		int numDocente = 0, posicion = 0;
		print("\n\tLa lista en este momento se encuentra así:\n\n");
		mostrarDocentes(docentes, idDocentes);
		numDocente = Integer.parseInt(getInput("\n\n\tIngresa el número de ID del docente que se dará de baja: "));
		print("\n\n\tEl docente a dar de baja es: " + numDocente);

		for(posicion = 0; posicion <= 9; posicion++)
		{
			if(numDocente == idDocentes[posicion])
			{
				docentes[posicion] = null;
				idDocentes[posicion] = 0;
			}
		}
		print("docente eliminado de la base de datos.");
		mostrarDocentes(docentes, idDocentes);
	}
	public static void actualizarAlumnos(String[] alumnos, int[] carne)
	{
		int numCarne = 0, posicion = 0;
		print("\n\tLa lista en este momento se encuentra así:\n\n");
		mostrarAlumnos(alumnos, carne);
		numCarne = Integer.parseInt(getInput("\n\n\tIngresa el número de carné del alumno que se actualizará: "));
		String nuevoNombre = getInput("Ingresa el nuevo nombre para el alumno con carné " + numCarne + ": ");

		for(posicion = 0; posicion <= 9; posicion++)
		{
			if(numCarne == carne[posicion])
			{
				alumnos[posicion] = nuevoNombre;
			}
		}
		print("Alumno eliminado de la base de datos.");
		mostrarAlumnos(alumnos, carne);
	}
	public static void actualizarDocentes(String[] docentes, int[] idDocentes)
	{
		int numDocente = 0, posicion = 0;
		print("\n\tLa lista en este momento se encuentra así:\n\n");
		mostrarDocentes(docentes, idDocentes);
		numDocente = Integer.parseInt(getInput("\n\n\tIngresa el número de ID del docente que se actualizará: "));
		String nuevoNombre = getInput("Ingresa el nuevo nombre para el docente con ID " + numDocente + ": ");

		for(posicion = 0; posicion <= 9; posicion++)
		{
			if(numDocente == idDocentes[posicion])
			{
				docentes[posicion] = nuevoNombre;
			}
		}
		print("Alumno " + nuevoNombre + " en la base de datos.");
		mostrarDocentes(docentes, idDocentes);
	}	
}