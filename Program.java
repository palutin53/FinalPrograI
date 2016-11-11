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
		//Delcaracion variables temporales
		String user, pass;
		int contador = 0;
		boolean flag = true, valid = true, validsub = true;
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
					//Menu Principal

					billy.menuPrin();
					int opcion = Integer.parseInt(billy.getInput("\n\n\t\tTu Opción: "));

					// Validacion para salida

					while(valid)
					{
						switch(opcion)
						{
							case 1:
									// Administrar Alumnos
									billy.subMenu();
									int subOpcion = Integer.parseInt(billy.getInput("\n\n\tIngresa tu opcion: "));
									switch(subOpcion)
									{
										case 1:
										break;
										case 2:
										break;
										case 3:
										break;
										case 4:
										break;
										default:
										break;
									}
							break;
							case 2:
								// Administrar Docentes
								billy.subMenu();
							break;
							case 3:
								// Administrar Cursos
								billy.subMenu();
							break;
							case 4:
							break;
							case 5:
							break;
							case 6:
							break;
							case 7:
								billy.print("\n\n\t\t\tSaliendo del programa.");
								valid = false;
							break;
							default:
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