/***
 * @author evelyn
 * Primera version ejercicio10
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio10App {
	public static void main(String[] args) {
		 //introducir numero de ventas
		
		int ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de ventas: "));
		
		//por cada venta pedir el importe y sumarlo a una variable acumulativa
		int suma = 0;
		for (int i=0; i < ventas; i++)
		{
			double importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe de la venta "+(i+1)));
			suma += importe;
		}
		JOptionPane.showMessageDialog(null,"El beneficio obtenido a partir de las ventas es: "+suma); //mostramos los beneficios totales
	}
}
