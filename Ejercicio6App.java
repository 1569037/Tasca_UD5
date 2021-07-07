/***
 * @author evelyn
 * Primera version ejercicio6
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio6App {
	public static void main(String[] args) {
		
		//Leemos precio por teclado
		
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto:"));
		
		final double IVA = 0.21; //declaracion de la constante IVA
		
		//Mostramos el precio final del producto con el IVA aplicado
		
		JOptionPane.showMessageDialog(null, "El precio final del producto es: "+(precio + precio*IVA));
	}
}