
/***
 * @author evelyn
 * Primera version ejercicio13
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
import java.lang.Math;

public class Ejercicio13App {
	
	//funcion Calculadora inversa, encargada de operar con los operandos y el string pasados como parametro
	public static double CalculadoraInversa(int n1, int n2, String s) {
		double res = 0;
		switch (s) {
		case "+":
			return res = n1 + n2;
		case "-":
			return res = n1 - n2;
		case "*":
			return res = n1 * n2;
		case "/":
			return res = n1 / n2;
		case "^":
			return res = Math.pow(n1, n2);
		case "%":
			return res = n1 % n2;
		default:
			JOptionPane.showMessageDialog(null, "La operacion no es posible");
			return res;
		}
	}
	
	public static void main(String[] args) {
		
		//pedimos los operandos y la operacion
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce el primer operando"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce el segundo operando"));
		String op = JOptionPane.showInputDialog("Por favor, introduce la operacion deseada");
		double res = CalculadoraInversa(num1, num2, op); //llamamos a la funcion de arriba
		JOptionPane.showMessageDialog(null, "El resultado es: "+res); //mostramos el resultado si es que lo hay
	}
}
