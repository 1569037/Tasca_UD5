/***
 * @author evelyn
 * Primera version ejercicio11
 * Fecha de edicion: 07/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio11App {
	public static void main(String[] args) {
		
		//pedimos un dia de la semana
		String dia = JOptionPane.showInputDialog("Por favor introduce un dia de la semana sin tildes: ");
		
		//comprovamos si el dia es laboral con una estructura switch case
		
		switch (dia.toUpperCase()) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, dia+" es un dia laboral");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, dia+" es un dia laboral");
			break;
		case "MIERCOLES":
			JOptionPane.showMessageDialog(null, dia+" es un dia laboral");
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, dia+" es un dia laboral");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, dia+" es un dia laboral");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, dia+" NO es un dia laboral");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, dia+" NO es un dia laboral");
			break;
		default:
			JOptionPane.showMessageDialog(null, dia+" no es un dia valido");
			break;
		}	
	}	
}
