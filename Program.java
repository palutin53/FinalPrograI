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
		//Declaracion metodo de procesos
		Proceso billy = new Proceso();

		try
		{
			//Login
			user = billy.getInput("Ingresa tu usuario: ");
			pass = billy.getInput("Ingrese su contraseña: ");
			if(user == USERV && pass == PASSV)
			{
				billy.print("Has ingresado");
			}else{
				billy.print("Intenta de nuevo");
			}
		}
		catch(Exception e)
		{
			print(">>>>>> ERROR PUTO");
		}
	}
}