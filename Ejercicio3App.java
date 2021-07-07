/***
 * @author evelyn
 * Primera version ejercicio3
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio3App {

	public static void main(String[] args) {
		
		//Pedimos un nombre por teclado
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		//Mostramos un mensaje de saludo con el nombre anterior
		
		JOptionPane.showMessageDialog(null, "Bien, tu nombre es "+nombre);
	}
}
