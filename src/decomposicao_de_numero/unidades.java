//Decomposi��o de n�meros em milhares, centenas, dezenas e unidades.

// Neste caso primeiro declaramos Scanner, depois importamos o mesmo  do Java 
// Depois declaramos as vari�veis, unidades, dezenas, centenas, um e rea, no tipo int
// Fizemos as opera��es de divis�o de digitar o n�mero (rea) entre as diferentes unidades
// Por �ltimo imprimimos as quantidades em "System.out.println(" UNIDADES" +unidades);

package decomposicao_de_numero;

import java.util.Scanner;

//Primeiro declaramos Scanner para poder ler os registros
//Importamos o Scanner
public class unidades {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int unidades=0;
		int dezenas=0,centenas=0;
		int um=0;
		int rea=0;
		System.out.println(" ");
		System.out.println(" N�MERO DECOMPOSTO  ");
		System.out.println(" ");
		System.out.println(" DIGITE O N�MERO");
		rea=in.nextInt();
		unidades=rea%10;
		rea=rea/10;
		dezenas=rea%10;
		rea=rea/10;
		centenas=rea/10;
		um=rea/10;
		System.out.println(" ");
		System.out.println(" DIGITE O N�MERO " + rea + " CONTA COM: ");
		System.out.println(" UNIDADES = " +unidades);
		System.out.println(" DEZENAS = " +dezenas);
		System.out.println(" CENTENAS = " +centenas);
		System.out.println(" Milhares = " +um);
		System.out.println(" ");
		
	}
	
	
}
