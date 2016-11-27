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
			float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0, nota6 = 0, parcial = 0, proyecto = 0, examenFinal = 0;
		//Delcaracion variables temporales
			String user, pass, nombreAlmuno;
			int contador = 0, numCarne;
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
													billy.addAlumno(alumnos, carne);
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
								while(validsub)
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
													salir = billy.salir();
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
													salir = billy.salir();
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
													salir = billy.salir();
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
							case 4:
								// Realizar un pago
								try
								{
									while(salir)
									{
									salir = billy.salir();
									}
								}catch(Exception e)
								{
									billy.print("\nError: " + e.getMessage());
								}
							break;
							case 5:
								// Ingreso de Notas
								billy.print("\n\t\t\t\tIngreso de Notas.");
								nota1 = Float.parseFloat(billy.getInput("\n\n\tActividad 1:\t\t\t"));
								nota2 = Float.parseFloat(billy.getInput("\n\tActividad 2:\t\t\t"));
								nota3 = Float.parseFloat(billy.getInput("\n\tActividad 3:\t\t\t"));
								nota4 = Float.parseFloat(billy.getInput("\n\tActividad 4:\t\t\t"));
								nota5 = Float.parseFloat(billy.getInput("\n\tActividad 5:\t\t\t"));
								nota6 = Float.parseFloat(billy.getInput("\n\tActividad 6:\t\t\t"));
								parcial = Float.parseFloat(billy.getInput("\n\tExamen Parcial:\t\t\t"));
								proyecto = Float.parseFloat(billy.getInput("\n\tProyecto:\t\t\t"));
								examenFinal = Float.parseFloat(billy.getInput("\n\tExamen Final:\t\t\t"));
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