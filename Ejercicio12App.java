/***
 * @author evelyn
 * Primera version ejercicio12
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio12App {

	public static void main(String[] args) {
		
		//Declaramos la contraseña
		
		String password = "cualquiera";
		boolean acierto = false; //booleano que controla la salida del bucle si la contraseña es correcta
		int i = 0; //variable iteradora
		while ( i<3 && !acierto)
		{
			String contra = JOptionPane.showInputDialog("Introduce la contraseña, te quedan "+(3-i)+" intentos"); //introducir contraseña por teclado
			if (contra.equals(password))
			{
				JOptionPane.showMessageDialog(null, "Enhorabuena"); //Si la contraseña es correcta mostrar este mensaje y salir del bucle
				acierto = true;
			}
			else //Si la contraseña no es correcta seguir iterando siempre que queden intentos
				i++;
		}
	}
}
