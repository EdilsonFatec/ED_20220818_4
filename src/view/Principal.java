package view;
import javax.swing.JOptionPane;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int valor=0;
		int numero=0;
		int soma=0;

		Controller somat = new Controller();
		
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Número 1 (de 10 a 999999)"));
		}
		while (valor<10 || valor >1000000);

		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Número 2 (de 0 a 9)"));
		}
		while (numero<0 || numero >9);

		soma =  somat.Somatorio(valor, numero, soma);
	    
		System.out.println("O número "+numero+" aparece "+soma+" vezes em "+valor);
	}
}