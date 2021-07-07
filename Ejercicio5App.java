/***
 * @author evelyn
 * Primera version ejercicio5
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio5App {
	public static void main(String[] args) {
		
		//Leemos un numero por teclado
		
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero: "));
		
		//Comprovamos si el numero introducido es divisible entre 2
		
		if (num%2 == 0)
			JOptionPane.showMessageDialog(null, "El numero introducido es divisible entre 2");
		else
			JOptionPane.showMessageDialog(null, "El numero introducido no es divisible entre 2");
	}
}
