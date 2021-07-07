/***
 * @author evelyn
 * Primera version ejercicio1
 * Fecha de edicion: 07/07/2021
 */
import java.lang.Math;
public class Ejercicio1App {

	public static void main(String[] args) {
		
		//Declaracion y asigancion de valor a variables numericas
		
		int n1 = 240;
		int n2 = 29;
		//Mostrar por pantalla el valor mayor de los dos y si son iguales indicarlo tambien
		
		if (n1 == n2)
			System.out.println("Las dos variables tienen el mismo valor: "+ n1);
		else
			System.out.println("El valor mayor es "+Math.max(n1, n2));
	}
}
