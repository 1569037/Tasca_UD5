/***
 * @author evelyn
 * Primera version ejercicio4
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class Ejercicio4App {
	public static void main(String[] args) {
		
		//Pedimos el valor del radio al usuario pasandolo direcatamente a double
		
		Double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio:"));
		
		final double PI = Math.PI; //declaramos constante PI aunque no sea necesario
		
		//Calculamos el area del circulo
		
		double area = PI * Math.pow(radio, 2);
		
		//Mostramos el resultado por pantall
		
		JOptionPane.showMessageDialog(null, "El area del circulo es: "+area);
	}
}

