package controller;

public class Controller {

	public Controller() {
		super();
	}
	public int Somatorio(int valor, int numero, int soma) {
		int resto=0;
		
		if  (valor<10) {
			if (valor==numero) {
				soma = soma + 1;
			}
			return soma;
		}
		else {
			resto = valor % 10;
			valor = valor / 10;

			if (resto==numero) {
				soma = soma + 1;
			}

			soma = Somatorio(valor, numero, soma);
			
		}
	 return soma;
	}
}
