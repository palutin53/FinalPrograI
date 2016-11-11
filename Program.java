import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Program
{
	public static void main(String[] args)
	{
		// Declaracion de variables a utilizar
		final String PASSV = "udeo", USERV = "admin";
		String[] alumnos = new String[10];
		String[] docentes = new String[5];
		String[] cursost1 = new String[4]; 
		String[] cursost2 = new String[4];
		String[] cursost3 = new String[4];
		String[] cursost4 = new String[4];
		float[] notas = new float[89];
		String[] pagos = new String[10];
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0, nota6 = 0, parcial = 0, proyecto = 0, examenFinal = 0;
		//Delcaracion variables temporales
		String user, pass;
		int contador = 0;
		boolean flag = true, valid = true;
		//Declaracion metodo de procesos
		Proceso billy = new Proceso();

		try
		{
			//Login
			while(flag && contador<3)
			{
				user = billy.getInput("\nIngresa tu usuario: ");
				pass = billy.getInput("Ingrese su contraseña: ");
				if(user.equals(USERV) && pass.equals(PASSV))
				{
					billy.print("¡Bienvenido!\n");
					flag = false;
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
										billy.subMenu();
										int subOpcion = Integer.parseInt(billy.getInput("\n\n\tIngresa la opcion: "));
										switch(subOpcion)
										{
											case 1:
												// Agregar
											break;
											case 2:
												// Modificar
											break;
											case 3:
												// Eliminar
											break;
											case 4:
												// Volver al menú principal
												billy.print("volviendo al menú princial...");
												validsub = false;
											break;
											default:
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
											break;
											case 2:
												// Modificar
											break;
											case 3:
												// Eliminar
											break;
											case 4:
												// Volver al menú principal
												billy.print("volviendo al menú princial...");
												validsub = false;
											break;
											default:
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
											break;
											case 2:
												// Modificar
											break;
											case 3:
												// Eliminar
											break;
											case 4:
												// Volver al menú principal
												billy.print("volviendo al menú princial...");
												validsub = false;
											break;
											default:
												billy.print("Selección inválida, intentalo de nuevo.");
												validsub = true;
											break;
										}
									}
							break;
							case 4:
								// Realizar un pago
							break;
							case 5:
								// Ingreso de Notas
								billy.print("\n\t\t\t\tIngreso de Notas.");
								nota1 = Float.parseFloat(getInput("\n\n\tActividad 1:\t\t\t"));
								nota2 = Float.parseFloat(getInput("\n\tActividad 2:\t\t\t"));
								nota3 = Float.parseFloat(getInput("\n\tActividad 3:\t\t\t"));
								nota4 = Float.parseFloat(getInput("\n\tActividad 4:\t\t\t"));
								nota5 = Float.parseFloat(getInput("\n\tActividad 5:\t\t\t"));
								nota6 = Float.parseFloat(getInput("\n\tActividad 6:\t\t\t"));
								parcial = Float.parseFloat(getInput("\n\tExamen Parcial:\t\t\t"));
								proyecto = Float.parseFloat(getInput("\n\tProyecto:\t\t\t"));
								examenFinal = Float.parseFloat(getInput("\n\tExamen Final:\t\t\t"));
							break;
							case 6:
								// Resultados Finales
							break;
							case 7:
								// SALIR
								billy.print("\n\n\t\t\tSaliendo del programa.");
								valid = false;
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
				
			}
		}
		catch(Exception e)
		{
			billy.print(">>>>>> ERROR PUTO");
		}
	}
}