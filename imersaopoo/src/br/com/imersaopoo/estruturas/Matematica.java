package br.com.imersaopoo.estruturas;

public class Matematica {
	
	private int numero;
	private int contador;
	private int fim;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public void mostrarLoopPar() {
		// Algoritmo para mostrar os numeros pares de um looping
		System.out.println("Algoritmo While Imersão:");
		int i = this.getContador(); 
		while (i<=this.getFim());
		if(i%2==0) {
			System.out.println(i);
		}
		i++;
	}

}
