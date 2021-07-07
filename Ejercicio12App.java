/***
 * @author evelyn
 * Primera version ejercicio12
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio12App {

	public static void main(String[] args) {
		
		//Declaramos la contrase�a
		
		String password = "cualquiera";
		boolean acierto = false; //booleano que controla la salida del bucle si la contrase�a es correcta
		int i = 0; //variable iteradora
		while ( i<3 && !acierto)
		{
			String contra = JOptionPane.showInputDialog("Introduce la contrase�a, te quedan "+(3-i)+" intentos"); //introducir contrase�a por teclado
			if (contra.equals(password))
			{
				JOptionPane.showMessageDialog(null, "Enhorabuena"); //Si la contrase�a es correcta mostrar este mensaje y salir del bucle
				acierto = true;
			}
			else //Si la contrase�a no es correcta seguir iterando siempre que queden intentos
				i++;
		}
	}
}
