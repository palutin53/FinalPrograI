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
import java.util.Date;
import java.text.SimpleDateFormat;

public class Proceso
{
	public static int historial=-1;
	public static int historialdoc=-1;
	public static int historialcur=-1;
	public static int historialnot=-1;
	public static int historialPag=-1;

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
			print("\n\n\t\t1.- Administrar Alumnos\n\t\t2.- Administrar Docentes\n\t\t3.- Administrar Cursos\n\t\t4.- Realizar Pago\n\t\t5.- Ingresar Notas\n\t\t6.- Ver Resultados Finales.\n\t\t7.- Mostrar Historial\n\t\t8.- Salir");
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
	public static void subMenuCursos()
	{
		try{
			print("\n\t\t\tAdministrar");
			print("\n\n\tIngresa el valor según la opción que selecciones.");
			print("\n\n\t\t1.- Agregar\n\t\t2.- Editar\n\t\t3.- Eliminar\n\t\t4.- Asignar Alumnos\n\t\t5.- VOLVER");
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
	public static int addAlumno(String usuario,ArrayList<String> histo,ArrayList<String> alumnos, ArrayList<Integer> carne, int numCarne, ArrayList<Integer> pagos, ArrayList<Integer> trimestre, ArrayList<Float> curso1nota1, ArrayList<Float> curso1nota2, ArrayList<Float> curso1nota3, ArrayList<Float> curso1nota4, ArrayList<Float> curso1nota5, ArrayList<Float> curso1nota6, ArrayList<Float> curso1parcial, ArrayList<Float> curso1proyecto, ArrayList<Float> curso1examenFinal, ArrayList<Float> curso2nota1, ArrayList<Float> curso2nota2, ArrayList<Float> curso2nota3, ArrayList<Float> curso2nota4, ArrayList<Float> curso2nota5, ArrayList<Float> curso2nota6, ArrayList<Float> curso2parcial, ArrayList<Float> curso2proyecto, ArrayList<Float> curso2examenFinal, ArrayList<Float> curso3nota1, ArrayList<Float> curso3nota2, ArrayList<Float> curso3nota3, ArrayList<Float> curso3nota4, ArrayList<Float> curso3nota5, ArrayList<Float> curso3nota6, ArrayList<Float> curso3parcial, ArrayList<Float> curso3proyecto, ArrayList<Float> curso3examenFinal, ArrayList<Float> curso4nota1, ArrayList<Float> curso4nota2, ArrayList<Float> curso4nota3, ArrayList<Float> curso4nota4, ArrayList<Float> curso4nota5, ArrayList<Float> curso4nota6, ArrayList<Float> curso4parcial, ArrayList<Float> curso4proyecto, ArrayList<Float> curso4examenFinal, ArrayList<Integer> alumnoCurso1, ArrayList<Integer> alumnoCurso2, ArrayList<Integer> alumnoCurso3, ArrayList<Integer> alumnoCurso4, ArrayList<Float> finalesCurso1, ArrayList<Float> finalesCurso2, ArrayList<Float> finalesCurso3, ArrayList<Float> finalesCurso4)
	{
		String nombre;
		int posicion = 0;
		boolean valSalir = true;
		int iniciar = 0;
		float inicio = (float) iniciar;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del alumno: ");
				print("\n\t\tEl numero de carne de " + nombre +" es: " + numCarne);
				alumnos.add(nombre);
				carne.add(numCarne);
				pagos.add(0);
				trimestre.add(0);

				curso1nota1.add(inicio);
				curso1nota2.add(inicio);
				curso1nota3.add(inicio);
				curso1nota4.add(inicio);
				curso1nota5.add(inicio);
				curso1nota6.add(inicio);
				curso1parcial.add(inicio);
				curso1proyecto.add(inicio);
				curso1examenFinal.add(inicio);

				curso2nota1.add(inicio);
				curso2nota2.add(inicio);
				curso2nota3.add(inicio);
				curso2nota4.add(inicio);
				curso2nota5.add(inicio);
				curso2nota6.add(inicio);
				curso2parcial.add(inicio);
				curso2proyecto.add(inicio);
				curso2examenFinal.add(inicio);

				curso3nota1.add(inicio);
				curso3nota2.add(inicio);
				curso3nota3.add(inicio);
				curso3nota4.add(inicio);
				curso3nota5.add(inicio);
				curso3nota6.add(inicio);
				curso3parcial.add(inicio);
				curso3proyecto.add(inicio);
				curso3examenFinal.add(inicio);

				curso4nota1.add(inicio);
				curso4nota2.add(inicio);
				curso4nota3.add(inicio);
				curso4nota4.add(inicio);
				curso4nota5.add(inicio);
				curso4nota6.add(inicio);
				curso4parcial.add(inicio);
				curso4proyecto.add(inicio);
				curso4examenFinal.add(inicio);

				alumnoCurso1.add(0);
				alumnoCurso2.add(0);
				alumnoCurso3.add(0);
				alumnoCurso4.add(0);

				finalesCurso1.add(inicio);
				finalesCurso2.add(inicio);
				finalesCurso3.add(inicio);
				finalesCurso4.add(inicio);

				posicion++;
				numCarne = numCarne + 1;

				historialAdd(usuario,alumnos,histo);
				
				valSalir = salir();

			}while(valSalir);

		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
		return numCarne;
	}
	public static void addDocente(String usuario,ArrayList<String> histo,ArrayList<String> docentes, ArrayList<Integer> idDocentes, ArrayList<Integer> docenteCurso, ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		String nombre;
		int posicion = 0, numDocente = 1001;
		boolean valSalir = true;
		try
		{
			do{
				nombre = getInput("\n\n\tIngresa el nombre del Docente: ");
				docentes.add(nombre);
				print("\n\t\tEl numero de ID de " + nombre +" es: " + numDocente);				
				idDocentes.add(numDocente);
				mostrarCursos(cursos, idCursos);
				int numCurso = Integer.parseInt(getInput("\n\t\tIngresa el ID del curso al que estará asignado el docente: "));
				int pos = idCursos.indexOf(numCurso);
				String nombreCurso = cursos.get(pos);
				print("\n\t\tEl docente " + nombre + " estará impartiendo el curso de: " + nombreCurso + " del ID " + numCurso);
				docenteCurso.add(numCurso);
				posicion++;
				numDocente++;
				historialAddDocentes(usuario,docentes,histo);
				valSalir = salir();

			}while(valSalir);

		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void addCursos(String usuario,ArrayList<String> histo,ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		String nombre;
		int posicion = 0, numCurso = 101;
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
				historialAddCursos(usuario,cursos,histo);
				valSalir = salir();

			}while(valSalir);

		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void addPagos(String usuario,ArrayList<String> histo,ArrayList<Integer> pagos, ArrayList<String> alumnos, ArrayList<Integer> carne, ArrayList<Integer> trimestre, ArrayList<Integer> alumnoCurso1, ArrayList<Integer> alumnoCurso2, ArrayList<Integer> alumnoCurso3, ArrayList<Integer> alumnoCurso4, ArrayList<String> cursos, ArrayList<Integer> idCursos)
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
				mostrarAlumnos(alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
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

							alumnoCurso1.remove(pos);
							alumnoCurso1.add(pos, 0);
							alumnoCurso2.remove(pos);
							alumnoCurso2.add(pos, 0);
							alumnoCurso3.remove(pos);
							alumnoCurso3.add(pos, 0);
							alumnoCurso4.remove(pos);
							alumnoCurso4.add(pos, 0);

							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tEnero - Marzo\n\t\tExitosamente.");
						}else if(posicionTrimestre == 1)
						{
							trimestre.remove(pos);
							trimestre.add(pos, 2);
							pagos.add(pos, CANTIDADPAGO);

							alumnoCurso1.remove(pos);
							alumnoCurso1.add(pos, 0);
							alumnoCurso2.remove(pos);
							alumnoCurso2.add(pos, 0);
							alumnoCurso3.remove(pos);
							alumnoCurso3.add(pos, 0);
							alumnoCurso4.remove(pos);
							alumnoCurso4.add(pos, 0);

							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tAbril - Junio\n\t\tExitosamente.");

						}else if(posicionTrimestre == 2)
						{
							trimestre.remove(pos);
							trimestre.add(pos, 3);
							pagos.add(pos, CANTIDADPAGO);

							alumnoCurso1.remove(pos);
							alumnoCurso1.add(pos, 0);
							alumnoCurso2.remove(pos);
							alumnoCurso2.add(pos, 0);
							alumnoCurso3.remove(pos);
							alumnoCurso3.add(pos, 0);
							alumnoCurso4.remove(pos);
							alumnoCurso4.add(pos, 0);

							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tJulio - Septiembre\n\t\tExitosamente.");

						}else if(posicionTrimestre == 3)
						{
							trimestre.remove(pos);
							trimestre.add(pos, 4);
							pagos.add(pos, CANTIDADPAGO);

							alumnoCurso1.remove(pos);
							alumnoCurso1.add(pos, 0);
							alumnoCurso2.remove(pos);
							alumnoCurso2.add(pos, 0);
							alumnoCurso3.remove(pos);
							alumnoCurso3.add(pos, 0);
							alumnoCurso4.remove(pos);
							alumnoCurso4.add(pos, 0);

							print("\n\t\tSe ha realizado el pago de el trimestre\n\t\t\tOctubre - Diciembre\n\t\tExitosamente.");
						}else if(posicionTrimestre == 4)
						{
							print("\n\t\tEl alumno ya ha realizado todos sus pagos.");
						}
					
				//mostrarPagos(pagos, idPagos, alumnos, carne);
				historialAddPagos(usuario,alumnos,histo);
				valSalir = salir();
			}while(valSalir);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void addNotas(String usuario,ArrayList<String> histo, ArrayList<Integer> trimestre,ArrayList<Float> curso1nota1, ArrayList<Float> curso1nota2, ArrayList<Float> curso1nota3, ArrayList<Float> curso1nota4, ArrayList<Float> curso1nota5, ArrayList<Float> curso1nota6, ArrayList<Float> curso1parcial, ArrayList<Float> curso1proyecto, ArrayList<Float> curso1examenFinal, ArrayList<Float> curso2nota1, ArrayList<Float> curso2nota2, ArrayList<Float> curso2nota3, ArrayList<Float> curso2nota4, ArrayList<Float> curso2nota5, ArrayList<Float> curso2nota6, ArrayList<Float> curso2parcial, ArrayList<Float> curso2proyecto, ArrayList<Float> curso2examenFinal, ArrayList<Float> curso3nota1, ArrayList<Float> curso3nota2, ArrayList<Float> curso3nota3, ArrayList<Float> curso3nota4, ArrayList<Float> curso3nota5, ArrayList<Float> curso3nota6, ArrayList<Float> curso3parcial, ArrayList<Float> curso3proyecto, ArrayList<Float> curso3examenFinal, ArrayList<Float> curso4nota1, ArrayList<Float> curso4nota2, ArrayList<Float> curso4nota3, ArrayList<Float> curso4nota4, ArrayList<Float> curso4nota5, ArrayList<Float> curso4nota6, ArrayList<Float> curso4parcial, ArrayList<Float> curso4proyecto, ArrayList<Float> curso4examenFinal, ArrayList<String> alumnos, ArrayList<Integer> carne, ArrayList<Integer> alumnoCurso1, ArrayList<Integer> alumnoCurso2, ArrayList<Integer> alumnoCurso3, ArrayList<Integer> alumnoCurso4, ArrayList<String> cursos, ArrayList<Integer> idCursos, ArrayList<Float> finalesCurso1, ArrayList<Float> finalesCurso2, ArrayList<Float> finalesCurso3, ArrayList<Float> finalesCurso4)
	{
		boolean valSalir = true;
		float n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, par = 0, pro = 0, exF = 0;
		try
		{
			do
			{
				mostrarAlumnos(alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
				int numCarne = Integer.parseInt(getInput("\nIngresa el numero de Carné del alumno que se calificará: "));
				int pos = carne.indexOf(numCarne);
				String nombre = alumnos.get(pos);
					int nC1 = alumnoCurso1.get(pos);
						int idCrurso1 = idCursos.indexOf(nC1);
						String nomCurso1 = cursos.get(idCrurso1);
					int nC2 = alumnoCurso2.get(pos);
						int idCrurso2 = idCursos.indexOf(nC2);
						String nomCurso2 = cursos.get(idCrurso2);
					int nC3 = alumnoCurso3.get(pos);
						int idCrurso3 = idCursos.indexOf(nC3);
						String nomCurso3 = cursos.get(idCrurso3);
					int nC4 = alumnoCurso4.get(pos);
						int idCrurso4 = idCursos.indexOf(nC4);
						String nomCurso4 = cursos.get(idCrurso4);

					int solvencia = trimestre.get(pos);

				if(solvencia != 0)
				{
					mostrarCursos(cursos, idCursos);

					int opcion = Integer.parseInt(getInput("\n\tSelecciona el curso al cual quieres calificar:\n\t\t1.- " + nomCurso1 + "\n\t\t2.- " + nomCurso2 + "\n\t\t3.- " + nomCurso3 + "\n\t\t4.- " + nomCurso4 + "\n\t\tOpción: "));

					switch(opcion)
					{
						case 1:
						//------------------------------------Curso 1------------------------------------------------------------------
							if(curso1nota1.get(pos) > 0 && curso1nota2.get(pos) > 0 && curso1nota3.get(pos) > 0 && curso1nota4.get(pos) > 0 && curso1nota5.get(pos) > 0 && curso1nota6.get(pos) > 0 && curso1parcial.get(pos) > 0 && curso1proyecto.get(pos) > 0 && curso1examenFinal.get(pos) > 0)
							{
								print("\n\t\t\tEl alumno ya ha sido calificado.");
							}else
							{

								n1 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 1 (5 pts): "));
								curso1nota1.add(pos, n1);

								if(n1 <= 5)
								{
									n2 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 2 (5 pts): "));
									curso1nota2.add(pos, n2);
									if(n2 <= 5)
									{
										n3 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 3 (5 pts): "));
										curso1nota3.add(pos, n3);
										if(n3 <= 5)
										{
											n4 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 4 (5 pts): "));
											curso1nota4.add(pos, n4);
											if(n4 <= 5)
											{
												n5 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 5 (5 pts): "));
												curso1nota5.add(pos, n5);
												if(n5 <= 5)
												{
													n6 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 6 (5 pts): "));
													curso1nota6.add(pos, n6);
													if(n6 <= 5)
													{
														par = Float.parseFloat(getInput("Ingresa la calificacion del Examen Parcial (10 pts): "));
														curso1parcial.add(pos, par);
														if(par <= 10)
														{
															pro = Float.parseFloat(getInput("Ingresa la calificacion del Proyecto Final (20 pts): "));
															curso1proyecto.add(pos, pro);
															if(pro <= 20)
															{
																exF = Float.parseFloat(getInput("Ingresa la calificacion del Examen Final (40 pts): "));
																curso1examenFinal.add(pos, exF);
																if(exF <= 40)
																{
																	float suma = n1 + n2 + n3 + n4 + n5 + n6 + par + pro + exF;
																	finalesCurso1.add(pos, suma);
																	print("\n\t\tSe han ingresado las notas correntamente.");
																}else{	print("La nota excede el rango establecido");	}
															}else{	print("La nota excede el rango establecido");	}
														}else{	print("La nota excede el rango establecido");	}
													}else{	print("La nota excede el rango establecido");	}
												}else{	print("La nota excede el rango establecido");	}
											}else{	print("La nota excede el rango establecido");	}
										}else{	print("La nota excede el rango establecido");	}
									}else{	print("La nota excede el rango establecido");	}
								}else{	print("La nota excede el rango establecido");	}
							}
						//-------------------------------------------------------------------------------------------------------------
						break;
						case 2:
						//------------------------------------Curso 2------------------------------------------------------------------
						if(curso2nota1.get(pos) > 0 && curso2nota2.get(pos) > 0 && curso2nota3.get(pos) > 0 && curso2nota4.get(pos) > 0 && curso2nota5.get(pos) > 0 && curso2nota6.get(pos) > 0 && curso2parcial.get(pos) > 0 && curso2proyecto.get(pos) > 0 && curso2examenFinal.get(pos) > 0)
							{
								print("\n\t\t\tEl alumno ya ha sido calificado.");
							}else
							{

								n1 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 1 (5 pts): "));
								curso2nota1.add(pos, n1);

								if(n1 <= 5)
								{
									n2 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 2 (5 pts): "));
									curso2nota2.add(pos, n2);
									if(n2 <= 5)
									{
										n3 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 3 (5 pts): "));
										curso2nota3.add(pos, n3);
										if(n3 <= 5)
										{
											n4 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 4 (5 pts): "));
											curso2nota4.add(pos, n4);
											if(n4 <= 5)
											{
												n5 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 5 (5 pts): "));
												curso2nota5.add(pos, n5);
												if(n5 <= 5)
												{
													n6 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 6 (5 pts): "));
													curso2nota6.add(pos, n6);
													if(n6 <= 5)
													{
														par = Float.parseFloat(getInput("Ingresa la calificacion del Examen Parcial (10 pts): "));
														curso2parcial.add(pos, par);
														if(par <= 10)
														{
															pro = Float.parseFloat(getInput("Ingresa la calificacion del Proyecto Final (20 pts): "));
															curso2proyecto.add(pos, pro);
															if(pro <= 20)
															{
																exF = Float.parseFloat(getInput("Ingresa la calificacion del Examen Final (40 pts): "));
																curso2examenFinal.add(pos, exF);
																if(exF <= 40)
																{
																	float suma = n1 + n2 + n3 + n4 + n5 + n6 + par + pro + exF;
																	finalesCurso2.add(pos, suma);
																	print("\n\t\tSe han ingresado las notas correntamente.");
																}else{	print("La nota excede el rango establecido");	}
															}else{	print("La nota excede el rango establecido");	}
														}else{	print("La nota excede el rango establecido");	}
													}else{	print("La nota excede el rango establecido");	}
												}else{	print("La nota excede el rango establecido");	}
											}else{	print("La nota excede el rango establecido");	}
										}else{	print("La nota excede el rango establecido");	}
									}else{	print("La nota excede el rango establecido");	}
								}else{	print("La nota excede el rango establecido");	}
							}
						//-------------------------------------------------------------------------------------------------------------
						break;
						case 3:
						//-------------------------------------Curso 3-----------------------------------------------------------------
						if(curso3nota1.get(pos) > 0 && curso3nota2.get(pos) > 0 && curso3nota3.get(pos) > 0 && curso3nota4.get(pos) > 0 && curso3nota5.get(pos) > 0 && curso3nota6.get(pos) > 0 && curso3parcial.get(pos) > 0 && curso3proyecto.get(pos) > 0 && curso3examenFinal.get(pos) > 0)
							{
								print("\n\t\t\tEl alumno ya ha sido calificado.");
							}else
							{

								n1 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 1 (5 pts): "));
								curso3nota1.add(pos, n1);

								if(n1 <= 5)
								{
									n2 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 2 (5 pts): "));
									curso3nota2.add(pos, n2);
									if(n2 <= 5)
									{
										n3 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 3 (5 pts): "));
										curso3nota3.add(pos, n3);
										if(n3 <= 5)
										{
											n4 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 4 (5 pts): "));
											curso3nota4.add(pos, n4);
											if(n4 <= 5)
											{
												n5 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 5 (5 pts): "));
												curso3nota5.add(pos, n5);
												if(n5 <= 5)
												{
													n6 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 6 (5 pts): "));
													curso3nota6.add(pos, n6);
													if(n6 <= 5)
													{
														par = Float.parseFloat(getInput("Ingresa la calificacion del Examen Parcial (10 pts): "));
														curso3parcial.add(pos, par);
														if(par <= 10)
														{
															pro = Float.parseFloat(getInput("Ingresa la calificacion del Proyecto Final (20 pts): "));
															curso3proyecto.add(pos, pro);
															if(pro <= 20)
															{
																exF = Float.parseFloat(getInput("Ingresa la calificacion del Examen Final (40 pts): "));
																curso3examenFinal.add(pos, exF);
																if(exF <= 40)
																{
																	float suma = n1 + n2 + n3 + n4 + n5 + n6 + par + pro + exF;
																	finalesCurso3.add(pos, suma);
																	print("\n\t\tSe han ingresado las notas correntamente.");
																}else{	print("La nota excede el rango establecido");	}
															}else{	print("La nota excede el rango establecido");	}
														}else{	print("La nota excede el rango establecido");	}
													}else{	print("La nota excede el rango establecido");	}
												}else{	print("La nota excede el rango establecido");	}
											}else{	print("La nota excede el rango establecido");	}
										}else{	print("La nota excede el rango establecido");	}
									}else{	print("La nota excede el rango establecido");	}
								}else{	print("La nota excede el rango establecido");	}
							}
						//-------------------------------------------------------------------------------------------------------------
						break;
						case 4:
						//---------------------------------------Curso 4---------------------------------------------------------------
						if(curso4nota1.get(pos) > 0 && curso4nota2.get(pos) > 0 && curso4nota3.get(pos) > 0 && curso4nota4.get(pos) > 0 && curso4nota5.get(pos) > 0 && curso4nota6.get(pos) > 0 && curso4parcial.get(pos) > 0 && curso4proyecto.get(pos) > 0 && curso4examenFinal.get(pos) > 0)
							{
								print("\n\t\t\tEl alumno ya ha sido calificado.");
							}else
							{

								n1 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 1 (5 pts): "));
								curso4nota1.add(pos, n1);

								if(n1 <= 5)
								{
									n2 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 2 (5 pts): "));
									curso4nota2.add(pos, n2);
									if(n2 <= 5)
									{
										n3 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 3 (5 pts): "));
										curso4nota3.add(pos, n3);
										if(n3 <= 5)
										{
											n4 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 4 (5 pts): "));
											curso4nota4.add(pos, n4);
											if(n4 <= 5)
											{
												n5 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 5 (5 pts): "));
												curso4nota5.add(pos, n5);
												if(n5 <= 5)
												{
													n6 = Float.parseFloat(getInput("Ingresa la calificacion de la Actividad 6 (5 pts): "));
													curso4nota6.add(pos, n6);
													if(n6 <= 5)
													{
														par = Float.parseFloat(getInput("Ingresa la calificacion del Examen Parcial (10 pts): "));
														curso4parcial.add(pos, par);
														if(par <= 10)
														{
															pro = Float.parseFloat(getInput("Ingresa la calificacion del Proyecto Final (20 pts): "));
															curso4proyecto.add(pos, pro);
															if(pro <= 20)
															{
																exF = Float.parseFloat(getInput("Ingresa la calificacion del Examen Final (40 pts): "));
																curso4examenFinal.add(pos, exF);
																if(exF <= 40)
																{
																	float suma = n1 + n2 + n3 + n4 + n5 + n6 + par + pro + exF;
																	finalesCurso4.add(pos, suma);
																	print("\n\t\tSe han ingresado las notas correntamente.");
																}else{	print("La nota excede el rango establecido");	}
															}else{	print("La nota excede el rango establecido");	}
														}else{	print("La nota excede el rango establecido");	}
													}else{	print("La nota excede el rango establecido");	}
												}else{	print("La nota excede el rango establecido");	}
											}else{	print("La nota excede el rango establecido");	}
										}else{	print("La nota excede el rango establecido");	}
									}else{	print("La nota excede el rango establecido");	}
								}else{	print("La nota excede el rango establecido");	}
							}
						//-------------------------------------------------------------------------------------------------------------
						break;
						case 5:
							print("\n\t\t\tRestornando a menu.");
							valSalir = false;
						break;
						default:
							print("\n\t\t\tValor inválido intentalo de nuevo.");
							valSalir = false;
						break;
					}
				historialAddNotas(usuario,alumnos,histo);
				}else{ print("\n\t\tEl alumno no ha pagado, no es posible asignarse."); }

				valSalir = salir();
			}while(valSalir);
		}catch(Exception e)
		{
			print("ERROR: " + e.getMessage());
		}
	}
	// Metodos Mostrar
	public static void mostrarAlumnos(ArrayList<String> alumnos, ArrayList<Integer> carne, ArrayList<Integer> trimestre, ArrayList<Integer> alumnoCurso1, ArrayList<Integer> alumnoCurso2, ArrayList<Integer> alumnoCurso3, ArrayList<Integer> alumnoCurso4, ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			print("\n\tNombre\t\t\tCarné\t\t\tTrimestre\t\t\tCurso 1\t\t\tCurso 2\t\t\tCurso 3\t\t\tCurso 4");
			
			for(int i = 0; i < alumnos.size(); i++)
			{
				int numCarne = carne.get(i);
				String alumno2 = alumnos.get(i);

				int numTrimestre = trimestre.get(i);

				int numCurso1 = alumnoCurso1.get(i);

				int numCurso2 = alumnoCurso2.get(i);

				int numCurso3 = alumnoCurso3.get(i);

				int numCurso4 = alumnoCurso4.get(i);

				print("\n\t" + alumno2 + "\t\t\t" + numCarne + "\t\t\t" + numTrimestre + "\t\t\t" + numCurso1 + "\t\t\t" + numCurso2 + "\t\t\t" + numCurso3 + "\t\t\t" + numCurso4);
			}
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void mostrarDocentes(ArrayList<String> docentes, ArrayList<Integer> idDocentes, ArrayList<Integer> docenteCurso, ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			print("\n\tNombre\t\t\tID\t\t\tCurso Impartido");
			int size = docentes.size();
			for(int i = 0; i < size; i++)
			{
				int numID = idDocentes.get(i);
				String docente = docentes.get(i);
				int codicoCurs = docenteCurso.get(i);
				int pos = idCursos.indexOf(codicoCurs);
				String cursoImpartido = cursos.get(pos);


				print("\n\t" + docente + "\t\t\t" + numID + "\t\t\t" + cursoImpartido);
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
			int size = cursos.size();
			for(int i = 0; i < size; i++)
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
			print("\n\tNombre\t\t\tCarné\t\t\t\tTrimestre");
		
				for(int i = 0; i < alumnos.size(); i++)
				{
					String nombre = alumnos.get(i);
					int numCarne = carne.get(i);
					int trim = trimestre.get(i);

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
	public static void mostrarFinales(ArrayList<String> alumnos, ArrayList<Integer> carne, int numCarne, ArrayList<Integer> pagos, ArrayList<Integer> trimestre, ArrayList<Float> curso1nota1, ArrayList<Float> curso1nota2, ArrayList<Float> curso1nota3, ArrayList<Float> curso1nota4, ArrayList<Float> curso1nota5, ArrayList<Float> curso1nota6, ArrayList<Float> curso1parcial, ArrayList<Float> curso1proyecto, ArrayList<Float> curso1examenFinal, ArrayList<Float> curso2nota1, ArrayList<Float> curso2nota2, ArrayList<Float> curso2nota3, ArrayList<Float> curso2nota4, ArrayList<Float> curso2nota5, ArrayList<Float> curso2nota6, ArrayList<Float> curso2parcial, ArrayList<Float> curso2proyecto, ArrayList<Float> curso2examenFinal, ArrayList<Float> curso3nota1, ArrayList<Float> curso3nota2, ArrayList<Float> curso3nota3, ArrayList<Float> curso3nota4, ArrayList<Float> curso3nota5, ArrayList<Float> curso3nota6, ArrayList<Float> curso3parcial, ArrayList<Float> curso3proyecto, ArrayList<Float> curso3examenFinal, ArrayList<Float> curso4nota1, ArrayList<Float> curso4nota2, ArrayList<Float> curso4nota3, ArrayList<Float> curso4nota4, ArrayList<Float> curso4nota5, ArrayList<Float> curso4nota6, ArrayList<Float> curso4parcial, ArrayList<Float> curso4proyecto, ArrayList<Float> curso4examenFinal, ArrayList<Float> finalesCurso1, ArrayList<Float> finalesCurso2, ArrayList<Float> finalesCurso3, ArrayList<Float> finalesCurso4)
	{
		boolean valSalir = true;
		try
		{
			String nombreCurso = null;
			int contadorGanados = 0, contadorPerdidos = 0, nota = 0;
			do
			{
				print("\n\t\tResultados por curso: ");
				print("\n\tCurso\t\t\tGanados\t\t\tPerdidos");

				for(int i = 0; i <= alumnos.size(); i++)
				{
					if(nota <= 60)
					{
						print("\n\t" + nombreCurso + "\t\t\t" + contadorGanados + "\t\t\t" + contadorPerdidos);
						contadorPerdidos = contadorPerdidos + 1;
					}else
					{
						contadorPerdidos = contadorPerdidos + 1;
						print("\n\t" + nombreCurso + "\t\t\t" + contadorGanados + "\t\t\t" + contadorPerdidos);
					}
				}

				valSalir = salir();
			}while(valSalir);
		}catch(Exception e)
		{
			print("ERROR: " + e.getMessage());
		}
	}
	// Metodos Eliminar
	public static void eliminarAlumnos(String usuario,ArrayList<String> histo,ArrayList<String> alumnos, ArrayList<Integer> carne, int numCarne, ArrayList<Integer> pagos, ArrayList<Integer> trimestre, ArrayList<Float> curso1nota1, ArrayList<Float> curso1nota2, ArrayList<Float> curso1nota3, ArrayList<Float> curso1nota4, ArrayList<Float> curso1nota5, ArrayList<Float> curso1nota6, ArrayList<Float> curso1parcial, ArrayList<Float> curso1proyecto, ArrayList<Float> curso1examenFinal, ArrayList<Float> curso2nota1, ArrayList<Float> curso2nota2, ArrayList<Float> curso2nota3, ArrayList<Float> curso2nota4, ArrayList<Float> curso2nota5, ArrayList<Float> curso2nota6, ArrayList<Float> curso2parcial, ArrayList<Float> curso2proyecto, ArrayList<Float> curso2examenFinal, ArrayList<Float> curso3nota1, ArrayList<Float> curso3nota2, ArrayList<Float> curso3nota3, ArrayList<Float> curso3nota4, ArrayList<Float> curso3nota5, ArrayList<Float> curso3nota6, ArrayList<Float> curso3parcial, ArrayList<Float> curso3proyecto, ArrayList<Float> curso3examenFinal, ArrayList<Float> curso4nota1, ArrayList<Float> curso4nota2, ArrayList<Float> curso4nota3, ArrayList<Float> curso4nota4, ArrayList<Float> curso4nota5, ArrayList<Float> curso4nota6, ArrayList<Float> curso4parcial, ArrayList<Float> curso4proyecto, ArrayList<Float> curso4examenFinal, ArrayList<Integer> alumnoCurso1, ArrayList<Integer> alumnoCurso2, ArrayList<Integer> alumnoCurso3, ArrayList<Integer> alumnoCurso4, ArrayList<String> cursos, ArrayList<Integer> idCursos)
    {
    	try
    	{
	    	int num, pos;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarAlumnos(alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
			num = Integer.parseInt(getInput("\n\nIngresa el carné del alumno que se dará de baja: "));
			pos = carne.indexOf(num);
			historialDeleteAlum(usuario,alumnos,histo,pos);
			alumnos.remove(pos);
			carne.remove(pos);
			pagos.remove(pos);
			trimestre.remove(pos);
			
			curso1nota1.remove(pos);
			curso1nota2.remove(pos);
			curso1nota3.remove(pos);
			curso1nota4.remove(pos);
			curso1nota5.remove(pos);
			curso1nota6.remove(pos);
			curso1parcial.remove(pos);
			curso1proyecto.remove(pos);
			curso1examenFinal.remove(pos);
				
			curso2nota1.remove(pos);
			curso2nota2.remove(pos);
			curso2nota3.remove(pos);
			curso2nota4.remove(pos);
			curso2nota5.remove(pos);
			curso2nota6.remove(pos);
			curso2parcial.remove(pos);
			curso2proyecto.remove(pos);
			curso2examenFinal.remove(pos);

			curso3nota1.remove(pos);
			curso3nota2.remove(pos);
			curso3nota3.remove(pos);
			curso3nota4.remove(pos);
			curso3nota5.remove(pos);
			curso3nota6.remove(pos);
			curso3parcial.remove(pos);
			curso3proyecto.remove(pos);
			curso3examenFinal.remove(pos);

			curso4nota1.remove(pos);
			curso4nota2.remove(pos);
			curso4nota3.remove(pos);
			curso4nota4.remove(pos);
			curso4nota5.remove(pos);
			curso4nota6.remove(pos);
			curso4parcial.remove(pos);
			curso4proyecto.remove(pos);
			curso4examenFinal.remove(pos);

			alumnoCurso1.remove(pos);
			alumnoCurso2.remove(pos);
			alumnoCurso3.remove(pos);
			alumnoCurso4.remove(pos);

	        print("\n\tEl alumno se ha dado de baja.\n");
	        mostrarAlumnos(alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}	        
    }
	public static void eliminarDocentes(String usuario,ArrayList<String> histo,ArrayList<String> docentes, ArrayList<Integer> idDocentes, ArrayList<Integer> docenteCurso, ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			int num, pos, numDocente;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarDocentes(docentes, idDocentes, docenteCurso, cursos, idCursos);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del docente que se dará de baja: "));
			pos = idDocentes.indexOf(num);
			historialDeleteDoc(usuario,docentes,histo,pos);
			docentes.remove(pos);
			idDocentes.remove(pos);
			docenteCurso.remove(pos);

	        print("\n\tEl alumno se ha dado de baja.\n");
	        mostrarDocentes(docentes, idDocentes, docenteCurso, cursos, idCursos);
	    }catch(Exception e)
	    {
	    	print("\nError: " + e.getMessage());
	    }
	}
	public static void eliminarCursos(String usuario,ArrayList<String> histo,ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			int num, pos, numCurso;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarCursos(cursos, idCursos);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del curso que se dará de baja: "));
			pos = idCursos.indexOf(num);
			historialDeleteCur(usuario,cursos,histo,pos);
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
	public static void actualizarAlumnos(String usuario,ArrayList<String> histo, ArrayList<Integer> trimestre,ArrayList<String> alumnos, ArrayList<Integer> carne, ArrayList<Integer> alumnoCurso1, ArrayList<Integer> alumnoCurso2, ArrayList<Integer> alumnoCurso3, ArrayList<Integer> alumnoCurso4, ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			int num, pos, numCarne;
			print("\n\n\tPor el momento el listado que tenemos está así: ");
			mostrarAlumnos(alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
			num = Integer.parseInt(getInput("\n\nIngresa el carné del alumno que quieres actualizar: "));
			pos = carne.indexOf(num);
			alumnos.remove(pos);
			String nuevoNombre = getInput("\n\nIngresa el nuevo nombre para el alumno: ");
			alumnos.add(pos, nuevoNombre);
			
			print("\n\t\tAlumno con el carné " + num + " se ha actualizado.");
			mostrarAlumnos(alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
			historialEdit(usuario,alumnos,histo,pos);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void actualizarDocentes(String usuario,ArrayList<String> histo,ArrayList<String> docentes, ArrayList<Integer> idDocentes, ArrayList<Integer> docenteCurso, ArrayList<String> cursos, ArrayList<Integer> idCursos)
	{
		try
		{
			int num, pos, numCarne;
			print("\n\nPor el momento el listado que tenemos está así: ");
			mostrarDocentes(docentes, idDocentes, docenteCurso, cursos, idCursos);
			num = Integer.parseInt(getInput("\n\nIngresa el ID del docente que quieres actualizar: "));
			pos = idDocentes.indexOf(num);
			docentes.remove(pos);
			String nuevoNombre = getInput("\n\nIngresa el nuevo nombre para el docente: ");
			docentes.add(pos, nuevoNombre);
			
			print("Docente con el ID " + num + " se ha actualizado.");
			mostrarDocentes(docentes, idDocentes, docenteCurso, cursos, idCursos);
			historialEdit(usuario,docentes,histo,pos);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	public static void actualizarCursos(String usuario,ArrayList<String> histo,ArrayList<String> cursos, ArrayList<Integer> idCursos)
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
			historialEdit(usuario,cursos,histo,pos);
		}catch(Exception e)
		{
			print("\nError: " + e.getMessage());
		}
	}
	// Metodos para Asignar
	public static void asignarCursos(ArrayList<Integer> trimestre, ArrayList<String> cursos, ArrayList<Integer> idCursos, ArrayList<String> alumnos, ArrayList<Integer> carne, ArrayList<String> docentes, ArrayList<Integer> idDocentes, ArrayList<Integer> alumnoCurso1, ArrayList<Integer> alumnoCurso2, ArrayList<Integer> alumnoCurso3, ArrayList<Integer> alumnoCurso4)
	{
		boolean valSalir = true;
		int codigoCurso = 0, posCurso = 0;
		String nombreCurso;
		try
		{
			do
			{
				mostrarAlumnos(alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
				int numCarne = Integer.parseInt(getInput("\n\t\tIngresa el numero de carné del alumno que se va a asignar: "));
				int pos = carne.indexOf(numCarne);
				String nombreAlumno = alumnos.get(pos);
				int curso1 = alumnoCurso1.get(pos);
				int curso2 = alumnoCurso2.get(pos);
				int curso3 = alumnoCurso3.get(pos);
				int curso4 = alumnoCurso4.get(pos);
					print("\n\n");
				if(curso1 == 0)
				{
					mostrarCursos(cursos, idCursos);
					codigoCurso = Integer.parseInt(getInput("\n\t\tIngresa el ID del curso al cual se va a asignar el alumno: "));
					posCurso = idCursos.indexOf(codigoCurso);
					nombreCurso = cursos.get(posCurso);
					alumnoCurso1.add(pos, codigoCurso);

					print("El alumno se ha asignado a " + nombreCurso + " con el ID de curso " + codigoCurso + " correctamente.");
				}else if(curso2 == 0)
				{
					mostrarCursos(cursos, idCursos);
					codigoCurso = Integer.parseInt(getInput("\n\t\tIngresa el ID del curso al cual se va a asignar el alumno: "));
					posCurso = idCursos.indexOf(codigoCurso);
					nombreCurso = cursos.get(posCurso);
					alumnoCurso2.add(pos, codigoCurso);

					print("El alumno se ha asignado a " + nombreCurso + " con el ID de curso " + codigoCurso + " correctamente.");
				}else if(curso3 == 0)
				{
					mostrarCursos(cursos, idCursos);
					codigoCurso = Integer.parseInt(getInput("\n\t\tIngresa el ID del curso al cual se va a asignar el alumno: "));
					posCurso = idCursos.indexOf(codigoCurso);
					nombreCurso = cursos.get(posCurso);
					alumnoCurso3.add(pos, codigoCurso);

					print("El alumno se ha asignado a " + nombreCurso + " con el ID de curso " + codigoCurso + " correctamente.");
				}else if(curso4 == 0)
				{
					mostrarCursos(cursos, idCursos);
					codigoCurso = Integer.parseInt(getInput("\n\t\tIngresa el ID del curso al cual se va a asignar el alumno: "));
					posCurso = idCursos.indexOf(codigoCurso);
					nombreCurso = cursos.get(posCurso);
					alumnoCurso4.add(pos, codigoCurso);

					print("El alumno se ha asignado a " + nombreCurso + " con el ID de curso " + codigoCurso + " correctamente.");
				}else{
					print("\n\t\tEl alumno ya ha cumplido con sus 4 asignaturas de este trimestre.");
				}

				valSalir = salir();
			}while(valSalir);
		}catch(Exception e)
		{
			print("ERROR: " + e.getMessage());
		}
	}
	// LOG AGREGAR -----------------------------------------------------------------------------------------
	public static void historialAdd(String usuario,ArrayList<String> alumnos,ArrayList<String> histo)
	{
		historial=historial + 1;
		Date myDate = new Date();
		String alumno2 = alumnos.get(historial);
		System.out.println("\n\n\t"+usuario+" "+" Agrego en la lista el alumno "+alumno2+" "+myDate);
		String cadena= usuario+" "+" Agrego en la lista el alumno  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		
	}
	public static void historialAddDocentes(String usuario,ArrayList<String> docente,ArrayList<String> histo)
	{
		historialdoc=historialdoc + 1;
		Date myDate = new Date();
		String alumno2 = docente.get(historialdoc);
		System.out.println("\n\n\t"+usuario+" "+" Agrego en la lista el docente "+alumno2+" "+myDate);
		String cadena= usuario+" "+" Agrego en la lista el docente  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		
	}
	public static void historialAddCursos(String usuario,ArrayList<String> curso,ArrayList<String> histo)
	{
		historialcur=historialcur + 1;
		Date myDate = new Date();
		String alumno2 = curso.get(historialcur);
		System.out.println("\n\n\t"+usuario+" "+" Agrego en la lista el curso "+alumno2+" "+myDate);
		String cadena= usuario+" "+" Agrego en la lista el curso  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		
	}
	public static void historialAddPagos(String usuario,ArrayList<String> pagos,ArrayList<String> histo)
	{
		historialPag=historialPag + 1;
		Date myDate = new Date();
		String alumno2 = pagos.get(historialPag);
		System.out.println("\n\n\t"+usuario+" "+" Agrego un pago a "+alumno2+" "+myDate);
		String cadena= usuario+" "+" Agrego un pago  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		
	}
	public static void historialAddNotas(String usuario,ArrayList<String> notas,ArrayList<String> histo)
	{
		historialnot=historialnot + 1;
		Date myDate = new Date();
		String alumno2 = notas.get(historialnot);
		System.out.println("\n\n\t"+usuario+" "+" Agrego en la lista notas "+myDate);
		String cadena= usuario+" "+" Agrego en la lista notas "+myDate;
		histo.add(cadena);
		
	}
	// LOG EDIT ------------------------------------------------------------------------------------------------------
	public static void historialEdit(String usuario,ArrayList<String> alumnos,ArrayList<String> histo,int muestra)
	{
		//historial=historial + 1;
		Date myDate = new Date();
		String alumno2 = alumnos.get(muestra);
		System.out.println("\n\n\t"+usuario+" "+" Edito en la lista "+alumno2.toString()+" "+myDate);
		String cadena= usuario+" "+" Edito en la lista  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		
	}
	//LOG EDIT -----------------------------------------------------------------------------------------------------
	public static void historialDeleteAlum(String usuario,ArrayList<String> alumnos,ArrayList<String> histo,int muestra)
	{
		//historial=historial + 1;
		Date myDate = new Date();
		String alumno2 = alumnos.get(muestra);
		System.out.println("\n\n\t"+usuario+" "+" Borro en la lista "+alumno2.toString()+" "+myDate);
		String cadena= usuario+" "+" Borro en la lista  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		historial=historial-1;
		
	}
	public static void historialDeleteDoc(String usuario,ArrayList<String> alumnos,ArrayList<String> histo,int muestra)
	{
		//historial=historial + 1;
		Date myDate = new Date();
		String alumno2 = alumnos.get(muestra);
		System.out.println("\n\n\t"+usuario+" "+" Borro en la lista "+alumno2.toString()+" "+myDate);
		String cadena= usuario+" "+" Borro en la lista  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		historialdoc=historialdoc-1;
		
	}
	public static void historialDeleteCur(String usuario,ArrayList<String> alumnos,ArrayList<String> histo,int muestra)
	{
		//historial=historial + 1;
		Date myDate = new Date();
		String alumno2 = alumnos.get(muestra);
		System.out.println("\n\n\t"+usuario+" "+" Borro en la lista "+alumno2.toString()+" "+myDate);
		String cadena= usuario+" "+" Borro en la lista  "+alumno2.toString()+" "+myDate;
		histo.add(cadena);
		historialcur=historialcur-1;
		
	}

	public static void historialMostrar(ArrayList<String> histo)
	{
		for(int i=0; i< histo.size(); i++)
		{
			System.out.println(histo.get(i));
		}
	}
}