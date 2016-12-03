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

					ArrayList<Float> curso1nota1 = new ArrayList<Float>();
					ArrayList<Float> curso1nota2 = new ArrayList<Float>();
					ArrayList<Float> curso1nota3 = new ArrayList<Float>();
					ArrayList<Float> curso1nota4 = new ArrayList<Float>();
					ArrayList<Float> curso1nota5 = new ArrayList<Float>();
					ArrayList<Float> curso1nota6 = new ArrayList<Float>();
					ArrayList<Float> curso1parcial = new ArrayList<Float>();
					ArrayList<Float> curso1proyecto = new ArrayList<Float>();
					ArrayList<Float> curso1examenFinal = new ArrayList<Float>();

					ArrayList<Float> curso2nota1 = new ArrayList<Float>();
					ArrayList<Float> curso2nota2 = new ArrayList<Float>();
					ArrayList<Float> curso2nota3 = new ArrayList<Float>();
					ArrayList<Float> curso2nota4 = new ArrayList<Float>();
					ArrayList<Float> curso2nota5 = new ArrayList<Float>();
					ArrayList<Float> curso2nota6 = new ArrayList<Float>();
					ArrayList<Float> curso2parcial = new ArrayList<Float>();
					ArrayList<Float> curso2proyecto = new ArrayList<Float>();
					ArrayList<Float> curso2examenFinal = new ArrayList<Float>();

					ArrayList<Float> curso3nota1 = new ArrayList<Float>();
					ArrayList<Float> curso3nota2 = new ArrayList<Float>();
					ArrayList<Float> curso3nota3 = new ArrayList<Float>();
					ArrayList<Float> curso3nota4 = new ArrayList<Float>();
					ArrayList<Float> curso3nota5 = new ArrayList<Float>();
					ArrayList<Float> curso3nota6 = new ArrayList<Float>();
					ArrayList<Float> curso3parcial = new ArrayList<Float>();
					ArrayList<Float> curso3proyecto = new ArrayList<Float>();
					ArrayList<Float> curso3examenFinal = new ArrayList<Float>();

					ArrayList<Float> curso4nota1 = new ArrayList<Float>();
					ArrayList<Float> curso4nota2 = new ArrayList<Float>();
					ArrayList<Float> curso4nota3 = new ArrayList<Float>();
					ArrayList<Float> curso4nota4 = new ArrayList<Float>();
					ArrayList<Float> curso4nota5 = new ArrayList<Float>();
					ArrayList<Float> curso4nota6 = new ArrayList<Float>();
					ArrayList<Float> curso4parcial = new ArrayList<Float>();
					ArrayList<Float> curso4proyecto = new ArrayList<Float>();
					ArrayList<Float> curso4examenFinal = new ArrayList<Float>();

					ArrayList<Integer> alumnoCurso = new ArrayList<Integer>();
					ArrayList<Integer> docenteCurso = new ArrayList<Integer>();
					ArrayList<Integer> alumnoCurso1 = new ArrayList<Integer>();
					ArrayList<Integer> alumnoCurso2 = new ArrayList<Integer>();
					ArrayList<Integer> alumnoCurso3 = new ArrayList<Integer>();
					ArrayList<Integer> alumnoCurso4 = new ArrayList<Integer>();
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
													numCarne = billy.addAlumno(alumnos, carne, numCarne, pagos, trimestre, curso1nota1, curso1nota2, curso1nota3, curso1nota4, curso1nota5, curso1nota6, curso1parcial, curso1proyecto, curso1examenFinal, curso2nota1, curso2nota2, curso2nota3, curso2nota4, curso2nota5, curso2nota6, curso2parcial, curso2proyecto, curso2examenFinal, curso3nota1, curso3nota2, curso3nota3, curso3nota4, curso3nota5, curso3nota6, curso3parcial, curso3proyecto, curso3examenFinal, curso4nota1, curso4nota2, curso4nota3, curso4nota4, curso4nota5, curso4nota6, curso4parcial, curso4proyecto, curso4examenFinal, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4);
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
													billy.actualizarAlumnos(alumnos, carne, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
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
													billy.eliminarAlumnos(alumnos, carne, numCarne, pagos, trimestre, curso1nota1, curso1nota2, curso1nota3, curso1nota4, curso1nota5, curso1nota6, curso1parcial, curso1proyecto, curso1examenFinal, curso2nota1, curso2nota2, curso2nota3, curso2nota4, curso2nota5, curso2nota6, curso2parcial, curso2proyecto, curso2examenFinal, curso3nota1, curso3nota2, curso3nota3, curso3nota4, curso3nota5, curso3nota6, curso3parcial, curso3proyecto, curso3examenFinal, curso4nota1, curso4nota2, curso4nota3, curso4nota4, curso4nota5, curso4nota6, curso4parcial, curso4proyecto, curso4examenFinal, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
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
													billy.addDocente(docentes, idDocentes, docenteCurso, cursos, idCursos);
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
													billy.actualizarDocentes(docentes, idDocentes, docenteCurso, cursos, idCursos);
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
													billy.eliminarDocentes(docentes, idDocentes, docenteCurso, cursos, idCursos);
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
									billy.subMenuCursos();
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
											try
											{
												billy.linea();
												billy.asignarCursos(cursos, idCursos, alumnos, carne, docentes, idDocentes, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4);
											}catch(Exception e)
											{
												billy.print("\n\t\tERROR: " + e.getMessage());
											}
										break;
										case 5:
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
												billy.addPagos(pagos, alumnos, carne, trimestre, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);
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
								billy.addNotas(curso1nota1, curso1nota2, curso1nota3, curso1nota4, curso1nota5, curso1nota6, curso1parcial, curso1proyecto, curso1examenFinal, curso2nota1, curso2nota2, curso2nota3, curso2nota4, curso2nota5, curso2nota6, curso2parcial, curso2proyecto, curso2examenFinal, curso3nota1, curso3nota2, curso3nota3, curso3nota4, curso3nota5, curso3nota6, curso3parcial, curso3proyecto, curso3examenFinal, curso4nota1, curso4nota2, curso4nota3, curso4nota4, curso4nota5, curso4nota6, curso4parcial, curso4proyecto, curso4examenFinal, alumnos, carne, alumnoCurso1, alumnoCurso2, alumnoCurso3, alumnoCurso4, cursos, idCursos);				
							break;
							case 6:
								// Resultados Finales
								try
								{

								}catch(Exception e)
								{
									billy.print("\n\tERROR: " + e.getMessage());
								}
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