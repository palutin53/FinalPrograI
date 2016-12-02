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
	public static void subMenuPagos()
	{
		try{
			print("\n\t\t\tAdministrar Pagos");
			print("\n\n\tIngresa el valor según la opción que selecciones.");
			print("\n\n\t\t1.- Realizar Pago\n\t\t2.- Mostrar Pagos\n\t\t3.- VOLVER");
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
	// Metodos Agregar
	public static int addAlumno(ArrayList<String> alumnos, ArrayList<Integer> carne, int numCarne, ArrayList<Integer> pagos, ArrayList<Integer> trimestre)
	{
		String nombre;
		int posicion = 0;
		boolean valSalir = true;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del alumno: ");
				print("\n\t\tEl numero de carne de " + nombre +" es: " + numCarne);
				alumnos.add(nombre);
				carne.add(numCarne);
				pagos.add(0);
				trimestre.add(0);
				posicion++;
				numCarne = numCarne + 1;
				
				valSalir = salir();

			}while(valSalir);

		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
		return numCarne;
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
				print("\n\t\tEl numero de carne de " + nombre +" es: " + numDocente);				
				idDocentes.add(numDocente);
				posicion++;
				numDocente++;
				
				valSalir = salir();

			}while(valSalir);

		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void addCursos(ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		String nombre;
		int posicion = 0, numCurso = 01;
		boolean valSalir = true;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del nuevo curso: ");
				cursos.add(nombre);
				print("\n\t\tEl numero de ID de " + nombre +" es: " + numCurso);				
				idCursos.add(numCurso);
				posicion++;
				numCurso++;
				
				valSalir = salir();

			}while(valSalir);

		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void addPagos(ArrayList<Integer> pagos, ArrayList<String> alumnos, ArrayList<Integer> carne, ArrayList<Integer> trimestre)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean valSalir = true;
		int pago, posicion = 0, numPago = 0;
		final int CANTIDADPAGO = 780;
		char opcion = ' ';
		try
		{		
			do
			{
				mostrarAlumnos(alumnos, carne);
				numPago = Integer.parseInt(getInput("\n\n\tIngresa el carné del alumno que realizará el pago: "));
				int pos = carne.indexOf(numPago);
				String nombrePago = alumnos.get(pos);


				print("\n\tEl pago del trimestre debe ser de " + CANTIDADPAGO + ".");

						int posicionTrimestre = trimestre.get(pos);
						if(posicionTrimestre == 0)
						{
							trimestre.remove(pos);
							trimestre.add(pos, 1);
							pagos.add(pos, CANTIDADPAGO);
							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tEnero - Marzo\n\t\tExitosamente.");
						}else if(posicionTrimestre == 1)
						{
							trimestre.remove(pos);
							trimestre.add(pos, 2);
							pagos.add(pos, CANTIDADPAGO);
							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tAbril - Junio\n\t\tExitosamente.");

						}else if(posicionTrimestre == 2)
						{
							trimestre.remove(pos);
							trimestre.add(pos, 3);
							pagos.add(pos, CANTIDADPAGO);
							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tJulio - Septiembre\n\t\tExitosamente.");

						}else if(posicionTrimestre == 3)
						{
							trimestre.remove(pos);
							trimestre.add(pos, 4);
							pagos.add(pos, CANTIDADPAGO);
							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tOctubre - Diciembre\n\t\tExitosamente.");
						}else if(posicionTrimestre == 4)
						{
							print("\n\t\tEl alumno ya ha realizado todos sus pagos.");
						}
					
				//mostrarPagos(pagos, idPagos, alumnos, carne);
				
				valSalir = salir();
			}while(valSalir);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	// Metodos Mostrar
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
	public static void mostrarCursos(ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			print("\n\tNombre\t\t\tID");
			int pos = cursos.size();
			int size = pos - 1;
			for(int i = 0; i <= size; i++)
			{
				int numCurso = idCursos.get(i);
				String curso2 = cursos.get(i);
				print("\n\t" + curso2 + "\t\t\t" + numCurso);
			}
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void mostrarPagos(ArrayList<Integer> pagos, ArrayList<String> alumnos, ArrayList<Integer> carne, ArrayList<Integer> trimestre)
	{
		boolean valSalir = true;
		try
		{
			print("\n\tNombre\t\t\tCarné\t\t\tTrimestre");
			int pos = pagos.size();
			int size = pos - 1;	
				for(int i = 0; i <= size; i++)
				{
					String nombre = alumnos.get(i);
					int numCarne = carne.get(i);
					int trim = carne.get(i);

					if(trim == 0)
					{
						print("\n\t" + nombre + "\t\t\t" + numCarne + "\t\t\t" + "SIN PAGO");
					}else if(trim == 1)
					{
						print("\n\t" + nombre + "\t\t\t" + numCarne + "\t\t\t" + "Enero - Marzo");
					}else if(trim == 2)
					{
						print("\n\t" + nombre + "\t\t\t" + numCarne + "\t\t\t" + "Abril - Junio");
					}else if(trim == 3)
					{
						print("\n\t" + nombre + "\t\t\t" + numCarne + "\t\t\t" + "Julio - Septiembre");
					}else if (trim == 4)
					{
						print("\n\t" + nombre + "\t\t\t" + numCarne + "\t\t\t" + "Octubre - Diciembre");
					}
				}
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	// Metodos Eliminar
	public static void eliminarAlumnos(ArrayList<String> alumnos, ArrayList<Integer> carne)
    {
    	try
    	{
	    	int num, pos, numCarne;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarDocentes(alumnos, carne);
			num = Integer.parseInt(getInput("\n\nIngresa el carné del alumno que se dará de baja: "));
			pos = carne.indexOf(num);
			alumnos.remove(pos);
			carne.remove(pos);

	        print("\n\tEl alumno se ha dado de baja.\n");
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
			int num, pos, numDocente;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarDocentes(docentes, idDocentes);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del docente que se dará de baja: "));
			pos = idDocentes.indexOf(num);
			docentes.remove(pos);
			idDocentes.remove(pos);

	        print("\n\tEl alumno se ha dado de baja.\n");
	        mostrarDocentes(docentes, idDocentes);
	    }catch(Exception e)
	    {
	    	print("\nError: " + e.getMessage());
	    }
	}
	public static void eliminarCursos(ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			int num, pos, numCurso;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarCursos(cursos, idCursos);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del curso que se dará de baja: "));
			pos = idCursos.indexOf(num);
			cursos.remove(pos);
			idCursos.remove(pos);

	        print("\n\tEl curso se ha dado de baja.\n");
	        mostrarCursos(cursos, idCursos);
	    }catch(Exception e)
	    {
	    	print("\nError: " + e.getMessage());
	    }
	}
	// Metodos Actualizar
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
	public static void actualizarCursos(ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			int num, pos, numCurso;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarCursos(cursos, idCursos);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del curso que quieres actualizar: "));
			pos = idCursos.indexOf(num);
			cursos.remove(pos);
			String nuevoNombre = getInput("\n\nIngresa el nuevo nombre para el curso: ");
			cursos.add(pos, nuevoNombre);
			
			print("Docente con el ID " + num + " se ha actualizado.");
			mostrarCursos(cursos, idCursos);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
}