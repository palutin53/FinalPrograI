import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Console;

public class Program
{
	public static void main(String[] args)
	{
		//Instanciando metodo de procesos
			Proceso billy = new Proceso();
		// Declaracion de variables a utilizar
			final String PASSV = "udeo", USERV = "admin";
		//Delcaracion variables temporales
			String user, pass, nombreAlmuno;
			int contador = 0, numCarne = 160402001;
			boolean flag = true, valid = true, salir = true, valSalir;			
		try
		{
			//Login
			do
			{
				// Esconder password
				Console cnsl = null;
				cnsl = System.console();

				user = billy.getInput("\nUsuario: ");
				billy.print("password: ");

	        	char[] passwordChars = cnsl.readPassword();
        		String passwordString = new String(passwordChars);
        		pass = passwordString;

				if(user.equals(USERV) && pass.equals(PASSV))
				{
					billy.print("¡Bienvenido!\n");
					flag = false;
					// ArrayList
					ArrayList<String> alumnos = new ArrayList<String>();
					ArrayList<String> docentes = new ArrayList<String>();
					ArrayList<Integer> carne = new ArrayList<Integer>();
					ArrayList<Integer> idDocentes = new ArrayList<Integer>();
					ArrayList<String> cursos = new ArrayList<String>();
					ArrayList<Integer> idCursos = new ArrayList<Integer>();
					ArrayList<Integer> pagos = new ArrayList<Integer>();
					ArrayList<Integer> trimestre = new ArrayList<Integer>();
					ArrayList<Float> nota1 = new ArrayList<Float>();
					ArrayList<Float> nota2 = new ArrayList<Float>();
					ArrayList<Float> nota3 = new ArrayList<Float>();
					ArrayList<Float> nota4 = new ArrayList<Float>();
					ArrayList<Float> nota5 = new ArrayList<Float>();
					ArrayList<Float> nota6 = new ArrayList<Float>();
					ArrayList<Float> parcial = new ArrayList<Float>();
					ArrayList<Float> proyecto = new ArrayList<Float>();
					ArrayList<Float> examenFinal = new ArrayList<Float>();
					// Validacion para salida
					//Menu Principal
					while(valid)
					{
						billy.menuPrin();
						int opcion = Integer.parseInt(billy.getInput("\n\n\t\tTu Opción: "));

						boolean validsub = true;
						switch(opcion)
						{
							case 1:
									while(validsub)
									{
										// Administrar Alumnos
										billy.linea();
										billy.subMenu();
										int subOpcion = Integer.parseInt(billy.getInput("\n\n\tIngresa la opcion: "));
										switch(subOpcion)
										{
											case 1:
												// Agregar
												try
												{
													billy.linea();
													numCarne = billy.addAlumno(alumnos, carne, numCarne, pagos, trimestre, nota1, nota2, nota3, nota4, nota5, nota6, parcial, proyecto, examenFinal);
												}catch(Exception e)
												{
													billy.linea();
													billy.print("\nError: " + e.getMessage());
												}
											break;
											case 2:
												// Modificar
												try
												{
													billy.linea();
													billy.actualizarAlumnos(alumnos, carne);
												}catch(Exception e)
												{
													billy.linea();
													billy.print("\nError: " + e.getMessage());
												}
											break;
											case 3:
												// Eliminar
												try
												{
													billy.linea();
													billy.eliminarAlumnos(alumnos, carne);
												}catch(Exception e)
												{
													billy.linea();
													billy.print("\nError: " + e.getMessage());
												}
											break;
											case 4:
												// Volver al menú principal
												billy.linea();
												billy.print("volviendo al menú princial...");
												validsub = false;
											break;
											default:
												billy.linea();
												billy.print("Selección inválida, intentalo de nuevo.");
												validsub = true;
											break;
										}
									}
							break;
							case 2:
								while(validsub)
									{
										// Administrar Docentes
										billy.subMenu();
										int subOpcion = Integer.parseInt(billy.getInput("\n\n\tIngresa la opcion: "));
										switch(subOpcion)
										{
											case 1:
												// Agregar
												try
												{
													billy.linea();
													billy.addDocente(docentes, idDocentes);
												}catch(Exception e)
												{
													billy.linea();
													billy.print("\nError: " + e.getMessage());
												}
											break;
											case 2:
												// Modificar
												try
												{
													billy.linea();
													billy.actualizarDocentes(docentes, idDocentes);
												}catch(Exception e)
												{
													billy.linea();
													billy.print("\nError: " + e.getMessage());
												}
											break;
											case 3:
												// Eliminar
												try
												{
													billy.linea();
													billy.eliminarDocentes(docentes, idDocentes);
												}catch(Exception e)
												{
													billy.linea();
													billy.print("\nError: " + e.getMessage());
												}
											break;
											case 4:
												// Volver al menú principal
												billy.linea();
												billy.print("volviendo al menú princial...");
												validsub = false;
											break;
											default:
												billy.linea();
												billy.print("Selección inválida, intentalo de nuevo.");
												validsub = true;
											break;
										}
									}
							break;
							case 3:
								do
								{
									// Administrar Cursos
									billy.subMenu();
									int subOpcion = Integer.parseInt(billy.getInput("\n\n\tIngresa la opcion: "));
									switch(subOpcion)
									{
										case 1:
											// Agregar
											try
											{
												billy.linea();
												billy.addCursos(cursos, idCursos);
											}catch(Exception e)
											{
												billy.linea();
												billy.print("\nError: " + e.getMessage());
											}
										break;
										case 2:
											// Modificar
											try
											{
											billy.linea();
												billy.actualizarCursos(cursos, idCursos);
											}catch(Exception e)
											{
												billy.linea();
												billy.print("\nError: " + e.getMessage());
											}
										break;
										case 3:
											// Eliminar
											try
											{
												billy.linea();
												billy.eliminarCursos(cursos, idCursos);
											}catch(Exception e)
											{
												billy.linea();
												billy.print("\nError: " + e.getMessage());
											}
										break;
										case 4:
											// Volver al menú principal
											billy.linea();
											billy.print("volviendo al menú princial...");
											validsub = false;
										break;
										default:
											billy.linea();
											billy.print("Selección inválida, intentalo de nuevo.");
											validsub = true;
										break;
									}
								}while(validsub);
							break;
							// PAGOS
							case 4:
								do
								{
									billy.linea();
									billy.subMenuPagos();
									int subOpcion = Integer.parseInt(billy.getInput("\n\n\tIngresa la opcion: "));
									switch(subOpcion)
									{
										case 1:
											// Realizar un pago
											try
											{
												billy.linea();
												billy.addPagos(pagos, alumnos, carne, trimestre);
											}catch(Exception e)
											{
												billy.linea();
												billy.print("\nError: " + e.getMessage());
											}
										break;
										case 2:
											try
											{
												billy.mostrarPagos(pagos, alumnos, carne, trimestre);
											}catch(Exception e)
											{
												billy.print("ERROR: " + e.getMessage());
											}
										break;
										case 3:
											try
											{
												// Volver al menú principal
												billy.linea();
												billy.print("volviendo al menú princial...");
												validsub = false;
											}catch(Exception e)
											{
												billy.print("\n\tError: " + e.getMessage());
											}
										break;
										default:
											billy.linea();
											billy.print("Selección inválida, intentalo de nuevo.");
											validsub = true;
										break;
									}
								}while(validsub);
							break;
							case 5:
								// Ingreso de Notas
								billy.linea();
								billy.addNotas(nota1, nota2, nota3, nota4, nota5, nota6, parcial, proyecto, examenFinal, alumnos, carne);				
							break;
							case 6:
								// Resultados Finales
							break;
							case 7:
								// SALIR
								billy.print("\n\n\t\t\tPresiona enter para salir del programa.");
								//valid = false;
								System.out.close();
							break;
							default:
								billy.print("Selección inválida, intentalo de nuevo.");
								valid = true;
							break;
						}
					}

				}else{
					contador++;
					billy.print("\nIntenta de nuevo.");
				}
				
			}while(flag && contador < 3);
		}
		catch(Exception e)
		{
			billy.print("\nError: " + e.getMessage());
		}
	}
	// Comit Oct 19
}